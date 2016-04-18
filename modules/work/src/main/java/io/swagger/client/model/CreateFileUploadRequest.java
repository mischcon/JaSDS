package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class CreateFileUploadRequest   {
  
  private Long parentId = null;
  private String name = null;
  private Long size = null;
  private Date expireAt = null;
  private Integer classification = null;
  private String notes = null;

  
  /**
   * Target room or folder ID.
   **/
  public CreateFileUploadRequest parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Target room or folder ID.")
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }


  /**
   * File name
   **/
  public CreateFileUploadRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "File name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * File size in byte
   **/
  public CreateFileUploadRequest size(Long size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "File size in byte")
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }


  /**
   * Expiration date (2015-12-31T23:59:00). Max year is limited to 9999
   **/
  public CreateFileUploadRequest expireAt(Date expireAt) {
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
   * Classification
   **/
  public CreateFileUploadRequest classification(Integer classification) {
    this.classification = classification;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Classification")
  @JsonProperty("classification")
  public Integer getClassification() {
    return classification;
  }
  public void setClassification(Integer classification) {
    this.classification = classification;
  }


  /**
   * User notes
   **/
  public CreateFileUploadRequest notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User notes")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFileUploadRequest createFileUploadRequest = (CreateFileUploadRequest) o;
    return Objects.equals(this.parentId, createFileUploadRequest.parentId) &&
        Objects.equals(this.name, createFileUploadRequest.name) &&
        Objects.equals(this.size, createFileUploadRequest.size) &&
        Objects.equals(this.expireAt, createFileUploadRequest.expireAt) &&
        Objects.equals(this.classification, createFileUploadRequest.classification) &&
        Objects.equals(this.notes, createFileUploadRequest.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, name, size, expireAt, classification, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFileUploadRequest {\n");
    
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

