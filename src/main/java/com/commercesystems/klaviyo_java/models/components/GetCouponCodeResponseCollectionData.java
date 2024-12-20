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
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class GetCouponCodeResponseCollectionData {

    @JsonProperty("type")
    private CouponCodeEnum type;

    /**
     * The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with.
     */
    @JsonProperty("id")
    private String id;

    @JsonProperty("attributes")
    private GetCouponCodeResponseCollectionAttributes attributes;

    @JsonProperty("links")
    private ObjectLinks links;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relationships")
    private Optional<? extends GetCouponCodeResponseCollectionRelationships> relationships;

    @JsonCreator
    public GetCouponCodeResponseCollectionData(
            @JsonProperty("type") CouponCodeEnum type,
            @JsonProperty("id") String id,
            @JsonProperty("attributes") GetCouponCodeResponseCollectionAttributes attributes,
            @JsonProperty("links") ObjectLinks links,
            @JsonProperty("relationships") Optional<? extends GetCouponCodeResponseCollectionRelationships> relationships) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(attributes, "attributes");
        Utils.checkNotNull(links, "links");
        Utils.checkNotNull(relationships, "relationships");
        this.type = type;
        this.id = id;
        this.attributes = attributes;
        this.links = links;
        this.relationships = relationships;
    }
    
    public GetCouponCodeResponseCollectionData(
            CouponCodeEnum type,
            String id,
            GetCouponCodeResponseCollectionAttributes attributes,
            ObjectLinks links) {
        this(type, id, attributes, links, Optional.empty());
    }

    @JsonIgnore
    public CouponCodeEnum type() {
        return type;
    }

    /**
     * The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with.
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public GetCouponCodeResponseCollectionAttributes attributes() {
        return attributes;
    }

    @JsonIgnore
    public ObjectLinks links() {
        return links;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetCouponCodeResponseCollectionRelationships> relationships() {
        return (Optional<GetCouponCodeResponseCollectionRelationships>) relationships;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetCouponCodeResponseCollectionData withType(CouponCodeEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with.
     */
    public GetCouponCodeResponseCollectionData withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetCouponCodeResponseCollectionData withAttributes(GetCouponCodeResponseCollectionAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public GetCouponCodeResponseCollectionData withLinks(ObjectLinks links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
        return this;
    }

    public GetCouponCodeResponseCollectionData withRelationships(GetCouponCodeResponseCollectionRelationships relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = Optional.ofNullable(relationships);
        return this;
    }

    public GetCouponCodeResponseCollectionData withRelationships(Optional<? extends GetCouponCodeResponseCollectionRelationships> relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = relationships;
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
        GetCouponCodeResponseCollectionData other = (GetCouponCodeResponseCollectionData) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.attributes, other.attributes) &&
            Objects.deepEquals(this.links, other.links) &&
            Objects.deepEquals(this.relationships, other.relationships);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            id,
            attributes,
            links,
            relationships);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCouponCodeResponseCollectionData.class,
                "type", type,
                "id", id,
                "attributes", attributes,
                "links", links,
                "relationships", relationships);
    }
    
    public final static class Builder {
 
        private CouponCodeEnum type;
 
        private String id;
 
        private GetCouponCodeResponseCollectionAttributes attributes;
 
        private ObjectLinks links;
 
        private Optional<? extends GetCouponCodeResponseCollectionRelationships> relationships = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(CouponCodeEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder attributes(GetCouponCodeResponseCollectionAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder links(ObjectLinks links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }

        public Builder relationships(GetCouponCodeResponseCollectionRelationships relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Builder relationships(Optional<? extends GetCouponCodeResponseCollectionRelationships> relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = relationships;
            return this;
        }
        
        public GetCouponCodeResponseCollectionData build() {
            return new GetCouponCodeResponseCollectionData(
                type,
                id,
                attributes,
                links,
                relationships);
        }
    }
}

