/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class PatchCouponResponseAttributes {

    /**
     * This is the id that is stored in an integration such as Shopify or Magento.
     */
    @JsonProperty("external_id")
    private String externalId;

    /**
     * A description of the coupon.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private JsonNullable<String> description;

    @JsonCreator
    public PatchCouponResponseAttributes(
            @JsonProperty("external_id") String externalId,
            @JsonProperty("description") JsonNullable<String> description) {
        Utils.checkNotNull(externalId, "externalId");
        Utils.checkNotNull(description, "description");
        this.externalId = externalId;
        this.description = description;
    }
    
    public PatchCouponResponseAttributes(
            String externalId) {
        this(externalId, JsonNullable.undefined());
    }

    /**
     * This is the id that is stored in an integration such as Shopify or Magento.
     */
    @JsonIgnore
    public String externalId() {
        return externalId;
    }

    /**
     * A description of the coupon.
     */
    @JsonIgnore
    public JsonNullable<String> description() {
        return description;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * This is the id that is stored in an integration such as Shopify or Magento.
     */
    public PatchCouponResponseAttributes withExternalId(String externalId) {
        Utils.checkNotNull(externalId, "externalId");
        this.externalId = externalId;
        return this;
    }

    /**
     * A description of the coupon.
     */
    public PatchCouponResponseAttributes withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * A description of the coupon.
     */
    public PatchCouponResponseAttributes withDescription(JsonNullable<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PatchCouponResponseAttributes other = (PatchCouponResponseAttributes) o;
        return 
            Objects.deepEquals(this.externalId, other.externalId) &&
            Objects.deepEquals(this.description, other.description);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            externalId,
            description);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchCouponResponseAttributes.class,
                "externalId", externalId,
                "description", description);
    }
    
    public final static class Builder {
 
        private String externalId;
 
        private JsonNullable<String> description = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * This is the id that is stored in an integration such as Shopify or Magento.
         */
        public Builder externalId(String externalId) {
            Utils.checkNotNull(externalId, "externalId");
            this.externalId = externalId;
            return this;
        }

        /**
         * A description of the coupon.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = JsonNullable.of(description);
            return this;
        }

        /**
         * A description of the coupon.
         */
        public Builder description(JsonNullable<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }
        
        public PatchCouponResponseAttributes build() {
            return new PatchCouponResponseAttributes(
                externalId,
                description);
        }
    }
}
