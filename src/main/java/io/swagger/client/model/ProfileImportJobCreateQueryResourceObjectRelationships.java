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
import io.swagger.client.model.ProfileImportJobCreateQueryResourceObjectRelationshipsLists;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ProfileImportJobCreateQueryResourceObjectRelationships
 */



public class ProfileImportJobCreateQueryResourceObjectRelationships {
  @SerializedName("lists")
  private ProfileImportJobCreateQueryResourceObjectRelationshipsLists lists = null;

  public ProfileImportJobCreateQueryResourceObjectRelationships lists(ProfileImportJobCreateQueryResourceObjectRelationshipsLists lists) {
    this.lists = lists;
    return this;
  }

   /**
   * Get lists
   * @return lists
  **/
  @Schema(description = "")
  public ProfileImportJobCreateQueryResourceObjectRelationshipsLists getLists() {
    return lists;
  }

  public void setLists(ProfileImportJobCreateQueryResourceObjectRelationshipsLists lists) {
    this.lists = lists;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileImportJobCreateQueryResourceObjectRelationships profileImportJobCreateQueryResourceObjectRelationships = (ProfileImportJobCreateQueryResourceObjectRelationships) o;
    return Objects.equals(this.lists, profileImportJobCreateQueryResourceObjectRelationships.lists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lists);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileImportJobCreateQueryResourceObjectRelationships {\n");
    
    sb.append("    lists: ").append(toIndentedString(lists)).append("\n");
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
