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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * CatalogCategoryCreateQueryResourceObjectAttributes
 */



public class CatalogCategoryCreateQueryResourceObjectAttributes {
  @SerializedName("external_id")
  private String externalId = null;

  @SerializedName("name")
  private String name = null;

  /**
   * The integration type. Currently only \&quot;$custom\&quot; is supported.
   */
  @JsonAdapter(IntegrationTypeEnum.Adapter.class)
  public enum IntegrationTypeEnum {
    @SerializedName("$custom")
    _CUSTOM("$custom");

    private String value;

    IntegrationTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static IntegrationTypeEnum fromValue(String input) {
      for (IntegrationTypeEnum b : IntegrationTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<IntegrationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IntegrationTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public IntegrationTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return IntegrationTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("integration_type")
  private IntegrationTypeEnum integrationType = IntegrationTypeEnum._CUSTOM;

  @SerializedName("catalog_type")
  private String catalogType = "$default";

  public CatalogCategoryCreateQueryResourceObjectAttributes externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * The ID of the catalog category in an external system.
   * @return externalId
  **/
  @Schema(example = "SAMPLE-DATA-CATEGORY-APPAREL", required = true, description = "The ID of the catalog category in an external system.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public CatalogCategoryCreateQueryResourceObjectAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the catalog category.
   * @return name
  **/
  @Schema(example = "Sample Data Category Apparel", required = true, description = "The name of the catalog category.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogCategoryCreateQueryResourceObjectAttributes integrationType(IntegrationTypeEnum integrationType) {
    this.integrationType = integrationType;
    return this;
  }

   /**
   * The integration type. Currently only \&quot;$custom\&quot; is supported.
   * @return integrationType
  **/
  @Schema(example = "$custom", description = "The integration type. Currently only \"$custom\" is supported.")
  public IntegrationTypeEnum getIntegrationType() {
    return integrationType;
  }

  public void setIntegrationType(IntegrationTypeEnum integrationType) {
    this.integrationType = integrationType;
  }

  public CatalogCategoryCreateQueryResourceObjectAttributes catalogType(String catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * The type of catalog. Currently only \&quot;$default\&quot; is supported.
   * @return catalogType
  **/
  @Schema(example = "$default", description = "The type of catalog. Currently only \"$default\" is supported.")
  public String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogCategoryCreateQueryResourceObjectAttributes catalogCategoryCreateQueryResourceObjectAttributes = (CatalogCategoryCreateQueryResourceObjectAttributes) o;
    return Objects.equals(this.externalId, catalogCategoryCreateQueryResourceObjectAttributes.externalId) &&
        Objects.equals(this.name, catalogCategoryCreateQueryResourceObjectAttributes.name) &&
        Objects.equals(this.integrationType, catalogCategoryCreateQueryResourceObjectAttributes.integrationType) &&
        Objects.equals(this.catalogType, catalogCategoryCreateQueryResourceObjectAttributes.catalogType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, name, integrationType, catalogType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogCategoryCreateQueryResourceObjectAttributes {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
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
