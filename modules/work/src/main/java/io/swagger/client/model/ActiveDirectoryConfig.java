package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class ActiveDirectoryConfig   {
  
  private Integer id = null;
  private String alias = null;
  private String serverIp = null;
  private Integer serverPort = null;
  private String serverAdminName = null;
  private String serverAdminPassword = null;
  private String ldapUsersDomain = null;
  private String userFilter = null;
  private Boolean userImport = null;
  private String adExportGroup = null;
  private Date importExpireAt = null;
  private Long sdsImportGroup = null;
  private Boolean createHomeFolder = null;
  private Long homeFolderParent = null;
  private Boolean useLdaps = null;
  private String sslFingerPrint = null;

  
  /**
   * ID
   **/
  public ActiveDirectoryConfig id(Integer id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   * Unique name for an active directroy configuration
   **/
  public ActiveDirectoryConfig alias(String alias) {
    this.alias = alias;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique name for an active directroy configuration")
  @JsonProperty("alias")
  public String getAlias() {
    return alias;
  }
  public void setAlias(String alias) {
    this.alias = alias;
  }


  /**
   * IPv4 or IPv6 address or host name
   **/
  public ActiveDirectoryConfig serverIp(String serverIp) {
    this.serverIp = serverIp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "IPv4 or IPv6 address or host name")
  @JsonProperty("serverIp")
  public String getServerIp() {
    return serverIp;
  }
  public void setServerIp(String serverIp) {
    this.serverIp = serverIp;
  }


  /**
   * Port
   **/
  public ActiveDirectoryConfig serverPort(Integer serverPort) {
    this.serverPort = serverPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Port")
  @JsonProperty("serverPort")
  public Integer getServerPort() {
    return serverPort;
  }
  public void setServerPort(Integer serverPort) {
    this.serverPort = serverPort;
  }


  /**
   * DistinguishedName of Active Directory administrative account
   **/
  public ActiveDirectoryConfig serverAdminName(String serverAdminName) {
    this.serverAdminName = serverAdminName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "DistinguishedName of Active Directory administrative account")
  @JsonProperty("serverAdminName")
  public String getServerAdminName() {
    return serverAdminName;
  }
  public void setServerAdminName(String serverAdminName) {
    this.serverAdminName = serverAdminName;
  }


  /**
   * Password of Active Directory administrative account
   **/
  public ActiveDirectoryConfig serverAdminPassword(String serverAdminPassword) {
    this.serverAdminPassword = serverAdminPassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Password of Active Directory administrative account")
  @JsonProperty("serverAdminPassword")
  public String getServerAdminPassword() {
    return serverAdminPassword;
  }
  public void setServerAdminPassword(String serverAdminPassword) {
    this.serverAdminPassword = serverAdminPassword;
  }


  /**
   * Search scope of Active Directory; only users below this node can log on.
   **/
  public ActiveDirectoryConfig ldapUsersDomain(String ldapUsersDomain) {
    this.ldapUsersDomain = ldapUsersDomain;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Search scope of Active Directory; only users below this node can log on.")
  @JsonProperty("ldapUsersDomain")
  public String getLdapUsersDomain() {
    return ldapUsersDomain;
  }
  public void setLdapUsersDomain(String ldapUsersDomain) {
    this.ldapUsersDomain = ldapUsersDomain;
  }


  /**
   * Name of Active Directory attribute that is used as login name
   **/
  public ActiveDirectoryConfig userFilter(String userFilter) {
    this.userFilter = userFilter;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of Active Directory attribute that is used as login name")
  @JsonProperty("userFilter")
  public String getUserFilter() {
    return userFilter;
  }
  public void setUserFilter(String userFilter) {
    this.userFilter = userFilter;
  }


  /**
   * Determines if an SDS account is automatically created for a new user who successfully logs on with his/her AD account,
   **/
  public ActiveDirectoryConfig userImport(Boolean userImport) {
    this.userImport = userImport;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Determines if an SDS account is automatically created for a new user who successfully logs on with his/her AD account,")
  @JsonProperty("userImport")
  public Boolean getUserImport() {
    return userImport;
  }
  public void setUserImport(Boolean userImport) {
    this.userImport = userImport;
  }


  /**
   * If ad_userimport is set to true, a user must be member of this Active Directory group to receive a newly created SDS account.
   **/
  public ActiveDirectoryConfig adExportGroup(String adExportGroup) {
    this.adExportGroup = adExportGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "If ad_userimport is set to true, a user must be member of this Active Directory group to receive a newly created SDS account.")
  @JsonProperty("adExportGroup")
  public String getAdExportGroup() {
    return adExportGroup;
  }
  public void setAdExportGroup(String adExportGroup) {
    this.adExportGroup = adExportGroup;
  }


  /**
   * Default expiration date of users who are created by automatic import.
   **/
  public ActiveDirectoryConfig importExpireAt(Date importExpireAt) {
    this.importExpireAt = importExpireAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Default expiration date of users who are created by automatic import.")
  @JsonProperty("importExpireAt")
  public Date getImportExpireAt() {
    return importExpireAt;
  }
  public void setImportExpireAt(Date importExpireAt) {
    this.importExpireAt = importExpireAt;
  }


  /**
   * User group that is assigned to users who are created by automatic import.
   **/
  public ActiveDirectoryConfig sdsImportGroup(Long sdsImportGroup) {
    this.sdsImportGroup = sdsImportGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User group that is assigned to users who are created by automatic import.")
  @JsonProperty("sdsImportGroup")
  public Long getSdsImportGroup() {
    return sdsImportGroup;
  }
  public void setSdsImportGroup(Long sdsImportGroup) {
    this.sdsImportGroup = sdsImportGroup;
  }


  /**
   * Determines whether a SubRoom is created for each user that is created by automatic import (Like a home folder). The SubRoom's name will equal the user's login name.
   **/
  public ActiveDirectoryConfig createHomeFolder(Boolean createHomeFolder) {
    this.createHomeFolder = createHomeFolder;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Determines whether a SubRoom is created for each user that is created by automatic import (Like a home folder). The SubRoom's name will equal the user's login name.")
  @JsonProperty("createHomeFolder")
  public Boolean getCreateHomeFolder() {
    return createHomeFolder;
  }
  public void setCreateHomeFolder(Boolean createHomeFolder) {
    this.createHomeFolder = createHomeFolder;
  }


  /**
   * ID of the Data Room in which the individual SubRooms for users will be created (cf. 'ad_create_home_folder_on').
   **/
  public ActiveDirectoryConfig homeFolderParent(Long homeFolderParent) {
    this.homeFolderParent = homeFolderParent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the Data Room in which the individual SubRooms for users will be created (cf. 'ad_create_home_folder_on').")
  @JsonProperty("homeFolderParent")
  public Long getHomeFolderParent() {
    return homeFolderParent;
  }
  public void setHomeFolderParent(Long homeFolderParent) {
    this.homeFolderParent = homeFolderParent;
  }


  /**
   * Determines whether LDAPS should be used instead of plain LDAP.
   **/
  public ActiveDirectoryConfig useLdaps(Boolean useLdaps) {
    this.useLdaps = useLdaps;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Determines whether LDAPS should be used instead of plain LDAP.")
  @JsonProperty("useLdaps")
  public Boolean getUseLdaps() {
    return useLdaps;
  }
  public void setUseLdaps(Boolean useLdaps) {
    this.useLdaps = useLdaps;
  }


  /**
   * SSL finger print of Active Directory server.  Mandatory for LDAPS connections. Format: <Algorithm>/<FingerPrint>
   **/
  public ActiveDirectoryConfig sslFingerPrint(String sslFingerPrint) {
    this.sslFingerPrint = sslFingerPrint;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "SSL finger print of Active Directory server.  Mandatory for LDAPS connections. Format: <Algorithm>/<FingerPrint>")
  @JsonProperty("sslFingerPrint")
  public String getSslFingerPrint() {
    return sslFingerPrint;
  }
  public void setSslFingerPrint(String sslFingerPrint) {
    this.sslFingerPrint = sslFingerPrint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveDirectoryConfig activeDirectoryConfig = (ActiveDirectoryConfig) o;
    return Objects.equals(this.id, activeDirectoryConfig.id) &&
        Objects.equals(this.alias, activeDirectoryConfig.alias) &&
        Objects.equals(this.serverIp, activeDirectoryConfig.serverIp) &&
        Objects.equals(this.serverPort, activeDirectoryConfig.serverPort) &&
        Objects.equals(this.serverAdminName, activeDirectoryConfig.serverAdminName) &&
        Objects.equals(this.serverAdminPassword, activeDirectoryConfig.serverAdminPassword) &&
        Objects.equals(this.ldapUsersDomain, activeDirectoryConfig.ldapUsersDomain) &&
        Objects.equals(this.userFilter, activeDirectoryConfig.userFilter) &&
        Objects.equals(this.userImport, activeDirectoryConfig.userImport) &&
        Objects.equals(this.adExportGroup, activeDirectoryConfig.adExportGroup) &&
        Objects.equals(this.importExpireAt, activeDirectoryConfig.importExpireAt) &&
        Objects.equals(this.sdsImportGroup, activeDirectoryConfig.sdsImportGroup) &&
        Objects.equals(this.createHomeFolder, activeDirectoryConfig.createHomeFolder) &&
        Objects.equals(this.homeFolderParent, activeDirectoryConfig.homeFolderParent) &&
        Objects.equals(this.useLdaps, activeDirectoryConfig.useLdaps) &&
        Objects.equals(this.sslFingerPrint, activeDirectoryConfig.sslFingerPrint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, alias, serverIp, serverPort, serverAdminName, serverAdminPassword, ldapUsersDomain, userFilter, userImport, adExportGroup, importExpireAt, sdsImportGroup, createHomeFolder, homeFolderParent, useLdaps, sslFingerPrint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveDirectoryConfig {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    serverPort: ").append(toIndentedString(serverPort)).append("\n");
    sb.append("    serverAdminName: ").append(toIndentedString(serverAdminName)).append("\n");
    sb.append("    serverAdminPassword: ").append(toIndentedString(serverAdminPassword)).append("\n");
    sb.append("    ldapUsersDomain: ").append(toIndentedString(ldapUsersDomain)).append("\n");
    sb.append("    userFilter: ").append(toIndentedString(userFilter)).append("\n");
    sb.append("    userImport: ").append(toIndentedString(userImport)).append("\n");
    sb.append("    adExportGroup: ").append(toIndentedString(adExportGroup)).append("\n");
    sb.append("    importExpireAt: ").append(toIndentedString(importExpireAt)).append("\n");
    sb.append("    sdsImportGroup: ").append(toIndentedString(sdsImportGroup)).append("\n");
    sb.append("    createHomeFolder: ").append(toIndentedString(createHomeFolder)).append("\n");
    sb.append("    homeFolderParent: ").append(toIndentedString(homeFolderParent)).append("\n");
    sb.append("    useLdaps: ").append(toIndentedString(useLdaps)).append("\n");
    sb.append("    sslFingerPrint: ").append(toIndentedString(sslFingerPrint)).append("\n");
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

