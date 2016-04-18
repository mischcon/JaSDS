package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class UserGlobalPermissions   {
  
  private Boolean manageDataspace = null;
  private Boolean manageUsers = null;

  
  /**
   * Manage all
   **/
  public UserGlobalPermissions manageDataspace(Boolean manageDataspace) {
    this.manageDataspace = manageDataspace;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Manage all")
  @JsonProperty("manageDataspace")
  public Boolean getManageDataspace() {
    return manageDataspace;
  }
  public void setManageDataspace(Boolean manageDataspace) {
    this.manageDataspace = manageDataspace;
  }


  /**
   * Manage users
   **/
  public UserGlobalPermissions manageUsers(Boolean manageUsers) {
    this.manageUsers = manageUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Manage users")
  @JsonProperty("manageUsers")
  public Boolean getManageUsers() {
    return manageUsers;
  }
  public void setManageUsers(Boolean manageUsers) {
    this.manageUsers = manageUsers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGlobalPermissions userGlobalPermissions = (UserGlobalPermissions) o;
    return Objects.equals(this.manageDataspace, userGlobalPermissions.manageDataspace) &&
        Objects.equals(this.manageUsers, userGlobalPermissions.manageUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manageDataspace, manageUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGlobalPermissions {\n");
    
    sb.append("    manageDataspace: ").append(toIndentedString(manageDataspace)).append("\n");
    sb.append("    manageUsers: ").append(toIndentedString(manageUsers)).append("\n");
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

