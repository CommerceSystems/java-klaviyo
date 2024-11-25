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


public class PostFlowValuesResponseDTOData {

    @JsonProperty("type")
    private FlowValuesReportEnum type;

    @JsonProperty("attributes")
    private PostFlowValuesResponseDTOAttributes attributes;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("relationships")
    private Optional<? extends PostFlowValuesResponseDTORelationships> relationships;

    @JsonCreator
    public PostFlowValuesResponseDTOData(
            @JsonProperty("type") FlowValuesReportEnum type,
            @JsonProperty("attributes") PostFlowValuesResponseDTOAttributes attributes,
            @JsonProperty("relationships") Optional<? extends PostFlowValuesResponseDTORelationships> relationships) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        Utils.checkNotNull(relationships, "relationships");
        this.type = type;
        this.attributes = attributes;
        this.relationships = relationships;
    }
    
    public PostFlowValuesResponseDTOData(
            FlowValuesReportEnum type,
            PostFlowValuesResponseDTOAttributes attributes) {
        this(type, attributes, Optional.empty());
    }

    @JsonIgnore
    public FlowValuesReportEnum type() {
        return type;
    }

    @JsonIgnore
    public PostFlowValuesResponseDTOAttributes attributes() {
        return attributes;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostFlowValuesResponseDTORelationships> relationships() {
        return (Optional<PostFlowValuesResponseDTORelationships>) relationships;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostFlowValuesResponseDTOData withType(FlowValuesReportEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public PostFlowValuesResponseDTOData withAttributes(PostFlowValuesResponseDTOAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
        return this;
    }

    public PostFlowValuesResponseDTOData withRelationships(PostFlowValuesResponseDTORelationships relationships) {
        Utils.checkNotNull(relationships, "relationships");
        this.relationships = Optional.ofNullable(relationships);
        return this;
    }

    public PostFlowValuesResponseDTOData withRelationships(Optional<? extends PostFlowValuesResponseDTORelationships> relationships) {
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
        PostFlowValuesResponseDTOData other = (PostFlowValuesResponseDTOData) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.attributes, other.attributes) &&
            Objects.deepEquals(this.relationships, other.relationships);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            attributes,
            relationships);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostFlowValuesResponseDTOData.class,
                "type", type,
                "attributes", attributes,
                "relationships", relationships);
    }
    
    public final static class Builder {
 
        private FlowValuesReportEnum type;
 
        private PostFlowValuesResponseDTOAttributes attributes;
 
        private Optional<? extends PostFlowValuesResponseDTORelationships> relationships = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(FlowValuesReportEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(PostFlowValuesResponseDTOAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }

        public Builder relationships(PostFlowValuesResponseDTORelationships relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = Optional.ofNullable(relationships);
            return this;
        }

        public Builder relationships(Optional<? extends PostFlowValuesResponseDTORelationships> relationships) {
            Utils.checkNotNull(relationships, "relationships");
            this.relationships = relationships;
            return this;
        }
        
        public PostFlowValuesResponseDTOData build() {
            return new PostFlowValuesResponseDTOData(
                type,
                attributes,
                relationships);
        }
    }
}
