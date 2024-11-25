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


public class GetBulkProfileSuppressionsRemoveJobResponseData {

    @JsonProperty("type")
    private ProfileSuppressionBulkDeleteJobEnum type;

    /**
     * Unique identifier for retrieving the job. Generated by Klaviyo.
     */
    @JsonProperty("id")
    private String id;

    @JsonProperty("attributes")
    private GetBulkProfileSuppressionsRemoveJobResponseAttributes attributes;

    @JsonProperty("links")
    private ObjectLinks links;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relationships")
    private Optional<? extends GetBulkProfileSuppressionsRemoveJobResponseRelationships> relationships;

    @JsonCreator
    public GetBulkProfileSuppressionsRemoveJobResponseData(
            @JsonProperty("type") ProfileSuppressionBulkDeleteJobEnum type,
            @JsonProperty("id") String id,
            @JsonProperty("attributes") GetBulkProfileSuppressionsRemoveJobResponseAttributes attributes,
            @JsonProperty("links") ObjectLinks links,
            @JsonProperty("relationships") Optional<? extends GetBulkProfileSuppressionsRemoveJobResponseRelationships> relationships) {
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
    
    public GetBulkProfileSuppressionsRemoveJobResponseData(
            ProfileSuppressionBulkDeleteJobEnum type,
            String id,
            GetBulkProfileSuppressionsRemoveJobResponseAttributes attributes,
            ObjectLinks links) {
        this(type, id, attributes, links, Optional.empty());
    }

    @JsonIgnore
    public ProfileSuppressionBulkDeleteJobEnum type() {
        return type;
    }

    /**
     * Unique identifier for retrieving the job. Generated by Klaviyo.
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public GetBulkProfileSuppressionsRemoveJobResponseAttributes attributes() {
        return attributes;
    }

    @JsonIgnore
    public ObjectLinks links() {
        return links;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetBulkProfileSuppressionsRemoveJobResponseRelationships> relationships() {
        return (Optional<GetBulkProfileSuppressionsRemoveJobResponseRelationships>) relationships;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetBulkProfileSuppressionsRemoveJobResponseData withType(ProfileSuppressionBulkDeleteJobEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * Unique identifier for retrieving the job. Generated by Klaviyo.
     */
    public GetBulkProfileSuppressionsRemoveJobResponseData withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetBulkProfileSuppressionsRemoveJobResponseData withAttributes(GetBulkProfileSuppressionsRemoveJobResponseAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public GetBulkProfileSuppressionsRemoveJobResponseData withLinks(ObjectLinks links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
        return this;
    }

    public GetBulkProfileSuppressionsRemoveJobResponseData withRelationships(GetBulkProfileSuppressionsRemoveJobResponseRelationships relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = Optional.ofNullable(relationships);
        return this;
    }

    public GetBulkProfileSuppressionsRemoveJobResponseData withRelationships(Optional<? extends GetBulkProfileSuppressionsRemoveJobResponseRelationships> relationships) {
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
        GetBulkProfileSuppressionsRemoveJobResponseData other = (GetBulkProfileSuppressionsRemoveJobResponseData) o;
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
        return Utils.toString(GetBulkProfileSuppressionsRemoveJobResponseData.class,
                "type", type,
                "id", id,
                "attributes", attributes,
                "links", links,
                "relationships", relationships);
    }
    
    public final static class Builder {
 
        private ProfileSuppressionBulkDeleteJobEnum type;
 
        private String id;
 
        private GetBulkProfileSuppressionsRemoveJobResponseAttributes attributes;
 
        private ObjectLinks links;
 
        private Optional<? extends GetBulkProfileSuppressionsRemoveJobResponseRelationships> relationships = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(ProfileSuppressionBulkDeleteJobEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * Unique identifier for retrieving the job. Generated by Klaviyo.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder attributes(GetBulkProfileSuppressionsRemoveJobResponseAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder links(ObjectLinks links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }

        public Builder relationships(GetBulkProfileSuppressionsRemoveJobResponseRelationships relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Builder relationships(Optional<? extends GetBulkProfileSuppressionsRemoveJobResponseRelationships> relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = relationships;
            return this;
        }
        
        public GetBulkProfileSuppressionsRemoveJobResponseData build() {
            return new GetBulkProfileSuppressionsRemoveJobResponseData(
                type,
                id,
                attributes,
                links,
                relationships);
        }
    }
}

