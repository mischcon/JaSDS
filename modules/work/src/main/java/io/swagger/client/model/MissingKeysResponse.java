package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.FileFileKeys;
import io.swagger.client.model.Range;
import io.swagger.client.model.UserIdFileIdItem;
import io.swagger.client.model.UserUserPublicKey;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class MissingKeysResponse   {
  
  private Range range = null;
  private List<UserIdFileIdItem> items = new ArrayList<UserIdFileIdItem>();
  private List<UserUserPublicKey> users = new ArrayList<UserUserPublicKey>();
  private List<FileFileKeys> files = new ArrayList<FileFileKeys>();

  
  /**
   **/
  public MissingKeysResponse range(Range range) {
    this.range = range;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("range")
  public Range getRange() {
    return range;
  }
  public void setRange(Range range) {
    this.range = range;
  }


  /**
   **/
  public MissingKeysResponse items(List<UserIdFileIdItem> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("items")
  public List<UserIdFileIdItem> getItems() {
    return items;
  }
  public void setItems(List<UserIdFileIdItem> items) {
    this.items = items;
  }


  /**
   **/
  public MissingKeysResponse users(List<UserUserPublicKey> users) {
    this.users = users;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("users")
  public List<UserUserPublicKey> getUsers() {
    return users;
  }
  public void setUsers(List<UserUserPublicKey> users) {
    this.users = users;
  }


  /**
   **/
  public MissingKeysResponse files(List<FileFileKeys> files) {
    this.files = files;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("files")
  public List<FileFileKeys> getFiles() {
    return files;
  }
  public void setFiles(List<FileFileKeys> files) {
    this.files = files;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MissingKeysResponse missingKeysResponse = (MissingKeysResponse) o;
    return Objects.equals(this.range, missingKeysResponse.range) &&
        Objects.equals(this.items, missingKeysResponse.items) &&
        Objects.equals(this.users, missingKeysResponse.users) &&
        Objects.equals(this.files, missingKeysResponse.files);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, items, users, files);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MissingKeysResponse {\n");
    
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

