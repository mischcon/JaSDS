package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.FileKeyContainer;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class FileFileKeys   {
  
  private Long id = null;
  private FileKeyContainer filekey = null;

  
  /**
   * File Id
   **/
  public FileFileKeys id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "File Id")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * File Key for the current user
   **/
  public FileFileKeys filekey(FileKeyContainer filekey) {
    this.filekey = filekey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "File Key for the current user")
  @JsonProperty("filekey")
  public FileKeyContainer getFilekey() {
    return filekey;
  }
  public void setFilekey(FileKeyContainer filekey) {
    this.filekey = filekey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileFileKeys fileFileKeys = (FileFileKeys) o;
    return Objects.equals(this.id, fileFileKeys.id) &&
        Objects.equals(this.filekey, fileFileKeys.filekey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, filekey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileFileKeys {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    filekey: ").append(toIndentedString(filekey)).append("\n");
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

