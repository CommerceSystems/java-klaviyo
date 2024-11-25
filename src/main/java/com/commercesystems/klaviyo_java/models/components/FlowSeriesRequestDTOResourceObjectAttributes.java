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
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class FlowSeriesRequestDTOResourceObjectAttributes {

    /**
     * List of statistics to query for. All rate statistics will be returned in fractional form [0.0, 1.0]
     */
    @JsonProperty("statistics")
    private List<FlowSeriesRequestDTOResourceObjectStatistics> statistics;

    /**
     * The timeframe to query for data within. The max length a timeframe can be is 1 year
     */
    @JsonProperty("timeframe")
    private FlowSeriesRequestDTOResourceObjectTimeframe timeframe;

    /**
     * The interval used to aggregate data within the series request.
     * If hourly is used, the timeframe cannot be longer than 7 days.
     * If daily is used, the timeframe cannot be longer than 60 days.
     * If monthly is used, the timeframe cannot be longer than 52 weeks.
     */
    @JsonProperty("interval")
    private FlowSeriesRequestDTOResourceObjectInterval interval;

    /**
     * ID of the metric to be used for conversion statistics
     */
    @JsonProperty("conversion_metric_id")
    private String conversionMetricId;

    /**
     * API filter string used to filter the query.
     * Allowed filters are flow_id, send_channel, flow_message_id.
     * Allowed operators are equals, contains-any.
     * Only one filter can be used per attribute, only AND can be used as a combination operator.
     * Max of 100 messages per ANY filter.
     * When filtering on send_channel, allowed values are email, push-notification, sms.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filter")
    private JsonNullable<String> filter;

    @JsonCreator
    public FlowSeriesRequestDTOResourceObjectAttributes(
            @JsonProperty("statistics") List<FlowSeriesRequestDTOResourceObjectStatistics> statistics,
            @JsonProperty("timeframe") FlowSeriesRequestDTOResourceObjectTimeframe timeframe,
            @JsonProperty("interval") FlowSeriesRequestDTOResourceObjectInterval interval,
            @JsonProperty("conversion_metric_id") String conversionMetricId,
            @JsonProperty("filter") JsonNullable<String> filter) {
        Utils.checkNotNull(statistics, "statistics");
        Utils.checkNotNull(timeframe, "timeframe");
        Utils.checkNotNull(interval, "interval");
        Utils.checkNotNull(conversionMetricId, "conversionMetricId");
        Utils.checkNotNull(filter, "filter");
        this.statistics = statistics;
        this.timeframe = timeframe;
        this.interval = interval;
        this.conversionMetricId = conversionMetricId;
        this.filter = filter;
    }
    
    public FlowSeriesRequestDTOResourceObjectAttributes(
            List<FlowSeriesRequestDTOResourceObjectStatistics> statistics,
            FlowSeriesRequestDTOResourceObjectTimeframe timeframe,
            FlowSeriesRequestDTOResourceObjectInterval interval,
            String conversionMetricId) {
        this(statistics, timeframe, interval, conversionMetricId, JsonNullable.undefined());
    }

    /**
     * List of statistics to query for. All rate statistics will be returned in fractional form [0.0, 1.0]
     */
    @JsonIgnore
    public List<FlowSeriesRequestDTOResourceObjectStatistics> statistics() {
        return statistics;
    }

    /**
     * The timeframe to query for data within. The max length a timeframe can be is 1 year
     */
    @JsonIgnore
    public FlowSeriesRequestDTOResourceObjectTimeframe timeframe() {
        return timeframe;
    }

    /**
     * The interval used to aggregate data within the series request.
     * If hourly is used, the timeframe cannot be longer than 7 days.
     * If daily is used, the timeframe cannot be longer than 60 days.
     * If monthly is used, the timeframe cannot be longer than 52 weeks.
     */
    @JsonIgnore
    public FlowSeriesRequestDTOResourceObjectInterval interval() {
        return interval;
    }

    /**
     * ID of the metric to be used for conversion statistics
     */
    @JsonIgnore
    public String conversionMetricId() {
        return conversionMetricId;
    }

    /**
     * API filter string used to filter the query.
     * Allowed filters are flow_id, send_channel, flow_message_id.
     * Allowed operators are equals, contains-any.
     * Only one filter can be used per attribute, only AND can be used as a combination operator.
     * Max of 100 messages per ANY filter.
     * When filtering on send_channel, allowed values are email, push-notification, sms.
     */
    @JsonIgnore
    public JsonNullable<String> filter() {
        return filter;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * List of statistics to query for. All rate statistics will be returned in fractional form [0.0, 1.0]
     */
    public FlowSeriesRequestDTOResourceObjectAttributes withStatistics(List<FlowSeriesRequestDTOResourceObjectStatistics> statistics) {
        Utils.checkNotNull(statistics, "statistics");
        this.statistics = statistics;
        return this;
    }

    /**
     * The timeframe to query for data within. The max length a timeframe can be is 1 year
     */
    public FlowSeriesRequestDTOResourceObjectAttributes withTimeframe(FlowSeriesRequestDTOResourceObjectTimeframe timeframe) {
        Utils.checkNotNull(timeframe, "timeframe");
        this.timeframe = timeframe;
        return this;
    }

    /**
     * The interval used to aggregate data within the series request.
     * If hourly is used, the timeframe cannot be longer than 7 days.
     * If daily is used, the timeframe cannot be longer than 60 days.
     * If monthly is used, the timeframe cannot be longer than 52 weeks.
     */
    public FlowSeriesRequestDTOResourceObjectAttributes withInterval(FlowSeriesRequestDTOResourceObjectInterval interval) {
        Utils.checkNotNull(interval, "interval");
        this.interval = interval;
        return this;
    }

    /**
     * ID of the metric to be used for conversion statistics
     */
    public FlowSeriesRequestDTOResourceObjectAttributes withConversionMetricId(String conversionMetricId) {
        Utils.checkNotNull(conversionMetricId, "conversionMetricId");
        this.conversionMetricId = conversionMetricId;
        return this;
    }

    /**
     * API filter string used to filter the query.
     * Allowed filters are flow_id, send_channel, flow_message_id.
     * Allowed operators are equals, contains-any.
     * Only one filter can be used per attribute, only AND can be used as a combination operator.
     * Max of 100 messages per ANY filter.
     * When filtering on send_channel, allowed values are email, push-notification, sms.
     */
    public FlowSeriesRequestDTOResourceObjectAttributes withFilter(String filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = JsonNullable.of(filter);
        return this;
    }

    /**
     * API filter string used to filter the query.
     * Allowed filters are flow_id, send_channel, flow_message_id.
     * Allowed operators are equals, contains-any.
     * Only one filter can be used per attribute, only AND can be used as a combination operator.
     * Max of 100 messages per ANY filter.
     * When filtering on send_channel, allowed values are email, push-notification, sms.
     */
    public FlowSeriesRequestDTOResourceObjectAttributes withFilter(JsonNullable<String> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
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
        FlowSeriesRequestDTOResourceObjectAttributes other = (FlowSeriesRequestDTOResourceObjectAttributes) o;
        return 
            Objects.deepEquals(this.statistics, other.statistics) &&
            Objects.deepEquals(this.timeframe, other.timeframe) &&
            Objects.deepEquals(this.interval, other.interval) &&
            Objects.deepEquals(this.conversionMetricId, other.conversionMetricId) &&
            Objects.deepEquals(this.filter, other.filter);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            statistics,
            timeframe,
            interval,
            conversionMetricId,
            filter);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FlowSeriesRequestDTOResourceObjectAttributes.class,
                "statistics", statistics,
                "timeframe", timeframe,
                "interval", interval,
                "conversionMetricId", conversionMetricId,
                "filter", filter);
    }
    
    public final static class Builder {
 
        private List<FlowSeriesRequestDTOResourceObjectStatistics> statistics;
 
        private FlowSeriesRequestDTOResourceObjectTimeframe timeframe;
 
        private FlowSeriesRequestDTOResourceObjectInterval interval;
 
        private String conversionMetricId;
 
        private JsonNullable<String> filter = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * List of statistics to query for. All rate statistics will be returned in fractional form [0.0, 1.0]
         */
        public Builder statistics(List<FlowSeriesRequestDTOResourceObjectStatistics> statistics) {
            Utils.checkNotNull(statistics, "statistics");
            this.statistics = statistics;
            return this;
        }

        /**
         * The timeframe to query for data within. The max length a timeframe can be is 1 year
         */
        public Builder timeframe(FlowSeriesRequestDTOResourceObjectTimeframe timeframe) {
            Utils.checkNotNull(timeframe, "timeframe");
            this.timeframe = timeframe;
            return this;
        }

        /**
         * The interval used to aggregate data within the series request.
         * If hourly is used, the timeframe cannot be longer than 7 days.
         * If daily is used, the timeframe cannot be longer than 60 days.
         * If monthly is used, the timeframe cannot be longer than 52 weeks.
         */
        public Builder interval(FlowSeriesRequestDTOResourceObjectInterval interval) {
            Utils.checkNotNull(interval, "interval");
            this.interval = interval;
            return this;
        }

        /**
         * ID of the metric to be used for conversion statistics
         */
        public Builder conversionMetricId(String conversionMetricId) {
            Utils.checkNotNull(conversionMetricId, "conversionMetricId");
            this.conversionMetricId = conversionMetricId;
            return this;
        }

        /**
         * API filter string used to filter the query.
         * Allowed filters are flow_id, send_channel, flow_message_id.
         * Allowed operators are equals, contains-any.
         * Only one filter can be used per attribute, only AND can be used as a combination operator.
         * Max of 100 messages per ANY filter.
         * When filtering on send_channel, allowed values are email, push-notification, sms.
         */
        public Builder filter(String filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = JsonNullable.of(filter);
            return this;
        }

        /**
         * API filter string used to filter the query.
         * Allowed filters are flow_id, send_channel, flow_message_id.
         * Allowed operators are equals, contains-any.
         * Only one filter can be used per attribute, only AND can be used as a combination operator.
         * Max of 100 messages per ANY filter.
         * When filtering on send_channel, allowed values are email, push-notification, sms.
         */
        public Builder filter(JsonNullable<String> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }
        
        public FlowSeriesRequestDTOResourceObjectAttributes build() {
            return new FlowSeriesRequestDTOResourceObjectAttributes(
                statistics,
                timeframe,
                interval,
                conversionMetricId,
                filter);
        }
    }
}
