
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
    "country",
    "expiration_date",
    "issue_date",
    "number",
    "type"
})
@Component
public class Id implements Serializable
{

    @JsonProperty("country")
    private String country;
    @JsonProperty("expiration_date")
    private Object expirationDate;
    @JsonProperty("issue_date")
    private Object issueDate;
    @JsonProperty("number")
    private String number;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3333806822235261356L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Id() {
    }

    /**
     * 
     * @param expirationDate
     * @param number
     * @param issueDate
     * @param type
     * @param country
     */
    public Id(String country, Object expirationDate, Object issueDate, String number, String type) {
        super();
        this.country = country;
        this.expirationDate = expirationDate;
        this.issueDate = issueDate;
        this.number = number;
        this.type = type;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("expiration_date")
    public Object getExpirationDate() {
        return expirationDate;
    }

    @JsonProperty("expiration_date")
    public void setExpirationDate(Object expirationDate) {
        this.expirationDate = expirationDate;
    }

    @JsonProperty("issue_date")
    public Object getIssueDate() {
        return issueDate;
    }

    @JsonProperty("issue_date")
    public void setIssueDate(Object issueDate) {
        this.issueDate = issueDate;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
        return new ToStringBuilder(this).append("country", country).append("expirationDate", expirationDate).append("issueDate", issueDate).append("number", number).append("type", type).append("additionalProperties", additionalProperties).toString();
    }

}
