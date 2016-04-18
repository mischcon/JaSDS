package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.RoomPermissions;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class RoomGroup   {
  
  private Long id = null;
  private Boolean isGranted = null;
  private String name = null;
  private RoomPermissions permissions = null;

  
  /**
   * Group Id
   **/
  public RoomGroup id(Long id) {
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
   * Is group granted room permissions
   **/
  public RoomGroup isGranted(Boolean isGranted) {
    this.isGranted = isGranted;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Is group granted room permissions")
  @JsonProperty("is_granted")
  public Boolean getIsGranted() {
    return isGranted;
  }
  public void setIsGranted(Boolean isGranted) {
    this.isGranted = isGranted;
  }


  /**
   * Group name
   **/
  public RoomGroup name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Group name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Group permissions. Empty for not granted groups
   **/
  public RoomGroup permissions(RoomPermissions permissions) {
    this.permissions = permissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Group permissions. Empty for not granted groups")
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
    RoomGroup roomGroup = (RoomGroup) o;
    return Objects.equals(this.id, roomGroup.id) &&
        Objects.equals(this.isGranted, roomGroup.isGranted) &&
        Objects.equals(this.name, roomGroup.name) &&
        Objects.equals(this.permissions, roomGroup.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isGranted, name, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isGranted: ").append(toIndentedString(isGranted)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

