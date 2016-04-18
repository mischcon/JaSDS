package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class Language   {
  
  private Integer languageId = null;
  private String description = null;
  private String isoCode = null;

  
  /**
   * Language ID
   **/
  public Language languageId(Integer languageId) {
    this.languageId = languageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Language ID")
  @JsonProperty("languageId")
  public Integer getLanguageId() {
    return languageId;
  }
  public void setLanguageId(Integer languageId) {
    this.languageId = languageId;
  }


  /**
   * Description
   **/
  public Language description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * ISO 639-1 code
   **/
  public Language isoCode(String isoCode) {
    this.isoCode = isoCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ISO 639-1 code")
  @JsonProperty("isoCode")
  public String getIsoCode() {
    return isoCode;
  }
  public void setIsoCode(String isoCode) {
    this.isoCode = isoCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Language language = (Language) o;
    return Objects.equals(this.languageId, language.languageId) &&
        Objects.equals(this.description, language.description) &&
        Objects.equals(this.isoCode, language.isoCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageId, description, isoCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Language {\n");
    
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isoCode: ").append(toIndentedString(isoCode)).append("\n");
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

