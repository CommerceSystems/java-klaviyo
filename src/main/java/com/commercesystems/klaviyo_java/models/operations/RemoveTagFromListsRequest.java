/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.TagListOp;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class RemoveTagFromListsRequest {

    /**
     * The Tag ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @SpeakeasyMetadata("request:mediaType=application/vnd.api+json")
    private TagListOp tagListOp;

    @JsonCreator
    public RemoveTagFromListsRequest(
            String id,
            String revision,
            TagListOp tagListOp) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(revision, "revision");
        Utils.checkNotNull(tagListOp, "tagListOp");
        this.id = id;
        this.revision = revision;
        this.tagListOp = tagListOp;
    }

    /**
     * The Tag ID
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    @JsonIgnore
    public TagListOp tagListOp() {
        return tagListOp;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Tag ID
     */
    public RemoveTagFromListsRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public RemoveTagFromListsRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public RemoveTagFromListsRequest withTagListOp(TagListOp tagListOp) {
        Utils.checkNotNull(tagListOp, "tagListOp");
        this.tagListOp = tagListOp;
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
        RemoveTagFromListsRequest other = (RemoveTagFromListsRequest) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.revision, other.revision) &&
            Objects.deepEquals(this.tagListOp, other.tagListOp);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            revision,
            tagListOp);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RemoveTagFromListsRequest.class,
                "id", id,
                "revision", revision,
                "tagListOp", tagListOp);
    }
    
    public final static class Builder {
 
        private String id;
 
        private String revision;
 
        private TagListOp tagListOp;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The Tag ID
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * API endpoint revision (format: YYYY-MM-DD[.suffix])
         */
        public Builder revision(String revision) {
            Utils.checkNotNull(revision, "revision");
            this.revision = revision;
            return this;
        }

        public Builder tagListOp(TagListOp tagListOp) {
            Utils.checkNotNull(tagListOp, "tagListOp");
            this.tagListOp = tagListOp;
            return this;
        }
        
        public RemoveTagFromListsRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new RemoveTagFromListsRequest(
                id,
                revision,
                tagListOp);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}
