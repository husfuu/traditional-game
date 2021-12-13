package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RegisterBody   {

  private @Valid String username = null;

  private @Valid String email = null;

  private @Valid String password = null;

  /**
   **/
  public RegisterBody username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(example = "husfuu", value = "")
  @JsonProperty("username")

  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   **/
  public RegisterBody email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(example = "husfuu@yahoo.com", value = "")
  @JsonProperty("email")

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  public RegisterBody password(String password) {
    this.password = password;
    return this;
  }

  
  @ApiModelProperty(example = "husfuuPass", value = "")
  @JsonProperty("password")

  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterBody registerBody = (RegisterBody) o;
    return Objects.equals(username, registerBody.username) &&
        Objects.equals(email, registerBody.email) &&
        Objects.equals(password, registerBody.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, email, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterBody {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
