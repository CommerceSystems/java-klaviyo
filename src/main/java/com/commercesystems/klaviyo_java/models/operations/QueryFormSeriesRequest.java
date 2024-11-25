/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.models.components.FormSeriesRequestDTO;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class QueryFormSeriesRequest {

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @SpeakeasyMetadata("request:mediaType=application/vnd.api+json")
    private FormSeriesRequestDTO formSeriesRequestDTO;

    @JsonCreator
    public QueryFormSeriesRequest(
            String revision,
            FormSeriesRequestDTO formSeriesRequestDTO) {
        Utils.checkNotNull(revision, "revision");
        Utils.checkNotNull(formSeriesRequestDTO, "formSeriesRequestDTO");
        this.revision = revision;
        this.formSeriesRequestDTO = formSeriesRequestDTO;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    @JsonIgnore
    public FormSeriesRequestDTO formSeriesRequestDTO() {
        return formSeriesRequestDTO;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public QueryFormSeriesRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public QueryFormSeriesRequest withFormSeriesRequestDTO(FormSeriesRequestDTO formSeriesRequestDTO) {
        Utils.checkNotNull(formSeriesRequestDTO, "formSeriesRequestDTO");
        this.formSeriesRequestDTO = formSeriesRequestDTO;
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
        QueryFormSeriesRequest other = (QueryFormSeriesRequest) o;
        return 
            Objects.deepEquals(this.revision, other.revision) &&
            Objects.deepEquals(this.formSeriesRequestDTO, other.formSeriesRequestDTO);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            revision,
            formSeriesRequestDTO);
    }
    
    @Override
    public String toString() {
        return Utils.toString(QueryFormSeriesRequest.class,
                "revision", revision,
                "formSeriesRequestDTO", formSeriesRequestDTO);
    }
    
    public final static class Builder {
 
        private String revision;
 
        private FormSeriesRequestDTO formSeriesRequestDTO;  
        
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

        public Builder formSeriesRequestDTO(FormSeriesRequestDTO formSeriesRequestDTO) {
            Utils.checkNotNull(formSeriesRequestDTO, "formSeriesRequestDTO");
            this.formSeriesRequestDTO = formSeriesRequestDTO;
            return this;
        }
        
        public QueryFormSeriesRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new QueryFormSeriesRequest(
                revision,
                formSeriesRequestDTO);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

