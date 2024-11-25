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
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class PostBulkProfileSuppressionsCreateJobResponseAttributes {

    /**
     * Status of the asynchronous job.
     */
    @JsonProperty("status")
    private PostBulkProfileSuppressionsCreateJobResponseStatus status;

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
     * Date and time the job was completed in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("completed_at")
    private JsonNullable<OffsetDateTime> completedAt;

    /**
     * The total number of profiles that have been skipped as part of the job.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("skipped_count")
    private JsonNullable<Long> skippedCount;

    @JsonCreator
    public PostBulkProfileSuppressionsCreateJobResponseAttributes(
            @JsonProperty("status") PostBulkProfileSuppressionsCreateJobResponseStatus status,
            @JsonProperty("created_at") OffsetDateTime createdAt,
            @JsonProperty("total_count") long totalCount,
            @JsonProperty("completed_count") JsonNullable<Long> completedCount,
            @JsonProperty("completed_at") JsonNullable<OffsetDateTime> completedAt,
            @JsonProperty("skipped_count") JsonNullable<Long> skippedCount) {
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(totalCount, "totalCount");
        Utils.checkNotNull(completedCount, "completedCount");
        Utils.checkNotNull(completedAt, "completedAt");
        Utils.checkNotNull(skippedCount, "skippedCount");
        this.status = status;
        this.createdAt = createdAt;
        this.totalCount = totalCount;
        this.completedCount = completedCount;
        this.completedAt = completedAt;
        this.skippedCount = skippedCount;
    }
    
    public PostBulkProfileSuppressionsCreateJobResponseAttributes(
            PostBulkProfileSuppressionsCreateJobResponseStatus status,
            OffsetDateTime createdAt,
            long totalCount) {
        this(status, createdAt, totalCount, JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Status of the asynchronous job.
     */
    @JsonIgnore
    public PostBulkProfileSuppressionsCreateJobResponseStatus status() {
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
     * Date and time the job was completed in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> completedAt() {
        return completedAt;
    }

    /**
     * The total number of profiles that have been skipped as part of the job.
     */
    @JsonIgnore
    public JsonNullable<Long> skippedCount() {
        return skippedCount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Status of the asynchronous job.
     */
    public PostBulkProfileSuppressionsCreateJobResponseAttributes withStatus(PostBulkProfileSuppressionsCreateJobResponseStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * The date and time the job was created in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public PostBulkProfileSuppressionsCreateJobResponseAttributes withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The total number of operations to be processed by the job. See `completed_count` for the job's current progress.
     */
    public PostBulkProfileSuppressionsCreateJobResponseAttributes withTotalCount(long totalCount) {
        Utils.checkNotNull(totalCount, "totalCount");
        this.totalCount = totalCount;
        return this;
    }

    /**
     * The total number of operations that have been completed by the job.
     */
    public PostBulkProfileSuppressionsCreateJobResponseAttributes withCompletedCount(long completedCount) {
        Utils.checkNotNull(completedCount, "completedCount");
        this.completedCount = JsonNullable.of(completedCount);
        return this;
    }

    /**
     * The total number of operations that have been completed by the job.
     */
    public PostBulkProfileSuppressionsCreateJobResponseAttributes withCompletedCount(JsonNullable<Long> completedCount) {
        Utils.checkNotNull(completedCount, "completedCount");
        this.completedCount = completedCount;
        return this;
    }

    /**
     * Date and time the job was completed in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public PostBulkProfileSuppressionsCreateJobResponseAttributes withCompletedAt(OffsetDateTime completedAt) {
        Utils.checkNotNull(completedAt, "completedAt");
        this.completedAt = JsonNullable.of(completedAt);
        return this;
    }

    /**
     * Date and time the job was completed in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm).
     */
    public PostBulkProfileSuppressionsCreateJobResponseAttributes withCompletedAt(JsonNullable<OffsetDateTime> completedAt) {
        Utils.checkNotNull(completedAt, "completedAt");
        this.completedAt = completedAt;
        return this;
    }

    /**
     * The total number of profiles that have been skipped as part of the job.
     */
    public PostBulkProfileSuppressionsCreateJobResponseAttributes withSkippedCount(long skippedCount) {
        Utils.checkNotNull(skippedCount, "skippedCount");
        this.skippedCount = JsonNullable.of(skippedCount);
        return this;
    }

    /**
     * The total number of profiles that have been skipped as part of the job.
     */
    public PostBulkProfileSuppressionsCreateJobResponseAttributes withSkippedCount(JsonNullable<Long> skippedCount) {
        Utils.checkNotNull(skippedCount, "skippedCount");
        this.skippedCount = skippedCount;
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
        PostBulkProfileSuppressionsCreateJobResponseAttributes other = (PostBulkProfileSuppressionsCreateJobResponseAttributes) o;
        return 
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.totalCount, other.totalCount) &&
            Objects.deepEquals(this.completedCount, other.completedCount) &&
            Objects.deepEquals(this.completedAt, other.completedAt) &&
            Objects.deepEquals(this.skippedCount, other.skippedCount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            status,
            createdAt,
            totalCount,
            completedCount,
            completedAt,
            skippedCount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostBulkProfileSuppressionsCreateJobResponseAttributes.class,
                "status", status,
                "createdAt", createdAt,
                "totalCount", totalCount,
                "completedCount", completedCount,
                "completedAt", completedAt,
                "skippedCount", skippedCount);
    }
    
    public final static class Builder {
 
        private PostBulkProfileSuppressionsCreateJobResponseStatus status;
 
        private OffsetDateTime createdAt;
 
        private Long totalCount;
 
        private JsonNullable<Long> completedCount;
 
        private JsonNullable<OffsetDateTime> completedAt = JsonNullable.undefined();
 
        private JsonNullable<Long> skippedCount;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Status of the asynchronous job.
         */
        public Builder status(PostBulkProfileSuppressionsCreateJobResponseStatus status) {
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
         * The total number of profiles that have been skipped as part of the job.
         */
        public Builder skippedCount(long skippedCount) {
            Utils.checkNotNull(skippedCount, "skippedCount");
            this.skippedCount = JsonNullable.of(skippedCount);
            return this;
        }

        /**
         * The total number of profiles that have been skipped as part of the job.
         */
        public Builder skippedCount(JsonNullable<Long> skippedCount) {
            Utils.checkNotNull(skippedCount, "skippedCount");
            this.skippedCount = skippedCount;
            return this;
        }
        
        public PostBulkProfileSuppressionsCreateJobResponseAttributes build() {
            if (completedCount == null) {
                completedCount = _SINGLETON_VALUE_CompletedCount.value();
            }
            if (skippedCount == null) {
                skippedCount = _SINGLETON_VALUE_SkippedCount.value();
            }            return new PostBulkProfileSuppressionsCreateJobResponseAttributes(
                status,
                createdAt,
                totalCount,
                completedCount,
                completedAt,
                skippedCount);
        }

        private static final LazySingletonValue<JsonNullable<Long>> _SINGLETON_VALUE_CompletedCount =
                new LazySingletonValue<>(
                        "completed_count",
                        "0",
                        new TypeReference<JsonNullable<Long>>() {});

        private static final LazySingletonValue<JsonNullable<Long>> _SINGLETON_VALUE_SkippedCount =
                new LazySingletonValue<>(
                        "skipped_count",
                        "0",
                        new TypeReference<JsonNullable<Long>>() {});
    }
}

