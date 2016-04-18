package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class CreateUploadShareRequest   {
  
  private Long targetId = null;
  private String name = null;
  private String password = null;
  private Integer maxSlots = null;
  private Integer maxSize = null;
  private Date expireAt = null;
  private Integer filesExpiryPeriod = null;
  private String notes = null;
  private Boolean notifyCreator = null;
  private Boolean sendMail = null;
  private String mailRecipients = null;
  private String mailSubject = null;
  private String mailBody = null;

  
  /**
   * Target room or folder id
   **/
  public CreateUploadShareRequest targetId(Long targetId) {
    this.targetId = targetId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Target room or folder id")
  @JsonProperty("targetId")
  public Long getTargetId() {
    return targetId;
  }
  public void setTargetId(Long targetId) {
    this.targetId = targetId;
  }


  /**
   * Alias name
   **/
  public CreateUploadShareRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Alias name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Password
   **/
  public CreateUploadShareRequest password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Password")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   * Maximal amount of files to upload
   **/
  public CreateUploadShareRequest maxSlots(Integer maxSlots) {
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
  public CreateUploadShareRequest maxSize(Integer maxSize) {
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
   * Expiration time (2015-12-31T23:59:00). Max year is limited to 9999
   **/
  public CreateUploadShareRequest expireAt(Date expireAt) {
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
   * Number of days after which uploaded files expire
   **/
  public CreateUploadShareRequest filesExpiryPeriod(Integer filesExpiryPeriod) {
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
   * User notes
   **/
  public CreateUploadShareRequest notes(String notes) {
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
   * Notify creator on every upload
   **/
  public CreateUploadShareRequest notifyCreator(Boolean notifyCreator) {
    this.notifyCreator = notifyCreator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Notify creator on every upload")
  @JsonProperty("notifyCreator")
  public Boolean getNotifyCreator() {
    return notifyCreator;
  }
  public void setNotifyCreator(Boolean notifyCreator) {
    this.notifyCreator = notifyCreator;
  }


  /**
   * Notify recipients
   **/
  public CreateUploadShareRequest sendMail(Boolean sendMail) {
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
  public CreateUploadShareRequest mailRecipients(String mailRecipients) {
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
  public CreateUploadShareRequest mailSubject(String mailSubject) {
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
  public CreateUploadShareRequest mailBody(String mailBody) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUploadShareRequest createUploadShareRequest = (CreateUploadShareRequest) o;
    return Objects.equals(this.targetId, createUploadShareRequest.targetId) &&
        Objects.equals(this.name, createUploadShareRequest.name) &&
        Objects.equals(this.password, createUploadShareRequest.password) &&
        Objects.equals(this.maxSlots, createUploadShareRequest.maxSlots) &&
        Objects.equals(this.maxSize, createUploadShareRequest.maxSize) &&
        Objects.equals(this.expireAt, createUploadShareRequest.expireAt) &&
        Objects.equals(this.filesExpiryPeriod, createUploadShareRequest.filesExpiryPeriod) &&
        Objects.equals(this.notes, createUploadShareRequest.notes) &&
        Objects.equals(this.notifyCreator, createUploadShareRequest.notifyCreator) &&
        Objects.equals(this.sendMail, createUploadShareRequest.sendMail) &&
        Objects.equals(this.mailRecipients, createUploadShareRequest.mailRecipients) &&
        Objects.equals(this.mailSubject, createUploadShareRequest.mailSubject) &&
        Objects.equals(this.mailBody, createUploadShareRequest.mailBody);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, name, password, maxSlots, maxSize, expireAt, filesExpiryPeriod, notes, notifyCreator, sendMail, mailRecipients, mailSubject, mailBody);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUploadShareRequest {\n");
    
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    maxSlots: ").append(toIndentedString(maxSlots)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    filesExpiryPeriod: ").append(toIndentedString(filesExpiryPeriod)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    notifyCreator: ").append(toIndentedString(notifyCreator)).append("\n");
    sb.append("    sendMail: ").append(toIndentedString(sendMail)).append("\n");
    sb.append("    mailRecipients: ").append(toIndentedString(mailRecipients)).append("\n");
    sb.append("    mailSubject: ").append(toIndentedString(mailSubject)).append("\n");
    sb.append("    mailBody: ").append(toIndentedString(mailBody)).append("\n");
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

