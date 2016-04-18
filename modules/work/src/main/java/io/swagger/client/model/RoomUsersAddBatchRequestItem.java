package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.RoomPermissions;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class RoomUsersAddBatchRequestItem   {
  
  private Long id = null;
  private RoomPermissions permissions = null;

  
  /**
   * User Id
   **/
  public RoomUsersAddBatchRequestItem id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User Id")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * User permissions
   **/
  public RoomUsersAddBatchRequestItem permissions(RoomPermissions permissions) {
    this.permissions = permissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User permissions")
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
    RoomUsersAddBatchRequestItem roomUsersAddBatchRequestItem = (RoomUsersAddBatchRequestItem) o;
    return Objects.equals(this.id, roomUsersAddBatchRequestItem.id) &&
        Objects.equals(this.permissions, roomUsersAddBatchRequestItem.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomUsersAddBatchRequestItem {\n");
    
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

