package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class TestActiveDirectoryConfigResponse   {
  
  private String serverIp = null;
  private Integer serverPort = null;
  private String serverAdminName = null;
  private String serverAdminPassword = null;
  private String ldapUsersDomain = null;
  private Boolean useLdaps = null;
  private String sslFingerPrint = null;

  
  /**
   * IPv4 or IPv6 address or host name
   **/
  public TestActiveDirectoryConfigResponse serverIp(String serverIp) {
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
  public TestActiveDirectoryConfigResponse serverPort(Integer serverPort) {
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
  public TestActiveDirectoryConfigResponse serverAdminName(String serverAdminName) {
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
  public TestActiveDirectoryConfigResponse serverAdminPassword(String serverAdminPassword) {
    this.serverAdminPassword = serverAdminPassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Password of Active Directory administrative account")
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
  public TestActiveDirectoryConfigResponse ldapUsersDomain(String ldapUsersDomain) {
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
   * Determines whether LDAPS should be used instead of plain LDAP.
   **/
  public TestActiveDirectoryConfigResponse useLdaps(Boolean useLdaps) {
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
   * SSL finger print of Active Directory server.  Mandatory for LDAPS connections. Format: Algorithm/FingerPrint
   **/
  public TestActiveDirectoryConfigResponse sslFingerPrint(String sslFingerPrint) {
    this.sslFingerPrint = sslFingerPrint;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "SSL finger print of Active Directory server.  Mandatory for LDAPS connections. Format: Algorithm/FingerPrint")
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
    TestActiveDirectoryConfigResponse testActiveDirectoryConfigResponse = (TestActiveDirectoryConfigResponse) o;
    return Objects.equals(this.serverIp, testActiveDirectoryConfigResponse.serverIp) &&
        Objects.equals(this.serverPort, testActiveDirectoryConfigResponse.serverPort) &&
        Objects.equals(this.serverAdminName, testActiveDirectoryConfigResponse.serverAdminName) &&
        Objects.equals(this.serverAdminPassword, testActiveDirectoryConfigResponse.serverAdminPassword) &&
        Objects.equals(this.ldapUsersDomain, testActiveDirectoryConfigResponse.ldapUsersDomain) &&
        Objects.equals(this.useLdaps, testActiveDirectoryConfigResponse.useLdaps) &&
        Objects.equals(this.sslFingerPrint, testActiveDirectoryConfigResponse.sslFingerPrint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverIp, serverPort, serverAdminName, serverAdminPassword, ldapUsersDomain, useLdaps, sslFingerPrint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestActiveDirectoryConfigResponse {\n");
    
    sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
    sb.append("    serverPort: ").append(toIndentedString(serverPort)).append("\n");
    sb.append("    serverAdminName: ").append(toIndentedString(serverAdminName)).append("\n");
    sb.append("    serverAdminPassword: ").append(toIndentedString(serverAdminPassword)).append("\n");
    sb.append("    ldapUsersDomain: ").append(toIndentedString(ldapUsersDomain)).append("\n");
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

