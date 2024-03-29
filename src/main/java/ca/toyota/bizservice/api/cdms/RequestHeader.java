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
 * RequestHeader
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-15T15:26:37.695-05:00")
public class RequestHeader {
  /**
   * Toyota, Lexus etc.
   */
  public enum SourceEnum {
    TOYOTA("Toyota"),
    
    LEXUS("Lexus");

    private String value;

    SourceEnum(String value) {
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
    public static SourceEnum fromValue(String text) {
      for (SourceEnum b : SourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("source")
  private SourceEnum source = null;

  @JsonProperty("applicationId")
  private String applicationId = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("transactionId")
  private String transactionId = null;

  /**
   * Local en_CA, fr_CA, etc.
   */
  public enum RequestLanguageEnum {
    EN_CA("en_CA"),
    
    FR_CA("fr_CA");

    private String value;

    RequestLanguageEnum(String value) {
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
    public static RequestLanguageEnum fromValue(String text) {
      for (RequestLanguageEnum b : RequestLanguageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("requestLanguage")
  private RequestLanguageEnum requestLanguage = null;

  public RequestHeader source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * Toyota, Lexus etc.
   * @return source
  **/
  @ApiModelProperty(example = "Toyota", required = true, value = "Toyota, Lexus etc.")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  public RequestHeader applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Calling application
   * @return applicationId
  **/
  @ApiModelProperty(value = "Calling application")
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public RequestHeader userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * User logged into system
   * @return userId
  **/
  @ApiModelProperty(value = "User logged into system")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public RequestHeader transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Unique transaction ID, prefer to GUID
   * @return transactionId
  **/
  @ApiModelProperty(required = true, value = "Unique transaction ID, prefer to GUID")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public RequestHeader requestLanguage(RequestLanguageEnum requestLanguage) {
    this.requestLanguage = requestLanguage;
    return this;
  }

   /**
   * Local en_CA, fr_CA, etc.
   * @return requestLanguage
  **/
  @ApiModelProperty(value = "Local en_CA, fr_CA, etc.")
  public RequestLanguageEnum getRequestLanguage() {
    return requestLanguage;
  }

  public void setRequestLanguage(RequestLanguageEnum requestLanguage) {
    this.requestLanguage = requestLanguage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestHeader requestHeader = (RequestHeader) o;
    return Objects.equals(this.source, requestHeader.source) &&
        Objects.equals(this.applicationId, requestHeader.applicationId) &&
        Objects.equals(this.userId, requestHeader.userId) &&
        Objects.equals(this.transactionId, requestHeader.transactionId) &&
        Objects.equals(this.requestLanguage, requestHeader.requestLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, applicationId, userId, transactionId, requestLanguage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestHeader {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    requestLanguage: ").append(toIndentedString(requestLanguage)).append("\n");
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

