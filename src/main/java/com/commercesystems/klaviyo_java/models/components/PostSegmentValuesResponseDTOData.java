/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PostSegmentValuesResponseDTOData {

    @JsonProperty("type")
    private SegmentValuesReportEnum type;

    @JsonProperty("attributes")
    private PostSegmentValuesResponseDTOAttributes attributes;

    @JsonCreator
    public PostSegmentValuesResponseDTOData(
            @JsonProperty("type") SegmentValuesReportEnum type,
            @JsonProperty("attributes") PostSegmentValuesResponseDTOAttributes attributes) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        this.type = type;
        this.attributes = attributes;
    }

    @JsonIgnore
    public SegmentValuesReportEnum type() {
        return type;
    }

    @JsonIgnore
    public PostSegmentValuesResponseDTOAttributes attributes() {
        return attributes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostSegmentValuesResponseDTOData withType(SegmentValuesReportEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public PostSegmentValuesResponseDTOData withAttributes(PostSegmentValuesResponseDTOAttributes attributes) {
        Utils.checkNotNull(attributes, "attributes");
        this.attributes = attributes;
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
        PostSegmentValuesResponseDTOData other = (PostSegmentValuesResponseDTOData) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.attributes, other.attributes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            attributes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostSegmentValuesResponseDTOData.class,
                "type", type,
                "attributes", attributes);
    }
    
    public final static class Builder {
 
        private SegmentValuesReportEnum type;
 
        private PostSegmentValuesResponseDTOAttributes attributes;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(SegmentValuesReportEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(PostSegmentValuesResponseDTOAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }
        
        public PostSegmentValuesResponseDTOData build() {
            return new PostSegmentValuesResponseDTOData(
                type,
                attributes);
        }
    }
}

