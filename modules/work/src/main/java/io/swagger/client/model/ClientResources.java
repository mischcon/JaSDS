package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class ClientResources   {
  
  private Object nodeTypes = null;
  private Object syslogEventMessages = null;
  private Object userRoomPermissions = null;
  private Object strings = null;

  
  /**
   * Node type names by id
   **/
  public ClientResources nodeTypes(Object nodeTypes) {
    this.nodeTypes = nodeTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Node type names by id")
  @JsonProperty("nodeTypes")
  public Object getNodeTypes() {
    return nodeTypes;
  }
  public void setNodeTypes(Object nodeTypes) {
    this.nodeTypes = nodeTypes;
  }


  /**
   * Syslog message templates by message code
   **/
  public ClientResources syslogEventMessages(Object syslogEventMessages) {
    this.syslogEventMessages = syslogEventMessages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Syslog message templates by message code")
  @JsonProperty("syslogEventMessages")
  public Object getSyslogEventMessages() {
    return syslogEventMessages;
  }
  public void setSyslogEventMessages(Object syslogEventMessages) {
    this.syslogEventMessages = syslogEventMessages;
  }


  /**
   * Permission name by id
   **/
  public ClientResources userRoomPermissions(Object userRoomPermissions) {
    this.userRoomPermissions = userRoomPermissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Permission name by id")
  @JsonProperty("userRoomPermissions")
  public Object getUserRoomPermissions() {
    return userRoomPermissions;
  }
  public void setUserRoomPermissions(Object userRoomPermissions) {
    this.userRoomPermissions = userRoomPermissions;
  }


  /**
   * Other resounrce bundles
   **/
  public ClientResources strings(Object strings) {
    this.strings = strings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Other resounrce bundles")
  @JsonProperty("strings")
  public Object getStrings() {
    return strings;
  }
  public void setStrings(Object strings) {
    this.strings = strings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientResources clientResources = (ClientResources) o;
    return Objects.equals(this.nodeTypes, clientResources.nodeTypes) &&
        Objects.equals(this.syslogEventMessages, clientResources.syslogEventMessages) &&
        Objects.equals(this.userRoomPermissions, clientResources.userRoomPermissions) &&
        Objects.equals(this.strings, clientResources.strings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeTypes, syslogEventMessages, userRoomPermissions, strings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientResources {\n");
    
    sb.append("    nodeTypes: ").append(toIndentedString(nodeTypes)).append("\n");
    sb.append("    syslogEventMessages: ").append(toIndentedString(syslogEventMessages)).append("\n");
    sb.append("    userRoomPermissions: ").append(toIndentedString(userRoomPermissions)).append("\n");
    sb.append("    strings: ").append(toIndentedString(strings)).append("\n");
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

