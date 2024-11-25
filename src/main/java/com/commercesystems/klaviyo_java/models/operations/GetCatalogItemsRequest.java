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


public class GetCatalogItemsRequest {

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[catalog-item]")
    private Optional<? extends List<FieldsCatalogItem>> fieldsCatalogItem;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[catalog-variant]")
    private Optional<? extends List<FieldsCatalogVariant>> fieldsCatalogVariant;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`ids`: `any`&lt;br&gt;`category.id`: `equals`&lt;br&gt;`title`: `contains`&lt;br&gt;`published`: `equals`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=filter")
    private Optional<String> filter;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=include")
    private Optional<? extends List<GetCatalogItemsQueryParamInclude>> include;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page[cursor]")
    private Optional<String> pageCursor;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sorting
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    private Optional<? extends QueryParamSort> sort;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @JsonCreator
    public GetCatalogItemsRequest(
            Optional<? extends List<FieldsCatalogItem>> fieldsCatalogItem,
            Optional<? extends List<FieldsCatalogVariant>> fieldsCatalogVariant,
            Optional<String> filter,
            Optional<? extends List<GetCatalogItemsQueryParamInclude>> include,
            Optional<String> pageCursor,
            Optional<? extends QueryParamSort> sort,
            String revision) {
        Utils.checkNotNull(fieldsCatalogItem, "fieldsCatalogItem");
        Utils.checkNotNull(fieldsCatalogVariant, "fieldsCatalogVariant");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(include, "include");
        Utils.checkNotNull(pageCursor, "pageCursor");
        Utils.checkNotNull(sort, "sort");
        Utils.checkNotNull(revision, "revision");
        this.fieldsCatalogItem = fieldsCatalogItem;
        this.fieldsCatalogVariant = fieldsCatalogVariant;
        this.filter = filter;
        this.include = include;
        this.pageCursor = pageCursor;
        this.sort = sort;
        this.revision = revision;
    }
    
