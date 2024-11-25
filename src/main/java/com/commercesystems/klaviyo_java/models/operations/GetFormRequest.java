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


public class GetFormRequest {

    /**
     * The ID of the form
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[form-version]")
    private Optional<? extends List<FieldsFormVersion>> fieldsFormVersion;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[form]")
    private Optional<? extends List<QueryParamFieldsForm>> fieldsForm;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=include")
    private Optional<? extends List<GetFormQueryParamInclude>> include;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @JsonCreator
    public GetFormRequest(
            String id,
            Optional<? extends List<FieldsFormVersion>> fieldsFormVersion,
            Optional<? extends List<QueryParamFieldsForm>> fieldsForm,
            Optional<? extends List<GetFormQueryParamInclude>> include,
            String revision) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(fieldsFormVersion, "fieldsFormVersion");
        Utils.checkNotNull(fieldsForm, "fieldsForm");
        Utils.checkNotNull(include, "include");
        Utils.checkNotNull(revision, "revision");
        this.id = id;
        this.fieldsFormVersion = fieldsFormVersion;
        this.fieldsForm = fieldsForm;
        this.include = include;
        this.revision = revision;
    }
    
    public GetFormRequest(
            String id,
            String revision) {
        this(id, Optional.empty(), Optional.empty(), Optional.empty(), revision);
    }

    /**
     * The ID of the form
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
    public Optional<List<FieldsFormVersion>> fieldsFormVersion() {
        return (Optional<List<FieldsFormVersion>>) fieldsFormVersion;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<QueryParamFieldsForm>> fieldsForm() {
        return (Optional<List<QueryParamFieldsForm>>) fieldsForm;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetFormQueryParamInclude>> include() {
        return (Optional<List<GetFormQueryParamInclude>>) include;
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
     * The ID of the form
     */
    public GetFormRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetFormRequest withFieldsFormVersion(List<FieldsFormVersion> fieldsFormVersion) {
        Utils.checkNotNull(fieldsFormVersion, "fieldsFormVersion");
        this.fieldsFormVersion = Optional.ofNullable(fieldsFormVersion);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetFormRequest withFieldsFormVersion(Optional<? extends List<FieldsFormVersion>> fieldsFormVersion) {
        Utils.checkNotNull(fieldsFormVersion, "fieldsFormVersion");
        this.fieldsFormVersion = fieldsFormVersion;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetFormRequest withFieldsForm(List<QueryParamFieldsForm> fieldsForm) {
        Utils.checkNotNull(fieldsForm, "fieldsForm");
        this.fieldsForm = Optional.ofNullable(fieldsForm);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetFormRequest withFieldsForm(Optional<? extends List<QueryParamFieldsForm>> fieldsForm) {
        Utils.checkNotNull(fieldsForm, "fieldsForm");
        this.fieldsForm = fieldsForm;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    public GetFormRequest withInclude(List<GetFormQueryParamInclude> include) {
        Utils.checkNotNull(include, "include");
        this.include = Optional.ofNullable(include);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    public GetFormRequest withInclude(Optional<? extends List<GetFormQueryParamInclude>> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public GetFormRequest withRevision(String revision) {
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
        GetFormRequest other = (GetFormRequest) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.fieldsFormVersion, other.fieldsFormVersion) &&
            Objects.deepEquals(this.fieldsForm, other.fieldsForm) &&
            Objects.deepEquals(this.include, other.include) &&
            Objects.deepEquals(this.revision, other.revision);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            fieldsFormVersion,
            fieldsForm,
            include,
            revision);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetFormRequest.class,
                "id", id,
                "fieldsFormVersion", fieldsFormVersion,
                "fieldsForm", fieldsForm,
                "include", include,
                "revision", revision);
    }
    
    public final static class Builder {
 
        private String id;
 
        private Optional<? extends List<FieldsFormVersion>> fieldsFormVersion = Optional.empty();
 
        private Optional<? extends List<QueryParamFieldsForm>> fieldsForm = Optional.empty();
 
        private Optional<? extends List<GetFormQueryParamInclude>> include = Optional.empty();
 
        private String revision;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the form
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsFormVersion(List<FieldsFormVersion> fieldsFormVersion) {
            Utils.checkNotNull(fieldsFormVersion, "fieldsFormVersion");
            this.fieldsFormVersion = Optional.ofNullable(fieldsFormVersion);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsFormVersion(Optional<? extends List<FieldsFormVersion>> fieldsFormVersion) {
            Utils.checkNotNull(fieldsFormVersion, "fieldsFormVersion");
            this.fieldsFormVersion = fieldsFormVersion;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsForm(List<QueryParamFieldsForm> fieldsForm) {
            Utils.checkNotNull(fieldsForm, "fieldsForm");
            this.fieldsForm = Optional.ofNullable(fieldsForm);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsForm(Optional<? extends List<QueryParamFieldsForm>> fieldsForm) {
            Utils.checkNotNull(fieldsForm, "fieldsForm");
            this.fieldsForm = fieldsForm;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
         */
        public Builder include(List<GetFormQueryParamInclude> include) {
            Utils.checkNotNull(include, "include");
            this.include = Optional.ofNullable(include);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
         */
        public Builder include(Optional<? extends List<GetFormQueryParamInclude>> include) {
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
        
        public GetFormRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new GetFormRequest(
                id,
                fieldsFormVersion,
                fieldsForm,
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
