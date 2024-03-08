/*
 * CDMS Customer API
 * CDMS Customer API will provide a set of the REST API for operations on Customer Data Management System (CDMS)
 *
 * OpenAPI spec version: 1.0
 * Contact: johnson_ouyang@toyota.ca
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ca.toyota.bizservice.api.cdms;

import java.util.Objects;
import ca.toyota.bizservice.api.cdms.RequestHeader;
import ca.toyota.bizservice.api.cdms.VehicleOwnership;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request for the vehicle ownership APIs
 */
@ApiModel(description = "Request for the vehicle ownership APIs")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-15T15:26:36.821-05:00")
public class OwnershipRequest {
  @JsonProperty("requestHeader")
  private RequestHeader requestHeader = null;

  @JsonProperty("vehicleOwnership")
  private VehicleOwnership vehicleOwnership = null;

  public OwnershipRequest requestHeader(RequestHeader requestHeader) {
    this.requestHeader = requestHeader;
    return this;
  }

   /**
   * Get requestHeader
   * @return requestHeader
  **/
  @ApiModelProperty(required = true, value = "")
  public RequestHeader getRequestHeader() {
    return requestHeader;
  }

  public void setRequestHeader(RequestHeader requestHeader) {
    this.requestHeader = requestHeader;
  }

  public OwnershipRequest vehicleOwnership(VehicleOwnership vehicleOwnership) {
    this.vehicleOwnership = vehicleOwnership;
    return this;
  }

   /**
   * Get vehicleOwnership
   * @return vehicleOwnership
  **/
  @ApiModelProperty(required = true, value = "")
  public VehicleOwnership getVehicleOwnership() {
    return vehicleOwnership;
  }

  public void setVehicleOwnership(VehicleOwnership vehicleOwnership) {
    this.vehicleOwnership = vehicleOwnership;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnershipRequest ownershipRequest = (OwnershipRequest) o;
    return Objects.equals(this.requestHeader, ownershipRequest.requestHeader) &&
        Objects.equals(this.vehicleOwnership, ownershipRequest.vehicleOwnership);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeader, vehicleOwnership);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnershipRequest {\n");
    
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    sb.append("    vehicleOwnership: ").append(toIndentedString(vehicleOwnership)).append("\n");
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

