package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.FileKey;
import io.swagger.client.model.UserKeyPairContainer;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class CreateDownloadShareRequest   {
  
  private Long fileId = null;
  private Long nodeId = null;
  private String name = null;
  private String password = null;
  private Date expireAt = null;
  private String notes = null;
  private Boolean showCreatorName = null;
  private Boolean showCreatorUsername = null;
  private Boolean notifyCreator = null;
  private Integer maxDownloads = null;
  private Boolean sendMail = null;
  private String mailRecipients = null;
  private String mailSubject = null;
  private String mailBody = null;
  private UserKeyPairContainer keyPair = null;
  private FileKey fileKey = null;

  
  /**
   * Source file ID
   **/
  public CreateDownloadShareRequest fileId(Long fileId) {
    this.fileId = fileId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Source file ID")
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
  public CreateDownloadShareRequest nodeId(Long nodeId) {
    this.nodeId = nodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Source node ID <b style='color: green;'>&nbsp;NEW</b>")
  @JsonProperty("nodeId")
  public Long getNodeId() {
    return nodeId;
  }
  public void setNodeId(Long nodeId) {
    this.nodeId = nodeId;
  }


  /**
   * Alias Name. <b style='color: green;'>&nbsp;NEW</b>
   **/
  public CreateDownloadShareRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Alias Name. <b style='color: green;'>&nbsp;NEW</b>")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Access password, not allowed for encrypted shares
   **/
  public CreateDownloadShareRequest password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Access password, not allowed for encrypted shares")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   * Expiration time (2015-12-31T23:59:00). Max year is limited to 9999
   **/
  public CreateDownloadShareRequest expireAt(Date expireAt) {
    this.expireAt = expireAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Expiration time (2015-12-31T23:59:00). Max year is limited to 9999")
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
  public CreateDownloadShareRequest notes(String notes) {
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
  public CreateDownloadShareRequest showCreatorName(Boolean showCreatorName) {
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
  public CreateDownloadShareRequest showCreatorUsername(Boolean showCreatorUsername) {
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
   * Notify creator on every download
   **/
  public CreateDownloadShareRequest notifyCreator(Boolean notifyCreator) {
    this.notifyCreator = notifyCreator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Notify creator on every download")
  @JsonProperty("notifyCreator")
  public Boolean getNotifyCreator() {
    return notifyCreator;
  }
  public void setNotifyCreator(Boolean notifyCreator) {
    this.notifyCreator = notifyCreator;
  }


  /**
   * Max allowed downloads
   **/
  public CreateDownloadShareRequest maxDownloads(Integer maxDownloads) {
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
   * Notify recipients
   **/
  public CreateDownloadShareRequest sendMail(Boolean sendMail) {
    this.sendMail = sendMail;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Notify recipients")
  @JsonProperty("sendMail")
  public Boolean getSendMail() {
    return sendMail;
  }
  public void setSendMail(Boolean sendMail) {
    this.sendMail = sendMail;
  }


  /**
   * CSV string of recipient emails
   **/
  public CreateDownloadShareRequest mailRecipients(String mailRecipients) {
    this.mailRecipients = mailRecipients;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "CSV string of recipient emails")
  @JsonProperty("mailRecipients")
  public String getMailRecipients() {
    return mailRecipients;
  }
  public void setMailRecipients(String mailRecipients) {
    this.mailRecipients = mailRecipients;
  }


  /**
   * Notification email subject
   **/
  public CreateDownloadShareRequest mailSubject(String mailSubject) {
    this.mailSubject = mailSubject;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Notification email subject")
  @JsonProperty("mailSubject")
  public String getMailSubject() {
    return mailSubject;
  }
  public void setMailSubject(String mailSubject) {
    this.mailSubject = mailSubject;
  }


  /**
   * Notification email content
   **/
  public CreateDownloadShareRequest mailBody(String mailBody) {
    this.mailBody = mailBody;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Notification email content")
  @JsonProperty("mailBody")
  public String getMailBody() {
    return mailBody;
  }
  public void setMailBody(String mailBody) {
    this.mailBody = mailBody;
  }


  /**
   * Key Pair; mandatory for encrypted shares <b style='color: green;'>&nbsp;NEW</b>
   **/
  public CreateDownloadShareRequest keyPair(UserKeyPairContainer keyPair) {
    this.keyPair = keyPair;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Key Pair; mandatory for encrypted shares <b style='color: green;'>&nbsp;NEW</b>")
  @JsonProperty("keyPair")
  public UserKeyPairContainer getKeyPair() {
    return keyPair;
  }
  public void setKeyPair(UserKeyPairContainer keyPair) {
    this.keyPair = keyPair;
  }


  /**
   * Encrypted File Key; mandatory for encrypted shares <b style='color: green;'>&nbsp;NEW</b>
   **/
  public CreateDownloadShareRequest fileKey(FileKey fileKey) {
    this.fileKey = fileKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Encrypted File Key; mandatory for encrypted shares <b style='color: green;'>&nbsp;NEW</b>")
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
    CreateDownloadShareRequest createDownloadShareRequest = (CreateDownloadShareRequest) o;
    return Objects.equals(this.fileId, createDownloadShareRequest.fileId) &&
        Objects.equals(this.nodeId, createDownloadShareRequest.nodeId) &&
        Objects.equals(this.name, createDownloadShareRequest.name) &&
        Objects.equals(this.password, createDownloadShareRequest.password) &&
        Objects.equals(this.expireAt, createDownloadShareRequest.expireAt) &&
        Objects.equals(this.notes, createDownloadShareRequest.notes) &&
        Objects.equals(this.showCreatorName, createDownloadShareRequest.showCreatorName) &&
        Objects.equals(this.showCreatorUsername, createDownloadShareRequest.showCreatorUsername) &&
        Objects.equals(this.notifyCreator, createDownloadShareRequest.notifyCreator) &&
        Objects.equals(this.maxDownloads, createDownloadShareRequest.maxDownloads) &&
        Objects.equals(this.sendMail, createDownloadShareRequest.sendMail) &&
        Objects.equals(this.mailRecipients, createDownloadShareRequest.mailRecipients) &&
        Objects.equals(this.mailSubject, createDownloadShareRequest.mailSubject) &&
        Objects.equals(this.mailBody, createDownloadShareRequest.mailBody) &&
        Objects.equals(this.keyPair, createDownloadShareRequest.keyPair) &&
        Objects.equals(this.fileKey, createDownloadShareRequest.fileKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, nodeId, name, password, expireAt, notes, showCreatorName, showCreatorUsername, notifyCreator, maxDownloads, sendMail, mailRecipients, mailSubject, mailBody, keyPair, fileKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDownloadShareRequest {\n");
    
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    showCreatorName: ").append(toIndentedString(showCreatorName)).append("\n");
    sb.append("    showCreatorUsername: ").append(toIndentedString(showCreatorUsername)).append("\n");
    sb.append("    notifyCreator: ").append(toIndentedString(notifyCreator)).append("\n");
    sb.append("    maxDownloads: ").append(toIndentedString(maxDownloads)).append("\n");
    sb.append("    sendMail: ").append(toIndentedString(sendMail)).append("\n");
    sb.append("    mailRecipients: ").append(toIndentedString(mailRecipients)).append("\n");
    sb.append("    mailSubject: ").append(toIndentedString(mailSubject)).append("\n");
    sb.append("    mailBody: ").append(toIndentedString(mailBody)).append("\n");
    sb.append("    keyPair: ").append(toIndentedString(keyPair)).append("\n");
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

