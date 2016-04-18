package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.NodeId;
import io.swagger.client.model.UserInfo;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class DownloadShare   {
  
  private Long id = null;
  private Long fileId = null;
  private Long nodeId = null;
  private String name = null;
  private Integer classification = null;
  private String accessKey = null;
  private String notes = null;
  private Boolean showCreatorName = null;
  private Boolean showCreatorUsername = null;
  private Boolean isProtected = null;
  private Boolean notifyCreator = null;
  private Date expireAt = null;
  private Integer maxDownloads = null;
  private Integer cntDownloads = null;
  private String recipients = null;
  private Date createdAt = null;
  private UserInfo createdBy = null;
  private String nodePath = null;
  private NodeId sourceId = null;
  private Boolean isEncrypted = null;

  
  /**
   * Share Id
   **/
  public DownloadShare id(Long id) {
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
   * Source file ID <b style='color: red;'>&nbsp;DEPRECATED</b>
   **/
  public DownloadShare fileId(Long fileId) {
    this.fileId = fileId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Source file ID <b style='color: red;'>&nbsp;DEPRECATED</b>")
  @JsonProperty("fileId")
  public Long getFileId() {
    return fileId;
  }
  public void setFileId(Long fileId) {
    this.fileId = fileId;
  }


  /**
   * Source node ID <b style='color: green;'>&nbsp;NEW</b>
   **/
  public DownloadShare nodeId(Long nodeId) {
    this.nodeId = nodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Source node ID <b style='color: green;'>&nbsp;NEW</b>")
  @JsonProperty("nodeId")
  public Long getNodeId() {
    return nodeId;
  }
  public void setNodeId(Long nodeId) {
    this.nodeId = nodeId;
  }


  /**
   * Alias Name. <b style='color: orange;'>&nbsp;CHANGE FROM FILE NAME TO ALIAS NAME</b>
   **/
  public DownloadShare name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Alias Name. <b style='color: orange;'>&nbsp;CHANGE FROM FILE NAME TO ALIAS NAME</b>")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * File classification.
   **/
  public DownloadShare classification(Integer classification) {
    this.classification = classification;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "File classification.")
  @JsonProperty("classification")
  public Integer getClassification() {
    return classification;
  }
  public void setClassification(Integer classification) {
    this.classification = classification;
  }


  /**
   * Share access key to generate secure link
   **/
  public DownloadShare accessKey(String accessKey) {
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
  public DownloadShare notes(String notes) {
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
   * Show creator First Name and Last Name
   **/
  public DownloadShare showCreatorName(Boolean showCreatorName) {
    this.showCreatorName = showCreatorName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show creator First Name and Last Name")
  @JsonProperty("showCreatorName")
  public Boolean getShowCreatorName() {
    return showCreatorName;
  }
  public void setShowCreatorName(Boolean showCreatorName) {
    this.showCreatorName = showCreatorName;
  }


  /**
   * Show creator email address
   **/
  public DownloadShare showCreatorUsername(Boolean showCreatorUsername) {
    this.showCreatorUsername = showCreatorUsername;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Show creator email address")
  @JsonProperty("showCreatorUsername")
  public Boolean getShowCreatorUsername() {
    return showCreatorUsername;
  }
  public void setShowCreatorUsername(Boolean showCreatorUsername) {
    this.showCreatorUsername = showCreatorUsername;
  }


  /**
   * Is share protected by password
   **/
  public DownloadShare isProtected(Boolean isProtected) {
    this.isProtected = isProtected;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is share protected by password")
  @JsonProperty("isProtected")
  public Boolean getIsProtected() {
    return isProtected;
  }
  public void setIsProtected(Boolean isProtected) {
    this.isProtected = isProtected;
  }


  /**
   * Notify creator on every download.
   **/
  public DownloadShare notifyCreator(Boolean notifyCreator) {
    this.notifyCreator = notifyCreator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Notify creator on every download.")
  @JsonProperty("notifyCreator")
  public Boolean getNotifyCreator() {
    return notifyCreator;
  }
  public void setNotifyCreator(Boolean notifyCreator) {
    this.notifyCreator = notifyCreator;
  }


  /**
   * Expiration date (2015-12-31T23:59:00).
   **/
  public DownloadShare expireAt(Date expireAt) {
    this.expireAt = expireAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Expiration date (2015-12-31T23:59:00).")
  @JsonProperty("expireAt")
  public Date getExpireAt() {
    return expireAt;
  }
  public void setExpireAt(Date expireAt) {
    this.expireAt = expireAt;
  }


  /**
   * Max allowed downloads
   **/
  public DownloadShare maxDownloads(Integer maxDownloads) {
    this.maxDownloads = maxDownloads;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Max allowed downloads")
  @JsonProperty("maxDownloads")
  public Integer getMaxDownloads() {
    return maxDownloads;
  }
  public void setMaxDownloads(Integer maxDownloads) {
    this.maxDownloads = maxDownloads;
  }


  /**
   * Downloads counter. Incremented on each download.
   **/
  public DownloadShare cntDownloads(Integer cntDownloads) {
    this.cntDownloads = cntDownloads;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Downloads counter. Incremented on each download.")
  @JsonProperty("cntDownloads")
  public Integer getCntDownloads() {
    return cntDownloads;
  }
  public void setCntDownloads(Integer cntDownloads) {
    this.cntDownloads = cntDownloads;
  }


  /**
   * CSV string of recipient emails
   **/
  public DownloadShare recipients(String recipients) {
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
  public DownloadShare createdAt(Date createdAt) {
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
  public DownloadShare createdBy(UserInfo createdBy) {
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
   * Path to shared download node
   **/
  public DownloadShare nodePath(String nodePath) {
    this.nodePath = nodePath;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Path to shared download node")
  @JsonProperty("nodePath")
  public String getNodePath() {
    return nodePath;
  }
  public void setNodePath(String nodePath) {
    this.nodePath = nodePath;
  }


  /**
   * Source node ID <b style='color: green;'>&nbsp;NEW</b>
   **/
  public DownloadShare sourceId(NodeId sourceId) {
    this.sourceId = sourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Source node ID <b style='color: green;'>&nbsp;NEW</b>")
  @JsonProperty("sourceId")
  public NodeId getSourceId() {
    return sourceId;
  }
  public void setSourceId(NodeId sourceId) {
    this.sourceId = sourceId;
  }


  /**
   * Encrypted share (this only applies to shared files, not folders) <b style='color: green;'>&nbsp;NEW</b>
   **/
  public DownloadShare isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Encrypted share (this only applies to shared files, not folders) <b style='color: green;'>&nbsp;NEW</b>")
  @JsonProperty("isEncrypted")
  public Boolean getIsEncrypted() {
    return isEncrypted;
  }
  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadShare downloadShare = (DownloadShare) o;
    return Objects.equals(this.id, downloadShare.id) &&
        Objects.equals(this.fileId, downloadShare.fileId) &&
        Objects.equals(this.nodeId, downloadShare.nodeId) &&
        Objects.equals(this.name, downloadShare.name) &&
        Objects.equals(this.classification, downloadShare.classification) &&
        Objects.equals(this.accessKey, downloadShare.accessKey) &&
        Objects.equals(this.notes, downloadShare.notes) &&
        Objects.equals(this.showCreatorName, downloadShare.showCreatorName) &&
        Objects.equals(this.showCreatorUsername, downloadShare.showCreatorUsername) &&
        Objects.equals(this.isProtected, downloadShare.isProtected) &&
        Objects.equals(this.notifyCreator, downloadShare.notifyCreator) &&
        Objects.equals(this.expireAt, downloadShare.expireAt) &&
        Objects.equals(this.maxDownloads, downloadShare.maxDownloads) &&
        Objects.equals(this.cntDownloads, downloadShare.cntDownloads) &&
        Objects.equals(this.recipients, downloadShare.recipients) &&
        Objects.equals(this.createdAt, downloadShare.createdAt) &&
        Objects.equals(this.createdBy, downloadShare.createdBy) &&
        Objects.equals(this.nodePath, downloadShare.nodePath) &&
        Objects.equals(this.sourceId, downloadShare.sourceId) &&
        Objects.equals(this.isEncrypted, downloadShare.isEncrypted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fileId, nodeId, name, classification, accessKey, notes, showCreatorName, showCreatorUsername, isProtected, notifyCreator, expireAt, maxDownloads, cntDownloads, recipients, createdAt, createdBy, nodePath, sourceId, isEncrypted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadShare {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    showCreatorName: ").append(toIndentedString(showCreatorName)).append("\n");
    sb.append("    showCreatorUsername: ").append(toIndentedString(showCreatorUsername)).append("\n");
    sb.append("    isProtected: ").append(toIndentedString(isProtected)).append("\n");
    sb.append("    notifyCreator: ").append(toIndentedString(notifyCreator)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    maxDownloads: ").append(toIndentedString(maxDownloads)).append("\n");
    sb.append("    cntDownloads: ").append(toIndentedString(cntDownloads)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    nodePath: ").append(toIndentedString(nodePath)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
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

