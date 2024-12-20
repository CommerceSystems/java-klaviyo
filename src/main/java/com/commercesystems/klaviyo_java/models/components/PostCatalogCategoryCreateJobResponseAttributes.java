/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class PostCatalogCategoryCreateJobResponseAttributes {

    /**
     * Status of the asynchronous job.
     */
    @JsonProperty("status")
    private PostCatalogCategoryCreateJobResponseStatus status;

    /**
     * The date and time the job was created in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    /**
     * The total number of operations to be processed by the job. See `completed_count` for the job's current progress.
     */
    @JsonProperty("total_count")
    private long totalCount;

    /**
     * The total number of operations that have been completed by the job.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("completed_count")
    private JsonNullable<Long> completedCount;

    /**
     * The total number of operations that have failed as part of the job.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("failed_count")
    private JsonNullable<Long> failedCount;

    /**
     * Date and time the job was completed in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("completed_at")
    private JsonNullable<OffsetDateTime> completedAt;

    /**
     * Array of errors encountered during the processing of the job.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    private JsonNullable<? extends List<APIJobErrorPayload>> errors;

    /**
     * Date and time the job expires in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expires_at")
    private JsonNullable<OffsetDateTime> expiresAt;

    @JsonCreator
    public PostCatalogCategoryCreateJobResponseAttributes(
            @JsonProperty("status") PostCatalogCategoryCreateJobResponseStatus status,
            @JsonProperty("created_at") OffsetDateTime createdAt,
            @JsonProperty("total_count") long totalCount,
            @JsonProperty("completed_count") JsonNullable<Long> completedCount,
            @JsonProperty("failed_count") JsonNullable<Long> failedCount,
            @JsonProperty("completed_at") JsonNullable<OffsetDateTime> completedAt,
            @JsonProperty("errors") JsonNullable<? extends List<APIJobErrorPayload>> errors,
            @JsonProperty("expires_at") JsonNullable<OffsetDateTime> expiresAt) {
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(totalCount, "totalCount");
        Utils.checkNotNull(completedCount, "completedCount");
        Utils.checkNotNull(failedCount, "failedCount");
        Utils.checkNotNull(completedAt, "completedAt");
        Utils.checkNotNull(errors, "errors");
        Utils.checkNotNull(expiresAt, "expiresAt");
        this.status = status;
        this.createdAt = createdAt;
        this.totalCount = totalCount;
        this.completedCount = completedCount;
        this.failedCount = failedCount;
        this.completedAt = completedAt;
        this.errors = errors;
        this.expiresAt = expiresAt;
    }
    
    public PostCatalogCategoryCreateJobResponseAttributes(
            PostCatalogCategoryCreateJobResponseStatus status,
            OffsetDateTime createdAt,
            long totalCount) {
        this(status, createdAt, totalCount, JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Status of the asynchronous job.
     */
    @JsonIgnore
    public PostCatalogCategoryCreateJobResponseStatus status() {
        return status;
    }

    /**
     * The date and time the job was created in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    /**
     * The total number of operations to be processed by the job. See `completed_count` for the job's current progress.
     */
    @JsonIgnore
    public long totalCount() {
        return totalCount;
    }

    /**
     * The total number of operations that have been completed by the job.
     */
    @JsonIgnore
    public JsonNullable<Long> completedCount() {
        return completedCount;
    }

    /**
     * The total number of operations that have failed as part of the job.
     */
    @JsonIgnore
    public JsonNullable<Long> failedCount() {
        return failedCount;
    }

    /**
     * Date and time the job was completed in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> completedAt() {
        return completedAt;
    }

    /**
     * Array of errors encountered during the processing of the job.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<List<APIJobErrorPayload>> errors() {
        return (JsonNullable<List<APIJobErrorPayload>>) errors;
    }

    /**
     * Date and time the job expires in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> expiresAt() {
        return expiresAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Status of the asynchronous job.
     */
    public PostCatalogCategoryCreateJobResponseAttributes withStatus(PostCatalogCategoryCreateJobResponseStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * The date and time the job was created in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public PostCatalogCategoryCreateJobResponseAttributes withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The total number of operations to be processed by the job. See `completed_count` for the job's current progress.
     */
    public PostCatalogCategoryCreateJobResponseAttributes withTotalCount(long totalCount) {
        Utils.checkNotNull(totalCount, "totalCount");
        this.totalCount = totalCount;
        return this;
    }

    /**
     * The total number of operations that have been completed by the job.
     */
    public PostCatalogCategoryCreateJobResponseAttributes withCompletedCount(long completedCount) {
        Utils.checkNotNull(completedCount, "completedCount");
        this.completedCount = JsonNullable.of(completedCount);
        return this;
    }

    /**
     * The total number of operations that have been completed by the job.
     */
    public PostCatalogCategoryCreateJobResponseAttributes withCompletedCount(JsonNullable<Long> completedCount) {
        Utils.checkNotNull(completedCount, "completedCount");
        this.completedCount = completedCount;
        return this;
    }

    /**
     * The total number of operations that have failed as part of the job.
     */
    public PostCatalogCategoryCreateJobResponseAttributes withFailedCount(long failedCount) {
        Utils.checkNotNull(failedCount, "failedCount");
        this.failedCount = JsonNullable.of(failedCount);
        return this;
    }

    /**
     * The total number of operations that have failed as part of the job.
     */
    public PostCatalogCategoryCreateJobResponseAttributes withFailedCount(JsonNullable<Long> failedCount) {
        Utils.checkNotNull(failedCount, "failedCount");
        this.failedCount = failedCount;
        return this;
    }

    /**
     * Date and time the job was completed in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public PostCatalogCategoryCreateJobResponseAttributes withCompletedAt(OffsetDateTime completedAt) {
        Utils.checkNotNull(completedAt, "completedAt");
        this.completedAt = JsonNullable.of(completedAt);
        return this;
    }

    /**
     * Date and time the job was completed in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public PostCatalogCategoryCreateJobResponseAttributes withCompletedAt(JsonNullable<OffsetDateTime> completedAt) {
        Utils.checkNotNull(completedAt, "completedAt");
        this.completedAt = completedAt;
        return this;
    }

    /**
     * Array of errors encountered during the processing of the job.
     */
    public PostCatalogCategoryCreateJobResponseAttributes withErrors(List<APIJobErrorPayload> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = JsonNullable.of(errors);
        return this;
    }

    /**
     * Array of errors encountered during the processing of the job.
     */
    public PostCatalogCategoryCreateJobResponseAttributes withErrors(JsonNullable<? extends List<APIJobErrorPayload>> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = errors;
        return this;
    }

    /**
     * Date and time the job expires in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public PostCatalogCategoryCreateJobResponseAttributes withExpiresAt(OffsetDateTime expiresAt) {
        Utils.checkNotNull(expiresAt, "expiresAt");
        this.expiresAt = JsonNullable.of(expiresAt);
        return this;
    }

    /**
     * Date and time the job expires in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public PostCatalogCategoryCreateJobResponseAttributes withExpiresAt(JsonNullable<OffsetDateTime> expiresAt) {
        Utils.checkNotNull(expiresAt, "expiresAt");
        this.expiresAt = expiresAt;
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
        PostCatalogCategoryCreateJobResponseAttributes other = (PostCatalogCategoryCreateJobResponseAttributes) o;
        return 
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.totalCount, other.totalCount) &&
            Objects.deepEquals(this.completedCount, other.completedCount) &&
            Objects.deepEquals(this.failedCount, other.failedCount) &&
            Objects.deepEquals(this.completedAt, other.completedAt) &&
            Objects.deepEquals(this.errors, other.errors) &&
            Objects.deepEquals(this.expiresAt, other.expiresAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            status,
            createdAt,
            totalCount,
            completedCount,
            failedCount,
            completedAt,
            errors,
            expiresAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostCatalogCategoryCreateJobResponseAttributes.class,
                "status", status,
                "createdAt", createdAt,
                "totalCount", totalCount,
                "completedCount", completedCount,
                "failedCount", failedCount,
                "completedAt", completedAt,
                "errors", errors,
                "expiresAt", expiresAt);
    }
    
    public final static class Builder {
 
        private PostCatalogCategoryCreateJobResponseStatus status;
 
        private OffsetDateTime createdAt;
 
        private Long totalCount;
 
        private JsonNullable<Long> completedCount;
 
        private JsonNullable<Long> failedCount;
 
        private JsonNullable<OffsetDateTime> completedAt = JsonNullable.undefined();
 
        private JsonNullable<? extends List<APIJobErrorPayload>> errors = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> expiresAt = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Status of the asynchronous job.
         */
        public Builder status(PostCatalogCategoryCreateJobResponseStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * The date and time the job was created in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * The total number of operations to be processed by the job. See `completed_count` for the job's current progress.
         */
        public Builder totalCount(long totalCount) {
            Utils.checkNotNull(totalCount, "totalCount");
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The total number of operations that have been completed by the job.
         */
        public Builder completedCount(long completedCount) {
            Utils.checkNotNull(completedCount, "completedCount");
            this.completedCount = JsonNullable.of(completedCount);
            return this;
        }

        /**
         * The total number of operations that have been completed by the job.
         */
        public Builder completedCount(JsonNullable<Long> completedCount) {
            Utils.checkNotNull(completedCount, "completedCount");
            this.completedCount = completedCount;
            return this;
        }

        /**
         * The total number of operations that have failed as part of the job.
         */
        public Builder failedCount(long failedCount) {
            Utils.checkNotNull(failedCount, "failedCount");
            this.failedCount = JsonNullable.of(failedCount);
            return this;
        }

        /**
         * The total number of operations that have failed as part of the job.
         */
        public Builder failedCount(JsonNullable<Long> failedCount) {
            Utils.checkNotNull(failedCount, "failedCount");
            this.failedCount = failedCount;
            return this;
        }

        /**
         * Date and time the job was completed in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
         */
        public Builder completedAt(OffsetDateTime completedAt) {
            Utils.checkNotNull(completedAt, "completedAt");
            this.completedAt = JsonNullable.of(completedAt);
            return this;
        }

        /**
         * Date and time the job was completed in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
         */
        public Builder completedAt(JsonNullable<OffsetDateTime> completedAt) {
            Utils.checkNotNull(completedAt, "completedAt");
            this.completedAt = completedAt;
            return this;
        }

        /**
         * Array of errors encountered during the processing of the job.
         */
        public Builder errors(List<APIJobErrorPayload> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = JsonNullable.of(errors);
            return this;
        }

        /**
         * Array of errors encountered during the processing of the job.
         */
        public Builder errors(JsonNullable<? extends List<APIJobErrorPayload>> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = errors;
            return this;
        }

        /**
         * Date and time the job expires in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
         */
        public Builder expiresAt(OffsetDateTime expiresAt) {
            Utils.checkNotNull(expiresAt, "expiresAt");
            this.expiresAt = JsonNullable.of(expiresAt);
            return this;
        }

        /**
         * Date and time the job expires in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
         */
        public Builder expiresAt(JsonNullable<OffsetDateTime> expiresAt) {
            Utils.checkNotNull(expiresAt, "expiresAt");
            this.expiresAt = expiresAt;
            return this;
        }
        
        public PostCatalogCategoryCreateJobResponseAttributes build() {
            if (completedCount == null) {
                completedCount = _SINGLETON_VALUE_CompletedCount.value();
            }
            if (failedCount == null) {
                failedCount = _SINGLETON_VALUE_FailedCount.value();
            }            return new PostCatalogCategoryCreateJobResponseAttributes(
                status,
                createdAt,
                totalCount,
                completedCount,
                failedCount,
                completedAt,
                errors,
                expiresAt);
        }

        private static final LazySingletonValue<JsonNullable<Long>> _SINGLETON_VALUE_CompletedCount =
                new LazySingletonValue<>(
                        "completed_count",
                        "0",
                        new TypeReference<JsonNullable<Long>>() {});

        private static final LazySingletonValue<JsonNullable<Long>> _SINGLETON_VALUE_FailedCount =
                new LazySingletonValue<>(
                        "failed_count",
                        "0",
                        new TypeReference<JsonNullable<Long>>() {});
    }
}

