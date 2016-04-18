package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.FileKey;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class UserFileKey   {
  
  private Long userId = null;
  private FileKey fileKey = null;

  
  /**
   * User ID
   **/
  public UserFileKey userId(Long userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User ID")
  @JsonProperty("userId")
  public Long getUserId() {
    return userId;
  }
  public void setUserId(Long userId) {
    this.userId = userId;
  }


  /**
   * File key
   **/
  public UserFileKey fileKey(FileKey fileKey) {
    this.fileKey = fileKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "File key")
  @JsonProperty("fileKey")
  public FileKey getFileKey() {
    return fileKey;
  }
  public void setFileKey(FileKey fileKey) {
    this.fileKey = fileKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFileKey userFileKey = (UserFileKey) o;
    return Objects.equals(this.userId, userFileKey.userId) &&
        Objects.equals(this.fileKey, userFileKey.fileKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, fileKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFileKey {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    fileKey: ").append(toIndentedString(fileKey)).append("\n");
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

