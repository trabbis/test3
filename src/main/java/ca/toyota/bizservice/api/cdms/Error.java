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

/**
 * Error
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-15T15:26:37.695-05:00")
public class Error {
  @JsonProperty("httpCode")
  private Integer httpCode = null;

  @JsonProperty("httpMessage")
  private String httpMessage = null;

  @JsonProperty("moreInformation")
  private String moreInformation = null;

  public Error httpCode(Integer httpCode) {
    this.httpCode = httpCode;
    return this;
  }

   /**
   * Get httpCode
   * @return httpCode
  **/
  @ApiModelProperty(example = "999", value = "")
  public Integer getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(Integer httpCode) {
    this.httpCode = httpCode;
  }

  public Error httpMessage(String httpMessage) {
    this.httpMessage = httpMessage;
    return this;
  }

   /**
   * Get httpMessage
   * @return httpMessage
  **/
  @ApiModelProperty(example = "Some Kind of error", value = "")
  public String getHttpMessage() {
    return httpMessage;
  }

  public void setHttpMessage(String httpMessage) {
    this.httpMessage = httpMessage;
  }

  public Error moreInformation(String moreInformation) {
    this.moreInformation = moreInformation;
    return this;
  }

   /**
   * Get moreInformation
   * @return moreInformation
  **/
  @ApiModelProperty(example = "9001 | standard party id {id} not exists.", value = "")
  public String getMoreInformation() {
    return moreInformation;
  }

  public void setMoreInformation(String moreInformation) {
    this.moreInformation = moreInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.httpCode, error.httpCode) &&
        Objects.equals(this.httpMessage, error.httpMessage) &&
        Objects.equals(this.moreInformation, error.moreInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpCode, httpMessage, moreInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    httpMessage: ").append(toIndentedString(httpMessage)).append("\n");
    sb.append("    moreInformation: ").append(toIndentedString(moreInformation)).append("\n");
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

