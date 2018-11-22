
package com.aml.sanctions.CSL.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "total",
    "offset",
    "sources_used",
    "search_performed_at",
    "results"
})
@Component
public class CSLApi implements Serializable
{

    @JsonProperty("total")
    private int total;
    @JsonProperty("offset")
    private int offset;
    @JsonProperty("sources_used")
    private List<SourcesUsed> sourcesUsed = null;
    @JsonProperty("search_performed_at")
    private String searchPerformedAt;
    @JsonProperty("results")
    private List<Result> results = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2088414498396552196L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CSLApi() {
    }

    /**
     * 
     * @param total
     * @param searchPerformedAt
     * @param results
     * @param sourcesUsed
     * @param offset
     */
    public CSLApi(int total, int offset, List<SourcesUsed> sourcesUsed, String searchPerformedAt, List<Result> results) {
        super();
        this.total = total;
        this.offset = offset;
        this.sourcesUsed = sourcesUsed;
        this.searchPerformedAt = searchPerformedAt;
        this.results = results;
    }

    @JsonProperty("total")
    public int getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(int total) {
        this.total = total;
    }

    @JsonProperty("offset")
    public int getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(int offset) {
        this.offset = offset;
    }

    @JsonProperty("sources_used")
    public List<SourcesUsed> getSourcesUsed() {
        return sourcesUsed;
    }

    @JsonProperty("sources_used")
    public void setSourcesUsed(List<SourcesUsed> sourcesUsed) {
        this.sourcesUsed = sourcesUsed;
    }

    @JsonProperty("search_performed_at")
    public String getSearchPerformedAt() {
        return searchPerformedAt;
    }

    @JsonProperty("search_performed_at")
    public void setSearchPerformedAt(String searchPerformedAt) {
        this.searchPerformedAt = searchPerformedAt;
    }

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("total", total).append("offset", offset).append("sourcesUsed", sourcesUsed).append("searchPerformedAt", searchPerformedAt).append("results", results).append("additionalProperties", additionalProperties).toString();
    }

}
