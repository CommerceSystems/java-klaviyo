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


public class GetCatalogVariantRequest {

    /**
     * The catalog variant ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    private String id;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[catalog-variant]")
    private Optional<? extends List<GetCatalogVariantQueryParamFieldsCatalogVariant>> fieldsCatalogVariant;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @JsonCreator
    public GetCatalogVariantRequest(
            String id,
            Optional<? extends List<GetCatalogVariantQueryParamFieldsCatalogVariant>> fieldsCatalogVariant,
            String revision) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(fieldsCatalogVariant, "fieldsCatalogVariant");
        Utils.checkNotNull(revision, "revision");
        this.id = id;
        this.fieldsCatalogVariant = fieldsCatalogVariant;
        this.revision = revision;
    }
    
    public GetCatalogVariantRequest(
            String id,
            String revision) {
        this(id, Optional.empty(), revision);
    }

    /**
     * The catalog variant ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
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
    public Optional<List<GetCatalogVariantQueryParamFieldsCatalogVariant>> fieldsCatalogVariant() {
        return (Optional<List<GetCatalogVariantQueryParamFieldsCatalogVariant>>) fieldsCatalogVariant;
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
     * The catalog variant ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
     */
    public GetCatalogVariantRequest withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCatalogVariantRequest withFieldsCatalogVariant(List<GetCatalogVariantQueryParamFieldsCatalogVariant> fieldsCatalogVariant) {
        Utils.checkNotNull(fieldsCatalogVariant, "fieldsCatalogVariant");
        this.fieldsCatalogVariant = Optional.ofNullable(fieldsCatalogVariant);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCatalogVariantRequest withFieldsCatalogVariant(Optional<? extends List<GetCatalogVariantQueryParamFieldsCatalogVariant>> fieldsCatalogVariant) {
        Utils.checkNotNull(fieldsCatalogVariant, "fieldsCatalogVariant");
        this.fieldsCatalogVariant = fieldsCatalogVariant;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public GetCatalogVariantRequest withRevision(String revision) {
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
        GetCatalogVariantRequest other = (GetCatalogVariantRequest) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.fieldsCatalogVariant, other.fieldsCatalogVariant) &&
            Objects.deepEquals(this.revision, other.revision);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            fieldsCatalogVariant,
            revision);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCatalogVariantRequest.class,
                "id", id,
                "fieldsCatalogVariant", fieldsCatalogVariant,
                "revision", revision);
    }
    
    public final static class Builder {
 
        private String id;
 
        private Optional<? extends List<GetCatalogVariantQueryParamFieldsCatalogVariant>> fieldsCatalogVariant = Optional.empty();
 
        private String revision;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The catalog variant ID is a compound ID (string), with format: `{integration}:::{catalog}:::{external_id}`. Currently, the only supported integration type is `$custom`, and the only supported catalog is `$default`.
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCatalogVariant(List<GetCatalogVariantQueryParamFieldsCatalogVariant> fieldsCatalogVariant) {
            Utils.checkNotNull(fieldsCatalogVariant, "fieldsCatalogVariant");
            this.fieldsCatalogVariant = Optional.ofNullable(fieldsCatalogVariant);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCatalogVariant(Optional<? extends List<GetCatalogVariantQueryParamFieldsCatalogVariant>> fieldsCatalogVariant) {
            Utils.checkNotNull(fieldsCatalogVariant, "fieldsCatalogVariant");
            this.fieldsCatalogVariant = fieldsCatalogVariant;
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
        
        public GetCatalogVariantRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new GetCatalogVariantRequest(
                id,
                fieldsCatalogVariant,
                revision);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

