/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;


import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.SpeakeasyMetadata;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class GetEventMetricRequest {

    /**
     * ID of the event
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[metric]")
    private Optional<? extends List<GetEventMetricQueryParamFieldsMetric>> fieldsMetric;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @JsonCreator
    public GetEventMetricRequest(
            String id,
            Optional<? extends List<GetEventMetricQueryParamFieldsMetric>> fieldsMetric,
            String revision) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(fieldsMetric, "fieldsMetric");
        Utils.checkNotNull(revision, "revision");
        this.id = id;
        this.fieldsMetric = fieldsMetric;
        this.revision = revision;
    }
    
    public GetEventMetricRequest(
            String id,
            String revision) {
        this(id, Optional.empty(), revision);
    }

    /**
     * ID of the event
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetEventMetricQueryParamFieldsMetric>> fieldsMetric() {
        return (Optional<List<GetEventMetricQueryParamFieldsMetric>>) fieldsMetric;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @JsonIgnore
    public String revision() {
        return revision;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the event
     */
    public GetEventMetricRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetEventMetricRequest withFieldsMetric(List<GetEventMetricQueryParamFieldsMetric> fieldsMetric) {
        Utils.checkNotNull(fieldsMetric, "fieldsMetric");
        this.fieldsMetric = Optional.ofNullable(fieldsMetric);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetEventMetricRequest withFieldsMetric(Optional<? extends List<GetEventMetricQueryParamFieldsMetric>> fieldsMetric) {
        Utils.checkNotNull(fieldsMetric, "fieldsMetric");
        this.fieldsMetric = fieldsMetric;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public GetEventMetricRequest withRevision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
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
        GetEventMetricRequest other = (GetEventMetricRequest) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.fieldsMetric, other.fieldsMetric) &&
            Objects.deepEquals(this.revision, other.revision);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            fieldsMetric,
            revision);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetEventMetricRequest.class,
                "id", id,
                "fieldsMetric", fieldsMetric,
                "revision", revision);
    }
    
    public final static class Builder {
 
        private String id;
 
        private Optional<? extends List<GetEventMetricQueryParamFieldsMetric>> fieldsMetric = Optional.empty();
 
        private String revision;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID of the event
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsMetric(List<GetEventMetricQueryParamFieldsMetric> fieldsMetric) {
            Utils.checkNotNull(fieldsMetric, "fieldsMetric");
            this.fieldsMetric = Optional.ofNullable(fieldsMetric);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsMetric(Optional<? extends List<GetEventMetricQueryParamFieldsMetric>> fieldsMetric) {
            Utils.checkNotNull(fieldsMetric, "fieldsMetric");
            this.fieldsMetric = fieldsMetric;
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
        
        public GetEventMetricRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new GetEventMetricRequest(
                id,
                fieldsMetric,
                revision);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

