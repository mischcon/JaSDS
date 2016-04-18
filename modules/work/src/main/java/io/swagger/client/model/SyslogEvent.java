package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class SyslogEvent   {
  
  private Long id = null;
  private Date time = null;
  private Integer operationId = null;
  private String operationName = null;
  private Long userId = null;
  private Integer status = null;
  private String message = null;
  private String userClient = null;

  
  /**
   * Event Id
   **/
  public SyslogEvent id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Event Id")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Event timestamp (2015-12-31T23:59:00)
   **/
  public SyslogEvent time(Date time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Event timestamp (2015-12-31T23:59:00)")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }


  /**
   * Operation type ID
   **/
  public SyslogEvent operationId(Integer operationId) {
    this.operationId = operationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Operation type ID")
  @JsonProperty("operationId")
  public Integer getOperationId() {
    return operationId;
  }
  public void setOperationId(Integer operationId) {
    this.operationId = operationId;
  }


  /**
   * Operation name
   **/
  public SyslogEvent operationName(String operationName) {
    this.operationName = operationName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Operation name")
  @JsonProperty("operationName")
  public String getOperationName() {
    return operationName;
  }
  public void setOperationName(String operationName) {
    this.operationName = operationName;
  }


  /**
   * User Id
   **/
  public SyslogEvent userId(Long userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User Id")
  @JsonProperty("userId")
  public Long getUserId() {
    return userId;
  }
  public void setUserId(Long userId) {
    this.userId = userId;
  }


  /**
   * Status code: 0=SUCCESS, 1=NOT_GRANTED, 2=ERROR
   **/
  public SyslogEvent status(Integer status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status code: 0=SUCCESS, 1=NOT_GRANTED, 2=ERROR")
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }


  /**
   * Event description
   **/
  public SyslogEvent message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Event description")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * Client client
   **/
  public SyslogEvent userClient(String userClient) {
    this.userClient = userClient;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Client client")
  @JsonProperty("userClient")
  public String getUserClient() {
    return userClient;
  }
  public void setUserClient(String userClient) {
    this.userClient = userClient;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyslogEvent syslogEvent = (SyslogEvent) o;
    return Objects.equals(this.id, syslogEvent.id) &&
        Objects.equals(this.time, syslogEvent.time) &&
        Objects.equals(this.operationId, syslogEvent.operationId) &&
        Objects.equals(this.operationName, syslogEvent.operationName) &&
        Objects.equals(this.userId, syslogEvent.userId) &&
        Objects.equals(this.status, syslogEvent.status) &&
        Objects.equals(this.message, syslogEvent.message) &&
        Objects.equals(this.userClient, syslogEvent.userClient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, time, operationId, operationName, userId, status, message, userClient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyslogEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    operationName: ").append(toIndentedString(operationName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    userClient: ").append(toIndentedString(userClient)).append("\n");
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

