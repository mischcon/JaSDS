package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-18T18:18:26.783+02:00")
public class AdminDSAdmin   {
  
  private Long id = null;
  private String salutation = null;


  public enum GenderEnum {
    M("m"),
    F("f"),
    N("n");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private GenderEnum gender = null;
  private String firstName = null;
  private String lastName = null;
  private String email = null;
  private Boolean mustChangeUserName = null;

  
  /**
   * User id
   **/
  public AdminDSAdmin id(Long id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User id")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Salutation key.  <span style=\"color: red; font-weight: bold;\">[DEPRECATED]</span>, please use gender instead!
   **/
  public AdminDSAdmin salutation(String salutation) {
    this.salutation = salutation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Salutation key.  <span style=\"color: red; font-weight: bold;\">[DEPRECATED]</span>, please use gender instead!")
  @JsonProperty("salutation")
  public String getSalutation() {
    return salutation;
  }
  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }


  /**
   * Gender key, one of [m|f|n]
   **/
  public AdminDSAdmin gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Gender key, one of [m|f|n]")
  @JsonProperty("gender")
  public GenderEnum getGender() {
    return gender;
  }
  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }


  /**
   * First name.
   **/
  public AdminDSAdmin firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "First name.")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   * Last name.
   **/
  public AdminDSAdmin lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Last name.")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   * Email
   **/
  public AdminDSAdmin email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Email")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * If true, the user must change the userName at the first login
   **/
  public AdminDSAdmin mustChangeUserName(Boolean mustChangeUserName) {
    this.mustChangeUserName = mustChangeUserName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, the user must change the userName at the first login")
  @JsonProperty("mustChangeUserName")
  public Boolean getMustChangeUserName() {
    return mustChangeUserName;
  }
  public void setMustChangeUserName(Boolean mustChangeUserName) {
    this.mustChangeUserName = mustChangeUserName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminDSAdmin adminDSAdmin = (AdminDSAdmin) o;
    return Objects.equals(this.id, adminDSAdmin.id) &&
        Objects.equals(this.salutation, adminDSAdmin.salutation) &&
        Objects.equals(this.gender, adminDSAdmin.gender) &&
        Objects.equals(this.firstName, adminDSAdmin.firstName) &&
        Objects.equals(this.lastName, adminDSAdmin.lastName) &&
        Objects.equals(this.email, adminDSAdmin.email) &&
        Objects.equals(this.mustChangeUserName, adminDSAdmin.mustChangeUserName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, salutation, gender, firstName, lastName, email, mustChangeUserName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminDSAdmin {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    mustChangeUserName: ").append(toIndentedString(mustChangeUserName)).append("\n");
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

