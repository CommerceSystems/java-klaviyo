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
import io.swagger.client.model.TagGroupEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * TagCreateQueryResourceObjectRelationshipsTaggroupData
 */



public class TagCreateQueryResourceObjectRelationshipsTaggroupData {
  @SerializedName("type")
  private TagGroupEnum type = null;

  @SerializedName("id")
  private String id = null;

  public TagCreateQueryResourceObjectRelationshipsTaggroupData type(TagGroupEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public TagGroupEnum getType() {
    return type;
  }

  public void setType(TagGroupEnum type) {
    this.type = type;
  }

  public TagCreateQueryResourceObjectRelationshipsTaggroupData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the Tag Group to associate the Tag with. If this field is not specified, the Tag will be associated with the company&#x27;s Default Tag Group.
   * @return id
  **/
  @Schema(example = "zyxw9876-vu54-ts32-rq10-zyxwvu654321", required = true, description = "The ID of the Tag Group to associate the Tag with. If this field is not specified, the Tag will be associated with the company's Default Tag Group.")
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
    TagCreateQueryResourceObjectRelationshipsTaggroupData tagCreateQueryResourceObjectRelationshipsTaggroupData = (TagCreateQueryResourceObjectRelationshipsTaggroupData) o;
    return Objects.equals(this.type, tagCreateQueryResourceObjectRelationshipsTaggroupData.type) &&
        Objects.equals(this.id, tagCreateQueryResourceObjectRelationshipsTaggroupData.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagCreateQueryResourceObjectRelationshipsTaggroupData {\n");
    
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
