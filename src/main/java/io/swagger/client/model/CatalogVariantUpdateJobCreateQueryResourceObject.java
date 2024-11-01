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
import io.swagger.client.model.CatalogVariantBulkUpdateJobEnum;
import io.swagger.client.model.CatalogVariantUpdateJobCreateQueryResourceObjectAttributes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CatalogVariantUpdateJobCreateQueryResourceObject
 */



public class CatalogVariantUpdateJobCreateQueryResourceObject {
  @SerializedName("type")
  private CatalogVariantBulkUpdateJobEnum type = null;

  @SerializedName("attributes")
  private CatalogVariantUpdateJobCreateQueryResourceObjectAttributes attributes = null;

  public CatalogVariantUpdateJobCreateQueryResourceObject type(CatalogVariantBulkUpdateJobEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public CatalogVariantBulkUpdateJobEnum getType() {
    return type;
  }

  public void setType(CatalogVariantBulkUpdateJobEnum type) {
    this.type = type;
  }

  public CatalogVariantUpdateJobCreateQueryResourceObject attributes(CatalogVariantUpdateJobCreateQueryResourceObjectAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(required = true, description = "")
  public CatalogVariantUpdateJobCreateQueryResourceObjectAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CatalogVariantUpdateJobCreateQueryResourceObjectAttributes attributes) {
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
    CatalogVariantUpdateJobCreateQueryResourceObject catalogVariantUpdateJobCreateQueryResourceObject = (CatalogVariantUpdateJobCreateQueryResourceObject) o;
    return Objects.equals(this.type, catalogVariantUpdateJobCreateQueryResourceObject.type) &&
        Objects.equals(this.attributes, catalogVariantUpdateJobCreateQueryResourceObject.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogVariantUpdateJobCreateQueryResourceObject {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
