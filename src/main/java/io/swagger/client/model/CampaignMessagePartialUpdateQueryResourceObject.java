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
import io.swagger.client.model.CampaignMessageEnum;
import io.swagger.client.model.CampaignMessagePartialUpdateQueryResourceObjectAttributes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CampaignMessagePartialUpdateQueryResourceObject
 */



public class CampaignMessagePartialUpdateQueryResourceObject {
  @SerializedName("type")
  private CampaignMessageEnum type = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("attributes")
  private CampaignMessagePartialUpdateQueryResourceObjectAttributes attributes = null;

  public CampaignMessagePartialUpdateQueryResourceObject type(CampaignMessageEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public CampaignMessageEnum getType() {
    return type;
  }

  public void setType(CampaignMessageEnum type) {
    this.type = type;
  }

  public CampaignMessagePartialUpdateQueryResourceObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The message ID to be retrieved
   * @return id
  **/
  @Schema(required = true, description = "The message ID to be retrieved")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CampaignMessagePartialUpdateQueryResourceObject attributes(CampaignMessagePartialUpdateQueryResourceObjectAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(required = true, description = "")
  public CampaignMessagePartialUpdateQueryResourceObjectAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CampaignMessagePartialUpdateQueryResourceObjectAttributes attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignMessagePartialUpdateQueryResourceObject campaignMessagePartialUpdateQueryResourceObject = (CampaignMessagePartialUpdateQueryResourceObject) o;
    return Objects.equals(this.type, campaignMessagePartialUpdateQueryResourceObject.type) &&
        Objects.equals(this.id, campaignMessagePartialUpdateQueryResourceObject.id) &&
        Objects.equals(this.attributes, campaignMessagePartialUpdateQueryResourceObject.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignMessagePartialUpdateQueryResourceObject {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
