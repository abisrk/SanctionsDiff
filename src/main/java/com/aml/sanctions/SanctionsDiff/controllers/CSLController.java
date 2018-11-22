package com.aml.sanctions.SanctionsDiff.controllers;

import java.io.IOException;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aml.sanctions.SanctionsDiff.service.CSLDownloader;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class CSLController {
	
	@Autowired
	CSLDownloader csl;
	
	@GetMapping("/test")
	public void doThis() throws URISyntaxException, JsonProcessingException, IOException {
		csl.download();
	}
}
