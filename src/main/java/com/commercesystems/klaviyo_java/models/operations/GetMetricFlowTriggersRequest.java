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


public class GetMetricFlowTriggersRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[flow]")
    private Optional<? extends List<GetMetricFlowTriggersQueryParamFieldsFlow>> fieldsFlow;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @JsonCreator
    public GetMetricFlowTriggersRequest(
            String id,
            Optional<? extends List<GetMetricFlowTriggersQueryParamFieldsFlow>> fieldsFlow,
            String revision) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(fieldsFlow, "fieldsFlow");
        Utils.checkNotNull(revision, "revision");
        this.id = id;
        this.fieldsFlow = fieldsFlow;
        this.revision = revision;
    }
    
    public GetMetricFlowTriggersRequest(
            String id,
            String revision) {
        this(id, Optional.empty(), revision);
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetMetricFlowTriggersQueryParamFieldsFlow>> fieldsFlow() {
        return (Optional<List<GetMetricFlowTriggersQueryParamFieldsFlow>>) fieldsFlow;
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

    public GetMetricFlowTriggersRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetMetricFlowTriggersRequest withFieldsFlow(List<GetMetricFlowTriggersQueryParamFieldsFlow> fieldsFlow) {
        Utils.checkNotNull(fieldsFlow, "fieldsFlow");
        this.fieldsFlow = Optional.ofNullable(fieldsFlow);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetMetricFlowTriggersRequest withFieldsFlow(Optional<? extends List<GetMetricFlowTriggersQueryParamFieldsFlow>> fieldsFlow) {
        Utils.checkNotNull(fieldsFlow, "fieldsFlow");
        this.fieldsFlow = fieldsFlow;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public GetMetricFlowTriggersRequest withRevision(String revision) {
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
        GetMetricFlowTriggersRequest other = (GetMetricFlowTriggersRequest) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.fieldsFlow, other.fieldsFlow) &&
            Objects.deepEquals(this.revision, other.revision);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            fieldsFlow,
            revision);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMetricFlowTriggersRequest.class,
                "id", id,
                "fieldsFlow", fieldsFlow,
                "revision", revision);
    }
    
    public final static class Builder {
 
        private String id;
 
        private Optional<? extends List<GetMetricFlowTriggersQueryParamFieldsFlow>> fieldsFlow = Optional.empty();
 
        private String revision;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsFlow(List<GetMetricFlowTriggersQueryParamFieldsFlow> fieldsFlow) {
            Utils.checkNotNull(fieldsFlow, "fieldsFlow");
            this.fieldsFlow = Optional.ofNullable(fieldsFlow);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsFlow(Optional<? extends List<GetMetricFlowTriggersQueryParamFieldsFlow>> fieldsFlow) {
            Utils.checkNotNull(fieldsFlow, "fieldsFlow");
            this.fieldsFlow = fieldsFlow;
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
        
        public GetMetricFlowTriggersRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new GetMetricFlowTriggersRequest(
                id,
                fieldsFlow,
                revision);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}
