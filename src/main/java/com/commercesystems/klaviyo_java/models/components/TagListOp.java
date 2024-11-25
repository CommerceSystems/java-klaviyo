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
import java.util.List;
import java.util.Objects;


public class TagListOp {

    @JsonProperty("data")
    private List<TagListOpData> data;

    @JsonCreator
    public TagListOp(
            @JsonProperty("data") List<TagListOpData> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public List<TagListOpData> data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TagListOp withData(List<TagListOpData> data) {
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
        TagListOp other = (TagListOp) o;
        return 
            Objects.deepEquals(this.data, other.data);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TagListOp.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private List<TagListOpData> data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(List<TagListOpData> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public TagListOp build() {
            return new TagListOp(
                data);
        }
    }
}

