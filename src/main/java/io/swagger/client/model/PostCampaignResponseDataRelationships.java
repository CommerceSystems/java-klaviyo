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
import io.swagger.client.model.PostCampaignResponseDataRelationshipsCampaignmessages;
import io.swagger.client.model.PostListCreateResponseDataRelationshipsTags;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PostCampaignResponseDataRelationships
 */



public class PostCampaignResponseDataRelationships {
  @SerializedName("campaign-messages")
  private PostCampaignResponseDataRelationshipsCampaignmessages campaignMessages = null;

  @SerializedName("tags")
  private PostListCreateResponseDataRelationshipsTags tags = null;

  public PostCampaignResponseDataRelationships campaignMessages(PostCampaignResponseDataRelationshipsCampaignmessages campaignMessages) {
    this.campaignMessages = campaignMessages;
    return this;
  }

   /**
   * Get campaignMessages
   * @return campaignMessages
  **/
  @Schema(description = "")
  public PostCampaignResponseDataRelationshipsCampaignmessages getCampaignMessages() {
    return campaignMessages;
  }

  public void setCampaignMessages(PostCampaignResponseDataRelationshipsCampaignmessages campaignMessages) {
    this.campaignMessages = campaignMessages;
  }

  public PostCampaignResponseDataRelationships tags(PostListCreateResponseDataRelationshipsTags tags) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCampaignResponseDataRelationships postCampaignResponseDataRelationships = (PostCampaignResponseDataRelationships) o;
    return Objects.equals(this.campaignMessages, postCampaignResponseDataRelationships.campaignMessages) &&
        Objects.equals(this.tags, postCampaignResponseDataRelationships.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignMessages, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCampaignResponseDataRelationships {\n");
    
    sb.append("    campaignMessages: ").append(toIndentedString(campaignMessages)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
