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
import java.util.Objects;
import java.util.Optional;


public class SplitBlock {

    @JsonProperty("content_type")
    private BlockEnum contentType;

    @JsonProperty("type")
    private SplitEnum type;

    @JsonInclude(Include.ALWAYS)
    @JsonProperty("data")
    private Optional<String> data;

    @JsonCreator
    public SplitBlock(
            @JsonProperty("content_type") BlockEnum contentType,
            @JsonProperty("type") SplitEnum type,
            @JsonProperty("data") Optional<String> data) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(data, "data");
        this.contentType = contentType;
        this.type = type;
        this.data = data;
    }
    
    public SplitBlock(
            BlockEnum contentType,
            SplitEnum type) {
        this(contentType, type, Optional.empty());
    }

    @JsonIgnore
    public BlockEnum contentType() {
        return contentType;
    }

    @JsonIgnore
    public SplitEnum type() {
        return type;
    }

    @JsonIgnore
    public Optional<String> data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SplitBlock withContentType(BlockEnum contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    public SplitBlock withType(SplitEnum type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public SplitBlock withData(String data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public SplitBlock withData(Optional<String> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
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
        SplitBlock other = (SplitBlock) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            type,
            data);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SplitBlock.class,
                "contentType", contentType,
                "type", type,
                "data", data);
    }
    
    public final static class Builder {
 
        private BlockEnum contentType;
 
        private SplitEnum type;
 
        private Optional<String> data = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder contentType(BlockEnum contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        public Builder type(SplitEnum type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder data(String data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<String> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public SplitBlock build() {
            return new SplitBlock(
                contentType,
                type,
                data);
        }
    }
}

