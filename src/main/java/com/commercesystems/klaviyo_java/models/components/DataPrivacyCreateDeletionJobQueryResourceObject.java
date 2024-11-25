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


public class DataPrivacyCreateDeletionJobQueryResourceObject {

    @JsonProperty("type")
    private DataPrivacyDeletionJobEnum type;

    @JsonProperty("attributes")
    private DataPrivacyCreateDeletionJobQueryResourceObjectAttributes attributes;

    @JsonCreator
    public DataPrivacyCreateDeletionJobQueryResourceObject(
            @JsonProperty("type") DataPrivacyDeletionJobEnum type,
            @JsonProperty("attributes") DataPrivacyCreateDeletionJobQueryResourceObjectAttributes attributes) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(attributes, "attributes");
        this.type = type;
        this.attributes = attributes;
    }

    @JsonIgnore
    public DataPrivacyDeletionJobEnum type() {
        return type;
    }

    @JsonIgnore
    public DataPrivacyCreateDeletionJobQueryResourceObjectAttributes attributes() {
        return attributes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DataPrivacyCreateDeletionJobQueryResourceObject withType(DataPrivacyDeletionJobEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public DataPrivacyCreateDeletionJobQueryResourceObject withAttributes(DataPrivacyCreateDeletionJobQueryResourceObjectAttributes attributes) {
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
        DataPrivacyCreateDeletionJobQueryResourceObject other = (DataPrivacyCreateDeletionJobQueryResourceObject) o;
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
        return Utils.toString(DataPrivacyCreateDeletionJobQueryResourceObject.class,
                "type", type,
                "attributes", attributes);
    }
    
    public final static class Builder {
 
        private DataPrivacyDeletionJobEnum type;
 
        private DataPrivacyCreateDeletionJobQueryResourceObjectAttributes attributes;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder type(DataPrivacyDeletionJobEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder attributes(DataPrivacyCreateDeletionJobQueryResourceObjectAttributes attributes) {
            Utils.checkNotNull(attributes, "attributes");
            this.attributes = attributes;
            return this;
        }
        
        public DataPrivacyCreateDeletionJobQueryResourceObject build() {
            return new DataPrivacyCreateDeletionJobQueryResourceObject(
                type,
                attributes);
        }
    }
}
