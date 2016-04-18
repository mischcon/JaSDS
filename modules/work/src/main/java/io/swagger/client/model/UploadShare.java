package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.NodeId;
import io.swagger.client.model.UserInfo;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class UploadShare   {
  
  private Long id = null;
  private NodeId targetId = null;
  private String targetPath = null;
  private String name = null;
  private Boolean isProtected = null;
  private Boolean isEncrypted = null;
  private String accessKey = null;
  private String notes = null;
  private Integer maxSlots = null;
  private Integer maxSize = null;
  private Date expireAt = null;
  private Integer filesExpiryPeriod = null;
  private Boolean notifyCreator = null;
  private String recipients = null;
  private Date createdAt = null;
  private UserInfo createdBy = null;
  private Integer cntFiles = null;
  private Integer cntUploads = null;

  
  /**
   * Share Id
   **/
  public UploadShare id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Share Id")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Target node
   **/
  public UploadShare targetId(NodeId targetId) {
    this.targetId = targetId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Target node")
  @JsonProperty("targetId")
  public NodeId getTargetId() {
    return targetId;
  }
  public void setTargetId(NodeId targetId) {
    this.targetId = targetId;
  }


  /**
   * Path to shared upload node
   **/
  public UploadShare targetPath(String targetPath) {
    this.targetPath = targetPath;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Path to shared upload node")
  @JsonProperty("targetPath")
  public String getTargetPath() {
    return targetPath;
  }
  public void setTargetPath(String targetPath) {
    this.targetPath = targetPath;
  }


  /**
   * Alias name.</b>
   **/
  public UploadShare name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Alias name.</b>")
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
  public UploadShare isProtected(Boolean isProtected) {
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
  public UploadShare isEncrypted(Boolean isEncrypted) {
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
   * Share access key to generate secure link
   **/
  public UploadShare accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Share access key to generate secure link")
  @JsonProperty("accessKey")
  public String getAccessKey() {
    return accessKey;
  }
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }


  /**
   * User notes
   **/
  public UploadShare notes(String notes) {
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
   * Maximal amount of files to upload
   **/
  public UploadShare maxSlots(Integer maxSlots) {
    this.maxSlots = maxSlots;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Maximal amount of files to upload")
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
  public UploadShare maxSize(Integer maxSize) {
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
   * Expiration date (2015-12-31T23:59:00).
   **/
  public UploadShare expireAt(Date expireAt) {
    this.expireAt = expireAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Expiration date (2015-12-31T23:59:00).")
  @JsonProperty("expireAt")
  public Date getExpireAt() {
    return expireAt;
  }
  public void setExpireAt(Date expireAt) {
    this.expireAt = expireAt;
  }


  /**
   * Number of days after which uploaded files expire
   **/
  public UploadShare filesExpiryPeriod(Integer filesExpiryPeriod) {
    this.filesExpiryPeriod = filesExpiryPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of days after which uploaded files expire")
  @JsonProperty("filesExpiryPeriod")
  public Integer getFilesExpiryPeriod() {
    return filesExpiryPeriod;
  }
  public void setFilesExpiryPeriod(Integer filesExpiryPeriod) {
    this.filesExpiryPeriod = filesExpiryPeriod;
  }


  /**
   * Notify creator on every upload.
   **/
  public UploadShare notifyCreator(Boolean notifyCreator) {
    this.notifyCreator = notifyCreator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Notify creator on every upload.")
  @JsonProperty("notifyCreator")
  public Boolean getNotifyCreator() {
    return notifyCreator;
  }
  public void setNotifyCreator(Boolean notifyCreator) {
    this.notifyCreator = notifyCreator;
  }


  /**
   * CSV string of recipient emails
   **/
  public UploadShare recipients(String recipients) {
    this.recipients = recipients;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CSV string of recipient emails")
  @JsonProperty("recipients")
  public String getRecipients() {
    return recipients;
  }
  public void setRecipients(String recipients) {
    this.recipients = recipients;
  }


  /**
   * Creation date (2015-12-31T23:59:00).
   **/
  public UploadShare createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Creation date (2015-12-31T23:59:00).")
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Creator info.
   **/
  public UploadShare createdBy(UserInfo createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Creator info.")
  @JsonProperty("createdBy")
  public UserInfo getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UserInfo createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * Total amount of existing files uploaded with this share.
   **/
  public UploadShare cntFiles(Integer cntFiles) {
    this.cntFiles = cntFiles;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total amount of existing files uploaded with this share.")
  @JsonProperty("cntFiles")
  public Integer getCntFiles() {
    return cntFiles;
  }
  public void setCntFiles(Integer cntFiles) {
    this.cntFiles = cntFiles;
  }


  /**
   * Total amount of uploads conducted with this share.
   **/
  public UploadShare cntUploads(Integer cntUploads) {
    this.cntUploads = cntUploads;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total amount of uploads conducted with this share.")
  @JsonProperty("cntUploads")
  public Integer getCntUploads() {
    return cntUploads;
  }
  public void setCntUploads(Integer cntUploads) {
    this.cntUploads = cntUploads;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadShare uploadShare = (UploadShare) o;
    return Objects.equals(this.id, uploadShare.id) &&
        Objects.equals(this.targetId, uploadShare.targetId) &&
        Objects.equals(this.targetPath, uploadShare.targetPath) &&
        Objects.equals(this.name, uploadShare.name) &&
        Objects.equals(this.isProtected, uploadShare.isProtected) &&
        Objects.equals(this.isEncrypted, uploadShare.isEncrypted) &&
        Objects.equals(this.accessKey, uploadShare.accessKey) &&
        Objects.equals(this.notes, uploadShare.notes) &&
        Objects.equals(this.maxSlots, uploadShare.maxSlots) &&
        Objects.equals(this.maxSize, uploadShare.maxSize) &&
        Objects.equals(this.expireAt, uploadShare.expireAt) &&
        Objects.equals(this.filesExpiryPeriod, uploadShare.filesExpiryPeriod) &&
        Objects.equals(this.notifyCreator, uploadShare.notifyCreator) &&
        Objects.equals(this.recipients, uploadShare.recipients) &&
        Objects.equals(this.createdAt, uploadShare.createdAt) &&
        Objects.equals(this.createdBy, uploadShare.createdBy) &&
        Objects.equals(this.cntFiles, uploadShare.cntFiles) &&
        Objects.equals(this.cntUploads, uploadShare.cntUploads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, targetId, targetPath, name, isProtected, isEncrypted, accessKey, notes, maxSlots, maxSize, expireAt, filesExpiryPeriod, notifyCreator, recipients, createdAt, createdBy, cntFiles, cntUploads);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadShare {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetPath: ").append(toIndentedString(targetPath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isProtected: ").append(toIndentedString(isProtected)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    maxSlots: ").append(toIndentedString(maxSlots)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    filesExpiryPeriod: ").append(toIndentedString(filesExpiryPeriod)).append("\n");
    sb.append("    notifyCreator: ").append(toIndentedString(notifyCreator)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    cntFiles: ").append(toIndentedString(cntFiles)).append("\n");
    sb.append("    cntUploads: ").append(toIndentedString(cntUploads)).append("\n");
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

