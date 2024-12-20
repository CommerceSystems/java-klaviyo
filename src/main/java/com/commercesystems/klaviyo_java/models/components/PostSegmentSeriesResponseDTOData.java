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


public class PostSegmentSeriesResponseDTOData {

    @JsonProperty("type")
    private SegmentSeriesReportEnum type;

    @JsonProperty("attributes")
    private PostSegmentSeriesResponseDTOAttributes attributes;

    @JsonCreator
    public PostSegmentSeriesResponseDTOData(
            @JsonProperty("type") SegmentSeriesReportEnum type,
            @JsonProperty("attributes") PostSegmentSeriesResponseDTOAttributes attributes) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        this.type = type;
        this.attributes = attributes;
    }

    @JsonIgnore
    public SegmentSeriesReportEnum type() {
        return type;
    }

    @JsonIgnore
    public PostSegmentSeriesResponseDTOAttributes attributes() {
        return attributes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostSegmentSeriesResponseDTOData withType(SegmentSeriesReportEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public PostSegmentSeriesResponseDTOData withAttributes(PostSegmentSeriesResponseDTOAttributes attributes) {
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
        PostSegmentSeriesResponseDTOData other = (PostSegmentSeriesResponseDTOData) o;
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
        return Utils.toString(PostSegmentSeriesResponseDTOData.class,
                "type", type,
                "attributes", attributes);
    }
    
    public final static class Builder {
 
        private SegmentSeriesReportEnum type;
 
        private PostSegmentSeriesResponseDTOAttributes attributes;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(SegmentSeriesReportEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(PostSegmentSeriesResponseDTOAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }
        
        public PostSegmentSeriesResponseDTOData build() {
            return new PostSegmentSeriesResponseDTOData(
                type,
                attributes);
        }
    }
}

