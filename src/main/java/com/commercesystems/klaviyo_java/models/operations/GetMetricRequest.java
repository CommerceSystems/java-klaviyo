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


public class GetMetricRequest {

    /**
     * Metric ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[flow]")
    private Optional<? extends List<GetMetricQueryParamFieldsFlow>> fieldsFlow;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[metric]")
    private Optional<? extends List<GetMetricQueryParamFieldsMetric>> fieldsMetric;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=include")
    private Optional<? extends List<GetMetricQueryParamInclude>> include;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @JsonCreator
    public GetMetricRequest(
            String id,
            Optional<? extends List<GetMetricQueryParamFieldsFlow>> fieldsFlow,
            Optional<? extends List<GetMetricQueryParamFieldsMetric>> fieldsMetric,
            Optional<? extends List<GetMetricQueryParamInclude>> include,
            String revision) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(fieldsFlow, "fieldsFlow");
        Utils.checkNotNull(fieldsMetric, "fieldsMetric");
        Utils.checkNotNull(include, "include");
        Utils.checkNotNull(revision, "revision");
        this.id = id;
        this.fieldsFlow = fieldsFlow;
        this.fieldsMetric = fieldsMetric;
        this.include = include;
        this.revision = revision;
    }
    
    public GetMetricRequest(
            String id,
            String revision) {
        this(id, Optional.empty(), Optional.empty(), Optional.empty(), revision);
    }

    /**
     * Metric ID
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
    public Optional<List<GetMetricQueryParamFieldsFlow>> fieldsFlow() {
        return (Optional<List<GetMetricQueryParamFieldsFlow>>) fieldsFlow;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetMetricQueryParamFieldsMetric>> fieldsMetric() {
        return (Optional<List<GetMetricQueryParamFieldsMetric>>) fieldsMetric;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetMetricQueryParamInclude>> include() {
        return (Optional<List<GetMetricQueryParamInclude>>) include;
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
     * Metric ID
     */
    public GetMetricRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetMetricRequest withFieldsFlow(List<GetMetricQueryParamFieldsFlow> fieldsFlow) {
        Utils.checkNotNull(fieldsFlow, "fieldsFlow");
        this.fieldsFlow = Optional.ofNullable(fieldsFlow);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetMetricRequest withFieldsFlow(Optional<? extends List<GetMetricQueryParamFieldsFlow>> fieldsFlow) {
        Utils.checkNotNull(fieldsFlow, "fieldsFlow");
        this.fieldsFlow = fieldsFlow;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetMetricRequest withFieldsMetric(List<GetMetricQueryParamFieldsMetric> fieldsMetric) {
        Utils.checkNotNull(fieldsMetric, "fieldsMetric");
        this.fieldsMetric = Optional.ofNullable(fieldsMetric);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetMetricRequest withFieldsMetric(Optional<? extends List<GetMetricQueryParamFieldsMetric>> fieldsMetric) {
        Utils.checkNotNull(fieldsMetric, "fieldsMetric");
        this.fieldsMetric = fieldsMetric;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    public GetMetricRequest withInclude(List<GetMetricQueryParamInclude> include) {
        Utils.checkNotNull(include, "include");
        this.include = Optional.ofNullable(include);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    public GetMetricRequest withInclude(Optional<? extends List<GetMetricQueryParamInclude>> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public GetMetricRequest withRevision(String revision) {
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
        GetMetricRequest other = (GetMetricRequest) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.fieldsFlow, other.fieldsFlow) &&
            Objects.deepEquals(this.fieldsMetric, other.fieldsMetric) &&
            Objects.deepEquals(this.include, other.include) &&
            Objects.deepEquals(this.revision, other.revision);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            fieldsFlow,
            fieldsMetric,
            include,
            revision);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMetricRequest.class,
                "id", id,
                "fieldsFlow", fieldsFlow,
                "fieldsMetric", fieldsMetric,
                "include", include,
                "revision", revision);
    }
    
    public final static class Builder {
 
        private String id;
 
        private Optional<? extends List<GetMetricQueryParamFieldsFlow>> fieldsFlow = Optional.empty();
 
        private Optional<? extends List<GetMetricQueryParamFieldsMetric>> fieldsMetric = Optional.empty();
 
        private Optional<? extends List<GetMetricQueryParamInclude>> include = Optional.empty();
 
        private String revision;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Metric ID
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsFlow(List<GetMetricQueryParamFieldsFlow> fieldsFlow) {
            Utils.checkNotNull(fieldsFlow, "fieldsFlow");
            this.fieldsFlow = Optional.ofNullable(fieldsFlow);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsFlow(Optional<? extends List<GetMetricQueryParamFieldsFlow>> fieldsFlow) {
            Utils.checkNotNull(fieldsFlow, "fieldsFlow");
            this.fieldsFlow = fieldsFlow;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsMetric(List<GetMetricQueryParamFieldsMetric> fieldsMetric) {
            Utils.checkNotNull(fieldsMetric, "fieldsMetric");
            this.fieldsMetric = Optional.ofNullable(fieldsMetric);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsMetric(Optional<? extends List<GetMetricQueryParamFieldsMetric>> fieldsMetric) {
            Utils.checkNotNull(fieldsMetric, "fieldsMetric");
            this.fieldsMetric = fieldsMetric;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
         */
        public Builder include(List<GetMetricQueryParamInclude> include) {
            Utils.checkNotNull(include, "include");
            this.include = Optional.ofNullable(include);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
         */
        public Builder include(Optional<? extends List<GetMetricQueryParamInclude>> include) {
            Utils.checkNotNull(include, "include");
            this.include = include;
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
        
        public GetMetricRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new GetMetricRequest(
                id,
                fieldsFlow,
                fieldsMetric,
                include,
                revision);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

