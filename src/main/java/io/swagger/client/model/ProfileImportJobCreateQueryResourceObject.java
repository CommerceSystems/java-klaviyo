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
import io.swagger.client.model.ProfileBulkImportJobEnum;
import io.swagger.client.model.ProfileImportJobCreateQueryResourceObjectAttributes;
import io.swagger.client.model.ProfileImportJobCreateQueryResourceObjectRelationships;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ProfileImportJobCreateQueryResourceObject
 */



public class ProfileImportJobCreateQueryResourceObject {
  @SerializedName("type")
  private ProfileBulkImportJobEnum type = null;

  @SerializedName("attributes")
  private ProfileImportJobCreateQueryResourceObjectAttributes attributes = null;

  @SerializedName("relationships")
  private ProfileImportJobCreateQueryResourceObjectRelationships relationships = null;

  public ProfileImportJobCreateQueryResourceObject type(ProfileBulkImportJobEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public ProfileBulkImportJobEnum getType() {
    return type;
  }

  public void setType(ProfileBulkImportJobEnum type) {
    this.type = type;
  }

  public ProfileImportJobCreateQueryResourceObject attributes(ProfileImportJobCreateQueryResourceObjectAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(required = true, description = "")
  public ProfileImportJobCreateQueryResourceObjectAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ProfileImportJobCreateQueryResourceObjectAttributes attributes) {
    this.attributes = attributes;
  }

  public ProfileImportJobCreateQueryResourceObject relationships(ProfileImportJobCreateQueryResourceObjectRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @Schema(description = "")
  public ProfileImportJobCreateQueryResourceObjectRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(ProfileImportJobCreateQueryResourceObjectRelationships relationships) {
    this.relationships = relationships;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileImportJobCreateQueryResourceObject profileImportJobCreateQueryResourceObject = (ProfileImportJobCreateQueryResourceObject) o;
    return Objects.equals(this.type, profileImportJobCreateQueryResourceObject.type) &&
        Objects.equals(this.attributes, profileImportJobCreateQueryResourceObject.attributes) &&
        Objects.equals(this.relationships, profileImportJobCreateQueryResourceObject.relationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, attributes, relationships);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileImportJobCreateQueryResourceObject {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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
