
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
    "id",
    "addresses",
    "end_date",
    "federal_register_notice",
    "name",
    "remarks",
    "source",
    "source_information_url",
    "source_list_url",
    "standard_order",
    "start_date",
    "alt_names",
    "citizenships",
    "dates_of_birth",
    "entity_number",
    "ids",
    "nationalities",
    "places_of_birth",
    "programs",
    "title",
    "type"
})
@Component
public class Result implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("addresses")
    private List<Address> addresses = null;
    @JsonProperty("end_date")
    private String endDate;
    @JsonProperty("federal_register_notice")
    private String federalRegisterNotice;
    @JsonProperty("name")
    private String name;
    @JsonProperty("remarks")
    private String remarks;
    @JsonProperty("source")
    private String source;
    @JsonProperty("source_information_url")
    private String sourceInformationUrl;
    @JsonProperty("source_list_url")
    private String sourceListUrl;
    @JsonProperty("standard_order")
    private String standardOrder;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("alt_names")
    private List<String> altNames = null;
    @JsonProperty("citizenships")
    private List<Object> citizenships = null;
    @JsonProperty("dates_of_birth")
    private List<String> datesOfBirth = null;
    @JsonProperty("entity_number")
    private String entityNumber;
    @JsonProperty("ids")
    private List<Id> ids = null;
    @JsonProperty("nationalities")
    private List<String> nationalities = null;
    @JsonProperty("places_of_birth")
    private List<String> placesOfBirth = null;
    @JsonProperty("programs")
    private List<String> programs = null;
    @JsonProperty("title")
    private Object title;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 416148022791351480L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param programs
     * @param sourceListUrl
     * @param startDate
     * @param ids
     * @param endDate
     * @param remarks
     * @param type
     * @param placesOfBirth
     * @param citizenships
     * @param nationalities
     * @param id
     * @param sourceInformationUrl
     * @param altNames
     * @param title
     * @param source
     * @param federalRegisterNotice
     * @param name
     * @param entityNumber
     * @param standardOrder
     * @param datesOfBirth
     * @param addresses
     */
    public Result(String id, List<Address> addresses, String endDate, String federalRegisterNotice, String name, String remarks, String source, String sourceInformationUrl, String sourceListUrl, String standardOrder, String startDate, List<String> altNames, List<Object> citizenships, List<String> datesOfBirth, String entityNumber, List<Id> ids, List<String> nationalities, List<String> placesOfBirth, List<String> programs, Object title, String type) {
        super();
        this.id = id;
        this.addresses = addresses;
        this.endDate = endDate;
        this.federalRegisterNotice = federalRegisterNotice;
        this.name = name;
        this.remarks = remarks;
        this.source = source;
        this.sourceInformationUrl = sourceInformationUrl;
        this.sourceListUrl = sourceListUrl;
        this.standardOrder = standardOrder;
        this.startDate = startDate;
        this.altNames = altNames;
        this.citizenships = citizenships;
        this.datesOfBirth = datesOfBirth;
        this.entityNumber = entityNumber;
        this.ids = ids;
        this.nationalities = nationalities;
        this.placesOfBirth = placesOfBirth;
        this.programs = programs;
        this.title = title;
        this.type = type;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("addresses")
    public List<Address> getAddresses() {
        return addresses;
    }

    @JsonProperty("addresses")
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @JsonProperty("end_date")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("federal_register_notice")
    public String getFederalRegisterNotice() {
        return federalRegisterNotice;
    }

    @JsonProperty("federal_register_notice")
    public void setFederalRegisterNotice(String federalRegisterNotice) {
        this.federalRegisterNotice = federalRegisterNotice;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("remarks")
    public String getRemarks() {
        return remarks;
    }

    @JsonProperty("remarks")
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("source_information_url")
    public String getSourceInformationUrl() {
        return sourceInformationUrl;
    }

    @JsonProperty("source_information_url")
    public void setSourceInformationUrl(String sourceInformationUrl) {
        this.sourceInformationUrl = sourceInformationUrl;
    }

    @JsonProperty("source_list_url")
    public String getSourceListUrl() {
        return sourceListUrl;
    }

    @JsonProperty("source_list_url")
    public void setSourceListUrl(String sourceListUrl) {
        this.sourceListUrl = sourceListUrl;
    }

    @JsonProperty("standard_order")
    public String getStandardOrder() {
        return standardOrder;
    }

    @JsonProperty("standard_order")
    public void setStandardOrder(String standardOrder) {
        this.standardOrder = standardOrder;
    }

    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("alt_names")
    public List<String> getAltNames() {
        return altNames;
    }

    @JsonProperty("alt_names")
    public void setAltNames(List<String> altNames) {
        this.altNames = altNames;
    }

    @JsonProperty("citizenships")
    public List<Object> getCitizenships() {
        return citizenships;
    }

    @JsonProperty("citizenships")
    public void setCitizenships(List<Object> citizenships) {
        this.citizenships = citizenships;
    }

    @JsonProperty("dates_of_birth")
    public List<String> getDatesOfBirth() {
        return datesOfBirth;
    }

    @JsonProperty("dates_of_birth")
    public void setDatesOfBirth(List<String> datesOfBirth) {
        this.datesOfBirth = datesOfBirth;
    }

    @JsonProperty("entity_number")
    public String getEntityNumber() {
        return entityNumber;
    }

    @JsonProperty("entity_number")
    public void setEntityNumber(String entityNumber) {
        this.entityNumber = entityNumber;
    }

    @JsonProperty("ids")
    public List<Id> getIds() {
        return ids;
    }

    @JsonProperty("ids")
    public void setIds(List<Id> ids) {
        this.ids = ids;
    }

    @JsonProperty("nationalities")
    public List<String> getNationalities() {
        return nationalities;
    }

    @JsonProperty("nationalities")
    public void setNationalities(List<String> nationalities) {
        this.nationalities = nationalities;
    }

    @JsonProperty("places_of_birth")
    public List<String> getPlacesOfBirth() {
        return placesOfBirth;
    }

    @JsonProperty("places_of_birth")
    public void setPlacesOfBirth(List<String> placesOfBirth) {
        this.placesOfBirth = placesOfBirth;
    }

    @JsonProperty("programs")
    public List<String> getPrograms() {
        return programs;
    }

    @JsonProperty("programs")
    public void setPrograms(List<String> programs) {
        this.programs = programs;
    }

    @JsonProperty("title")
    public Object getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(Object title) {
        this.title = title;
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
        return new ToStringBuilder(this).append("id", id).append("addresses", addresses).append("endDate", endDate).append("federalRegisterNotice", federalRegisterNotice).append("name", name).append("remarks", remarks).append("source", source).append("sourceInformationUrl", sourceInformationUrl).append("sourceListUrl", sourceListUrl).append("standardOrder", standardOrder).append("startDate", startDate).append("altNames", altNames).append("citizenships", citizenships).append("datesOfBirth", datesOfBirth).append("entityNumber", entityNumber).append("ids", ids).append("nationalities", nationalities).append("placesOfBirth", placesOfBirth).append("programs", programs).append("title", title).append("type", type).append("additionalProperties", additionalProperties).toString();
    }

}
