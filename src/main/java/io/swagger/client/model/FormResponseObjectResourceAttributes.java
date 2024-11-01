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
import org.threeten.bp.OffsetDateTime;
/**
 * FormResponseObjectResourceAttributes
 */



public class FormResponseObjectResourceAttributes {
  @SerializedName("name")
  private String name = null;

  /**
   * Status of the form. A live form with an in-progress draft is considered \&quot;live\&quot;.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    @SerializedName("draft")
    DRAFT("draft"),
    @SerializedName("live")
    LIVE("live");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("ab_test")
  private Boolean abTest = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public FormResponseObjectResourceAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the form.
   * @return name
  **/
  @Schema(example = "Cyber Monday Deals", required = true, description = "Name of the form.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FormResponseObjectResourceAttributes status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the form. A live form with an in-progress draft is considered \&quot;live\&quot;.
   * @return status
  **/
  @Schema(required = true, description = "Status of the form. A live form with an in-progress draft is considered \"live\".")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public FormResponseObjectResourceAttributes abTest(Boolean abTest) {
    this.abTest = abTest;
    return this;
  }

   /**
   * Whether the form has an A/B test configured, regardless of its status.
   * @return abTest
  **/
  @Schema(required = true, description = "Whether the form has an A/B test configured, regardless of its status.")
  public Boolean isAbTest() {
    return abTest;
  }

  public void setAbTest(Boolean abTest) {
    this.abTest = abTest;
  }

  public FormResponseObjectResourceAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO8601 timestamp when the form was created.
   * @return createdAt
  **/
  @Schema(example = "2024-03-04T00:00Z", required = true, description = "ISO8601 timestamp when the form was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public FormResponseObjectResourceAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO8601 timestamp when the form was last updated.
   * @return updatedAt
  **/
  @Schema(example = "2024-03-04T00:00Z", required = true, description = "ISO8601 timestamp when the form was last updated.")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormResponseObjectResourceAttributes formResponseObjectResourceAttributes = (FormResponseObjectResourceAttributes) o;
    return Objects.equals(this.name, formResponseObjectResourceAttributes.name) &&
        Objects.equals(this.status, formResponseObjectResourceAttributes.status) &&
        Objects.equals(this.abTest, formResponseObjectResourceAttributes.abTest) &&
        Objects.equals(this.createdAt, formResponseObjectResourceAttributes.createdAt) &&
        Objects.equals(this.updatedAt, formResponseObjectResourceAttributes.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, abTest, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormResponseObjectResourceAttributes {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    abTest: ").append(toIndentedString(abTest)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
