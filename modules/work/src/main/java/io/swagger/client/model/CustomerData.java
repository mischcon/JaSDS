package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class CustomerData   {
  
  private Long id = null;
  private String name = null;
  private Long spaceLimit = null;
  private Long spaceUsed = null;
  private Integer accountsLimit = null;
  private Integer accountsUsed = null;
  private Boolean customerEncryptionEnabled = null;
  private Long cntFiles = null;
  private Long cntFolders = null;
  private Long cntRooms = null;

  
  /**
   * Customer ID
   **/
  public CustomerData id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Customer ID")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Customer name
   **/
  public CustomerData name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Customer name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Space limit (MBytes, 1 MB = 1048576 bytes)
   **/
  public CustomerData spaceLimit(Long spaceLimit) {
    this.spaceLimit = spaceLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Space limit (MBytes, 1 MB = 1048576 bytes)")
  @JsonProperty("spaceLimit")
  public Long getSpaceLimit() {
    return spaceLimit;
  }
  public void setSpaceLimit(Long spaceLimit) {
    this.spaceLimit = spaceLimit;
  }


  /**
   * Space used (MBytes, 1 MB = 1048576 bytes)
   **/
  public CustomerData spaceUsed(Long spaceUsed) {
    this.spaceUsed = spaceUsed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Space used (MBytes, 1 MB = 1048576 bytes)")
  @JsonProperty("spaceUsed")
  public Long getSpaceUsed() {
    return spaceUsed;
  }
  public void setSpaceUsed(Long spaceUsed) {
    this.spaceUsed = spaceUsed;
  }


  /**
   * User accounts limit
   **/
  public CustomerData accountsLimit(Integer accountsLimit) {
    this.accountsLimit = accountsLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User accounts limit")
  @JsonProperty("accountsLimit")
  public Integer getAccountsLimit() {
    return accountsLimit;
  }
  public void setAccountsLimit(Integer accountsLimit) {
    this.accountsLimit = accountsLimit;
  }


  /**
   * User accounts used
   **/
  public CustomerData accountsUsed(Integer accountsUsed) {
    this.accountsUsed = accountsUsed;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User accounts used")
  @JsonProperty("accountsUsed")
  public Integer getAccountsUsed() {
    return accountsUsed;
  }
  public void setAccountsUsed(Integer accountsUsed) {
    this.accountsUsed = accountsUsed;
  }


  /**
   * Clientside encryption for customer enabled
   **/
  public CustomerData customerEncryptionEnabled(Boolean customerEncryptionEnabled) {
    this.customerEncryptionEnabled = customerEncryptionEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Clientside encryption for customer enabled")
  @JsonProperty("customerEncryptionEnabled")
  public Boolean getCustomerEncryptionEnabled() {
    return customerEncryptionEnabled;
  }
  public void setCustomerEncryptionEnabled(Boolean customerEncryptionEnabled) {
    this.customerEncryptionEnabled = customerEncryptionEnabled;
  }


  /**
   * Total number of files. Visible only with Data Space Admin right
   **/
  public CustomerData cntFiles(Long cntFiles) {
    this.cntFiles = cntFiles;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total number of files. Visible only with Data Space Admin right")
  @JsonProperty("cntFiles")
  public Long getCntFiles() {
    return cntFiles;
  }
  public void setCntFiles(Long cntFiles) {
    this.cntFiles = cntFiles;
  }


  /**
   * Total number of folders. Visible only with Data Space Admin right
   **/
  public CustomerData cntFolders(Long cntFolders) {
    this.cntFolders = cntFolders;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total number of folders. Visible only with Data Space Admin right")
  @JsonProperty("cntFolders")
  public Long getCntFolders() {
    return cntFolders;
  }
  public void setCntFolders(Long cntFolders) {
    this.cntFolders = cntFolders;
  }


  /**
   * Total number of rooms. Visible only with Data Space Admin right
   **/
  public CustomerData cntRooms(Long cntRooms) {
    this.cntRooms = cntRooms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total number of rooms. Visible only with Data Space Admin right")
  @JsonProperty("cntRooms")
  public Long getCntRooms() {
    return cntRooms;
  }
  public void setCntRooms(Long cntRooms) {
    this.cntRooms = cntRooms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerData customerData = (CustomerData) o;
    return Objects.equals(this.id, customerData.id) &&
        Objects.equals(this.name, customerData.name) &&
        Objects.equals(this.spaceLimit, customerData.spaceLimit) &&
        Objects.equals(this.spaceUsed, customerData.spaceUsed) &&
        Objects.equals(this.accountsLimit, customerData.accountsLimit) &&
        Objects.equals(this.accountsUsed, customerData.accountsUsed) &&
        Objects.equals(this.customerEncryptionEnabled, customerData.customerEncryptionEnabled) &&
        Objects.equals(this.cntFiles, customerData.cntFiles) &&
        Objects.equals(this.cntFolders, customerData.cntFolders) &&
        Objects.equals(this.cntRooms, customerData.cntRooms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, spaceLimit, spaceUsed, accountsLimit, accountsUsed, customerEncryptionEnabled, cntFiles, cntFolders, cntRooms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    spaceLimit: ").append(toIndentedString(spaceLimit)).append("\n");
    sb.append("    spaceUsed: ").append(toIndentedString(spaceUsed)).append("\n");
    sb.append("    accountsLimit: ").append(toIndentedString(accountsLimit)).append("\n");
    sb.append("    accountsUsed: ").append(toIndentedString(accountsUsed)).append("\n");
    sb.append("    customerEncryptionEnabled: ").append(toIndentedString(customerEncryptionEnabled)).append("\n");
    sb.append("    cntFiles: ").append(toIndentedString(cntFiles)).append("\n");
    sb.append("    cntFolders: ").append(toIndentedString(cntFolders)).append("\n");
    sb.append("    cntRooms: ").append(toIndentedString(cntRooms)).append("\n");
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

