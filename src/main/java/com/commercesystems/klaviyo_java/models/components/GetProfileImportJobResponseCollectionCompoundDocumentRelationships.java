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
import java.util.Objects;
import java.util.Optional;


public class GetProfileImportJobResponseCollectionCompoundDocumentRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lists")
    private Optional<? extends GetProfileImportJobResponseCollectionCompoundDocumentLists> lists;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profiles")
    private Optional<? extends GetProfileImportJobResponseCollectionCompoundDocumentProfiles> profiles;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("import-errors")
    private Optional<? extends ImportErrors> importErrors;

    @JsonCreator
    public GetProfileImportJobResponseCollectionCompoundDocumentRelationships(
            @JsonProperty("lists") Optional<? extends GetProfileImportJobResponseCollectionCompoundDocumentLists> lists,
            @JsonProperty("profiles") Optional<? extends GetProfileImportJobResponseCollectionCompoundDocumentProfiles> profiles,
            @JsonProperty("import-errors") Optional<? extends ImportErrors> importErrors) {
        Utils.checkNotNull(lists, "lists");
        Utils.checkNotNull(profiles, "profiles");
        Utils.checkNotNull(importErrors, "importErrors");
        this.lists = lists;
        this.profiles = profiles;
        this.importErrors = importErrors;
    }
    
    public GetProfileImportJobResponseCollectionCompoundDocumentRelationships() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetProfileImportJobResponseCollectionCompoundDocumentLists> lists() {
        return (Optional<GetProfileImportJobResponseCollectionCompoundDocumentLists>) lists;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetProfileImportJobResponseCollectionCompoundDocumentProfiles> profiles() {
        return (Optional<GetProfileImportJobResponseCollectionCompoundDocumentProfiles>) profiles;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ImportErrors> importErrors() {
        return (Optional<ImportErrors>) importErrors;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetProfileImportJobResponseCollectionCompoundDocumentRelationships withLists(GetProfileImportJobResponseCollectionCompoundDocumentLists lists) {
        Utils.checkNotNull(lists, "lists");
        this.lists = Optional.ofNullable(lists);
        return this;
    }

    public GetProfileImportJobResponseCollectionCompoundDocumentRelationships withLists(Optional<? extends GetProfileImportJobResponseCollectionCompoundDocumentLists> lists) {
        Utils.checkNotNull(lists, "lists");
        this.lists = lists;
        return this;
    }

    public GetProfileImportJobResponseCollectionCompoundDocumentRelationships withProfiles(GetProfileImportJobResponseCollectionCompoundDocumentProfiles profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = Optional.ofNullable(profiles);
        return this;
    }

    public GetProfileImportJobResponseCollectionCompoundDocumentRelationships withProfiles(Optional<? extends GetProfileImportJobResponseCollectionCompoundDocumentProfiles> profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = profiles;
        return this;
    }

    public GetProfileImportJobResponseCollectionCompoundDocumentRelationships withImportErrors(ImportErrors importErrors) {
        Utils.checkNotNull(importErrors, "importErrors");
        this.importErrors = Optional.ofNullable(importErrors);
        return this;
    }

    public GetProfileImportJobResponseCollectionCompoundDocumentRelationships withImportErrors(Optional<? extends ImportErrors> importErrors) {
        Utils.checkNotNull(importErrors, "importErrors");
        this.importErrors = importErrors;
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
        GetProfileImportJobResponseCollectionCompoundDocumentRelationships other = (GetProfileImportJobResponseCollectionCompoundDocumentRelationships) o;
        return 
            Objects.deepEquals(this.lists, other.lists) &&
            Objects.deepEquals(this.profiles, other.profiles) &&
            Objects.deepEquals(this.importErrors, other.importErrors);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            lists,
            profiles,
            importErrors);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetProfileImportJobResponseCollectionCompoundDocumentRelationships.class,
                "lists", lists,
                "profiles", profiles,
                "importErrors", importErrors);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetProfileImportJobResponseCollectionCompoundDocumentLists> lists = Optional.empty();
 
        private Optional<? extends GetProfileImportJobResponseCollectionCompoundDocumentProfiles> profiles = Optional.empty();
 
        private Optional<? extends ImportErrors> importErrors = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder lists(GetProfileImportJobResponseCollectionCompoundDocumentLists lists) {
            Utils.checkNotNull(lists, "lists");
            this.lists = Optional.ofNullable(lists);
            return this;
        }

        public Builder lists(Optional<? extends GetProfileImportJobResponseCollectionCompoundDocumentLists> lists) {
            Utils.checkNotNull(lists, "lists");
            this.lists = lists;
            return this;
        }

        public Builder profiles(GetProfileImportJobResponseCollectionCompoundDocumentProfiles profiles) {
            Utils.checkNotNull(profiles, "profiles");
            this.profiles = Optional.ofNullable(profiles);
            return this;
        }

        public Builder profiles(Optional<? extends GetProfileImportJobResponseCollectionCompoundDocumentProfiles> profiles) {
            Utils.checkNotNull(profiles, "profiles");
            this.profiles = profiles;
            return this;
        }

        public Builder importErrors(ImportErrors importErrors) {
            Utils.checkNotNull(importErrors, "importErrors");
            this.importErrors = Optional.ofNullable(importErrors);
            return this;
        }

        public Builder importErrors(Optional<? extends ImportErrors> importErrors) {
            Utils.checkNotNull(importErrors, "importErrors");
            this.importErrors = importErrors;
            return this;
        }
        
        public GetProfileImportJobResponseCollectionCompoundDocumentRelationships build() {
            return new GetProfileImportJobResponseCollectionCompoundDocumentRelationships(
                lists,
                profiles,
                importErrors);
        }
    }
}

