package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.KeyValueEntry;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class UserAuthMethod   {
  
  private String authId = null;
  private Boolean isEnabled = null;
  private List<KeyValueEntry> options = new ArrayList<KeyValueEntry>();

  
  /**
   * Authentication method Id
   **/
  public UserAuthMethod authId(String authId) {
    this.authId = authId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Authentication method Id")
  @JsonProperty("authId")
  public String getAuthId() {
    return authId;
  }
  public void setAuthId(String authId) {
    this.authId = authId;
  }


  /**
   * Is enabled
   **/
  public UserAuthMethod isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Is enabled")
  @JsonProperty("isEnabled")
  public Boolean getIsEnabled() {
    return isEnabled;
  }
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  /**
   * Authentication method options; optional for method 'sql', required for methods 'radius' and 'active_directory'
   **/
  public UserAuthMethod options(List<KeyValueEntry> options) {
    this.options = options;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Authentication method options; optional for method 'sql', required for methods 'radius' and 'active_directory'")
  @JsonProperty("options")
  public List<KeyValueEntry> getOptions() {
    return options;
  }
  public void setOptions(List<KeyValueEntry> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAuthMethod userAuthMethod = (UserAuthMethod) o;
    return Objects.equals(this.authId, userAuthMethod.authId) &&
        Objects.equals(this.isEnabled, userAuthMethod.isEnabled) &&
        Objects.equals(this.options, userAuthMethod.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authId, isEnabled, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthMethod {\n");
    
    sb.append("    authId: ").append(toIndentedString(authId)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

