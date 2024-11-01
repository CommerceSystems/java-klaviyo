/*
 * Klaviyo API
 * The Klaviyo REST API. Please visit https://developers.klaviyo.com for more details.
 *
 * OpenAPI spec version: 2024-10-15
 * Contact: developers@klaviyo.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ProfileEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PostCouponCodeResponseDataRelationshipsProfileData
 */



public class PostCouponCodeResponseDataRelationshipsProfileData {
  @SerializedName("type")
  private ProfileEnum type = null;

  @SerializedName("id")
  private String id = null;

  public PostCouponCodeResponseDataRelationshipsProfileData type(ProfileEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public ProfileEnum getType() {
    return type;
  }

  public void setType(ProfileEnum type) {
    this.type = type;
  }

  public PostCouponCodeResponseDataRelationshipsProfileData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "01GDDKASAP8TKDDA2GRZDSVP4H", required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCouponCodeResponseDataRelationshipsProfileData postCouponCodeResponseDataRelationshipsProfileData = (PostCouponCodeResponseDataRelationshipsProfileData) o;
    return Objects.equals(this.type, postCouponCodeResponseDataRelationshipsProfileData.type) &&
        Objects.equals(this.id, postCouponCodeResponseDataRelationshipsProfileData.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCouponCodeResponseDataRelationshipsProfileData {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
