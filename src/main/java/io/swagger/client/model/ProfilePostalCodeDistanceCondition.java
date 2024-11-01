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
import io.swagger.client.model.ProfilePostalCodeDistanceEnum;
import io.swagger.client.model.UnionPositiveNumericFilter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ProfilePostalCodeDistanceCondition
 */



public class ProfilePostalCodeDistanceCondition implements OneOfConditionGroupConditionsItems {
  @SerializedName("type")
  private ProfilePostalCodeDistanceEnum type = null;

  @SerializedName("country_code")
  private String countryCode = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  /**
   * Units for profile postal code distance conditions.
   */
  @JsonAdapter(UnitEnum.Adapter.class)
  public enum UnitEnum {
    @SerializedName("kilometers")
    KILOMETERS("kilometers"),
    @SerializedName("miles")
    MILES("miles");

    private String value;

    UnitEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static UnitEnum fromValue(String input) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<UnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnitEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public UnitEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return UnitEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("unit")
  private UnitEnum unit = null;

  @SerializedName("filter")
  private UnionPositiveNumericFilter filter = null;

  public ProfilePostalCodeDistanceCondition type(ProfilePostalCodeDistanceEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(required = true, description = "")
  public ProfilePostalCodeDistanceEnum getType() {
    return type;
  }

  public void setType(ProfilePostalCodeDistanceEnum type) {
    this.type = type;
  }

  public ProfilePostalCodeDistanceCondition countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @Schema(required = true, description = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public ProfilePostalCodeDistanceCondition postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  @Schema(required = true, description = "")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public ProfilePostalCodeDistanceCondition unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Units for profile postal code distance conditions.
   * @return unit
  **/
  @Schema(required = true, description = "Units for profile postal code distance conditions.")
  public UnitEnum getUnit() {
    return unit;
  }

  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }

  public ProfilePostalCodeDistanceCondition filter(UnionPositiveNumericFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @Schema(required = true, description = "")
  public UnionPositiveNumericFilter getFilter() {
    return filter;
  }

  public void setFilter(UnionPositiveNumericFilter filter) {
    this.filter = filter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfilePostalCodeDistanceCondition profilePostalCodeDistanceCondition = (ProfilePostalCodeDistanceCondition) o;
    return Objects.equals(this.type, profilePostalCodeDistanceCondition.type) &&
        Objects.equals(this.countryCode, profilePostalCodeDistanceCondition.countryCode) &&
        Objects.equals(this.postalCode, profilePostalCodeDistanceCondition.postalCode) &&
        Objects.equals(this.unit, profilePostalCodeDistanceCondition.unit) &&
        Objects.equals(this.filter, profilePostalCodeDistanceCondition.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, countryCode, postalCode, unit, filter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfilePostalCodeDistanceCondition {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
