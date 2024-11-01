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
import io.swagger.client.model.WebhookTopicEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PostWebhookResponseDataRelationshipsWebhooktopicsData
 */



public class PostWebhookResponseDataRelationshipsWebhooktopicsData {
  @SerializedName("type")
  private WebhookTopicEnum type = null;

  @SerializedName("id")
  private String id = null;

  public PostWebhookResponseDataRelationshipsWebhooktopicsData type(WebhookTopicEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public WebhookTopicEnum getType() {
    return type;
  }

  public void setType(WebhookTopicEnum type) {
    this.type = type;
  }

  public PostWebhookResponseDataRelationshipsWebhooktopicsData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A topic the webhook is subscribed to.
   * @return id
  **/
  @Schema(example = "event:klaviyo.sent_sms", required = true, description = "A topic the webhook is subscribed to.")
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
    PostWebhookResponseDataRelationshipsWebhooktopicsData postWebhookResponseDataRelationshipsWebhooktopicsData = (PostWebhookResponseDataRelationshipsWebhooktopicsData) o;
    return Objects.equals(this.type, postWebhookResponseDataRelationshipsWebhooktopicsData.type) &&
        Objects.equals(this.id, postWebhookResponseDataRelationshipsWebhooktopicsData.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostWebhookResponseDataRelationshipsWebhooktopicsData {\n");
    
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
