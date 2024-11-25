/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.TagCampaignOp;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class TagCampaignsRequest {

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
    private TagCampaignOp tagCampaignOp;

    @JsonCreator
    public TagCampaignsRequest(
            String id,
            String revision,
            TagCampaignOp tagCampaignOp) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(revision, "revision");
        Utils.checkNotNull(tagCampaignOp, "tagCampaignOp");
        this.id = id;
        this.revision = revision;
        this.tagCampaignOp = tagCampaignOp;
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
    public TagCampaignOp tagCampaignOp() {
        return tagCampaignOp;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The Tag ID
     */
    public TagCampaignsRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public TagCampaignsRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public TagCampaignsRequest withTagCampaignOp(TagCampaignOp tagCampaignOp) {
        Utils.checkNotNull(tagCampaignOp, "tagCampaignOp");
        this.tagCampaignOp = tagCampaignOp;
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
        TagCampaignsRequest other = (TagCampaignsRequest) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.revision, other.revision) &&
            Objects.deepEquals(this.tagCampaignOp, other.tagCampaignOp);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            revision,
            tagCampaignOp);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TagCampaignsRequest.class,
                "id", id,
                "revision", revision,
                "tagCampaignOp", tagCampaignOp);
    }
    
    public final static class Builder {
 
        private String id;
 
        private String revision;
 
        private TagCampaignOp tagCampaignOp;  
        
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

        public Builder tagCampaignOp(TagCampaignOp tagCampaignOp) {
            Utils.checkNotNull(tagCampaignOp, "tagCampaignOp");
            this.tagCampaignOp = tagCampaignOp;
            return this;
        }
        
        public TagCampaignsRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new TagCampaignsRequest(
                id,
                revision,
                tagCampaignOp);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}
