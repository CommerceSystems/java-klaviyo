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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class GetBulkImportProfilesJobsRequest {

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=fields[profile-bulk-import-job]")
    private Optional<? extends List<FieldsProfileBulkImportJob>> fieldsProfileBulkImportJob;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`status`: `any`, `equals`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=filter")
    private Optional<String> filter;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page[cursor]")
    private Optional<String> pageCursor;

    /**
     * Default: 20. Min: 1. Max: 100.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page[size]")
    private Optional<Long> pageSize;

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sorting
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    private Optional<? extends GetBulkImportProfilesJobsQueryParamSort> sort;

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=revision")
    private String revision;

    @JsonCreator
    public GetBulkImportProfilesJobsRequest(
            Optional<? extends List<FieldsProfileBulkImportJob>> fieldsProfileBulkImportJob,
            Optional<String> filter,
            Optional<String> pageCursor,
            Optional<Long> pageSize,
            Optional<? extends GetBulkImportProfilesJobsQueryParamSort> sort,
            String revision) {
        Utils.checkNotNull(fieldsProfileBulkImportJob, "fieldsProfileBulkImportJob");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(pageCursor, "pageCursor");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(sort, "sort");
        Utils.checkNotNull(revision, "revision");
        this.fieldsProfileBulkImportJob = fieldsProfileBulkImportJob;
        this.filter = filter;
        this.pageCursor = pageCursor;
        this.pageSize = pageSize;
        this.sort = sort;
        this.revision = revision;
    }
    
    public GetBulkImportProfilesJobsRequest(
            String revision) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), revision);
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<FieldsProfileBulkImportJob>> fieldsProfileBulkImportJob() {
        return (Optional<List<FieldsProfileBulkImportJob>>) fieldsProfileBulkImportJob;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`status`: `any`, `equals`
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
     * Default: 20. Min: 1. Max: 100.
     */
    @JsonIgnore
    public Optional<Long> pageSize() {
        return pageSize;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sorting
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetBulkImportProfilesJobsQueryParamSort> sort() {
        return (Optional<GetBulkImportProfilesJobsQueryParamSort>) sort;
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
    public GetBulkImportProfilesJobsRequest withFieldsProfileBulkImportJob(List<FieldsProfileBulkImportJob> fieldsProfileBulkImportJob) {
        Utils.checkNotNull(fieldsProfileBulkImportJob, "fieldsProfileBulkImportJob");
        this.fieldsProfileBulkImportJob = Optional.ofNullable(fieldsProfileBulkImportJob);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
     */
    public GetBulkImportProfilesJobsRequest withFieldsProfileBulkImportJob(Optional<? extends List<FieldsProfileBulkImportJob>> fieldsProfileBulkImportJob) {
        Utils.checkNotNull(fieldsProfileBulkImportJob, "fieldsProfileBulkImportJob");
        this.fieldsProfileBulkImportJob = fieldsProfileBulkImportJob;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`status`: `any`, `equals`
     */
    public GetBulkImportProfilesJobsRequest withFilter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`status`: `any`, `equals`
     */
    public GetBulkImportProfilesJobsRequest withFilter(Optional<String> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    public GetBulkImportProfilesJobsRequest withPageCursor(String pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = Optional.ofNullable(pageCursor);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination
     */
    public GetBulkImportProfilesJobsRequest withPageCursor(Optional<String> pageCursor) {
        Utils.checkNotNull(pageCursor, "pageCursor");
        this.pageCursor = pageCursor;
        return this;
    }

    /**
     * Default: 20. Min: 1. Max: 100.
     */
    public GetBulkImportProfilesJobsRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * Default: 20. Min: 1. Max: 100.
     */
    public GetBulkImportProfilesJobsRequest withPageSize(Optional<Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sorting
     */
    public GetBulkImportProfilesJobsRequest withSort(GetBulkImportProfilesJobsQueryParamSort sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.ofNullable(sort);
        return this;
    }

    /**
     * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sorting
     */
    public GetBulkImportProfilesJobsRequest withSort(Optional<? extends GetBulkImportProfilesJobsQueryParamSort> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
        return this;
    }

    /**
     * API endpoint revision (format: YYYY-MM-DD[.suffix])
     */
    public GetBulkImportProfilesJobsRequest withRevision(String revision) {
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
        GetBulkImportProfilesJobsRequest other = (GetBulkImportProfilesJobsRequest) o;
        return 
            Objects.deepEquals(this.fieldsProfileBulkImportJob, other.fieldsProfileBulkImportJob) &&
            Objects.deepEquals(this.filter, other.filter) &&
            Objects.deepEquals(this.pageCursor, other.pageCursor) &&
            Objects.deepEquals(this.pageSize, other.pageSize) &&
            Objects.deepEquals(this.sort, other.sort) &&
            Objects.deepEquals(this.revision, other.revision);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            fieldsProfileBulkImportJob,
            filter,
            pageCursor,
            pageSize,
            sort,
            revision);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBulkImportProfilesJobsRequest.class,
                "fieldsProfileBulkImportJob", fieldsProfileBulkImportJob,
                "filter", filter,
                "pageCursor", pageCursor,
                "pageSize", pageSize,
                "sort", sort,
                "revision", revision);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<FieldsProfileBulkImportJob>> fieldsProfileBulkImportJob = Optional.empty();
 
        private Optional<String> filter = Optional.empty();
 
        private Optional<String> pageCursor = Optional.empty();
 
        private Optional<Long> pageSize;
 
        private Optional<? extends GetBulkImportProfilesJobsQueryParamSort> sort = Optional.empty();
 
        private String revision;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsProfileBulkImportJob(List<FieldsProfileBulkImportJob> fieldsProfileBulkImportJob) {
            Utils.checkNotNull(fieldsProfileBulkImportJob, "fieldsProfileBulkImportJob");
            this.fieldsProfileBulkImportJob = Optional.ofNullable(fieldsProfileBulkImportJob);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets
         */
        public Builder fieldsProfileBulkImportJob(Optional<? extends List<FieldsProfileBulkImportJob>> fieldsProfileBulkImportJob) {
            Utils.checkNotNull(fieldsProfileBulkImportJob, "fieldsProfileBulkImportJob");
            this.fieldsProfileBulkImportJob = fieldsProfileBulkImportJob;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`status`: `any`, `equals`
         */
        public Builder filter(String filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering&lt;br&gt;Allowed field(s)/operator(s):&lt;br&gt;`status`: `any`, `equals`
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
         * Default: 20. Min: 1. Max: 100.
         */
        public Builder pageSize(long pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = Optional.ofNullable(pageSize);
            return this;
        }

        /**
         * Default: 20. Min: 1. Max: 100.
         */
        public Builder pageSize(Optional<Long> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sorting
         */
        public Builder sort(GetBulkImportProfilesJobsQueryParamSort sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = Optional.ofNullable(sort);
            return this;
        }

        /**
         * For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sorting
         */
        public Builder sort(Optional<? extends GetBulkImportProfilesJobsQueryParamSort> sort) {
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
        
        public GetBulkImportProfilesJobsRequest build() {
            if (pageSize == null) {
                pageSize = _SINGLETON_VALUE_PageSize.value();
            }
            if (revision == null) {
                revision = _SINGLETON_VALUE_Revision.value();
            }            return new GetBulkImportProfilesJobsRequest(
                fieldsProfileBulkImportJob,
                filter,
                pageCursor,
                pageSize,
                sort,
                revision);
        }

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_PageSize =
                new LazySingletonValue<>(
                        "page[size]",
                        "20",
                        new TypeReference<Optional<Long>>() {});

        private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
                new LazySingletonValue<>(
                        "revision",
                        "\"2024-10-15\"",
                        new TypeReference<String>() {});
    }
}
