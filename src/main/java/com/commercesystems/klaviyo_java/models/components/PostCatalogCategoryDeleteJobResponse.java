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


public class PostCatalogCategoryDeleteJobResponse {

    @JsonProperty("data")
    private PostCatalogCategoryDeleteJobResponseData data;

    @JsonCreator
    public PostCatalogCategoryDeleteJobResponse(
            @JsonProperty("data") PostCatalogCategoryDeleteJobResponseData data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
    }

    @JsonIgnore
    public PostCatalogCategoryDeleteJobResponseData data() {
        return data;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostCatalogCategoryDeleteJobResponse withData(PostCatalogCategoryDeleteJobResponseData data) {
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
        PostCatalogCategoryDeleteJobResponse other = (PostCatalogCategoryDeleteJobResponse) o;
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
        return Utils.toString(PostCatalogCategoryDeleteJobResponse.class,
                "data", data);
    }
    
    public final static class Builder {
 
        private PostCatalogCategoryDeleteJobResponseData data;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(PostCatalogCategoryDeleteJobResponseData data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }
        
        public PostCatalogCategoryDeleteJobResponse build() {
            return new PostCatalogCategoryDeleteJobResponse(
                data);
        }
    }
}

