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
import ca.toyota.bizservice.api.cdms.OiccExtraInfo;
import ca.toyota.bizservice.api.cdms.ResponseHeader;
import ca.toyota.bizservice.api.cdms.VehicleOwnership;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-15T15:26:37.695-05:00")
public class OiccOwnershipChangeResponse {
  @JsonProperty("responseHeader")
  private ResponseHeader responseHeader = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    NEWVEHICLEREGISTRATION("NewVehicleRegistration"),
    
    USEDVEHICLEREGISTRATION("UsedVehicleRegistration"),
    
    CERTIFIEDVEHICLEREGISTRATION("CertifiedVehicleRegistration"),
    
    OWNERSHIPCHANGE("OwnershipChange");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("ownership")
  private VehicleOwnership ownership = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("oiccExtraInfo")
  private OiccExtraInfo oiccExtraInfo = null;

  public OiccOwnershipChangeResponse responseHeader(ResponseHeader responseHeader) {
    this.responseHeader = responseHeader;
    return this;
  }

   /**
   * Get responseHeader
   * @return responseHeader
  **/
  @ApiModelProperty(value = "")
  public ResponseHeader getResponseHeader() {
    return responseHeader;
  }

  public void setResponseHeader(ResponseHeader responseHeader) {
    this.responseHeader = responseHeader;
  }

  public OiccOwnershipChangeResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public OiccOwnershipChangeResponse ownership(VehicleOwnership ownership) {
    this.ownership = ownership;
    return this;
  }

   /**
   * Get ownership
   * @return ownership
  **/
  @ApiModelProperty(value = "")
  public VehicleOwnership getOwnership() {
    return ownership;
  }

  public void setOwnership(VehicleOwnership ownership) {
    this.ownership = ownership;
  }

  public OiccOwnershipChangeResponse source(String source) {
    this.source = source;
    return this;
  }

   /**
   * where trigger the change
   * @return source
  **/
  @ApiModelProperty(example = "OICC", value = "where trigger the change")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public OiccOwnershipChangeResponse oiccExtraInfo(OiccExtraInfo oiccExtraInfo) {
    this.oiccExtraInfo = oiccExtraInfo;
    return this;
  }

   /**
   * Get oiccExtraInfo
   * @return oiccExtraInfo
  **/
  @ApiModelProperty(value = "")
  public OiccExtraInfo getOiccExtraInfo() {
    return oiccExtraInfo;
  }

  public void setOiccExtraInfo(OiccExtraInfo oiccExtraInfo) {
    this.oiccExtraInfo = oiccExtraInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OiccOwnershipChangeResponse oiccOwnershipChangeResponse = (OiccOwnershipChangeResponse) o;
    return Objects.equals(this.responseHeader, oiccOwnershipChangeResponse.responseHeader) &&
        Objects.equals(this.type, oiccOwnershipChangeResponse.type) &&
        Objects.equals(this.ownership, oiccOwnershipChangeResponse.ownership) &&
        Objects.equals(this.source, oiccOwnershipChangeResponse.source) &&
        Objects.equals(this.oiccExtraInfo, oiccOwnershipChangeResponse.oiccExtraInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, type, ownership, source, oiccExtraInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OiccOwnershipChangeResponse {\n");
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ownership: ").append(toIndentedString(ownership)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    oiccExtraInfo: ").append(toIndentedString(oiccExtraInfo)).append("\n");
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

