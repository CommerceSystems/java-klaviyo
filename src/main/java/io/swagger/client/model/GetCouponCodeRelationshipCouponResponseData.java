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
import io.swagger.client.model.CouponEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * GetCouponCodeRelationshipCouponResponseData
 */



public class GetCouponCodeRelationshipCouponResponseData {
  @SerializedName("type")
  private CouponEnum type = null;

  @SerializedName("id")
  private String id = null;

  public GetCouponCodeRelationshipCouponResponseData type(CouponEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public CouponEnum getType() {
    return type;
  }

  public void setType(CouponEnum type) {
    this.type = type;
  }

  public GetCouponCodeRelationshipCouponResponseData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The parent coupon ID for the given coupon code.
   * @return id
  **/
  @Schema(example = "10OFF-ASD325FHK324UJDOI2M3JNES99", required = true, description = "The parent coupon ID for the given coupon code.")
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
    GetCouponCodeRelationshipCouponResponseData getCouponCodeRelationshipCouponResponseData = (GetCouponCodeRelationshipCouponResponseData) o;
    return Objects.equals(this.type, getCouponCodeRelationshipCouponResponseData.type) &&
        Objects.equals(this.id, getCouponCodeRelationshipCouponResponseData.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCouponCodeRelationshipCouponResponseData {\n");
    
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
