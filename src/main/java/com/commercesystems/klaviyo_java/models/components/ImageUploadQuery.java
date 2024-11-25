/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class ImageUploadQuery {

    /**
     * The image file to upload. Supported image formats: jpeg,png,gif. Maximum image size: 5MB.
     */
    @SpeakeasyMetadata("multipartForm:file")
    private File file;

    /**
     * A name for the image.  Defaults to the filename if not provided.  If the name matches an existing image, a suffix will be added.
     */
    @SpeakeasyMetadata("multipartForm:name=name")
    private Optional<String> name;

    /**
     * If true, this image is not shown in the asset library.
     */
    @SpeakeasyMetadata("multipartForm:name=hidden")
    private Optional<Boolean> hidden;

    @JsonCreator
    public ImageUploadQuery(
            File file,
            Optional<String> name,
            Optional<Boolean> hidden) {
        Utils.checkNotNull(file, "file");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(hidden, "hidden");
        this.file = file;
        this.name = name;
        this.hidden = hidden;
    }
    
    public ImageUploadQuery(
            File file) {
        this(file, Optional.empty(), Optional.empty());
    }

    /**
     * The image file to upload. Supported image formats: jpeg,png,gif. Maximum image size: 5MB.
     */
    @JsonIgnore
    public File file() {
        return file;
    }

    /**
     * A name for the image.  Defaults to the filename if not provided.  If the name matches an existing image, a suffix will be added.
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * If true, this image is not shown in the asset library.
     */
    @JsonIgnore
    public Optional<Boolean> hidden() {
        return hidden;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The image file to upload. Supported image formats: jpeg,png,gif. Maximum image size: 5MB.
     */
    public ImageUploadQuery withFile(File file) {
        Utils.checkNotNull(file, "file");
        this.file = file;
        return this;
    }

    /**
     * A name for the image.  Defaults to the filename if not provided.  If the name matches an existing image, a suffix will be added.
     */
    public ImageUploadQuery withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * A name for the image.  Defaults to the filename if not provided.  If the name matches an existing image, a suffix will be added.
     */
    public ImageUploadQuery withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * If true, this image is not shown in the asset library.
     */
    public ImageUploadQuery withHidden(boolean hidden) {
        Utils.checkNotNull(hidden, "hidden");
        this.hidden = Optional.ofNullable(hidden);
        return this;
    }

    /**
     * If true, this image is not shown in the asset library.
     */
    public ImageUploadQuery withHidden(Optional<Boolean> hidden) {
        Utils.checkNotNull(hidden, "hidden");
        this.hidden = hidden;
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
        ImageUploadQuery other = (ImageUploadQuery) o;
        return 
            Objects.deepEquals(this.file, other.file) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.hidden, other.hidden);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            file,
            name,
            hidden);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ImageUploadQuery.class,
                "file", file,
                "name", name,
                "hidden", hidden);
    }
    
    public final static class Builder {
 
        private File file;
 
        private Optional<String> name = Optional.empty();
 
        private Optional<Boolean> hidden;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The image file to upload. Supported image formats: jpeg,png,gif. Maximum image size: 5MB.
         */
        public Builder file(File file) {
            Utils.checkNotNull(file, "file");
            this.file = file;
            return this;
        }

        /**
         * A name for the image.  Defaults to the filename if not provided.  If the name matches an existing image, a suffix will be added.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * A name for the image.  Defaults to the filename if not provided.  If the name matches an existing image, a suffix will be added.
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * If true, this image is not shown in the asset library.
         */
        public Builder hidden(boolean hidden) {
            Utils.checkNotNull(hidden, "hidden");
            this.hidden = Optional.ofNullable(hidden);
            return this;
        }

        /**
         * If true, this image is not shown in the asset library.
         */
        public Builder hidden(Optional<Boolean> hidden) {
            Utils.checkNotNull(hidden, "hidden");
            this.hidden = hidden;
            return this;
        }
        
        public ImageUploadQuery build() {
            if (hidden == null) {
                hidden = _SINGLETON_VALUE_Hidden.value();
            }            return new ImageUploadQuery(
                file,
                name,
                hidden);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_Hidden =
                new LazySingletonValue<>(
                        "hidden",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});
    }
}
