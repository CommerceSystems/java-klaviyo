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


public class GetProfileImportJobResponseCompoundDocumentRelationships {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lists")
    private Optional<? extends GetProfileImportJobResponseCompoundDocumentLists> lists;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("profiles")
    private Optional<? extends GetProfileImportJobResponseCompoundDocumentProfiles> profiles;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("import-errors")
    private Optional<? extends GetProfileImportJobResponseCompoundDocumentImportErrors> importErrors;

    @JsonCreator
    public GetProfileImportJobResponseCompoundDocumentRelationships(
            @JsonProperty("lists") Optional<? extends GetProfileImportJobResponseCompoundDocumentLists> lists,
            @JsonProperty("profiles") Optional<? extends GetProfileImportJobResponseCompoundDocumentProfiles> profiles,
            @JsonProperty("import-errors") Optional<? extends GetProfileImportJobResponseCompoundDocumentImportErrors> importErrors) {
        Utils.checkNotNull(lists, "lists");
        Utils.checkNotNull(profiles, "profiles");
        Utils.checkNotNull(importErrors, "importErrors");
        this.lists = lists;
        this.profiles = profiles;
        this.importErrors = importErrors;
    }
    
    public GetProfileImportJobResponseCompoundDocumentRelationships() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetProfileImportJobResponseCompoundDocumentLists> lists() {
        return (Optional<GetProfileImportJobResponseCompoundDocumentLists>) lists;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetProfileImportJobResponseCompoundDocumentProfiles> profiles() {
        return (Optional<GetProfileImportJobResponseCompoundDocumentProfiles>) profiles;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetProfileImportJobResponseCompoundDocumentImportErrors> importErrors() {
        return (Optional<GetProfileImportJobResponseCompoundDocumentImportErrors>) importErrors;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetProfileImportJobResponseCompoundDocumentRelationships withLists(GetProfileImportJobResponseCompoundDocumentLists lists) {
        Utils.checkNotNull(lists, "lists");
        this.lists = Optional.ofNullable(lists);
        return this;
    }

    public GetProfileImportJobResponseCompoundDocumentRelationships withLists(Optional<? extends GetProfileImportJobResponseCompoundDocumentLists> lists) {
        Utils.checkNotNull(lists, "lists");
        this.lists = lists;
        return this;
    }

    public GetProfileImportJobResponseCompoundDocumentRelationships withProfiles(GetProfileImportJobResponseCompoundDocumentProfiles profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = Optional.ofNullable(profiles);
        return this;
    }

    public GetProfileImportJobResponseCompoundDocumentRelationships withProfiles(Optional<? extends GetProfileImportJobResponseCompoundDocumentProfiles> profiles) {
        Utils.checkNotNull(profiles, "profiles");
        this.profiles = profiles;
        return this;
    }

    public GetProfileImportJobResponseCompoundDocumentRelationships withImportErrors(GetProfileImportJobResponseCompoundDocumentImportErrors importErrors) {
        Utils.checkNotNull(importErrors, "importErrors");
        this.importErrors = Optional.ofNullable(importErrors);
        return this;
    }

    public GetProfileImportJobResponseCompoundDocumentRelationships withImportErrors(Optional<? extends GetProfileImportJobResponseCompoundDocumentImportErrors> importErrors) {
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
        GetProfileImportJobResponseCompoundDocumentRelationships other = (GetProfileImportJobResponseCompoundDocumentRelationships) o;
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
        return Utils.toString(GetProfileImportJobResponseCompoundDocumentRelationships.class,
                "lists", lists,
                "profiles", profiles,
                "importErrors", importErrors);
    }
    
    public final static class Builder {
 
        private Optional<? extends GetProfileImportJobResponseCompoundDocumentLists> lists = Optional.empty();
 
        private Optional<? extends GetProfileImportJobResponseCompoundDocumentProfiles> profiles = Optional.empty();
 
        private Optional<? extends GetProfileImportJobResponseCompoundDocumentImportErrors> importErrors = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder lists(GetProfileImportJobResponseCompoundDocumentLists lists) {
            Utils.checkNotNull(lists, "lists");
            this.lists = Optional.ofNullable(lists);
            return this;
        }

        public Builder lists(Optional<? extends GetProfileImportJobResponseCompoundDocumentLists> lists) {
            Utils.checkNotNull(lists, "lists");
            this.lists = lists;
            return this;
        }

        public Builder profiles(GetProfileImportJobResponseCompoundDocumentProfiles profiles) {
            Utils.checkNotNull(profiles, "profiles");
            this.profiles = Optional.ofNullable(profiles);
            return this;
        }

        public Builder profiles(Optional<? extends GetProfileImportJobResponseCompoundDocumentProfiles> profiles) {
            Utils.checkNotNull(profiles, "profiles");
            this.profiles = profiles;
            return this;
        }

        public Builder importErrors(GetProfileImportJobResponseCompoundDocumentImportErrors importErrors) {
            Utils.checkNotNull(importErrors, "importErrors");
            this.importErrors = Optional.ofNullable(importErrors);
            return this;
        }

        public Builder importErrors(Optional<? extends GetProfileImportJobResponseCompoundDocumentImportErrors> importErrors) {
            Utils.checkNotNull(importErrors, "importErrors");
            this.importErrors = importErrors;
            return this;
        }
        
        public GetProfileImportJobResponseCompoundDocumentRelationships build() {
            return new GetProfileImportJobResponseCompoundDocumentRelationships(
                lists,
                profiles,
                importErrors);
        }
    }
}
