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
import io.swagger.client.model.ListEnum;
import io.swagger.client.model.ListListResponseObjectResourceAttributes;
import io.swagger.client.model.ObjectLinks;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ListResponseObjectResource
 */



public class ListResponseObjectResource implements OneOfGetProfileResponseCompoundDocumentIncludedItems {
  @SerializedName("type")
  private ListEnum type = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("attributes")
  private ListListResponseObjectResourceAttributes attributes = null;

  @SerializedName("links")
  private ObjectLinks links = null;

  public ListResponseObjectResource type(ListEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public ListEnum getType() {
    return type;
  }

  public void setType(ListEnum type) {
    this.type = type;
  }

  public ListResponseObjectResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Primary key that uniquely identifies this list. Generated by Klaviyo.
   * @return id
  **/
  @Schema(example = "Y6nRLr", required = true, description = "Primary key that uniquely identifies this list. Generated by Klaviyo.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ListResponseObjectResource attributes(ListListResponseObjectResourceAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(required = true, description = "")
  public ListListResponseObjectResourceAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ListListResponseObjectResourceAttributes attributes) {
    this.attributes = attributes;
  }

  public ListResponseObjectResource links(ObjectLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Schema(required = true, description = "")
  public ObjectLinks getLinks() {
    return links;
  }

  public void setLinks(ObjectLinks links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListResponseObjectResource listResponseObjectResource = (ListResponseObjectResource) o;
    return Objects.equals(this.type, listResponseObjectResource.type) &&
        Objects.equals(this.id, listResponseObjectResource.id) &&
        Objects.equals(this.attributes, listResponseObjectResource.attributes) &&
        Objects.equals(this.links, listResponseObjectResource.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, attributes, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListResponseObjectResource {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
