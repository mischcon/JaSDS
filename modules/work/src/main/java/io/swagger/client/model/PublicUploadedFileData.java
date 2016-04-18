package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class PublicUploadedFileData   {
  
  private String name = null;
  private Long size = null;
  private Date createdAt = null;

  
  /**
   * Name
   **/
  public PublicUploadedFileData name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * File size
   **/
  public PublicUploadedFileData size(Long size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "File size")
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }


  /**
   * Creation time (2015-12-31T23:59:00)
   **/
  public PublicUploadedFileData createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Creation time (2015-12-31T23:59:00)")
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicUploadedFileData publicUploadedFileData = (PublicUploadedFileData) o;
    return Objects.equals(this.name, publicUploadedFileData.name) &&
        Objects.equals(this.size, publicUploadedFileData.size) &&
        Objects.equals(this.createdAt, publicUploadedFileData.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, size, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicUploadedFileData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

