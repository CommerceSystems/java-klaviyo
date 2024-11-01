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
import io.swagger.client.model.CollectionLinks;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * GetListResponseCollection
 */



public class GetListResponseCollection {
  @SerializedName("data")
  private List<AllOfGetListResponseCollectionDataItems> data = new ArrayList<AllOfGetListResponseCollectionDataItems>();

  @SerializedName("links")
  private CollectionLinks links = null;

  public GetListResponseCollection data(List<AllOfGetListResponseCollectionDataItems> data) {
    this.data = data;
    return this;
  }

  public GetListResponseCollection addDataItem(AllOfGetListResponseCollectionDataItems dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(required = true, description = "")
  public List<AllOfGetListResponseCollectionDataItems> getData() {
    return data;
  }

  public void setData(List<AllOfGetListResponseCollectionDataItems> data) {
    this.data = data;
  }

  public GetListResponseCollection links(CollectionLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @Schema(description = "")
  public CollectionLinks getLinks() {
    return links;
  }

  public void setLinks(CollectionLinks links) {
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
    GetListResponseCollection getListResponseCollection = (GetListResponseCollection) o;
    return Objects.equals(this.data, getListResponseCollection.data) &&
        Objects.equals(this.links, getListResponseCollection.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetListResponseCollection {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
