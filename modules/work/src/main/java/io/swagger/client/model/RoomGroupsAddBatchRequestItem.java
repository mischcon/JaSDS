package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.RoomPermissions;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class RoomGroupsAddBatchRequestItem   {
  
  private Long id = null;
  private RoomPermissions permissions = null;

  
  /**
   * Group Id
   **/
  public RoomGroupsAddBatchRequestItem id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Group Id")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Group permissions
   **/
  public RoomGroupsAddBatchRequestItem permissions(RoomPermissions permissions) {
    this.permissions = permissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Group permissions")
  @JsonProperty("permissions")
  public RoomPermissions getPermissions() {
    return permissions;
  }
  public void setPermissions(RoomPermissions permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomGroupsAddBatchRequestItem roomGroupsAddBatchRequestItem = (RoomGroupsAddBatchRequestItem) o;
    return Objects.equals(this.id, roomGroupsAddBatchRequestItem.id) &&
        Objects.equals(this.permissions, roomGroupsAddBatchRequestItem.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomGroupsAddBatchRequestItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

