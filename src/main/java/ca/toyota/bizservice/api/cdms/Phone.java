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
 * Phone
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-15T15:26:37.695-05:00")
public class Phone {
  @JsonProperty("locationID")
  private Long locationID = null;

  @JsonProperty("localNumber")
  private String localNumber = null;

  @JsonProperty("extensionNumber")
  private String extensionNumber = null;

  @JsonProperty("areaCode")
  private String areaCode = null;

  /**
   * The code specifying the use of this communication. The optional value is HOME, WORK, FAX or MOBILE
   */
  public enum UseCodeEnum {
    HOME("HOME"),
    
    WORK("WORK"),
    
    FAX("FAX"),
    
    MOBILE("MOBILE");

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

  public Phone locationID(Long locationID) {
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

  public Phone localNumber(String localNumber) {
    this.localNumber = localNumber;
    return this;
  }

   /**
   * The communication number, expressed as text and not including country access code or the area number code, for this communication
   * @return localNumber
  **/
  @ApiModelProperty(required = true, value = "The communication number, expressed as text and not including country access code or the area number code, for this communication")
  public String getLocalNumber() {
    return localNumber;
  }

  public void setLocalNumber(String localNumber) {
    this.localNumber = localNumber;
  }

  public Phone extensionNumber(String extensionNumber) {
    this.extensionNumber = extensionNumber;
    return this;
  }

   /**
   * The extension number, expressed as text, assigned to this communication number to enable a caller to reach a specific party
   * @return extensionNumber
  **/
  @ApiModelProperty(value = "The extension number, expressed as text, assigned to this communication number to enable a caller to reach a specific party")
  public String getExtensionNumber() {
    return extensionNumber;
  }

  public void setExtensionNumber(String extensionNumber) {
    this.extensionNumber = extensionNumber;
  }

  public Phone areaCode(String areaCode) {
    this.areaCode = areaCode;
    return this;
  }

   /**
   * The code specifying the area number typically used in communication. This is also known in the US as the Area Code
   * @return areaCode
  **/
  @ApiModelProperty(required = true, value = "The code specifying the area number typically used in communication. This is also known in the US as the Area Code")
  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }

  public Phone useCode(UseCodeEnum useCode) {
    this.useCode = useCode;
    return this;
  }

   /**
   * The code specifying the use of this communication. The optional value is HOME, WORK, FAX or MOBILE
   * @return useCode
  **/
  @ApiModelProperty(value = "The code specifying the use of this communication. The optional value is HOME, WORK, FAX or MOBILE")
  public UseCodeEnum getUseCode() {
    return useCode;
  }

  public void setUseCode(UseCodeEnum useCode) {
    this.useCode = useCode;
  }

  public Phone preferredIndicator(Boolean preferredIndicator) {
    this.preferredIndicator = preferredIndicator;
    return this;
  }

   /**
   * The indication of whether this phone is preferred for communication
   * @return preferredIndicator
  **/
  @ApiModelProperty(value = "The indication of whether this phone is preferred for communication")
  public Boolean isPreferredIndicator() {
    return preferredIndicator;
  }

  public void setPreferredIndicator(Boolean preferredIndicator) {
    this.preferredIndicator = preferredIndicator;
  }

  public Phone invalidContactLocationReasonCode(String invalidContactLocationReasonCode) {
    this.invalidContactLocationReasonCode = invalidContactLocationReasonCode;
    return this;
  }

   /**
   * Reason code that makes this phone not reachable
   * @return invalidContactLocationReasonCode
  **/
  @ApiModelProperty(value = "Reason code that makes this phone not reachable")
  public String getInvalidContactLocationReasonCode() {
    return invalidContactLocationReasonCode;
  }

  public void setInvalidContactLocationReasonCode(String invalidContactLocationReasonCode) {
    this.invalidContactLocationReasonCode = invalidContactLocationReasonCode;
  }

  public Phone invalidContactLocationDate(LocalDate invalidContactLocationDate) {
    this.invalidContactLocationDate = invalidContactLocationDate;
    return this;
  }

   /**
   * Start date of this phone not reachable
   * @return invalidContactLocationDate
  **/
  @ApiModelProperty(value = "Start date of this phone not reachable")
  public LocalDate getInvalidContactLocationDate() {
    return invalidContactLocationDate;
  }

  public void setInvalidContactLocationDate(LocalDate invalidContactLocationDate) {
    this.invalidContactLocationDate = invalidContactLocationDate;
  }

  public Phone invalidContactLocationSource(String invalidContactLocationSource) {
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

  public Phone lastUpdateTimestamp(OffsetDateTime lastUpdateTimestamp) {
    this.lastUpdateTimestamp = lastUpdateTimestamp;
    return this;
  }

   /**
   * Last date and time for updating the phone
   * @return lastUpdateTimestamp
  **/
  @ApiModelProperty(value = "Last date and time for updating the phone")
  public OffsetDateTime getLastUpdateTimestamp() {
    return lastUpdateTimestamp;
  }

  public void setLastUpdateTimestamp(OffsetDateTime lastUpdateTimestamp) {
    this.lastUpdateTimestamp = lastUpdateTimestamp;
  }

  public Phone lastUpdateUserID(String lastUpdateUserID) {
    this.lastUpdateUserID = lastUpdateUserID;
    return this;
  }

   /**
   * Last userID updating the phone
   * @return lastUpdateUserID
  **/
  @ApiModelProperty(value = "Last userID updating the phone")
  public String getLastUpdateUserID() {
    return lastUpdateUserID;
  }

  public void setLastUpdateUserID(String lastUpdateUserID) {
    this.lastUpdateUserID = lastUpdateUserID;
  }

  public Phone lastUpdateSource(String lastUpdateSource) {
    this.lastUpdateSource = lastUpdateSource;
    return this;
  }

   /**
   * Last application updating the phone
   * @return lastUpdateSource
  **/
  @ApiModelProperty(value = "Last application updating the phone")
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
    Phone phone = (Phone) o;
    return Objects.equals(this.locationID, phone.locationID) &&
        Objects.equals(this.localNumber, phone.localNumber) &&
        Objects.equals(this.extensionNumber, phone.extensionNumber) &&
        Objects.equals(this.areaCode, phone.areaCode) &&
        Objects.equals(this.useCode, phone.useCode) &&
        Objects.equals(this.preferredIndicator, phone.preferredIndicator) &&
        Objects.equals(this.invalidContactLocationReasonCode, phone.invalidContactLocationReasonCode) &&
        Objects.equals(this.invalidContactLocationDate, phone.invalidContactLocationDate) &&
        Objects.equals(this.invalidContactLocationSource, phone.invalidContactLocationSource) &&
        Objects.equals(this.lastUpdateTimestamp, phone.lastUpdateTimestamp) &&
        Objects.equals(this.lastUpdateUserID, phone.lastUpdateUserID) &&
        Objects.equals(this.lastUpdateSource, phone.lastUpdateSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationID, localNumber, extensionNumber, areaCode, useCode, preferredIndicator, invalidContactLocationReasonCode, invalidContactLocationDate, invalidContactLocationSource, lastUpdateTimestamp, lastUpdateUserID, lastUpdateSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phone {\n");
    
    sb.append("    locationID: ").append(toIndentedString(locationID)).append("\n");
    sb.append("    localNumber: ").append(toIndentedString(localNumber)).append("\n");
    sb.append("    extensionNumber: ").append(toIndentedString(extensionNumber)).append("\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
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

