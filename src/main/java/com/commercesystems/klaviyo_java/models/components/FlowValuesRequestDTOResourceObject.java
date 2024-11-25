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


public class FlowValuesRequestDTOResourceObject {

    @JsonProperty("type")
    private FlowValuesReportEnum type;

    @JsonProperty("attributes")
    private FlowValuesRequestDTOResourceObjectAttributes attributes;

    @JsonCreator
    public FlowValuesRequestDTOResourceObject(
            @JsonProperty("type") FlowValuesReportEnum type,
            @JsonProperty("attributes") FlowValuesRequestDTOResourceObjectAttributes attributes) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        this.type = type;
        this.attributes = attributes;
    }

    @JsonIgnore
    public FlowValuesReportEnum type() {
        return type;
    }

    @JsonIgnore
    public FlowValuesRequestDTOResourceObjectAttributes attributes() {
        return attributes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public FlowValuesRequestDTOResourceObject withType(FlowValuesReportEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public FlowValuesRequestDTOResourceObject withAttributes(FlowValuesRequestDTOResourceObjectAttributes attributes) {
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
        FlowValuesRequestDTOResourceObject other = (FlowValuesRequestDTOResourceObject) o;
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
        return Utils.toString(FlowValuesRequestDTOResourceObject.class,
                "type", type,
                "attributes", attributes);
    }
    
    public final static class Builder {
 
        private FlowValuesReportEnum type;
 
        private FlowValuesRequestDTOResourceObjectAttributes attributes;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(FlowValuesReportEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(FlowValuesRequestDTOResourceObjectAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }
        
        public FlowValuesRequestDTOResourceObject build() {
            return new FlowValuesRequestDTOResourceObject(
                type,
                attributes);
        }
    }
}
