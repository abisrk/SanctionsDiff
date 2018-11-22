package com.aml.sanctions.SanctionsDiff.service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.aml.sanctions.CSL.dto.CSLApi;
import com.aml.sanctions.CSL.dto.Result;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class CSLDownloader {
	
	@Autowired
	RestTemplate template;
	
	@Autowired
	CSLApi cslObj;
	
	@Autowired
	CSLApi mainCslObj;
	
	@Autowired
	ObjectMapper obj;
	
	int size = 100;
	int offset = 0;
	int total = 0;
	int csltotal = 0;
	
	List<Result> results = new ArrayList<>();
	
	public void checkTotalsFirst() throws URISyntaxException {
		URI url = new URI("https://api.trade.gov/consolidated_screening_list/search?api_key=3TgMpmCCBwNeyh1f8XouLVq9");
		ResponseEntity<CSLApi> response = template.getForEntity(url, CSLApi.class);
		if (response.getStatusCode() == HttpStatus.OK) {
			mainCslObj = response.getBody();
			this.total = this.csltotal = mainCslObj.getTotal();			
		}
	}
	
	public void download() throws URISyntaxException, JsonProcessingException, IOException {
		checkTotalsFirst();
		List<URI> urls = urlGenerator();
		for(URI uri : urls) {
			ResponseEntity<CSLApi> response = template.getForEntity(uri, CSLApi.class);
			if (response.getStatusCode() == HttpStatus.OK) {
				cslObj = response.getBody();
				this.total = cslObj.getTotal();
				results.addAll(cslObj.getResults());
				System.out.println("No. accumulated : " + results.size());
			}
		}
		
		System.out.println("CSLTotal : " + csltotal);
		System.out.println("No. accumulated final : " + results.size());
		
		mainCslObj.setResults(results);
		
		
		Path p = Paths.get("download.json");
		Files.write(p, obj.writeValueAsBytes(mainCslObj), StandardOpenOption.CREATE);
	}
	
	public List<URI> urlGenerator() {
		List<URI> lstURIs = new ArrayList<>();
		try {
			do{
				URI url = new URI("https://api.trade.gov/consolidated_screening_list/search?api_key=3TgMpmCCBwNeyh1f8XouLVq9&size=" + size + "&offset="+ offset);
				System.out.printf("Size : %d , Offset : %d, Total: %d, url : %s \n", size,offset,total,url);				
				lstURIs.add(url);
				
				// re-align pointers
				if (this.total==0) {
					this.total = -1;
				}
				else {
					this.total = this.total - this.size;
					this.offset = this.offset + 100;
					if (this.total < 100) {
						this.size = this.total;
						this.total = 0;
					}					
				}
			}while(this.total >= 0); 
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lstURIs;		
	}
}
