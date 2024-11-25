/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class GetFlowActionResponseCompoundDocument {

    @JsonProperty("data")
    private GetFlowActionResponseCompoundDocumentData data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("included")
    private Optional<? extends List<GetFlowActionResponseCompoundDocumentIncluded>> included;

    @JsonCreator
    public GetFlowActionResponseCompoundDocument(
            @JsonProperty("data") GetFlowActionResponseCompoundDocumentData data,
            @JsonProperty("included") Optional<? extends List<GetFlowActionResponseCompoundDocumentIncluded>> included) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(included, "included");
        this.data = data;
        this.included = included;
    }
    
    public GetFlowActionResponseCompoundDocument(
            GetFlowActionResponseCompoundDocumentData data) {
        this(data, Optional.empty());
    }

    @JsonIgnore
    public GetFlowActionResponseCompoundDocumentData data() {
        return data;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetFlowActionResponseCompoundDocumentIncluded>> included() {
        return (Optional<List<GetFlowActionResponseCompoundDocumentIncluded>>) included;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetFlowActionResponseCompoundDocument withData(GetFlowActionResponseCompoundDocumentData data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public GetFlowActionResponseCompoundDocument withIncluded(List<GetFlowActionResponseCompoundDocumentIncluded> included) {
        Utils.checkNotNull(included, "included");
        this.included = Optional.ofNullable(included);
        return this;
    }

    public GetFlowActionResponseCompoundDocument withIncluded(Optional<? extends List<GetFlowActionResponseCompoundDocumentIncluded>> included) {
        Utils.checkNotNull(included, "included");
        this.included = included;
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
        GetFlowActionResponseCompoundDocument other = (GetFlowActionResponseCompoundDocument) o;
        return 
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.included, other.included);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data,
            included);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetFlowActionResponseCompoundDocument.class,
                "data", data,
                "included", included);
    }
    
    public final static class Builder {
 
        private GetFlowActionResponseCompoundDocumentData data;
 
        private Optional<? extends List<GetFlowActionResponseCompoundDocumentIncluded>> included = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(GetFlowActionResponseCompoundDocumentData data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder included(List<GetFlowActionResponseCompoundDocumentIncluded> included) {
            Utils.checkNotNull(included, "included");
            this.included = Optional.ofNullable(included);
            return this;
        }

        public Builder included(Optional<? extends List<GetFlowActionResponseCompoundDocumentIncluded>> included) {
            Utils.checkNotNull(included, "included");
            this.included = included;
            return this;
        }
        
        public GetFlowActionResponseCompoundDocument build() {
            return new GetFlowActionResponseCompoundDocument(
                data,
                included);
        }
    }
}

