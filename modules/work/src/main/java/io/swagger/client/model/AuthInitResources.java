package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.KeyValueEntry;
import io.swagger.client.model.Language;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class AuthInitResources   {
  
  private List<Language> languages = new ArrayList<Language>();
  private List<KeyValueEntry> authTypes = new ArrayList<KeyValueEntry>();

  
  /**
   * Supported languages
   **/
  public AuthInitResources languages(List<Language> languages) {
    this.languages = languages;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Supported languages")
  @JsonProperty("languages")
  public List<Language> getLanguages() {
    return languages;
  }
  public void setLanguages(List<Language> languages) {
    this.languages = languages;
  }


  /**
   * Supported authentication types
   **/
  public AuthInitResources authTypes(List<KeyValueEntry> authTypes) {
    this.authTypes = authTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Supported authentication types")
  @JsonProperty("authTypes")
  public List<KeyValueEntry> getAuthTypes() {
    return authTypes;
  }
  public void setAuthTypes(List<KeyValueEntry> authTypes) {
    this.authTypes = authTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthInitResources authInitResources = (AuthInitResources) o;
    return Objects.equals(this.languages, authInitResources.languages) &&
        Objects.equals(this.authTypes, authInitResources.authTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languages, authTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthInitResources {\n");
    
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    authTypes: ").append(toIndentedString(authTypes)).append("\n");
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

