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
import io.swagger.client.model.OnsiteSubscriptionCreateQueryResourceObjectRelationshipsList;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * OnsiteSubscriptionCreateQueryResourceObjectRelationships
 */



public class OnsiteSubscriptionCreateQueryResourceObjectRelationships {
  @SerializedName("list")
  private OnsiteSubscriptionCreateQueryResourceObjectRelationshipsList list = null;

  public OnsiteSubscriptionCreateQueryResourceObjectRelationships list(OnsiteSubscriptionCreateQueryResourceObjectRelationshipsList list) {
    this.list = list;
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @Schema(description = "")
  public OnsiteSubscriptionCreateQueryResourceObjectRelationshipsList getList() {
    return list;
  }

  public void setList(OnsiteSubscriptionCreateQueryResourceObjectRelationshipsList list) {
    this.list = list;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnsiteSubscriptionCreateQueryResourceObjectRelationships onsiteSubscriptionCreateQueryResourceObjectRelationships = (OnsiteSubscriptionCreateQueryResourceObjectRelationships) o;
    return Objects.equals(this.list, onsiteSubscriptionCreateQueryResourceObjectRelationships.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnsiteSubscriptionCreateQueryResourceObjectRelationships {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
