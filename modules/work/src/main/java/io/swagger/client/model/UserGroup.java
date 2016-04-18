package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class UserGroup   {
  
  private Long id = null;
  private Boolean isMember = null;
  private String name = null;

  
  /**
   * Group ID
   **/
  public UserGroup id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Group ID")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Is user member of the group
   **/
  public UserGroup isMember(Boolean isMember) {
    this.isMember = isMember;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Is user member of the group")
  @JsonProperty("isMember")
  public Boolean getIsMember() {
    return isMember;
  }
  public void setIsMember(Boolean isMember) {
    this.isMember = isMember;
  }


  /**
   * Group name
   **/
  public UserGroup name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGroup userGroup = (UserGroup) o;
    return Objects.equals(this.id, userGroup.id) &&
        Objects.equals(this.isMember, userGroup.isMember) &&
        Objects.equals(this.name, userGroup.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isMember, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isMember: ").append(toIndentedString(isMember)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

