/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.ImageUploadQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class UploadImageFromFileRequest {

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    private ImageUploadQuery imageUploadQuery;

    @JsonCreator
    public UploadImageFromFileRequest(
            String revision,
            ImageUploadQuery imageUploadQuery) {
        Utils.checkNotNull(revision, "revision");
        Utils.checkNotNull(imageUploadQuery, "imageUploadQuery");
        this.revision = revision;
        this.imageUploadQuery = imageUploadQuery;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    @JsonIgnore
    public ImageUploadQuery imageUploadQuery() {
        return imageUploadQuery;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public UploadImageFromFileRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public UploadImageFromFileRequest withImageUploadQuery(ImageUploadQuery imageUploadQuery) {
        Utils.checkNotNull(imageUploadQuery, "imageUploadQuery");
        this.imageUploadQuery = imageUploadQuery;
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
        UploadImageFromFileRequest other = (UploadImageFromFileRequest) o;
        return 
            Objects.deepEquals(this.revision, other.revision) &&
            Objects.deepEquals(this.imageUploadQuery, other.imageUploadQuery);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            revision,
            imageUploadQuery);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UploadImageFromFileRequest.class,
                "revision", revision,
                "imageUploadQuery", imageUploadQuery);
    }
    
    public final static class Builder {
 
        private String revision;
 
        private ImageUploadQuery imageUploadQuery;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * API endpoint revision (format: YYYY-MM-DD[.suffix])
         */
        public Builder revision(String revision) {
            Utils.checkNotNull(revision, "revision");
            this.revision = revision;
            return this;
        }

        public Builder imageUploadQuery(ImageUploadQuery imageUploadQuery) {
            Utils.checkNotNull(imageUploadQuery, "imageUploadQuery");
            this.imageUploadQuery = imageUploadQuery;
            return this;
        }
        
        public UploadImageFromFileRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new UploadImageFromFileRequest(
                revision,
                imageUploadQuery);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

