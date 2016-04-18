package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.FileKey;
import io.swagger.client.model.PrivateKeyContainer;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class PublicDownloadShare   {
  
  private Boolean isProtected = null;
  private String fileName = null;
  private String name = null;
  private Long size = null;
  private Boolean limitReached = null;
  private String creatorName = null;
  private String creatorUsername = null;
  private Date createdAt = null;
  private Date expireAt = null;
  private String notes = null;
  private Boolean isEncrypted = null;
  private FileKey fileKey = null;
  private PrivateKeyContainer privateKeyContainer = null;

  
  /**
   * Is protected by password
   **/
  public PublicDownloadShare isProtected(Boolean isProtected) {
    this.isProtected = isProtected;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Is protected by password")
  @JsonProperty("isProtected")
  public Boolean getIsProtected() {
    return isProtected;
  }
  public void setIsProtected(Boolean isProtected) {
    this.isProtected = isProtected;
  }


  /**
   * File name
   **/
  public PublicDownloadShare fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "File name")
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  /**
   * Share display name
   **/
  public PublicDownloadShare name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Share display name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * File size or container size not compressed
   **/
  public PublicDownloadShare size(Long size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "File size or container size not compressed")
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }


  /**
   * Downloads limit reached
   **/
  public PublicDownloadShare limitReached(Boolean limitReached) {
    this.limitReached = limitReached;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Downloads limit reached")
  @JsonProperty("limitReached")
  public Boolean getLimitReached() {
    return limitReached;
  }
  public void setLimitReached(Boolean limitReached) {
    this.limitReached = limitReached;
  }


  /**
   * Creator name
   **/
  public PublicDownloadShare creatorName(String creatorName) {
    this.creatorName = creatorName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Creator name")
  @JsonProperty("creatorName")
  public String getCreatorName() {
    return creatorName;
  }
  public void setCreatorName(String creatorName) {
    this.creatorName = creatorName;
  }


  /**
   * Creator user name
   **/
  public PublicDownloadShare creatorUsername(String creatorUsername) {
    this.creatorUsername = creatorUsername;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Creator user name")
  @JsonProperty("creatorUsername")
  public String getCreatorUsername() {
    return creatorUsername;
  }
  public void setCreatorUsername(String creatorUsername) {
    this.creatorUsername = creatorUsername;
  }


  /**
   * Creation time (2015-12-31T23:59:00)
   **/
  public PublicDownloadShare createdAt(Date createdAt) {
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


  /**
   * Expiration time (2015-12-31T23:59:00)
   **/
  public PublicDownloadShare expireAt(Date expireAt) {
    this.expireAt = expireAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Expiration time (2015-12-31T23:59:00)")
  @JsonProperty("expireAt")
  public Date getExpireAt() {
    return expireAt;
  }
  public void setExpireAt(Date expireAt) {
    this.expireAt = expireAt;
  }


  /**
   * User notes
   **/
  public PublicDownloadShare notes(String notes) {
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


  /**
   * True if file is end-to-end encrypted.
   **/
  public PublicDownloadShare isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "True if file is end-to-end encrypted.")
  @JsonProperty("isEncrypted")
  public Boolean getIsEncrypted() {
    return isEncrypted;
  }
  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }


  /**
   * File Key object if file is end-to-end encrypted.
   **/
  public PublicDownloadShare fileKey(FileKey fileKey) {
    this.fileKey = fileKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "File Key object if file is end-to-end encrypted.")
  @JsonProperty("fileKey")
  public FileKey getFileKey() {
    return fileKey;
  }
  public void setFileKey(FileKey fileKey) {
    this.fileKey = fileKey;
  }


  /**
   * Encrypted Private Key if file is end-to-end encrypted.
   **/
  public PublicDownloadShare privateKeyContainer(PrivateKeyContainer privateKeyContainer) {
    this.privateKeyContainer = privateKeyContainer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Encrypted Private Key if file is end-to-end encrypted.")
  @JsonProperty("privateKeyContainer")
  public PrivateKeyContainer getPrivateKeyContainer() {
    return privateKeyContainer;
  }
  public void setPrivateKeyContainer(PrivateKeyContainer privateKeyContainer) {
    this.privateKeyContainer = privateKeyContainer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicDownloadShare publicDownloadShare = (PublicDownloadShare) o;
    return Objects.equals(this.isProtected, publicDownloadShare.isProtected) &&
        Objects.equals(this.fileName, publicDownloadShare.fileName) &&
        Objects.equals(this.name, publicDownloadShare.name) &&
        Objects.equals(this.size, publicDownloadShare.size) &&
        Objects.equals(this.limitReached, publicDownloadShare.limitReached) &&
        Objects.equals(this.creatorName, publicDownloadShare.creatorName) &&
        Objects.equals(this.creatorUsername, publicDownloadShare.creatorUsername) &&
        Objects.equals(this.createdAt, publicDownloadShare.createdAt) &&
        Objects.equals(this.expireAt, publicDownloadShare.expireAt) &&
        Objects.equals(this.notes, publicDownloadShare.notes) &&
        Objects.equals(this.isEncrypted, publicDownloadShare.isEncrypted) &&
        Objects.equals(this.fileKey, publicDownloadShare.fileKey) &&
        Objects.equals(this.privateKeyContainer, publicDownloadShare.privateKeyContainer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isProtected, fileName, name, size, limitReached, creatorName, creatorUsername, createdAt, expireAt, notes, isEncrypted, fileKey, privateKeyContainer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicDownloadShare {\n");
    
    sb.append("    isProtected: ").append(toIndentedString(isProtected)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    limitReached: ").append(toIndentedString(limitReached)).append("\n");
    sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
    sb.append("    creatorUsername: ").append(toIndentedString(creatorUsername)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    fileKey: ").append(toIndentedString(fileKey)).append("\n");
    sb.append("    privateKeyContainer: ").append(toIndentedString(privateKeyContainer)).append("\n");
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

