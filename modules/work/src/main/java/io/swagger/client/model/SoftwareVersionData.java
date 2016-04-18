package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class SoftwareVersionData   {
  
  private String restApiVersion = null;
  private String sdsServerVersion = null;
  private Date buildDate = null;

  
  /**
   * REST API version. E.g. 3.1.0
   **/
  public SoftwareVersionData restApiVersion(String restApiVersion) {
    this.restApiVersion = restApiVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "REST API version. E.g. 3.1.0")
  @JsonProperty("restApiVersion")
  public String getRestApiVersion() {
    return restApiVersion;
  }
  public void setRestApiVersion(String restApiVersion) {
    this.restApiVersion = restApiVersion;
  }


  /**
   * SDS server version. E.g. 3.1.0.FINAL
   **/
  public SoftwareVersionData sdsServerVersion(String sdsServerVersion) {
    this.sdsServerVersion = sdsServerVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "SDS server version. E.g. 3.1.0.FINAL")
  @JsonProperty("sdsServerVersion")
  public String getSdsServerVersion() {
    return sdsServerVersion;
  }
  public void setSdsServerVersion(String sdsServerVersion) {
    this.sdsServerVersion = sdsServerVersion;
  }


  /**
   * Build date (2015-12-31T23:59:00)
   **/
  public SoftwareVersionData buildDate(Date buildDate) {
    this.buildDate = buildDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Build date (2015-12-31T23:59:00)")
  @JsonProperty("buildDate")
  public Date getBuildDate() {
    return buildDate;
  }
  public void setBuildDate(Date buildDate) {
    this.buildDate = buildDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SoftwareVersionData softwareVersionData = (SoftwareVersionData) o;
    return Objects.equals(this.restApiVersion, softwareVersionData.restApiVersion) &&
        Objects.equals(this.sdsServerVersion, softwareVersionData.sdsServerVersion) &&
        Objects.equals(this.buildDate, softwareVersionData.buildDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restApiVersion, sdsServerVersion, buildDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SoftwareVersionData {\n");
    
    sb.append("    restApiVersion: ").append(toIndentedString(restApiVersion)).append("\n");
    sb.append("    sdsServerVersion: ").append(toIndentedString(sdsServerVersion)).append("\n");
    sb.append("    buildDate: ").append(toIndentedString(buildDate)).append("\n");
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

