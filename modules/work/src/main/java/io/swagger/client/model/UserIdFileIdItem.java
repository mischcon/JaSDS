package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class UserIdFileIdItem   {
  
  private Long userid = null;
  private Long fileid = null;

  
  /**
   * User Id
   **/
  public UserIdFileIdItem userid(Long userid) {
    this.userid = userid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User Id")
  @JsonProperty("userid")
  public Long getUserid() {
    return userid;
  }
  public void setUserid(Long userid) {
    this.userid = userid;
  }


  /**
   * File Id
   **/
  public UserIdFileIdItem fileid(Long fileid) {
    this.fileid = fileid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "File Id")
  @JsonProperty("fileid")
  public Long getFileid() {
    return fileid;
  }
  public void setFileid(Long fileid) {
    this.fileid = fileid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserIdFileIdItem userIdFileIdItem = (UserIdFileIdItem) o;
    return Objects.equals(this.userid, userIdFileIdItem.userid) &&
        Objects.equals(this.fileid, userIdFileIdItem.fileid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userid, fileid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserIdFileIdItem {\n");
    
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
    sb.append("    fileid: ").append(toIndentedString(fileid)).append("\n");
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

