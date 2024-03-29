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
 * Response for the customer profile bulk APIs
 */
@ApiModel(description = "Response for the customer profile bulk APIs")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-15T15:26:36.821-05:00")
public class BulkProfileResponse {
  @JsonProperty("responseHeader")
  private ResponseHeader responseHeader = null;

  @JsonProperty("customers")
  private List<Customer> customers = null;

  public BulkProfileResponse responseHeader(ResponseHeader responseHeader) {
    this.responseHeader = responseHeader;
    return this;
  }

   /**
   * Get responseHeader
   * @return responseHeader
  **/
  @ApiModelProperty(required = true, value = "")
  public ResponseHeader getResponseHeader() {
    return responseHeader;
  }

  public void setResponseHeader(ResponseHeader responseHeader) {
    this.responseHeader = responseHeader;
  }

  public BulkProfileResponse customers(List<Customer> customers) {
    this.customers = customers;
    return this;
  }

  public BulkProfileResponse addCustomersItem(Customer customersItem) {
    if (this.customers == null) {
      this.customers = new ArrayList<>();
    }
    this.customers.add(customersItem);
    return this;
  }

   /**
   * Customers from the request with partyID
   * @return customers
  **/
  @ApiModelProperty(value = "Customers from the request with partyID")
  public List<Customer> getCustomers() {
    return customers;
  }

  public void setCustomers(List<Customer> customers) {
    this.customers = customers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkProfileResponse bulkProfileResponse = (BulkProfileResponse) o;
    return Objects.equals(this.responseHeader, bulkProfileResponse.responseHeader) &&
        Objects.equals(this.customers, bulkProfileResponse.customers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, customers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkProfileResponse {\n");
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    customers: ").append(toIndentedString(customers)).append("\n");
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

