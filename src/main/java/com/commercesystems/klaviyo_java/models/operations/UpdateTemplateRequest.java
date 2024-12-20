/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.TemplateUpdateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class UpdateTemplateRequest {

    /**
     * The ID of template
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @SpeakeasyMetadata("request:mediaType=application/vnd.api+json")
    private TemplateUpdateQuery templateUpdateQuery;

    @JsonCreator
    public UpdateTemplateRequest(
            String id,
            String revision,
            TemplateUpdateQuery templateUpdateQuery) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(revision, "revision");
        Utils.checkNotNull(templateUpdateQuery, "templateUpdateQuery");
        this.id = id;
        this.revision = revision;
        this.templateUpdateQuery = templateUpdateQuery;
    }

    /**
     * The ID of template
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
    public TemplateUpdateQuery templateUpdateQuery() {
        return templateUpdateQuery;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of template
     */
    public UpdateTemplateRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public UpdateTemplateRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public UpdateTemplateRequest withTemplateUpdateQuery(TemplateUpdateQuery templateUpdateQuery) {
        Utils.checkNotNull(templateUpdateQuery, "templateUpdateQuery");
        this.templateUpdateQuery = templateUpdateQuery;
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
        UpdateTemplateRequest other = (UpdateTemplateRequest) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.revision, other.revision) &&
            Objects.deepEquals(this.templateUpdateQuery, other.templateUpdateQuery);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            revision,
            templateUpdateQuery);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateTemplateRequest.class,
                "id", id,
                "revision", revision,
                "templateUpdateQuery", templateUpdateQuery);
    }
    
    public final static class Builder {
 
        private String id;
 
        private String revision;
 
        private TemplateUpdateQuery templateUpdateQuery;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of template
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

        public Builder templateUpdateQuery(TemplateUpdateQuery templateUpdateQuery) {
            Utils.checkNotNull(templateUpdateQuery, "templateUpdateQuery");
            this.templateUpdateQuery = templateUpdateQuery;
            return this;
        }
        
        public UpdateTemplateRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new UpdateTemplateRequest(
                id,
                revision,
                templateUpdateQuery);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

