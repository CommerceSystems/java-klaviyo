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


public class GetCreateCategoriesJobsRequest {

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[catalog-category-bulk-create-job]")
    private Optional<? extends List<FieldsCatalogCategoryBulkCreateJob>> fieldsCatalogCategoryBulkCreateJob;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`status`: `equals`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=filter")
    private Optional<String> filter;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page[cursor]")
    private Optional<String> pageCursor;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @JsonCreator
    public GetCreateCategoriesJobsRequest(
            Optional<? extends List<FieldsCatalogCategoryBulkCreateJob>> fieldsCatalogCategoryBulkCreateJob,
            Optional<String> filter,
            Optional<String> pageCursor,
            String revision) {
        Utils.checkNotNull(fieldsCatalogCategoryBulkCreateJob, "fieldsCatalogCategoryBulkCreateJob");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(pageCursor, "pageCursor");
        Utils.checkNotNull(revision, "revision");
        this.fieldsCatalogCategoryBulkCreateJob = fieldsCatalogCategoryBulkCreateJob;
        this.filter = filter;
        this.pageCursor = pageCursor;
        this.revision = revision;
    }
    
    public GetCreateCategoriesJobsRequest(
            String revision) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), revision);
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<FieldsCatalogCategoryBulkCreateJob>> fieldsCatalogCategoryBulkCreateJob() {
        return (Optional<List<FieldsCatalogCategoryBulkCreateJob>>) fieldsCatalogCategoryBulkCreateJob;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`status`: `equals`
     */
    @JsonIgnore
    public Optional<String> filter() {
        return filter;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    @JsonIgnore
    public Optional<String> pageCursor() {
        return pageCursor;
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
    public GetCreateCategoriesJobsRequest withFieldsCatalogCategoryBulkCreateJob(List<FieldsCatalogCategoryBulkCreateJob> fieldsCatalogCategoryBulkCreateJob) {
        Utils.checkNotNull(fieldsCatalogCategoryBulkCreateJob, "fieldsCatalogCategoryBulkCreateJob");
        this.fieldsCatalogCategoryBulkCreateJob = Optional.ofNullable(fieldsCatalogCategoryBulkCreateJob);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetCreateCategoriesJobsRequest withFieldsCatalogCategoryBulkCreateJob(Optional<? extends List<FieldsCatalogCategoryBulkCreateJob>> fieldsCatalogCategoryBulkCreateJob) {
        Utils.checkNotNull(fieldsCatalogCategoryBulkCreateJob, "fieldsCatalogCategoryBulkCreateJob");
        this.fieldsCatalogCategoryBulkCreateJob = fieldsCatalogCategoryBulkCreateJob;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`status`: `equals`
     */
    public GetCreateCategoriesJobsRequest withFilter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`status`: `equals`
     */
    public GetCreateCategoriesJobsRequest withFilter(Optional<String> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    public GetCreateCategoriesJobsRequest withPageCursor(String pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = Optional.ofNullable(pageCursor);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    public GetCreateCategoriesJobsRequest withPageCursor(Optional<String> pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = pageCursor;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public GetCreateCategoriesJobsRequest withRevision(String revision) {
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
        GetCreateCategoriesJobsRequest other = (GetCreateCategoriesJobsRequest) o;
        return 
            Objects.deepEquals(this.fieldsCatalogCategoryBulkCreateJob, other.fieldsCatalogCategoryBulkCreateJob) &&
            Objects.deepEquals(this.filter, other.filter) &&
            Objects.deepEquals(this.pageCursor, other.pageCursor) &&
            Objects.deepEquals(this.revision, other.revision);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            fieldsCatalogCategoryBulkCreateJob,
            filter,
            pageCursor,
            revision);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCreateCategoriesJobsRequest.class,
                "fieldsCatalogCategoryBulkCreateJob", fieldsCatalogCategoryBulkCreateJob,
                "filter", filter,
                "pageCursor", pageCursor,
                "revision", revision);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<FieldsCatalogCategoryBulkCreateJob>> fieldsCatalogCategoryBulkCreateJob = Optional.empty();
 
        private Optional<String> filter = Optional.empty();
 
        private Optional<String> pageCursor = Optional.empty();
 
        private String revision;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCatalogCategoryBulkCreateJob(List<FieldsCatalogCategoryBulkCreateJob> fieldsCatalogCategoryBulkCreateJob) {
            Utils.checkNotNull(fieldsCatalogCategoryBulkCreateJob, "fieldsCatalogCategoryBulkCreateJob");
            this.fieldsCatalogCategoryBulkCreateJob = Optional.ofNullable(fieldsCatalogCategoryBulkCreateJob);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsCatalogCategoryBulkCreateJob(Optional<? extends List<FieldsCatalogCategoryBulkCreateJob>> fieldsCatalogCategoryBulkCreateJob) {
            Utils.checkNotNull(fieldsCatalogCategoryBulkCreateJob, "fieldsCatalogCategoryBulkCreateJob");
            this.fieldsCatalogCategoryBulkCreateJob = fieldsCatalogCategoryBulkCreateJob;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`status`: `equals`
         */
        public Builder filter(String filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`status`: `equals`
         */
        public Builder filter(Optional<String> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
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
         * API endpoint revision (format: YYYY-MM-DD[.suffix])
         */
        public Builder revision(String revision) {
            Utils.checkNotNull(revision, "revision");
            this.revision = revision;
            return this;
        }
        
        public GetCreateCategoriesJobsRequest build() {
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new GetCreateCategoriesJobsRequest(
                fieldsCatalogCategoryBulkCreateJob,
                filter,
                pageCursor,
                revision);
        }

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}

