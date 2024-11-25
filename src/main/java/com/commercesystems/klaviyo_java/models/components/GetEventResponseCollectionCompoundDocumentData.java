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


public class GetEventResponseCollectionCompoundDocumentData {

    @JsonProperty("type")
    private EventEnum type;

    /**
     * The Event ID
     */
    @JsonProperty("id")
    private String id;

    @JsonProperty("attributes")
    private GetEventResponseCollectionCompoundDocumentAttributes attributes;

    @JsonProperty("links")
    private ObjectLinks links;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relationships")
    private Optional<? extends GetEventResponseCollectionCompoundDocumentRelationships> relationships;

    @JsonCreator
    public GetEventResponseCollectionCompoundDocumentData(
            @JsonProperty("type") EventEnum type,
            @JsonProperty("id") String id,
            @JsonProperty("attributes") GetEventResponseCollectionCompoundDocumentAttributes attributes,
            @JsonProperty("links") ObjectLinks links,
            @JsonProperty("relationships") Optional<? extends GetEventResponseCollectionCompoundDocumentRelationships> relationships) {
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
    
    public GetEventResponseCollectionCompoundDocumentData(
            EventEnum type,
            String id,
            GetEventResponseCollectionCompoundDocumentAttributes attributes,
            ObjectLinks links) {
        this(type, id, attributes, links, Optional.empty());
    }

    @JsonIgnore
    public EventEnum type() {
        return type;
    }

    /**
     * The Event ID
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public GetEventResponseCollectionCompoundDocumentAttributes attributes() {
        return attributes;
    }

    @JsonIgnore
    public ObjectLinks links() {
        return links;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetEventResponseCollectionCompoundDocumentRelationships> relationships() {
        return (Optional<GetEventResponseCollectionCompoundDocumentRelationships>) relationships;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetEventResponseCollectionCompoundDocumentData withType(EventEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * The Event ID
     */
    public GetEventResponseCollectionCompoundDocumentData withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetEventResponseCollectionCompoundDocumentData withAttributes(GetEventResponseCollectionCompoundDocumentAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public GetEventResponseCollectionCompoundDocumentData withLinks(ObjectLinks links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
        return this;
    }

    public GetEventResponseCollectionCompoundDocumentData withRelationships(GetEventResponseCollectionCompoundDocumentRelationships relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = Optional.ofNullable(relationships);
        return this;
    }

    public GetEventResponseCollectionCompoundDocumentData withRelationships(Optional<? extends GetEventResponseCollectionCompoundDocumentRelationships> relationships) {
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
        GetEventResponseCollectionCompoundDocumentData other = (GetEventResponseCollectionCompoundDocumentData) o;
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
        return Utils.toString(GetEventResponseCollectionCompoundDocumentData.class,
                "type", type,
                "id", id,
                "attributes", attributes,
                "links", links,
                "relationships", relationships);
    }
    
    public final static class Builder {
 
        private EventEnum type;
 
        private String id;
 
        private GetEventResponseCollectionCompoundDocumentAttributes attributes;
 
        private ObjectLinks links;
 
        private Optional<? extends GetEventResponseCollectionCompoundDocumentRelationships> relationships = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(EventEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * The Event ID
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder attributes(GetEventResponseCollectionCompoundDocumentAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder links(ObjectLinks links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }

        public Builder relationships(GetEventResponseCollectionCompoundDocumentRelationships relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Builder relationships(Optional<? extends GetEventResponseCollectionCompoundDocumentRelationships> relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = relationships;
            return this;
        }
        
        public GetEventResponseCollectionCompoundDocumentData build() {
            return new GetEventResponseCollectionCompoundDocumentData(
                type,
                id,
                attributes,
                links,
                relationships);
        }
    }
}

