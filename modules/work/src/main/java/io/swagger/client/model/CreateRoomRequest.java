package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class CreateRoomRequest   {
  
  private Long parentId = null;
  private String name = null;
  private Boolean hasRecycleBin = null;
  private Integer recycleBinRetentionPeriod = null;
  private Long quota = null;
  private List<Long> adminIds = new ArrayList<Long>();

  
  /**
   * Parent Room Id or null to create a top-level room
   **/
  public CreateRoomRequest parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parent Room Id or null to create a top-level room")
  @JsonProperty("parentId")
  public Long getParentId() {
    return parentId;
  }
  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }


  /**
   * Name
   **/
  public CreateRoomRequest name(String name) {
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
   * Activate Recycle Bin
   **/
  public CreateRoomRequest hasRecycleBin(Boolean hasRecycleBin) {
    this.hasRecycleBin = hasRecycleBin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Activate Recycle Bin")
  @JsonProperty("hasRecycleBin")
  public Boolean getHasRecycleBin() {
    return hasRecycleBin;
  }
  public void setHasRecycleBin(Boolean hasRecycleBin) {
    this.hasRecycleBin = hasRecycleBin;
  }


  /**
   * Retention period for deleted nodes in days. Integer between 1 and 9999.
   **/
  public CreateRoomRequest recycleBinRetentionPeriod(Integer recycleBinRetentionPeriod) {
    this.recycleBinRetentionPeriod = recycleBinRetentionPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Retention period for deleted nodes in days. Integer between 1 and 9999.")
  @JsonProperty("recycleBinRetentionPeriod")
  public Integer getRecycleBinRetentionPeriod() {
    return recycleBinRetentionPeriod;
  }
  public void setRecycleBinRetentionPeriod(Integer recycleBinRetentionPeriod) {
    this.recycleBinRetentionPeriod = recycleBinRetentionPeriod;
  }


  /**
   * Quota in Byte
   **/
  public CreateRoomRequest quota(Long quota) {
    this.quota = quota;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quota in Byte")
  @JsonProperty("quota")
  public Long getQuota() {
    return quota;
  }
  public void setQuota(Long quota) {
    this.quota = quota;
  }


  /**
   * List of user Ids. A room requires at least one admin
   **/
  public CreateRoomRequest adminIds(List<Long> adminIds) {
    this.adminIds = adminIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of user Ids. A room requires at least one admin")
  @JsonProperty("adminIds")
  public List<Long> getAdminIds() {
    return adminIds;
  }
  public void setAdminIds(List<Long> adminIds) {
    this.adminIds = adminIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRoomRequest createRoomRequest = (CreateRoomRequest) o;
    return Objects.equals(this.parentId, createRoomRequest.parentId) &&
        Objects.equals(this.name, createRoomRequest.name) &&
        Objects.equals(this.hasRecycleBin, createRoomRequest.hasRecycleBin) &&
        Objects.equals(this.recycleBinRetentionPeriod, createRoomRequest.recycleBinRetentionPeriod) &&
        Objects.equals(this.quota, createRoomRequest.quota) &&
        Objects.equals(this.adminIds, createRoomRequest.adminIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, name, hasRecycleBin, recycleBinRetentionPeriod, quota, adminIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRoomRequest {\n");
    
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hasRecycleBin: ").append(toIndentedString(hasRecycleBin)).append("\n");
    sb.append("    recycleBinRetentionPeriod: ").append(toIndentedString(recycleBinRetentionPeriod)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    adminIds: ").append(toIndentedString(adminIds)).append("\n");
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

