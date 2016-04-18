package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.UserInfo;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class Group   {
  
  private Long id = null;
  private String name = null;
  private Date createdAt = null;
  private UserInfo createdBy = null;
  private Date updatedAt = null;
  private UserInfo updatedBy = null;
  private Date expireAt = null;
  private Integer cntUsers = null;

  
  /**
   * Group ID
   **/
  public Group id(Long id) {
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
   * Group name.
   **/
  public Group name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Group name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Creation date (2015-12-31T23:59:00).
   **/
  public Group createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Creation date (2015-12-31T23:59:00).")
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Created by user info
   **/
  public Group createdBy(UserInfo createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Created by user info")
  @JsonProperty("createdBy")
  public UserInfo getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UserInfo createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * Modification date (2015-12-31T23:59:00)
   **/
  public Group updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Modification date (2015-12-31T23:59:00)")
  @JsonProperty("updatedAt")
  public Date getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Modified by user info
   **/
  public Group updatedBy(UserInfo updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Modified by user info")
  @JsonProperty("updatedBy")
  public UserInfo getUpdatedBy() {
    return updatedBy;
  }
  public void setUpdatedBy(UserInfo updatedBy) {
    this.updatedBy = updatedBy;
  }


  /**
   * Expiration date (2015-12-31T23:59:00).
   **/
  public Group expireAt(Date expireAt) {
    this.expireAt = expireAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Expiration date (2015-12-31T23:59:00).")
  @JsonProperty("expireAt")
  public Date getExpireAt() {
    return expireAt;
  }
  public void setExpireAt(Date expireAt) {
    this.expireAt = expireAt;
  }


  /**
   * Amount of users.
   **/
  public Group cntUsers(Integer cntUsers) {
    this.cntUsers = cntUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Amount of users.")
  @JsonProperty("cntUsers")
  public Integer getCntUsers() {
    return cntUsers;
  }
  public void setCntUsers(Integer cntUsers) {
    this.cntUsers = cntUsers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.id, group.id) &&
        Objects.equals(this.name, group.name) &&
        Objects.equals(this.createdAt, group.createdAt) &&
        Objects.equals(this.createdBy, group.createdBy) &&
        Objects.equals(this.updatedAt, group.updatedAt) &&
        Objects.equals(this.updatedBy, group.updatedBy) &&
        Objects.equals(this.expireAt, group.expireAt) &&
        Objects.equals(this.cntUsers, group.cntUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdAt, createdBy, updatedAt, updatedBy, expireAt, cntUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    cntUsers: ").append(toIndentedString(cntUsers)).append("\n");
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

