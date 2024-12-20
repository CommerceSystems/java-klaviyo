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


public class PostFormValuesResponseDTOData {

    @JsonProperty("type")
    private FormValuesReportEnum type;

    @JsonProperty("attributes")
    private PostFormValuesResponseDTOAttributes attributes;

    @JsonCreator
    public PostFormValuesResponseDTOData(
            @JsonProperty("type") FormValuesReportEnum type,
            @JsonProperty("attributes") PostFormValuesResponseDTOAttributes attributes) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        this.type = type;
        this.attributes = attributes;
    }

    @JsonIgnore
    public FormValuesReportEnum type() {
        return type;
    }

    @JsonIgnore
    public PostFormValuesResponseDTOAttributes attributes() {
        return attributes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostFormValuesResponseDTOData withType(FormValuesReportEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public PostFormValuesResponseDTOData withAttributes(PostFormValuesResponseDTOAttributes attributes) {
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
        PostFormValuesResponseDTOData other = (PostFormValuesResponseDTOData) o;
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
        return Utils.toString(PostFormValuesResponseDTOData.class,
                "type", type,
                "attributes", attributes);
    }
    
    public final static class Builder {
 
        private FormValuesReportEnum type;
 
        private PostFormValuesResponseDTOAttributes attributes;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(FormValuesReportEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(PostFormValuesResponseDTOAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }
        
        public PostFormValuesResponseDTOData build() {
            return new PostFormValuesResponseDTOData(
                type,
                attributes);
        }
    }
}