    public GetCatalogItemsRequest(
            String revision) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), revision);
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<FieldsCatalogItem>> fieldsCatalogItem() {
        return (Optional<List<FieldsCatalogItem>>) fieldsCatalogItem;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<FieldsCatalogVariant>> fieldsCatalogVariant() {
        return (Optional<List<FieldsCatalogVariant>>) fieldsCatalogVariant;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`ids`: `any`&lt;br&gt;`category.id`: `equals`&lt;br&gt;`title`: `contains`&lt;br&gt;`published`: `equals`
     */
    @JsonIgnore
    public Optional<String> filter() {
        return filter;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetCatalogItemsQueryParamInclude>> include() {
        return (Optional<List<GetCatalogItemsQueryParamInclude>>) include;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    @JsonIgnore
    public Optional<String> pageCursor() {
        return pageCursor;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sorting
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<QueryParamSort> sort() {
        return (Optional<QueryParamSort>) sort;
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
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCatalogItemsRequest withFieldsCatalogItem(List<FieldsCatalogItem> fieldsCatalogItem) {
        Utils.checkNotNull(fieldsCatalogItem, "fieldsCatalogItem");
        this.fieldsCatalogItem = Optional.ofNullable(fieldsCatalogItem);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCatalogItemsRequest withFieldsCatalogItem(Optional<? extends List<FieldsCatalogItem>> fieldsCatalogItem) {
        Utils.checkNotNull(fieldsCatalogItem, "fieldsCatalogItem");
        this.fieldsCatalogItem = fieldsCatalogItem;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCatalogItemsRequest withFieldsCatalogVariant(List<FieldsCatalogVariant> fieldsCatalogVariant) {
        Utils.checkNotNull(fieldsCatalogVariant, "fieldsCatalogVariant");
        this.fieldsCatalogVariant = Optional.ofNullable(fieldsCatalogVariant);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCatalogItemsRequest withFieldsCatalogVariant(Optional<? extends List<FieldsCatalogVariant>> fieldsCatalogVariant) {
        Utils.checkNotNull(fieldsCatalogVariant, "fieldsCatalogVariant");
        this.fieldsCatalogVariant = fieldsCatalogVariant;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`ids`: `any`&lt;br&gt;`category.id`: `equals`&lt;br&gt;`title`: `contains`&lt;br&gt;`published`: `equals`
     */
    public GetCatalogItemsRequest withFilter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`ids`: `any`&lt;br&gt;`category.id`: `equals`&lt;br&gt;`title`: `contains`&lt;br&gt;`published`: `equals`
     */
    public GetCatalogItemsRequest withFilter(Optional<String> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    public GetCatalogItemsRequest withInclude(List<GetCatalogItemsQueryParamInclude> include) {
        Utils.checkNotNull(include, "include");
        this.include = Optional.ofNullable(include);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
     */
    public GetCatalogItemsRequest withInclude(Optional<? extends List<GetCatalogItemsQueryParamInclude>> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    public GetCatalogItemsRequest withPageCursor(String pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = Optional.ofNullable(pageCursor);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    public GetCatalogItemsRequest withPageCursor(Optional<String> pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = pageCursor;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sorting
     */
    public GetCatalogItemsRequest withSort(QueryParamSort sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.ofNullable(sort);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sorting
     */
    public GetCatalogItemsRequest withSort(Optional<? extends QueryParamSort> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public GetCatalogItemsRequest withRevision(String revision) {
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
        GetCatalogItemsRequest other = (GetCatalogItemsRequest) o;
        return 
            Objects.deepEquals(this.fieldsCatalogItem, other.fieldsCatalogItem) &&
            Objects.deepEquals(this.fieldsCatalogVariant, other.fieldsCatalogVariant) &&
            Objects.deepEquals(this.filter, other.filter) &&
            Objects.deepEquals(this.include, other.include) &&
            Objects.deepEquals(this.pageCursor, other.pageCursor) &&
            Objects.deepEquals(this.sort, other.sort) &&
            Objects.deepEquals(this.revision, other.revision);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            fieldsCatalogItem,
            fieldsCatalogVariant,
            filter,
            include,
            pageCursor,
            sort,
            revision);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCatalogItemsRequest.class,
                "fieldsCatalogItem", fieldsCatalogItem,
                "fieldsCatalogVariant", fieldsCatalogVariant,
                "filter", filter,
                "include", include,
                "pageCursor", pageCursor,
                "sort", sort,
                "revision", revision);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<FieldsCatalogItem>> fieldsCatalogItem = Optional.empty();
 
        private Optional<? extends List<FieldsCatalogVariant>> fieldsCatalogVariant = Optional.empty();
 
        private Optional<String> filter = Optional.empty();
 
        private Optional<? extends List<GetCatalogItemsQueryParamInclude>> include = Optional.empty();
 
        private Optional<String> pageCursor = Optional.empty();
 
        private Optional<? extends QueryParamSort> sort = Optional.empty();
 
        private String revision;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCatalogItem(List<FieldsCatalogItem> fieldsCatalogItem) {
            Utils.checkNotNull(fieldsCatalogItem, "fieldsCatalogItem");
            this.fieldsCatalogItem = Optional.ofNullable(fieldsCatalogItem);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCatalogItem(Optional<? extends List<FieldsCatalogItem>> fieldsCatalogItem) {
            Utils.checkNotNull(fieldsCatalogItem, "fieldsCatalogItem");
            this.fieldsCatalogItem = fieldsCatalogItem;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCatalogVariant(List<FieldsCatalogVariant> fieldsCatalogVariant) {
            Utils.checkNotNull(fieldsCatalogVariant, "fieldsCatalogVariant");
            this.fieldsCatalogVariant = Optional.ofNullable(fieldsCatalogVariant);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCatalogVariant(Optional<? extends List<FieldsCatalogVariant>> fieldsCatalogVariant) {
            Utils.checkNotNull(fieldsCatalogVariant, "fieldsCatalogVariant");
            this.fieldsCatalogVariant = fieldsCatalogVariant;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`ids`: `any`&lt;br&gt;`category.id`: `equals`&lt;br&gt;`title`: `contains`&lt;br&gt;`published`: `equals`
         */
        public Builder filter(String filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`ids`: `any`&lt;br&gt;`category.id`: `equals`&lt;br&gt;`title`: `contains`&lt;br&gt;`published`: `equals`
         */
        public Builder filter(Optional<String> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
         */
        public Builder include(List<GetCatalogItemsQueryParamInclude> include) {
            Utils.checkNotNull(include, "include");
            this.include = Optional.ofNullable(include);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships
         */
        public Builder include(Optional<? extends List<GetCatalogItemsQueryParamInclude>> include) {
            Utils.checkNotNull(include, "include");
            this.include = include;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
         */
        public Builder pageCursor(String pageCursor) {
            Utils.checkNotNull(pageCursor, "pageCursor");
            this.pageCursor = Optional.ofNullable(pageCursor);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
         */
        public Builder pageCursor(Optional<String> pageCursor) {
            Utils.checkNotNull(pageCursor, "pageCursor");
            this.pageCursor = pageCursor;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sorting
         */
        public Builder sort(QueryParamSort sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = Optional.ofNullable(sort);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sorting
         */
        public Builder sort(Optional<? extends QueryParamSort> sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = sort;
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
        
        public GetCatalogItemsRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new GetCatalogItemsRequest(
                fieldsCatalogItem,
                fieldsCatalogVariant,
                filter,
                include,
                pageCursor,
                sort,
                revision);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

