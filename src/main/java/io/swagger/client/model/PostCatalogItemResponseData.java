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
import io.swagger.client.model.CatalogItemEnum;
import io.swagger.client.model.CatalogItemResponseObjectResourceAttributes;
import io.swagger.client.model.ObjectLinks;
import io.swagger.client.model.PostCatalogItemResponseDataRelationships;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PostCatalogItemResponseData
 */



public class PostCatalogItemResponseData {
  @SerializedName("type")
  private CatalogItemEnum type = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("attributes")
  private CatalogItemResponseObjectResourceAttributes attributes = null;

  @SerializedName("relationships")
  private PostCatalogItemResponseDataRelationships relationships = null;

  @SerializedName("links")
  private ObjectLinks links = null;

  public PostCatalogItemResponseData type(CatalogItemEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public CatalogItemEnum getType() {
    return type;
  }

  public void setType(CatalogItemEnum type) {
    this.type = type;
  }

  public PostCatalogItemResponseData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The catalog item ID is a compound ID (string), with format: &#x60;{integration}:::{catalog}:::{external_id}&#x60;. Currently, the only supported integration type is &#x60;$custom&#x60;, and the only supported catalog is &#x60;$default&#x60;.
   * @return id
  **/
  @Schema(example = "$custom:::$default:::SAMPLE-DATA-ITEM-1", required = true, description = "The catalog item ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PostCatalogItemResponseData attributes(CatalogItemResponseObjectResourceAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(required = true, description = "")
  public CatalogItemResponseObjectResourceAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CatalogItemResponseObjectResourceAttributes attributes) {
    this.attributes = attributes;
  }

  public PostCatalogItemResponseData relationships(PostCatalogItemResponseDataRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @Schema(description = "")
  public PostCatalogItemResponseDataRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(PostCatalogItemResponseDataRelationships relationships) {
    this.relationships = relationships;
  }

  public PostCatalogItemResponseData links(ObjectLinks links) {
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
    PostCatalogItemResponseData postCatalogItemResponseData = (PostCatalogItemResponseData) o;
    return Objects.equals(this.type, postCatalogItemResponseData.type) &&
        Objects.equals(this.id, postCatalogItemResponseData.id) &&
        Objects.equals(this.attributes, postCatalogItemResponseData.attributes) &&
        Objects.equals(this.relationships, postCatalogItemResponseData.relationships) &&
        Objects.equals(this.links, postCatalogItemResponseData.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, attributes, relationships, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCatalogItemResponseData {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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
