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


public class GetProfileImportJobResponseCompoundDocument {

    @JsonProperty("data")
    private GetProfileImportJobResponseCompoundDocumentData data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("included")
    private Optional<? extends List<ListResponseObjectResource>> included;

    @JsonCreator
    public GetProfileImportJobResponseCompoundDocument(
            @JsonProperty("data") GetProfileImportJobResponseCompoundDocumentData data,
            @JsonProperty("included") Optional<? extends List<ListResponseObjectResource>> included) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(included, "included");
        this.data = data;
        this.included = included;
    }
    
    public GetProfileImportJobResponseCompoundDocument(
            GetProfileImportJobResponseCompoundDocumentData data) {
        this(data, Optional.empty());
    }

    @JsonIgnore
    public GetProfileImportJobResponseCompoundDocumentData data() {
        return data;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ListResponseObjectResource>> included() {
        return (Optional<List<ListResponseObjectResource>>) included;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetProfileImportJobResponseCompoundDocument withData(GetProfileImportJobResponseCompoundDocumentData data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public GetProfileImportJobResponseCompoundDocument withIncluded(List<ListResponseObjectResource> included) {
        Utils.checkNotNull(included, "included");
        this.included = Optional.ofNullable(included);
        return this;
    }

    public GetProfileImportJobResponseCompoundDocument withIncluded(Optional<? extends List<ListResponseObjectResource>> included) {
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
        GetProfileImportJobResponseCompoundDocument other = (GetProfileImportJobResponseCompoundDocument) o;
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
        return Utils.toString(GetProfileImportJobResponseCompoundDocument.class,
                "data", data,
                "included", included);
    }
    
    public final static class Builder {
 
        private GetProfileImportJobResponseCompoundDocumentData data;
 
        private Optional<? extends List<ListResponseObjectResource>> included = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(GetProfileImportJobResponseCompoundDocumentData data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder included(List<ListResponseObjectResource> included) {
            Utils.checkNotNull(included, "included");
            this.included = Optional.ofNullable(included);
            return this;
        }

        public Builder included(Optional<? extends List<ListResponseObjectResource>> included) {
            Utils.checkNotNull(included, "included");
            this.included = included;
            return this;
        }
        
        public GetProfileImportJobResponseCompoundDocument build() {
            return new GetProfileImportJobResponseCompoundDocument(
                data,
                included);
        }
    }
}

