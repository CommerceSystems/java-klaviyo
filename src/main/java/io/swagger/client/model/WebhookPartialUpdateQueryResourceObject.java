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
import io.swagger.client.model.WebhookCreateQueryResourceObjectRelationships;
import io.swagger.client.model.WebhookEnum;
import io.swagger.client.model.WebhookPartialUpdateQueryResourceObjectAttributes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * WebhookPartialUpdateQueryResourceObject
 */



public class WebhookPartialUpdateQueryResourceObject {
  @SerializedName("type")
  private WebhookEnum type = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("attributes")
  private WebhookPartialUpdateQueryResourceObjectAttributes attributes = null;

  @SerializedName("relationships")
  private WebhookCreateQueryResourceObjectRelationships relationships = null;

  public WebhookPartialUpdateQueryResourceObject type(WebhookEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public WebhookEnum getType() {
    return type;
  }

  public void setType(WebhookEnum type) {
    this.type = type;
  }

  public WebhookPartialUpdateQueryResourceObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the webhook.
   * @return id
  **/
  @Schema(required = true, description = "The ID of the webhook.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WebhookPartialUpdateQueryResourceObject attributes(WebhookPartialUpdateQueryResourceObjectAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(required = true, description = "")
  public WebhookPartialUpdateQueryResourceObjectAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(WebhookPartialUpdateQueryResourceObjectAttributes attributes) {
    this.attributes = attributes;
  }

  public WebhookPartialUpdateQueryResourceObject relationships(WebhookCreateQueryResourceObjectRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @Schema(description = "")
  public WebhookCreateQueryResourceObjectRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(WebhookCreateQueryResourceObjectRelationships relationships) {
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
    WebhookPartialUpdateQueryResourceObject webhookPartialUpdateQueryResourceObject = (WebhookPartialUpdateQueryResourceObject) o;
    return Objects.equals(this.type, webhookPartialUpdateQueryResourceObject.type) &&
        Objects.equals(this.id, webhookPartialUpdateQueryResourceObject.id) &&
        Objects.equals(this.attributes, webhookPartialUpdateQueryResourceObject.attributes) &&
        Objects.equals(this.relationships, webhookPartialUpdateQueryResourceObject.relationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, attributes, relationships);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookPartialUpdateQueryResourceObject {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
