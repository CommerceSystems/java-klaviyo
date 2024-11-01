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
import io.swagger.client.model.ListMemberResponseObjectResourceAttributes;
import io.swagger.client.model.ObjectLinks;
import io.swagger.client.model.ProfileEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ListMemberResponseObjectResource
 */



public class ListMemberResponseObjectResource {
  @SerializedName("type")
  private ProfileEnum type = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("attributes")
  private ListMemberResponseObjectResourceAttributes attributes = null;

  @SerializedName("links")
  private ObjectLinks links = null;

  public ListMemberResponseObjectResource type(ProfileEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public ProfileEnum getType() {
    return type;
  }

  public void setType(ProfileEnum type) {
    this.type = type;
  }

  public ListMemberResponseObjectResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Primary key that uniquely identifies this profile. Generated by Klaviyo.
   * @return id
  **/
  @Schema(example = "01GDDKASAP8TKDDA2GRZDSVP4H", description = "Primary key that uniquely identifies this profile. Generated by Klaviyo.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ListMemberResponseObjectResource attributes(ListMemberResponseObjectResourceAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(required = true, description = "")
  public ListMemberResponseObjectResourceAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ListMemberResponseObjectResourceAttributes attributes) {
    this.attributes = attributes;
  }

  public ListMemberResponseObjectResource links(ObjectLinks links) {
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
    ListMemberResponseObjectResource listMemberResponseObjectResource = (ListMemberResponseObjectResource) o;
    return Objects.equals(this.type, listMemberResponseObjectResource.type) &&
        Objects.equals(this.id, listMemberResponseObjectResource.id) &&
        Objects.equals(this.attributes, listMemberResponseObjectResource.attributes) &&
        Objects.equals(this.links, listMemberResponseObjectResource.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, attributes, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListMemberResponseObjectResource {\n");
    
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
