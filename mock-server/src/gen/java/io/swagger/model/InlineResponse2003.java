package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class InlineResponse2003   {

  private @Valid Integer id = null;

  private @Valid String usernamae = null;

  private @Valid Integer point = null;

  private @Valid String level = null;

  private @Valid String avatarURL = null;

  /**
   **/
  public InlineResponse2003 id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public InlineResponse2003 usernamae(String usernamae) {
    this.usernamae = usernamae;
    return this;
  }

  
  @ApiModelProperty(example = "husfuu", value = "")
  @JsonProperty("usernamae")

  public String getUsernamae() {
    return usernamae;
  }
  public void setUsernamae(String usernamae) {
    this.usernamae = usernamae;
  }

  /**
   **/
  public InlineResponse2003 point(Integer point) {
    this.point = point;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("point")

  public Integer getPoint() {
    return point;
  }
  public void setPoint(Integer point) {
    this.point = point;
  }

  /**
   **/
  public InlineResponse2003 level(String level) {
    this.level = level;
    return this;
  }

  
  @ApiModelProperty(example = "Grand Master", value = "")
  @JsonProperty("level")

  public String getLevel() {
    return level;
  }
  public void setLevel(String level) {
    this.level = level;
  }

  /**
   **/
  public InlineResponse2003 avatarURL(String avatarURL) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(id, inlineResponse2003.id) &&
        Objects.equals(usernamae, inlineResponse2003.usernamae) &&
        Objects.equals(point, inlineResponse2003.point) &&
        Objects.equals(level, inlineResponse2003.level) &&
        Objects.equals(avatarURL, inlineResponse2003.avatarURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, usernamae, point, level, avatarURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    usernamae: ").append(toIndentedString(usernamae)).append("\n");
    sb.append("    point: ").append(toIndentedString(point)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    avatarURL: ").append(toIndentedString(avatarURL)).append("\n");
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
