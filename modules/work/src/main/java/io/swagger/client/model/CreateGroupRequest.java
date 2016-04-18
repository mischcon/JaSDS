package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GroupRoom;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class CreateGroupRequest   {
  
  private String name = null;
  private Date expireAt = null;
  private List<Long> users = new ArrayList<Long>();
  private List<GroupRoom> rooms = new ArrayList<GroupRoom>();

  
  /**
   * Group name
   **/
  public CreateGroupRequest name(String name) {
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
   * Expiration date (2015-12-31T23:59:00). Max year is limited to 9999
   **/
  public CreateGroupRequest expireAt(Date expireAt) {
    this.expireAt = expireAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Expiration date (2015-12-31T23:59:00). Max year is limited to 9999")
  @JsonProperty("expireAt")
  public Date getExpireAt() {
    return expireAt;
  }
  public void setExpireAt(Date expireAt) {
    this.expireAt = expireAt;
  }


  /**
   * Member user IDs
   **/
  public CreateGroupRequest users(List<Long> users) {
    this.users = users;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Member user IDs")
  @JsonProperty("users")
  public List<Long> getUsers() {
    return users;
  }
  public void setUsers(List<Long> users) {
    this.users = users;
  }


  /**
   * Assigned rooms
   **/
  public CreateGroupRequest rooms(List<GroupRoom> rooms) {
    this.rooms = rooms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Assigned rooms")
  @JsonProperty("rooms")
  public List<GroupRoom> getRooms() {
    return rooms;
  }
  public void setRooms(List<GroupRoom> rooms) {
    this.rooms = rooms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroupRequest createGroupRequest = (CreateGroupRequest) o;
    return Objects.equals(this.name, createGroupRequest.name) &&
        Objects.equals(this.expireAt, createGroupRequest.expireAt) &&
        Objects.equals(this.users, createGroupRequest.users) &&
        Objects.equals(this.rooms, createGroupRequest.rooms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, expireAt, users, rooms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroupRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    rooms: ").append(toIndentedString(rooms)).append("\n");
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

