
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
    "address",
    "city",
    "state",
    "postal_code",
    "country"
})
@Component
public class Address implements Serializable
{

    @JsonProperty("address")
    private Object address;
    @JsonProperty("city")
    private Object city;
    @JsonProperty("state")
    private Object state;
    @JsonProperty("postal_code")
    private Object postalCode;
    @JsonProperty("country")
    private String country;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4666219601298172065L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Address() {
    }

    /**
     * 
     * @param postalCode
     * @param address
     * @param state
     * @param country
     * @param city
     */
    public Address(Object address, Object city, Object state, Object postalCode, String country) {
        super();
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    @JsonProperty("address")
    public Object getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Object address) {
        this.address = address;
    }

    @JsonProperty("city")
    public Object getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(Object city) {
        this.city = city;
    }

    @JsonProperty("state")
    public Object getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(Object state) {
        this.state = state;
    }

    @JsonProperty("postal_code")
    public Object getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postal_code")
    public void setPostalCode(Object postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
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
        return new ToStringBuilder(this).append("address", address).append("city", city).append("state", state).append("postalCode", postalCode).append("country", country).append("additionalProperties", additionalProperties).toString();
    }

}
