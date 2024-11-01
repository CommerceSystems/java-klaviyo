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
import io.swagger.client.model.FlowEnum;
import io.swagger.client.model.FlowResponseObjectResourceAttributes;
import io.swagger.client.model.ObjectLinks;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * FlowResponseObjectResource
 */



public class FlowResponseObjectResource implements OneOfGetFlowActionResponseCompoundDocumentIncludedItems, OneOfGetListListResponseCollectionCompoundDocumentIncludedItems, OneOfGetListRetrieveResponseCompoundDocumentIncludedItems, OneOfGetSegmentListResponseCollectionCompoundDocumentIncludedItems, OneOfGetSegmentRetrieveResponseCompoundDocumentIncludedItems {
  @SerializedName("type")
  private FlowEnum type = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("attributes")
  private FlowResponseObjectResourceAttributes attributes = null;

  @SerializedName("links")
  private ObjectLinks links = null;

  public FlowResponseObjectResource type(FlowEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public FlowEnum getType() {
    return type;
  }

  public void setType(FlowEnum type) {
    this.type = type;
  }

  public FlowResponseObjectResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FlowResponseObjectResource attributes(FlowResponseObjectResourceAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(required = true, description = "")
  public FlowResponseObjectResourceAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(FlowResponseObjectResourceAttributes attributes) {
    this.attributes = attributes;
  }

  public FlowResponseObjectResource links(ObjectLinks links) {
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
    FlowResponseObjectResource flowResponseObjectResource = (FlowResponseObjectResource) o;
    return Objects.equals(this.type, flowResponseObjectResource.type) &&
        Objects.equals(this.id, flowResponseObjectResource.id) &&
        Objects.equals(this.attributes, flowResponseObjectResource.attributes) &&
        Objects.equals(this.links, flowResponseObjectResource.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, attributes, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowResponseObjectResource {\n");
    
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
