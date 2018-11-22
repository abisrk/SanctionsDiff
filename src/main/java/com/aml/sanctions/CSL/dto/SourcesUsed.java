
package com.aml.sanctions.CSL.dto;

import java.io.Serializable;
import java.util.HashMap;
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
    "source",
    "source_last_updated",
    "last_imported",
    "import_rate"
})
@Component
public class SourcesUsed implements Serializable
{

    @JsonProperty("source")
    private String source;
    @JsonProperty("source_last_updated")
    private String sourceLastUpdated;
    @JsonProperty("last_imported")
    private String lastImported;
    @JsonProperty("import_rate")
    private String importRate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7293708380326329379L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SourcesUsed() {
    }

    /**
     * 
     * @param source
     * @param sourceLastUpdated
     * @param importRate
     * @param lastImported
     */
    public SourcesUsed(String source, String sourceLastUpdated, String lastImported, String importRate) {
        super();
        this.source = source;
        this.sourceLastUpdated = sourceLastUpdated;
        this.lastImported = lastImported;
        this.importRate = importRate;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("source_last_updated")
    public String getSourceLastUpdated() {
        return sourceLastUpdated;
    }

    @JsonProperty("source_last_updated")
    public void setSourceLastUpdated(String sourceLastUpdated) {
        this.sourceLastUpdated = sourceLastUpdated;
    }

    @JsonProperty("last_imported")
    public String getLastImported() {
        return lastImported;
    }

    @JsonProperty("last_imported")
    public void setLastImported(String lastImported) {
        this.lastImported = lastImported;
    }

    @JsonProperty("import_rate")
    public String getImportRate() {
        return importRate;
    }

    @JsonProperty("import_rate")
    public void setImportRate(String importRate) {
        this.importRate = importRate;
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
        return new ToStringBuilder(this).append("source", source).append("sourceLastUpdated", sourceLastUpdated).append("lastImported", lastImported).append("importRate", importRate).append("additionalProperties", additionalProperties).toString();
    }

}
