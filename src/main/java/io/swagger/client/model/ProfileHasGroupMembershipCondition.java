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
import io.swagger.client.model.ProfileGroupMembershipEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ProfileHasGroupMembershipCondition
 */



public class ProfileHasGroupMembershipCondition implements OneOfConditionGroupConditionsItems {
  @SerializedName("type")
  private ProfileGroupMembershipEnum type = null;

  @SerializedName("is_member")
  private Boolean isMember = null;

  @SerializedName("group_ids")
  private List<String> groupIds = new ArrayList<String>();

  @SerializedName("timeframe_filter")
  private OneOfProfileHasGroupMembershipConditionTimeframeFilter timeframeFilter = null;

  public ProfileHasGroupMembershipCondition type(ProfileGroupMembershipEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public ProfileGroupMembershipEnum getType() {
    return type;
  }

  public void setType(ProfileGroupMembershipEnum type) {
    this.type = type;
  }

  public ProfileHasGroupMembershipCondition isMember(Boolean isMember) {
    this.isMember = isMember;
    return this;
  }

   /**
   * Get isMember
   * @return isMember
  **/
  @Schema(required = true, description = "")
  public Boolean getIsMember() {
    return isMember;
  }

  public void setIsMember(Boolean isMember) {
    this.isMember = isMember;
  }

  public ProfileHasGroupMembershipCondition groupIds(List<String> groupIds) {
    this.groupIds = groupIds;
    return this;
  }

  public ProfileHasGroupMembershipCondition addGroupIdsItem(String groupIdsItem) {
    this.groupIds.add(groupIdsItem);
    return this;
  }

   /**
   * Get groupIds
   * @return groupIds
  **/
  @Schema(required = true, description = "")
  public List<String> getGroupIds() {
    return groupIds;
  }

  public void setGroupIds(List<String> groupIds) {
    this.groupIds = groupIds;
  }

  public ProfileHasGroupMembershipCondition timeframeFilter(OneOfProfileHasGroupMembershipConditionTimeframeFilter timeframeFilter) {
    this.timeframeFilter = timeframeFilter;
    return this;
  }

   /**
   * Get timeframeFilter
   * @return timeframeFilter
  **/
  @Schema(description = "")
  public OneOfProfileHasGroupMembershipConditionTimeframeFilter getTimeframeFilter() {
    return timeframeFilter;
  }

  public void setTimeframeFilter(OneOfProfileHasGroupMembershipConditionTimeframeFilter timeframeFilter) {
    this.timeframeFilter = timeframeFilter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileHasGroupMembershipCondition profileHasGroupMembershipCondition = (ProfileHasGroupMembershipCondition) o;
    return Objects.equals(this.type, profileHasGroupMembershipCondition.type) &&
        Objects.equals(this.isMember, profileHasGroupMembershipCondition.isMember) &&
        Objects.equals(this.groupIds, profileHasGroupMembershipCondition.groupIds) &&
        Objects.equals(this.timeframeFilter, profileHasGroupMembershipCondition.timeframeFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, isMember, groupIds, timeframeFilter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileHasGroupMembershipCondition {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isMember: ").append(toIndentedString(isMember)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
    sb.append("    timeframeFilter: ").append(toIndentedString(timeframeFilter)).append("\n");
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
