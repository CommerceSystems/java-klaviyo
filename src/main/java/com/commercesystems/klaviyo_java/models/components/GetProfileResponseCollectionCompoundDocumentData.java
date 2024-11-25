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
import org.openapitools.jackson.nullable.JsonNullable;


public class GetProfileResponseCollectionCompoundDocumentData {

    @JsonProperty("type")
    private ProfileEnum type;

    /**
     * Primary key that uniquely identifies this profile. Generated by Klaviyo.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private JsonNullable<String> id;

    @JsonProperty("attributes")
    private GetProfileResponseCollectionCompoundDocumentAttributes attributes;

    @JsonProperty("links")
    private ObjectLinks links;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relationships")
    private Optional<? extends GetProfileResponseCollectionCompoundDocumentRelationships> relationships;

    @JsonCreator
    public GetProfileResponseCollectionCompoundDocumentData(
            @JsonProperty("type") ProfileEnum type,
            @JsonProperty("id") JsonNullable<String> id,
            @JsonProperty("attributes") GetProfileResponseCollectionCompoundDocumentAttributes attributes,
            @JsonProperty("links") ObjectLinks links,
            @JsonProperty("relationships") Optional<? extends GetProfileResponseCollectionCompoundDocumentRelationships> relationships) {
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
    
    public GetProfileResponseCollectionCompoundDocumentData(
            ProfileEnum type,
            GetProfileResponseCollectionCompoundDocumentAttributes attributes,
            ObjectLinks links) {
        this(type, JsonNullable.undefined(), attributes, links, Optional.empty());
    }

    @JsonIgnore
    public ProfileEnum type() {
        return type;
    }

    /**
     * Primary key that uniquely identifies this profile. Generated by Klaviyo.
     */
    @JsonIgnore
    public JsonNullable<String> id() {
        return id;
    }

    @JsonIgnore
    public GetProfileResponseCollectionCompoundDocumentAttributes attributes() {
        return attributes;
    }

    @JsonIgnore
    public ObjectLinks links() {
        return links;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetProfileResponseCollectionCompoundDocumentRelationships> relationships() {
        return (Optional<GetProfileResponseCollectionCompoundDocumentRelationships>) relationships;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetProfileResponseCollectionCompoundDocumentData withType(ProfileEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Primary key that uniquely identifies this profile. Generated by Klaviyo.
     */
    public GetProfileResponseCollectionCompoundDocumentData withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = JsonNullable.of(id);
        return this;
    }

    /**
     * Primary key that uniquely identifies this profile. Generated by Klaviyo.
     */
    public GetProfileResponseCollectionCompoundDocumentData withId(JsonNullable<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetProfileResponseCollectionCompoundDocumentData withAttributes(GetProfileResponseCollectionCompoundDocumentAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public GetProfileResponseCollectionCompoundDocumentData withLinks(ObjectLinks links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
        return this;
    }

    public GetProfileResponseCollectionCompoundDocumentData withRelationships(GetProfileResponseCollectionCompoundDocumentRelationships relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = Optional.ofNullable(relationships);
        return this;
    }

    public GetProfileResponseCollectionCompoundDocumentData withRelationships(Optional<? extends GetProfileResponseCollectionCompoundDocumentRelationships> relationships) {
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
        GetProfileResponseCollectionCompoundDocumentData other = (GetProfileResponseCollectionCompoundDocumentData) o;
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
        return Utils.toString(GetProfileResponseCollectionCompoundDocumentData.class,
                "type", type,
                "id", id,
                "attributes", attributes,
                "links", links,
                "relationships", relationships);
    }
    
    public final static class Builder {
 
        private ProfileEnum type;
 
        private JsonNullable<String> id = JsonNullable.undefined();
 
        private GetProfileResponseCollectionCompoundDocumentAttributes attributes;
 
        private ObjectLinks links;
 
        private Optional<? extends GetProfileResponseCollectionCompoundDocumentRelationships> relationships = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(ProfileEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Primary key that uniquely identifies this profile. Generated by Klaviyo.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = JsonNullable.of(id);
            return this;
        }

        /**
         * Primary key that uniquely identifies this profile. Generated by Klaviyo.
         */
        public Builder id(JsonNullable<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder attributes(GetProfileResponseCollectionCompoundDocumentAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder links(ObjectLinks links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }

        public Builder relationships(GetProfileResponseCollectionCompoundDocumentRelationships relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Builder relationships(Optional<? extends GetProfileResponseCollectionCompoundDocumentRelationships> relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = relationships;
            return this;
        }
        
        public GetProfileResponseCollectionCompoundDocumentData build() {
            return new GetProfileResponseCollectionCompoundDocumentData(
                type,
                id,
                attributes,
                links,
                relationships);
        }
    }
}
