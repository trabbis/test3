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
import ca.toyota.bizservice.api.cdms.Customer;
import ca.toyota.bizservice.api.cdms.ResponseHeader;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * SuspendCustomerResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-15T15:26:36.821-05:00")
public class SuspendCustomerResponse {
  @JsonProperty("responseHeader")
  private ResponseHeader responseHeader = null;

  @JsonProperty("customer")
  private Customer customer = null;

  @JsonProperty("terminatedVehicleIDs")
  private List<String> terminatedVehicleIDs = null;

  public SuspendCustomerResponse responseHeader(ResponseHeader responseHeader) {
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

  public SuspendCustomerResponse customer(Customer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public SuspendCustomerResponse terminatedVehicleIDs(List<String> terminatedVehicleIDs) {
    this.terminatedVehicleIDs = terminatedVehicleIDs;
    return this;
  }

  public SuspendCustomerResponse addTerminatedVehicleIDsItem(String terminatedVehicleIDsItem) {
    if (this.terminatedVehicleIDs == null) {
      this.terminatedVehicleIDs = new ArrayList<>();
    }
    this.terminatedVehicleIDs.add(terminatedVehicleIDsItem);
    return this;
  }

   /**
   * Array of the vehicle identification numbers having been terminated
   * @return terminatedVehicleIDs
  **/
  @ApiModelProperty(value = "Array of the vehicle identification numbers having been terminated")
  public List<String> getTerminatedVehicleIDs() {
    return terminatedVehicleIDs;
  }

  public void setTerminatedVehicleIDs(List<String> terminatedVehicleIDs) {
    this.terminatedVehicleIDs = terminatedVehicleIDs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuspendCustomerResponse suspendCustomerResponse = (SuspendCustomerResponse) o;
    return Objects.equals(this.responseHeader, suspendCustomerResponse.responseHeader) &&
        Objects.equals(this.customer, suspendCustomerResponse.customer) &&
        Objects.equals(this.terminatedVehicleIDs, suspendCustomerResponse.terminatedVehicleIDs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, customer, terminatedVehicleIDs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuspendCustomerResponse {\n");
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    terminatedVehicleIDs: ").append(toIndentedString(terminatedVehicleIDs)).append("\n");
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

