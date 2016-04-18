package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.FileKey;
import io.swagger.client.model.UserFileKeyList;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class CompleteUploadRequest   {
  


  public enum ResolutionStrategyEnum {
    AUTORENAME("autorename"),
    FAIL("fail"),
    OVERWRITE("overwrite");

    private String value;

    ResolutionStrategyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ResolutionStrategyEnum resolutionStrategy = null;
  private String fileName = null;
  private FileKey filekey = null;
  private UserFileKeyList userFileKeyList = null;

  
  /**
   * File name conflict resolution strategy
   **/
  public CompleteUploadRequest resolutionStrategy(ResolutionStrategyEnum resolutionStrategy) {
    this.resolutionStrategy = resolutionStrategy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "File name conflict resolution strategy")
  @JsonProperty("resolutionStrategy")
  public ResolutionStrategyEnum getResolutionStrategy() {
    return resolutionStrategy;
  }
  public void setResolutionStrategy(ResolutionStrategyEnum resolutionStrategy) {
    this.resolutionStrategy = resolutionStrategy;
  }


  /**
   * New file name to store with
   **/
  public CompleteUploadRequest fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "New file name to store with")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  /**
   * File key for this user; mandatory for uploads into encrypted rooms
   **/
  public CompleteUploadRequest filekey(FileKey filekey) {
    this.filekey = filekey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "File key for this user; mandatory for uploads into encrypted rooms")
  @JsonProperty("filekey")
  public FileKey getFilekey() {
    return filekey;
  }
  public void setFilekey(FileKey filekey) {
    this.filekey = filekey;
  }


  /**
   * List of Filekeys for Users; mandatory for uploads by public shares into encrypted rooms 
   **/
  public CompleteUploadRequest userFileKeyList(UserFileKeyList userFileKeyList) {
    this.userFileKeyList = userFileKeyList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of Filekeys for Users; mandatory for uploads by public shares into encrypted rooms ")
  @JsonProperty("userFileKeyList")
  public UserFileKeyList getUserFileKeyList() {
    return userFileKeyList;
  }
  public void setUserFileKeyList(UserFileKeyList userFileKeyList) {
    this.userFileKeyList = userFileKeyList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompleteUploadRequest completeUploadRequest = (CompleteUploadRequest) o;
    return Objects.equals(this.resolutionStrategy, completeUploadRequest.resolutionStrategy) &&
        Objects.equals(this.fileName, completeUploadRequest.fileName) &&
        Objects.equals(this.filekey, completeUploadRequest.filekey) &&
        Objects.equals(this.userFileKeyList, completeUploadRequest.userFileKeyList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolutionStrategy, fileName, filekey, userFileKeyList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompleteUploadRequest {\n");
    
    sb.append("    resolutionStrategy: ").append(toIndentedString(resolutionStrategy)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    filekey: ").append(toIndentedString(filekey)).append("\n");
    sb.append("    userFileKeyList: ").append(toIndentedString(userFileKeyList)).append("\n");
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

