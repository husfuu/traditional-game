package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LoginBody   {

  private @Valid String username = null;

  private @Valid String password = null;

  private @Valid String avatarURL = null;

  private @Valid String bio = null;

  private @Valid String phoneNumber = null;

  private @Valid String address = null;

  /**
   **/
  public LoginBody username(String username) {
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
  public LoginBody password(String password) {
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

  /**
   **/
  public LoginBody avatarURL(String avatarURL) {
    this.avatarURL = avatarURL;
    return this;
  }

  
  @ApiModelProperty(example = "https://pixabay.com/vectors/girl-cute-cold-winter-anime-scarf-160326/", value = "")
  @JsonProperty("avatarURL")

  public String getAvatarURL() {
    return avatarURL;
  }
  public void setAvatarURL(String avatarURL) {
    this.avatarURL = avatarURL;
  }

  /**
   **/
  public LoginBody bio(String bio) {
    this.bio = bio;
    return this;
  }

  
  @ApiModelProperty(example = "idk", value = "")
  @JsonProperty("bio")

  public String getBio() {
    return bio;
  }
  public void setBio(String bio) {
    this.bio = bio;
  }

  /**
   **/
  public LoginBody phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  
  @ApiModelProperty(example = "628777777777", value = "")
  @JsonProperty("phoneNumber")

  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  /**
   **/
  public LoginBody address(String address) {
    this.address = address;
    return this;
  }

  
  @ApiModelProperty(example = "jln Pegangsaan Timur", value = "")
  @JsonProperty("address")

  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginBody loginBody = (LoginBody) o;
    return Objects.equals(username, loginBody.username) &&
        Objects.equals(password, loginBody.password) &&
        Objects.equals(avatarURL, loginBody.avatarURL) &&
        Objects.equals(bio, loginBody.bio) &&
        Objects.equals(phoneNumber, loginBody.phoneNumber) &&
        Objects.equals(address, loginBody.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, avatarURL, bio, phoneNumber, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginBody {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    avatarURL: ").append(toIndentedString(avatarURL)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
