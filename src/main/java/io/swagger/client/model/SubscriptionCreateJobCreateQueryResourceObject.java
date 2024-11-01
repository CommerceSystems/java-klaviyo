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
import io.swagger.client.model.ProfileSubscriptionBulkCreateJobEnum;
import io.swagger.client.model.SubscriptionCreateJobCreateQueryResourceObjectAttributes;
import io.swagger.client.model.SubscriptionCreateJobCreateQueryResourceObjectRelationships;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SubscriptionCreateJobCreateQueryResourceObject
 */



public class SubscriptionCreateJobCreateQueryResourceObject {
  @SerializedName("type")
  private ProfileSubscriptionBulkCreateJobEnum type = null;

  @SerializedName("attributes")
  private SubscriptionCreateJobCreateQueryResourceObjectAttributes attributes = null;

  @SerializedName("relationships")
  private SubscriptionCreateJobCreateQueryResourceObjectRelationships relationships = null;

  public SubscriptionCreateJobCreateQueryResourceObject type(ProfileSubscriptionBulkCreateJobEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public ProfileSubscriptionBulkCreateJobEnum getType() {
    return type;
  }

  public void setType(ProfileSubscriptionBulkCreateJobEnum type) {
    this.type = type;
  }

  public SubscriptionCreateJobCreateQueryResourceObject attributes(SubscriptionCreateJobCreateQueryResourceObjectAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(required = true, description = "")
  public SubscriptionCreateJobCreateQueryResourceObjectAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(SubscriptionCreateJobCreateQueryResourceObjectAttributes attributes) {
    this.attributes = attributes;
  }

  public SubscriptionCreateJobCreateQueryResourceObject relationships(SubscriptionCreateJobCreateQueryResourceObjectRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @Schema(description = "")
  public SubscriptionCreateJobCreateQueryResourceObjectRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(SubscriptionCreateJobCreateQueryResourceObjectRelationships relationships) {
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
    SubscriptionCreateJobCreateQueryResourceObject subscriptionCreateJobCreateQueryResourceObject = (SubscriptionCreateJobCreateQueryResourceObject) o;
    return Objects.equals(this.type, subscriptionCreateJobCreateQueryResourceObject.type) &&
        Objects.equals(this.attributes, subscriptionCreateJobCreateQueryResourceObject.attributes) &&
        Objects.equals(this.relationships, subscriptionCreateJobCreateQueryResourceObject.relationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, attributes, relationships);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionCreateJobCreateQueryResourceObject {\n");
    
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
