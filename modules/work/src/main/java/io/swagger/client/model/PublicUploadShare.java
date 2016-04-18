package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PublicUploadedFileData;
import io.swagger.client.model.UserUserPublicKeyList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class PublicUploadShare   {
  
  private String name = null;
  private Boolean isProtected = null;
  private Boolean isEncrypted = null;
  private Integer maxSlots = null;
  private Integer maxSize = null;
  private Date createdAt = null;
  private Date expireAt = null;
  private String notes = null;
  private List<PublicUploadedFileData> uploadedFiles = new ArrayList<PublicUploadedFileData>();
  private UserUserPublicKeyList userUserPublicKeyList = null;

  
  /**
   * Share display name
   **/
  public PublicUploadShare name(String name) {
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
   * Is protected by password
   **/
  public PublicUploadShare isProtected(Boolean isProtected) {
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
   * Files are client-side encrypted
   **/
  public PublicUploadShare isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Files are client-side encrypted")
  @JsonProperty("isEncrypted")
  public Boolean getIsEncrypted() {
    return isEncrypted;
  }
  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }


  /**
   * Maximal amount of files to upload
   **/
  public PublicUploadShare maxSlots(Integer maxSlots) {
    this.maxSlots = maxSlots;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Maximal amount of files to upload")
  @JsonProperty("maxSlots")
  public Integer getMaxSlots() {
    return maxSlots;
  }
  public void setMaxSlots(Integer maxSlots) {
    this.maxSlots = maxSlots;
  }


  /**
   * Maximal total size of uploaded files (MBytes, 1 MB = 1048576 bytes)
   **/
  public PublicUploadShare maxSize(Integer maxSize) {
    this.maxSize = maxSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximal total size of uploaded files (MBytes, 1 MB = 1048576 bytes)")
  @JsonProperty("maxSize")
  public Integer getMaxSize() {
    return maxSize;
  }
  public void setMaxSize(Integer maxSize) {
    this.maxSize = maxSize;
  }


  /**
   * Creation time (2015-12-31T23:59:00)
   **/
  public PublicUploadShare createdAt(Date createdAt) {
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
  public PublicUploadShare expireAt(Date expireAt) {
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
  public PublicUploadShare notes(String notes) {
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
   **/
  public PublicUploadShare uploadedFiles(List<PublicUploadedFileData> uploadedFiles) {
    this.uploadedFiles = uploadedFiles;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadedFiles")
  public List<PublicUploadedFileData> getUploadedFiles() {
    return uploadedFiles;
  }
  public void setUploadedFiles(List<PublicUploadedFileData> uploadedFiles) {
    this.uploadedFiles = uploadedFiles;
  }


  /**
   * List of Public Keys to encrypt the FileKey with if parent is end-to-end encrypted
   **/
  public PublicUploadShare userUserPublicKeyList(UserUserPublicKeyList userUserPublicKeyList) {
    this.userUserPublicKeyList = userUserPublicKeyList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of Public Keys to encrypt the FileKey with if parent is end-to-end encrypted")
  @JsonProperty("userUserPublicKeyList")
  public UserUserPublicKeyList getUserUserPublicKeyList() {
    return userUserPublicKeyList;
  }
  public void setUserUserPublicKeyList(UserUserPublicKeyList userUserPublicKeyList) {
    this.userUserPublicKeyList = userUserPublicKeyList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicUploadShare publicUploadShare = (PublicUploadShare) o;
    return Objects.equals(this.name, publicUploadShare.name) &&
        Objects.equals(this.isProtected, publicUploadShare.isProtected) &&
        Objects.equals(this.isEncrypted, publicUploadShare.isEncrypted) &&
        Objects.equals(this.maxSlots, publicUploadShare.maxSlots) &&
        Objects.equals(this.maxSize, publicUploadShare.maxSize) &&
        Objects.equals(this.createdAt, publicUploadShare.createdAt) &&
        Objects.equals(this.expireAt, publicUploadShare.expireAt) &&
        Objects.equals(this.notes, publicUploadShare.notes) &&
        Objects.equals(this.uploadedFiles, publicUploadShare.uploadedFiles) &&
        Objects.equals(this.userUserPublicKeyList, publicUploadShare.userUserPublicKeyList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isProtected, isEncrypted, maxSlots, maxSize, createdAt, expireAt, notes, uploadedFiles, userUserPublicKeyList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicUploadShare {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isProtected: ").append(toIndentedString(isProtected)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    maxSlots: ").append(toIndentedString(maxSlots)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    uploadedFiles: ").append(toIndentedString(uploadedFiles)).append("\n");
    sb.append("    userUserPublicKeyList: ").append(toIndentedString(userUserPublicKeyList)).append("\n");
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

