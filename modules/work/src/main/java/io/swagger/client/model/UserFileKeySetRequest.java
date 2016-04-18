package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.FileKey;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class UserFileKeySetRequest   {
  
  private Long fileId = null;
  private Long userId = null;
  private FileKey fileKey = null;

  
  /**
   * File Id
   **/
  public UserFileKeySetRequest fileId(Long fileId) {
    this.fileId = fileId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "File Id")
  @JsonProperty("file_id")
  public Long getFileId() {
    return fileId;
  }
  public void setFileId(Long fileId) {
    this.fileId = fileId;
  }


  /**
   * User Id
   **/
  public UserFileKeySetRequest userId(Long userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User Id")
  @JsonProperty("user_id")
  public Long getUserId() {
    return userId;
  }
  public void setUserId(Long userId) {
    this.userId = userId;
  }


  /**
   * Filekeys
   **/
  public UserFileKeySetRequest fileKey(FileKey fileKey) {
    this.fileKey = fileKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Filekeys")
  @JsonProperty("file_key")
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
    UserFileKeySetRequest userFileKeySetRequest = (UserFileKeySetRequest) o;
    return Objects.equals(this.fileId, userFileKeySetRequest.fileId) &&
        Objects.equals(this.userId, userFileKeySetRequest.userId) &&
        Objects.equals(this.fileKey, userFileKeySetRequest.fileKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, userId, fileKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFileKeySetRequest {\n");
    
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
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

