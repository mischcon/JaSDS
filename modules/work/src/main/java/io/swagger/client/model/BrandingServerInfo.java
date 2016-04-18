package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class BrandingServerInfo   {
  
  private String brandingServerUrl = null;
  private String brandingServerCustomer = null;
  private String brandingServerBrandingId = null;

  
  /**
   * Branding server URL
   **/
  public BrandingServerInfo brandingServerUrl(String brandingServerUrl) {
    this.brandingServerUrl = brandingServerUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Branding server URL")
  @JsonProperty("brandingServerUrl")
  public String getBrandingServerUrl() {
    return brandingServerUrl;
  }
  public void setBrandingServerUrl(String brandingServerUrl) {
    this.brandingServerUrl = brandingServerUrl;
  }


  /**
   * Branding server customer UUID
   **/
  public BrandingServerInfo brandingServerCustomer(String brandingServerCustomer) {
    this.brandingServerCustomer = brandingServerCustomer;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Branding server customer UUID")
  @JsonProperty("brandingServerCustomer")
  public String getBrandingServerCustomer() {
    return brandingServerCustomer;
  }
  public void setBrandingServerCustomer(String brandingServerCustomer) {
    this.brandingServerCustomer = brandingServerCustomer;
  }


  /**
   * UUID of Branding <b style='color: green;'>&nbsp;NEW</b>
   **/
  public BrandingServerInfo brandingServerBrandingId(String brandingServerBrandingId) {
    this.brandingServerBrandingId = brandingServerBrandingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "UUID of Branding <b style='color: green;'>&nbsp;NEW</b>")
  @JsonProperty("brandingServerBrandingId")
  public String getBrandingServerBrandingId() {
    return brandingServerBrandingId;
  }
  public void setBrandingServerBrandingId(String brandingServerBrandingId) {
    this.brandingServerBrandingId = brandingServerBrandingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandingServerInfo brandingServerInfo = (BrandingServerInfo) o;
    return Objects.equals(this.brandingServerUrl, brandingServerInfo.brandingServerUrl) &&
        Objects.equals(this.brandingServerCustomer, brandingServerInfo.brandingServerCustomer) &&
        Objects.equals(this.brandingServerBrandingId, brandingServerInfo.brandingServerBrandingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandingServerUrl, brandingServerCustomer, brandingServerBrandingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandingServerInfo {\n");
    
    sb.append("    brandingServerUrl: ").append(toIndentedString(brandingServerUrl)).append("\n");
    sb.append("    brandingServerCustomer: ").append(toIndentedString(brandingServerCustomer)).append("\n");
    sb.append("    brandingServerBrandingId: ").append(toIndentedString(brandingServerBrandingId)).append("\n");
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

