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
public class UpdateGroupRequest   {
  
  private String name = null;
  private Date expireAt = null;
  private List<Long> users = new ArrayList<Long>();
  private List<GroupRoom> rooms = new ArrayList<GroupRoom>();

  
  /**
   * Group name
   **/
  public UpdateGroupRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Group name")
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
  public UpdateGroupRequest expireAt(Date expireAt) {
    this.expireAt = expireAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Expiration date (2015-12-31T23:59:00). Max year is limited to 9999")
  @JsonProperty("expireAt")
  public Date getExpireAt() {
    return expireAt;
  }
  public void setExpireAt(Date expireAt) {
    this.expireAt = expireAt;
  }


  /**
   * Member user IDs. If set to null, the current group members will not be affected.
   **/
  public UpdateGroupRequest users(List<Long> users) {
    this.users = users;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Member user IDs. If set to null, the current group members will not be affected.")
  @JsonProperty("users")
  public List<Long> getUsers() {
    return users;
  }
  public void setUsers(List<Long> users) {
    this.users = users;
  }


  /**
   * Assigned rooms. If set to null, the current group teams will not be affected
   **/
  public UpdateGroupRequest rooms(List<GroupRoom> rooms) {
    this.rooms = rooms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Assigned rooms. If set to null, the current group teams will not be affected")
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
    UpdateGroupRequest updateGroupRequest = (UpdateGroupRequest) o;
    return Objects.equals(this.name, updateGroupRequest.name) &&
        Objects.equals(this.expireAt, updateGroupRequest.expireAt) &&
        Objects.equals(this.users, updateGroupRequest.users) &&
        Objects.equals(this.rooms, updateGroupRequest.rooms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, expireAt, users, rooms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGroupRequest {\n");
    
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

