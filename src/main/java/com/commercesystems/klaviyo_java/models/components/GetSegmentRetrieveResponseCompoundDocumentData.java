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


public class GetSegmentRetrieveResponseCompoundDocumentData {

    @JsonProperty("type")
    private SegmentEnum type;

    @JsonProperty("id")
    private String id;

    @JsonProperty("attributes")
    private GetSegmentRetrieveResponseCompoundDocumentAttributes attributes;

    @JsonProperty("links")
    private ObjectLinks links;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relationships")
    private Optional<? extends GetSegmentRetrieveResponseCompoundDocumentRelationships> relationships;

    @JsonCreator
    public GetSegmentRetrieveResponseCompoundDocumentData(
            @JsonProperty("type") SegmentEnum type,
            @JsonProperty("id") String id,
            @JsonProperty("attributes") GetSegmentRetrieveResponseCompoundDocumentAttributes attributes,
            @JsonProperty("links") ObjectLinks links,
            @JsonProperty("relationships") Optional<? extends GetSegmentRetrieveResponseCompoundDocumentRelationships> relationships) {
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
    
    public GetSegmentRetrieveResponseCompoundDocumentData(
            SegmentEnum type,
            String id,
            GetSegmentRetrieveResponseCompoundDocumentAttributes attributes,
            ObjectLinks links) {
        this(type, id, attributes, links, Optional.empty());
    }

    @JsonIgnore
    public SegmentEnum type() {
        return type;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public GetSegmentRetrieveResponseCompoundDocumentAttributes attributes() {
        return attributes;
    }

    @JsonIgnore
    public ObjectLinks links() {
        return links;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetSegmentRetrieveResponseCompoundDocumentRelationships> relationships() {
        return (Optional<GetSegmentRetrieveResponseCompoundDocumentRelationships>) relationships;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetSegmentRetrieveResponseCompoundDocumentData withType(SegmentEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public GetSegmentRetrieveResponseCompoundDocumentData withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetSegmentRetrieveResponseCompoundDocumentData withAttributes(GetSegmentRetrieveResponseCompoundDocumentAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public GetSegmentRetrieveResponseCompoundDocumentData withLinks(ObjectLinks links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
        return this;
    }

    public GetSegmentRetrieveResponseCompoundDocumentData withRelationships(GetSegmentRetrieveResponseCompoundDocumentRelationships relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = Optional.ofNullable(relationships);
        return this;
    }

    public GetSegmentRetrieveResponseCompoundDocumentData withRelationships(Optional<? extends GetSegmentRetrieveResponseCompoundDocumentRelationships> relationships) {
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
        GetSegmentRetrieveResponseCompoundDocumentData other = (GetSegmentRetrieveResponseCompoundDocumentData) o;
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
        return Utils.toString(GetSegmentRetrieveResponseCompoundDocumentData.class,
                "type", type,
                "id", id,
                "attributes", attributes,
                "links", links,
                "relationships", relationships);
    }
    
    public final static class Builder {
 
        private SegmentEnum type;
 
        private String id;
 
        private GetSegmentRetrieveResponseCompoundDocumentAttributes attributes;
 
        private ObjectLinks links;
 
        private Optional<? extends GetSegmentRetrieveResponseCompoundDocumentRelationships> relationships = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(SegmentEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder attributes(GetSegmentRetrieveResponseCompoundDocumentAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder links(ObjectLinks links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }

        public Builder relationships(GetSegmentRetrieveResponseCompoundDocumentRelationships relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Builder relationships(Optional<? extends GetSegmentRetrieveResponseCompoundDocumentRelationships> relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = relationships;
            return this;
        }
        
        public GetSegmentRetrieveResponseCompoundDocumentData build() {
            return new GetSegmentRetrieveResponseCompoundDocumentData(
                type,
                id,
                attributes,
                links,
                relationships);
        }
    }
}
