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
import io.swagger.client.model.PostListCreateResponseDataRelationshipsFlowtriggers;
import io.swagger.client.model.PostListCreateResponseDataRelationshipsProfiles;
import io.swagger.client.model.PostListCreateResponseDataRelationshipsTags;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PostListCreateResponseDataRelationships
 */



public class PostListCreateResponseDataRelationships {
  @SerializedName("profiles")
  private PostListCreateResponseDataRelationshipsProfiles profiles = null;

  @SerializedName("tags")
  private PostListCreateResponseDataRelationshipsTags tags = null;

  @SerializedName("flow-triggers")
  private PostListCreateResponseDataRelationshipsFlowtriggers flowTriggers = null;

  public PostListCreateResponseDataRelationships profiles(PostListCreateResponseDataRelationshipsProfiles profiles) {
    this.profiles = profiles;
    return this;
  }

   /**
   * Get profiles
   * @return profiles
  **/
  @Schema(description = "")
  public PostListCreateResponseDataRelationshipsProfiles getProfiles() {
    return profiles;
  }

  public void setProfiles(PostListCreateResponseDataRelationshipsProfiles profiles) {
    this.profiles = profiles;
  }

  public PostListCreateResponseDataRelationships tags(PostListCreateResponseDataRelationshipsTags tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public PostListCreateResponseDataRelationshipsTags getTags() {
    return tags;
  }

  public void setTags(PostListCreateResponseDataRelationshipsTags tags) {
    this.tags = tags;
  }

  public PostListCreateResponseDataRelationships flowTriggers(PostListCreateResponseDataRelationshipsFlowtriggers flowTriggers) {
    this.flowTriggers = flowTriggers;
    return this;
  }

   /**
   * Get flowTriggers
   * @return flowTriggers
  **/
  @Schema(description = "")
  public PostListCreateResponseDataRelationshipsFlowtriggers getFlowTriggers() {
    return flowTriggers;
  }

  public void setFlowTriggers(PostListCreateResponseDataRelationshipsFlowtriggers flowTriggers) {
    this.flowTriggers = flowTriggers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostListCreateResponseDataRelationships postListCreateResponseDataRelationships = (PostListCreateResponseDataRelationships) o;
    return Objects.equals(this.profiles, postListCreateResponseDataRelationships.profiles) &&
        Objects.equals(this.tags, postListCreateResponseDataRelationships.tags) &&
        Objects.equals(this.flowTriggers, postListCreateResponseDataRelationships.flowTriggers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profiles, tags, flowTriggers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostListCreateResponseDataRelationships {\n");
    
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    flowTriggers: ").append(toIndentedString(flowTriggers)).append("\n");
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
