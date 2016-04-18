package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.BulkErrorInfos;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class BulkErrorResponse   {
  
  private Integer code = null;
  private String message = null;
  private String debugInfo = null;
  private Integer errorCode = null;
  private BulkErrorInfos errorInfos = null;

  
  /**
   * HTTP status code
   **/
  public BulkErrorResponse code(Integer code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "HTTP status code")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }


  /**
   * HTTP status code description
   **/
  public BulkErrorResponse message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "HTTP status code description")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * Debug information
   **/
  public BulkErrorResponse debugInfo(String debugInfo) {
    this.debugInfo = debugInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Debug information")
  @JsonProperty("debugInfo")
  public String getDebugInfo() {
    return debugInfo;
  }
  public void setDebugInfo(String debugInfo) {
    this.debugInfo = debugInfo;
  }


  /**
   * Error code
   **/
  public BulkErrorResponse errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Error code")
  @JsonProperty("errorCode")
  public Integer getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }


  /**
   **/
  public BulkErrorResponse errorInfos(BulkErrorInfos errorInfos) {
    this.errorInfos = errorInfos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfos")
  public BulkErrorInfos getErrorInfos() {
    return errorInfos;
  }
  public void setErrorInfos(BulkErrorInfos errorInfos) {
    this.errorInfos = errorInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkErrorResponse bulkErrorResponse = (BulkErrorResponse) o;
    return Objects.equals(this.code, bulkErrorResponse.code) &&
        Objects.equals(this.message, bulkErrorResponse.message) &&
        Objects.equals(this.debugInfo, bulkErrorResponse.debugInfo) &&
        Objects.equals(this.errorCode, bulkErrorResponse.errorCode) &&
        Objects.equals(this.errorInfos, bulkErrorResponse.errorInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, debugInfo, errorCode, errorInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkErrorResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    debugInfo: ").append(toIndentedString(debugInfo)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorInfos: ").append(toIndentedString(errorInfos)).append("\n");
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

