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
import io.swagger.client.model.ConditionGroup;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SegmentDefinition
 */



public class SegmentDefinition {
  @SerializedName("condition_groups")
  private List<ConditionGroup> conditionGroups = new ArrayList<ConditionGroup>();

  public SegmentDefinition conditionGroups(List<ConditionGroup> conditionGroups) {
    this.conditionGroups = conditionGroups;
    return this;
  }

  public SegmentDefinition addConditionGroupsItem(ConditionGroup conditionGroupsItem) {
    this.conditionGroups.add(conditionGroupsItem);
    return this;
  }

   /**
   * Get conditionGroups
   * @return conditionGroups
  **/
  @Schema(required = true, description = "")
  public List<ConditionGroup> getConditionGroups() {
    return conditionGroups;
  }

  public void setConditionGroups(List<ConditionGroup> conditionGroups) {
    this.conditionGroups = conditionGroups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentDefinition segmentDefinition = (SegmentDefinition) o;
    return Objects.equals(this.conditionGroups, segmentDefinition.conditionGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentDefinition {\n");
    
    sb.append("    conditionGroups: ").append(toIndentedString(conditionGroups)).append("\n");
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
