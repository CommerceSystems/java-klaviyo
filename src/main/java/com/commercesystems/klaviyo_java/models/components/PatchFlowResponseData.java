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


public class PatchFlowResponseData {

    @JsonProperty("type")
    private FlowEnum type;

    @JsonProperty("id")
    private String id;

    @JsonProperty("attributes")
    private PatchFlowResponseAttributes attributes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relationships")
    private Optional<? extends PatchFlowResponseRelationships> relationships;

    @JsonProperty("links")
    private ObjectLinks links;

    @JsonCreator
    public PatchFlowResponseData(
            @JsonProperty("type") FlowEnum type,
            @JsonProperty("id") String id,
            @JsonProperty("attributes") PatchFlowResponseAttributes attributes,
            @JsonProperty("relationships") Optional<? extends PatchFlowResponseRelationships> relationships,
            @JsonProperty("links") ObjectLinks links) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(attributes, "attributes");
        Utils.checkNotNull(relationships, "relationships");
        Utils.checkNotNull(links, "links");
        this.type = type;
        this.id = id;
        this.attributes = attributes;
        this.relationships = relationships;
        this.links = links;
    }
    
    public PatchFlowResponseData(
            FlowEnum type,
            String id,
            PatchFlowResponseAttributes attributes,
            ObjectLinks links) {
        this(type, id, attributes, Optional.empty(), links);
    }

    @JsonIgnore
    public FlowEnum type() {
        return type;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public PatchFlowResponseAttributes attributes() {
        return attributes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PatchFlowResponseRelationships> relationships() {
        return (Optional<PatchFlowResponseRelationships>) relationships;
    }

    @JsonIgnore
    public ObjectLinks links() {
        return links;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PatchFlowResponseData withType(FlowEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public PatchFlowResponseData withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public PatchFlowResponseData withAttributes(PatchFlowResponseAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public PatchFlowResponseData withRelationships(PatchFlowResponseRelationships relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = Optional.ofNullable(relationships);
        return this;
    }

    public PatchFlowResponseData withRelationships(Optional<? extends PatchFlowResponseRelationships> relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = relationships;
        return this;
    }

    public PatchFlowResponseData withLinks(ObjectLinks links) {
        Utils.checkNotNull(links, "links");
        this.links = links;
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
        PatchFlowResponseData other = (PatchFlowResponseData) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.attributes, other.attributes) &&
            Objects.deepEquals(this.relationships, other.relationships) &&
            Objects.deepEquals(this.links, other.links);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            id,
            attributes,
            relationships,
            links);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PatchFlowResponseData.class,
                "type", type,
                "id", id,
                "attributes", attributes,
                "relationships", relationships,
                "links", links);
    }
    
    public final static class Builder {
 
        private FlowEnum type;
 
        private String id;
 
        private PatchFlowResponseAttributes attributes;
 
        private Optional<? extends PatchFlowResponseRelationships> relationships = Optional.empty();
 
        private ObjectLinks links;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(FlowEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder attributes(PatchFlowResponseAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder relationships(PatchFlowResponseRelationships relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Builder relationships(Optional<? extends PatchFlowResponseRelationships> relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = relationships;
            return this;
        }

        public Builder links(ObjectLinks links) {
            Utils.checkNotNull(links, "links");
            this.links = links;
            return this;
        }
        
        public PatchFlowResponseData build() {
            return new PatchFlowResponseData(
                type,
                id,
                attributes,
                relationships,
                links);
        }
    }
}

