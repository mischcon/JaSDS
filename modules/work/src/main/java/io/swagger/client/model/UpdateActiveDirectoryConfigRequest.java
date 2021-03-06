package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class UpdateActiveDirectoryConfigRequest   {
  
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
   * Alias string
   **/
  public UpdateActiveDirectoryConfigRequest alias(String alias) {
    this.alias = alias;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Alias string")
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
  public UpdateActiveDirectoryConfigRequest serverIp(String serverIp) {
    this.serverIp = serverIp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IPv4 or IPv6 address or host name")
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
  public UpdateActiveDirectoryConfigRequest serverPort(Integer serverPort) {
    this.serverPort = serverPort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Port")
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
  public UpdateActiveDirectoryConfigRequest serverAdminName(String serverAdminName) {
    this.serverAdminName = serverAdminName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "DistinguishedName of Active Directory administrative account")
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
  public UpdateActiveDirectoryConfigRequest serverAdminPassword(String serverAdminPassword) {
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
  public UpdateActiveDirectoryConfigRequest ldapUsersDomain(String ldapUsersDomain) {
    this.ldapUsersDomain = ldapUsersDomain;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Search scope of Active Directory; only users below this node can log on.")
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
  public UpdateActiveDirectoryConfigRequest userFilter(String userFilter) {
    this.userFilter = userFilter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of Active Directory attribute that is used as login name")
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
  public UpdateActiveDirectoryConfigRequest userImport(Boolean userImport) {
    this.userImport = userImport;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Determines if an SDS account is automatically created for a new user who successfully logs on with his/her AD account,")
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
  public UpdateActiveDirectoryConfigRequest adExportGroup(String adExportGroup) {
    this.adExportGroup = adExportGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If ad_userimport is set to true, a user must be member of this Active Directory group to receive a newly created SDS account.")
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
  public UpdateActiveDirectoryConfigRequest importExpireAt(Date importExpireAt) {
    this.importExpireAt = importExpireAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Default expiration date of users who are created by automatic import.")
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
  public UpdateActiveDirectoryConfigRequest sdsImportGroup(Long sdsImportGroup) {
    this.sdsImportGroup = sdsImportGroup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User group that is assigned to users who are created by automatic import.")
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
  public UpdateActiveDirectoryConfigRequest createHomeFolder(Boolean createHomeFolder) {
    this.createHomeFolder = createHomeFolder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Determines whether a SubRoom is created for each user that is created by automatic import (Like a home folder). The SubRoom's name will equal the user's login name.")
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
  public UpdateActiveDirectoryConfigRequest homeFolderParent(Long homeFolderParent) {
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
  public UpdateActiveDirectoryConfigRequest useLdaps(Boolean useLdaps) {
    this.useLdaps = useLdaps;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Determines whether LDAPS should be used instead of plain LDAP.")
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
  public UpdateActiveDirectoryConfigRequest sslFingerPrint(String sslFingerPrint) {
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
    UpdateActiveDirectoryConfigRequest updateActiveDirectoryConfigRequest = (UpdateActiveDirectoryConfigRequest) o;
    return Objects.equals(this.alias, updateActiveDirectoryConfigRequest.alias) &&
        Objects.equals(this.serverIp, updateActiveDirectoryConfigRequest.serverIp) &&
        Objects.equals(this.serverPort, updateActiveDirectoryConfigRequest.serverPort) &&
        Objects.equals(this.serverAdminName, updateActiveDirectoryConfigRequest.serverAdminName) &&
        Objects.equals(this.serverAdminPassword, updateActiveDirectoryConfigRequest.serverAdminPassword) &&
        Objects.equals(this.ldapUsersDomain, updateActiveDirectoryConfigRequest.ldapUsersDomain) &&
        Objects.equals(this.userFilter, updateActiveDirectoryConfigRequest.userFilter) &&
        Objects.equals(this.userImport, updateActiveDirectoryConfigRequest.userImport) &&
        Objects.equals(this.adExportGroup, updateActiveDirectoryConfigRequest.adExportGroup) &&
        Objects.equals(this.importExpireAt, updateActiveDirectoryConfigRequest.importExpireAt) &&
        Objects.equals(this.sdsImportGroup, updateActiveDirectoryConfigRequest.sdsImportGroup) &&
        Objects.equals(this.createHomeFolder, updateActiveDirectoryConfigRequest.createHomeFolder) &&
        Objects.equals(this.homeFolderParent, updateActiveDirectoryConfigRequest.homeFolderParent) &&
        Objects.equals(this.useLdaps, updateActiveDirectoryConfigRequest.useLdaps) &&
        Objects.equals(this.sslFingerPrint, updateActiveDirectoryConfigRequest.sslFingerPrint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, serverIp, serverPort, serverAdminName, serverAdminPassword, ldapUsersDomain, userFilter, userImport, adExportGroup, importExpireAt, sdsImportGroup, createHomeFolder, homeFolderParent, useLdaps, sslFingerPrint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateActiveDirectoryConfigRequest {\n");
    
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

