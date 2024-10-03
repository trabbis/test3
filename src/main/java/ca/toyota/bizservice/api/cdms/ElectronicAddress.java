/*
 * Customer Update Integration API
 * OICC API will process OICC request and broadcast to downstream applications via broadcast API.  Briefly, OICC will call customer API to match/create/update customer profile for all involve parties,  then call SAP if required, after SAP process success broad cast CustomerProfileChangeEvent or  OwnershipChangeEvent accordingly.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ca.toyota.bizservice.api.cdms;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;

/**
 * ElectronicAddress
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-15T15:26:37.695-05:00")
public class ElectronicAddress {
  @JsonProperty("locationID")
  private Long locationID = null;

  @JsonProperty("uriID")
  private String uriID = null;

  /**
   * The code specifying the use of this communication. The optional value is PERSONAL or BUSINESS
   */
  public enum UseCodeEnum {
    PERSONAL("PERSONAL"),
    
    BUSINESS("BUSINESS");

    private String value;

    UseCodeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static UseCodeEnum fromValue(String text) {
      for (UseCodeEnum b : UseCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("useCode")
  private UseCodeEnum useCode = null;

  @JsonProperty("preferredIndicator")
  private Boolean preferredIndicator = null;

  @JsonProperty("InvalidContactLocationReasonCode")
  private String invalidContactLocationReasonCode = null;

  @JsonProperty("InvalidContactLocationDate")
  private LocalDate invalidContactLocationDate = null;

  @JsonProperty("InvalidContactLocationSource")
  private String invalidContactLocationSource = null;

  @JsonProperty("lastUpdateTimestamp")
  private OffsetDateTime lastUpdateTimestamp = null;

  @JsonProperty("lastUpdateUserID")
  private String lastUpdateUserID = null;

  @JsonProperty("LastUpdateSource")
  private String lastUpdateSource = null;

  public ElectronicAddress locationID(Long locationID) {
    this.locationID = locationID;
    return this;
  }

   /**
   * A unique identifier for this communication
   * @return locationID
  **/
  @ApiModelProperty(value = "A unique identifier for this communication")
  public Long getLocationID() {
    return locationID;
  }

  public void setLocationID(Long locationID) {
    this.locationID = locationID;
  }

  public ElectronicAddress uriID(String uriID) {
    this.uriID = uriID;
    return this;
  }

   /**
   * The unique identifier of the Uniform Resource Identifier (URI) for this communication such as an email address
   * @return uriID
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the Uniform Resource Identifier (URI) for this communication such as an email address")
  public String getUriID() {
    return uriID;
  }

  public void setUriID(String uriID) {
    this.uriID = uriID;
  }

  public ElectronicAddress useCode(UseCodeEnum useCode) {
    this.useCode = useCode;
    return this;
  }

   /**
   * The code specifying the use of this communication. The optional value is PERSONAL or BUSINESS
   * @return useCode
  **/
  @ApiModelProperty(value = "The code specifying the use of this communication. The optional value is PERSONAL or BUSINESS")
  public UseCodeEnum getUseCode() {
    return useCode;
  }

  public void setUseCode(UseCodeEnum useCode) {
    this.useCode = useCode;
  }

  public ElectronicAddress preferredIndicator(Boolean preferredIndicator) {
    this.preferredIndicator = preferredIndicator;
    return this;
  }

   /**
   * The indication of whether this electronic address is preferred for communication
   * @return preferredIndicator
  **/
  @ApiModelProperty(value = "The indication of whether this electronic address is preferred for communication")
  public Boolean isPreferredIndicator() {
    return preferredIndicator;
  }

  public void setPreferredIndicator(Boolean preferredIndicator) {
    this.preferredIndicator = preferredIndicator;
  }

  public ElectronicAddress invalidContactLocationReasonCode(String invalidContactLocationReasonCode) {
    this.invalidContactLocationReasonCode = invalidContactLocationReasonCode;
    return this;
  }

   /**
   * Reason code that makes this electric address not reachable
   * @return invalidContactLocationReasonCode
  **/
  @ApiModelProperty(value = "Reason code that makes this electric address not reachable")
  public String getInvalidContactLocationReasonCode() {
    return invalidContactLocationReasonCode;
  }

  public void setInvalidContactLocationReasonCode(String invalidContactLocationReasonCode) {
    this.invalidContactLocationReasonCode = invalidContactLocationReasonCode;
  }

  public ElectronicAddress invalidContactLocationDate(LocalDate invalidContactLocationDate) {
    this.invalidContactLocationDate = invalidContactLocationDate;
    return this;
  }

   /**
   * Start date of this electric address not reachable
   * @return invalidContactLocationDate
  **/
  @ApiModelProperty(value = "Start date of this electric address not reachable")
  public LocalDate getInvalidContactLocationDate() {
    return invalidContactLocationDate;
  }

  public void setInvalidContactLocationDate(LocalDate invalidContactLocationDate) {
    this.invalidContactLocationDate = invalidContactLocationDate;
  }

  public ElectronicAddress invalidContactLocationSource(String invalidContactLocationSource) {
    this.invalidContactLocationSource = invalidContactLocationSource;
    return this;
  }

   /**
   * Source identifying an application to make location not reachable
   * @return invalidContactLocationSource
  **/
  @ApiModelProperty(value = "Source identifying an application to make location not reachable")
  public String getInvalidContactLocationSource() {
    return invalidContactLocationSource;
  }

  public void setInvalidContactLocationSource(String invalidContactLocationSource) {
    this.invalidContactLocationSource = invalidContactLocationSource;
  }

  public ElectronicAddress lastUpdateTimestamp(OffsetDateTime lastUpdateTimestamp) {
    this.lastUpdateTimestamp = lastUpdateTimestamp;
    return this;
  }

   /**
   * Last date and time for updating the electric address
   * @return lastUpdateTimestamp
  **/
  @ApiModelProperty(value = "Last date and time for updating the electric address")
  public OffsetDateTime getLastUpdateTimestamp() {
    return lastUpdateTimestamp;
  }

  public void setLastUpdateTimestamp(OffsetDateTime lastUpdateTimestamp) {
    this.lastUpdateTimestamp = lastUpdateTimestamp;
  }

  public ElectronicAddress lastUpdateUserID(String lastUpdateUserID) {
    this.lastUpdateUserID = lastUpdateUserID;
    return this;
  }

   /**
   * Last userID updating the electric address
   * @return lastUpdateUserID
  **/
  @ApiModelProperty(value = "Last userID updating the electric address")
  public String getLastUpdateUserID() {
    return lastUpdateUserID;
  }

  public void setLastUpdateUserID(String lastUpdateUserID) {
    this.lastUpdateUserID = lastUpdateUserID;
  }

  public ElectronicAddress lastUpdateSource(String lastUpdateSource) {
    this.lastUpdateSource = lastUpdateSource;
    return this;
  }

   /**
   * Last application updating the electric address
   * @return lastUpdateSource
  **/
  @ApiModelProperty(value = "Last application updating the electric address")
  public String getLastUpdateSource() {
    return lastUpdateSource;
  }

  public void setLastUpdateSource(String lastUpdateSource) {
    this.lastUpdateSource = lastUpdateSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElectronicAddress electronicAddress = (ElectronicAddress) o;
    return Objects.equals(this.locationID, electronicAddress.locationID) &&
        Objects.equals(this.uriID, electronicAddress.uriID) &&
        Objects.equals(this.useCode, electronicAddress.useCode) &&
        Objects.equals(this.preferredIndicator, electronicAddress.preferredIndicator) &&
        Objects.equals(this.invalidContactLocationReasonCode, electronicAddress.invalidContactLocationReasonCode) &&
        Objects.equals(this.invalidContactLocationDate, electronicAddress.invalidContactLocationDate) &&
        Objects.equals(this.invalidContactLocationSource, electronicAddress.invalidContactLocationSource) &&
        Objects.equals(this.lastUpdateTimestamp, electronicAddress.lastUpdateTimestamp) &&
        Objects.equals(this.lastUpdateUserID, electronicAddress.lastUpdateUserID) &&
        Objects.equals(this.lastUpdateSource, electronicAddress.lastUpdateSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationID, uriID, useCode, preferredIndicator, invalidContactLocationReasonCode, invalidContactLocationDate, invalidContactLocationSource, lastUpdateTimestamp, lastUpdateUserID, lastUpdateSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElectronicAddress {\n");
    
    sb.append("    locationID: ").append(toIndentedString(locationID)).append("\n");
    sb.append("    uriID: ").append(toIndentedString(uriID)).append("\n");
    sb.append("    useCode: ").append(toIndentedString(useCode)).append("\n");
    sb.append("    preferredIndicator: ").append(toIndentedString(preferredIndicator)).append("\n");
    sb.append("    invalidContactLocationReasonCode: ").append(toIndentedString(invalidContactLocationReasonCode)).append("\n");
    sb.append("    invalidContactLocationDate: ").append(toIndentedString(invalidContactLocationDate)).append("\n");
    sb.append("    invalidContactLocationSource: ").append(toIndentedString(invalidContactLocationSource)).append("\n");
    sb.append("    lastUpdateTimestamp: ").append(toIndentedString(lastUpdateTimestamp)).append("\n");
    sb.append("    lastUpdateUserID: ").append(toIndentedString(lastUpdateUserID)).append("\n");
    sb.append("    lastUpdateSource: ").append(toIndentedString(lastUpdateSource)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
