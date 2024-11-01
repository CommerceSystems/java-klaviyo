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
import io.swagger.client.model.CatalogItemBulkDeleteJobEnum;
import io.swagger.client.model.CouponCodeCreateJobResponseObjectResourceAttributes;
import io.swagger.client.model.ObjectLinks;
import io.swagger.client.model.PostCatalogItemDeleteJobResponseDataRelationships;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PostCatalogItemDeleteJobResponseData
 */



public class PostCatalogItemDeleteJobResponseData {
  @SerializedName("type")
  private CatalogItemBulkDeleteJobEnum type = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("attributes")
  private CouponCodeCreateJobResponseObjectResourceAttributes attributes = null;

  @SerializedName("relationships")
  private PostCatalogItemDeleteJobResponseDataRelationships relationships = null;

  @SerializedName("links")
  private ObjectLinks links = null;

  public PostCatalogItemDeleteJobResponseData type(CatalogItemBulkDeleteJobEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public CatalogItemBulkDeleteJobEnum getType() {
    return type;
  }

  public void setType(CatalogItemBulkDeleteJobEnum type) {
    this.type = type;
  }

  public PostCatalogItemDeleteJobResponseData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for retrieving the job. Generated by Klaviyo.
   * @return id
  **/
  @Schema(required = true, description = "Unique identifier for retrieving the job. Generated by Klaviyo.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PostCatalogItemDeleteJobResponseData attributes(CouponCodeCreateJobResponseObjectResourceAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(required = true, description = "")
  public CouponCodeCreateJobResponseObjectResourceAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CouponCodeCreateJobResponseObjectResourceAttributes attributes) {
    this.attributes = attributes;
  }

  public PostCatalogItemDeleteJobResponseData relationships(PostCatalogItemDeleteJobResponseDataRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @Schema(description = "")
  public PostCatalogItemDeleteJobResponseDataRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(PostCatalogItemDeleteJobResponseDataRelationships relationships) {
    this.relationships = relationships;
  }

  public PostCatalogItemDeleteJobResponseData links(ObjectLinks links) {
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
    PostCatalogItemDeleteJobResponseData postCatalogItemDeleteJobResponseData = (PostCatalogItemDeleteJobResponseData) o;
    return Objects.equals(this.type, postCatalogItemDeleteJobResponseData.type) &&
        Objects.equals(this.id, postCatalogItemDeleteJobResponseData.id) &&
        Objects.equals(this.attributes, postCatalogItemDeleteJobResponseData.attributes) &&
        Objects.equals(this.relationships, postCatalogItemDeleteJobResponseData.relationships) &&
        Objects.equals(this.links, postCatalogItemDeleteJobResponseData.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, attributes, relationships, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCatalogItemDeleteJobResponseData {\n");
    
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
