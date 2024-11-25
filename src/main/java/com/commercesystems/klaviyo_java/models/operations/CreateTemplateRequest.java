/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.TemplateCreateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CreateTemplateRequest {

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @SpeakeasyMetadata("request:mediaType=application/vnd.api+json")
    private TemplateCreateQuery templateCreateQuery;

    @JsonCreator
    public CreateTemplateRequest(
            String revision,
            TemplateCreateQuery templateCreateQuery) {
        Utils.checkNotNull(revision, "revision");
        Utils.checkNotNull(templateCreateQuery, "templateCreateQuery");
        this.revision = revision;
        this.templateCreateQuery = templateCreateQuery;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    @JsonIgnore
    public TemplateCreateQuery templateCreateQuery() {
        return templateCreateQuery;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public CreateTemplateRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public CreateTemplateRequest withTemplateCreateQuery(TemplateCreateQuery templateCreateQuery) {
        Utils.checkNotNull(templateCreateQuery, "templateCreateQuery");
        this.templateCreateQuery = templateCreateQuery;
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
        CreateTemplateRequest other = (CreateTemplateRequest) o;
        return 
            Objects.deepEquals(this.revision, other.revision) &&
            Objects.deepEquals(this.templateCreateQuery, other.templateCreateQuery);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            revision,
            templateCreateQuery);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateTemplateRequest.class,
                "revision", revision,
                "templateCreateQuery", templateCreateQuery);
    }
    
    public final static class Builder {
 
        private String revision;
 
        private TemplateCreateQuery templateCreateQuery;  
        
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

        public Builder templateCreateQuery(TemplateCreateQuery templateCreateQuery) {
            Utils.checkNotNull(templateCreateQuery, "templateCreateQuery");
            this.templateCreateQuery = templateCreateQuery;
            return this;
        }
        
        public CreateTemplateRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new CreateTemplateRequest(
                revision,
                templateCreateQuery);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

