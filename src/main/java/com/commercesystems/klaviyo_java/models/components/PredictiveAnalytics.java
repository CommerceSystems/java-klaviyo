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
import java.lang.Double;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;


public class PredictiveAnalytics {

    /**
     * Total value of all historically placed orders
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("historic_clv")
    private JsonNullable<Double> historicClv;

    /**
     * Predicted value of all placed orders in the next 365 days
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("predicted_clv")
    private JsonNullable<Double> predictedClv;

    /**
     * Sum of historic and predicted CLV
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_clv")
    private JsonNullable<Double> totalClv;

    /**
     * Number of already placed orders
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("historic_number_of_orders")
    private JsonNullable<Long> historicNumberOfOrders;

    /**
     * Predicted number of placed orders in the next 365 days
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("predicted_number_of_orders")
    private JsonNullable<Double> predictedNumberOfOrders;

    /**
     * Average number of days between orders (None if only one order has been placed)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("average_days_between_orders")
    private JsonNullable<Double> averageDaysBetweenOrders;

    /**
     * Average value of placed orders
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("average_order_value")
    private JsonNullable<Double> averageOrderValue;

    /**
     * Probability the customer has churned
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("churn_probability")
    private JsonNullable<Double> churnProbability;

    /**
     * Expected date of next order, as calculated at the time of their most recent order
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expected_date_of_next_order")
    private JsonNullable<OffsetDateTime> expectedDateOfNextOrder;

    @JsonCreator
    public PredictiveAnalytics(
            @JsonProperty("historic_clv") JsonNullable<Double> historicClv,
            @JsonProperty("predicted_clv") JsonNullable<Double> predictedClv,
            @JsonProperty("total_clv") JsonNullable<Double> totalClv,
            @JsonProperty("historic_number_of_orders") JsonNullable<Long> historicNumberOfOrders,
            @JsonProperty("predicted_number_of_orders") JsonNullable<Double> predictedNumberOfOrders,
            @JsonProperty("average_days_between_orders") JsonNullable<Double> averageDaysBetweenOrders,
            @JsonProperty("average_order_value") JsonNullable<Double> averageOrderValue,
            @JsonProperty("churn_probability") JsonNullable<Double> churnProbability,
            @JsonProperty("expected_date_of_next_order") JsonNullable<OffsetDateTime> expectedDateOfNextOrder) {
        Utils.checkNotNull(historicClv, "historicClv");
        Utils.checkNotNull(predictedClv, "predictedClv");
        Utils.checkNotNull(totalClv, "totalClv");
        Utils.checkNotNull(historicNumberOfOrders, "historicNumberOfOrders");
        Utils.checkNotNull(predictedNumberOfOrders, "predictedNumberOfOrders");
        Utils.checkNotNull(averageDaysBetweenOrders, "averageDaysBetweenOrders");
        Utils.checkNotNull(averageOrderValue, "averageOrderValue");
        Utils.checkNotNull(churnProbability, "churnProbability");
        Utils.checkNotNull(expectedDateOfNextOrder, "expectedDateOfNextOrder");
        this.historicClv = historicClv;
        this.predictedClv = predictedClv;
        this.totalClv = totalClv;
        this.historicNumberOfOrders = historicNumberOfOrders;
        this.predictedNumberOfOrders = predictedNumberOfOrders;
        this.averageDaysBetweenOrders = averageDaysBetweenOrders;
        this.averageOrderValue = averageOrderValue;
        this.churnProbability = churnProbability;
        this.expectedDateOfNextOrder = expectedDateOfNextOrder;
    }
    
    public PredictiveAnalytics() {
        this(JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * Total value of all historically placed orders
     */
    @JsonIgnore
    public JsonNullable<Double> historicClv() {
        return historicClv;
    }

    /**
     * Predicted value of all placed orders in the next 365 days
     */
    @JsonIgnore
    public JsonNullable<Double> predictedClv() {
        return predictedClv;
    }

    /**
     * Sum of historic and predicted CLV
     */
    @JsonIgnore
    public JsonNullable<Double> totalClv() {
        return totalClv;
    }

    /**
     * Number of already placed orders
     */
    @JsonIgnore
    public JsonNullable<Long> historicNumberOfOrders() {
        return historicNumberOfOrders;
    }

    /**
     * Predicted number of placed orders in the next 365 days
     */
    @JsonIgnore
    public JsonNullable<Double> predictedNumberOfOrders() {
        return predictedNumberOfOrders;
    }

    /**
     * Average number of days between orders (None if only one order has been placed)
     */
    @JsonIgnore
    public JsonNullable<Double> averageDaysBetweenOrders() {
        return averageDaysBetweenOrders;
    }

    /**
     * Average value of placed orders
     */
    @JsonIgnore
    public JsonNullable<Double> averageOrderValue() {
        return averageOrderValue;
    }

    /**
     * Probability the customer has churned
     */
    @JsonIgnore
    public JsonNullable<Double> churnProbability() {
        return churnProbability;
    }

    /**
     * Expected date of next order, as calculated at the time of their most recent order
     */
    @JsonIgnore
    public JsonNullable<OffsetDateTime> expectedDateOfNextOrder() {
        return expectedDateOfNextOrder;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Total value of all historically placed orders
     */
    public PredictiveAnalytics withHistoricClv(double historicClv) {
        Utils.checkNotNull(historicClv, "historicClv");
        this.historicClv = JsonNullable.of(historicClv);
        return this;
    }

    /**
     * Total value of all historically placed orders
     */
    public PredictiveAnalytics withHistoricClv(JsonNullable<Double> historicClv) {
        Utils.checkNotNull(historicClv, "historicClv");
        this.historicClv = historicClv;
        return this;
    }

    /**
     * Predicted value of all placed orders in the next 365 days
     */
    public PredictiveAnalytics withPredictedClv(double predictedClv) {
        Utils.checkNotNull(predictedClv, "predictedClv");
        this.predictedClv = JsonNullable.of(predictedClv);
        return this;
    }

    /**
     * Predicted value of all placed orders in the next 365 days
     */
    public PredictiveAnalytics withPredictedClv(JsonNullable<Double> predictedClv) {
        Utils.checkNotNull(predictedClv, "predictedClv");
        this.predictedClv = predictedClv;
        return this;
    }

    /**
     * Sum of historic and predicted CLV
     */
    public PredictiveAnalytics withTotalClv(double totalClv) {
        Utils.checkNotNull(totalClv, "totalClv");
        this.totalClv = JsonNullable.of(totalClv);
        return this;
    }

    /**
     * Sum of historic and predicted CLV
     */
    public PredictiveAnalytics withTotalClv(JsonNullable<Double> totalClv) {
        Utils.checkNotNull(totalClv, "totalClv");
        this.totalClv = totalClv;
        return this;
    }

    /**
     * Number of already placed orders
     */
    public PredictiveAnalytics withHistoricNumberOfOrders(long historicNumberOfOrders) {
        Utils.checkNotNull(historicNumberOfOrders, "historicNumberOfOrders");
        this.historicNumberOfOrders = JsonNullable.of(historicNumberOfOrders);
        return this;
    }

    /**
     * Number of already placed orders
     */
    public PredictiveAnalytics withHistoricNumberOfOrders(JsonNullable<Long> historicNumberOfOrders) {
        Utils.checkNotNull(historicNumberOfOrders, "historicNumberOfOrders");
        this.historicNumberOfOrders = historicNumberOfOrders;
        return this;
    }

    /**
     * Predicted number of placed orders in the next 365 days
     */
    public PredictiveAnalytics withPredictedNumberOfOrders(double predictedNumberOfOrders) {
        Utils.checkNotNull(predictedNumberOfOrders, "predictedNumberOfOrders");
        this.predictedNumberOfOrders = JsonNullable.of(predictedNumberOfOrders);
        return this;
    }

    /**
     * Predicted number of placed orders in the next 365 days
     */
    public PredictiveAnalytics withPredictedNumberOfOrders(JsonNullable<Double> predictedNumberOfOrders) {
        Utils.checkNotNull(predictedNumberOfOrders, "predictedNumberOfOrders");
        this.predictedNumberOfOrders = predictedNumberOfOrders;
        return this;
    }

    /**
     * Average number of days between orders (None if only one order has been placed)
     */
    public PredictiveAnalytics withAverageDaysBetweenOrders(double averageDaysBetweenOrders) {
        Utils.checkNotNull(averageDaysBetweenOrders, "averageDaysBetweenOrders");
        this.averageDaysBetweenOrders = JsonNullable.of(averageDaysBetweenOrders);
        return this;
    }

    /**
     * Average number of days between orders (None if only one order has been placed)
     */
    public PredictiveAnalytics withAverageDaysBetweenOrders(JsonNullable<Double> averageDaysBetweenOrders) {
        Utils.checkNotNull(averageDaysBetweenOrders, "averageDaysBetweenOrders");
        this.averageDaysBetweenOrders = averageDaysBetweenOrders;
        return this;
    }

    /**
     * Average value of placed orders
     */
    public PredictiveAnalytics withAverageOrderValue(double averageOrderValue) {
        Utils.checkNotNull(averageOrderValue, "averageOrderValue");
        this.averageOrderValue = JsonNullable.of(averageOrderValue);
        return this;
    }

    /**
     * Average value of placed orders
     */
    public PredictiveAnalytics withAverageOrderValue(JsonNullable<Double> averageOrderValue) {
        Utils.checkNotNull(averageOrderValue, "averageOrderValue");
        this.averageOrderValue = averageOrderValue;
        return this;
    }

    /**
     * Probability the customer has churned
     */
    public PredictiveAnalytics withChurnProbability(double churnProbability) {
        Utils.checkNotNull(churnProbability, "churnProbability");
        this.churnProbability = JsonNullable.of(churnProbability);
        return this;
    }

    /**
     * Probability the customer has churned
     */
    public PredictiveAnalytics withChurnProbability(JsonNullable<Double> churnProbability) {
        Utils.checkNotNull(churnProbability, "churnProbability");
        this.churnProbability = churnProbability;
        return this;
    }

    /**
     * Expected date of next order, as calculated at the time of their most recent order
     */
    public PredictiveAnalytics withExpectedDateOfNextOrder(OffsetDateTime expectedDateOfNextOrder) {
        Utils.checkNotNull(expectedDateOfNextOrder, "expectedDateOfNextOrder");
        this.expectedDateOfNextOrder = JsonNullable.of(expectedDateOfNextOrder);
        return this;
    }

    /**
     * Expected date of next order, as calculated at the time of their most recent order
     */
    public PredictiveAnalytics withExpectedDateOfNextOrder(JsonNullable<OffsetDateTime> expectedDateOfNextOrder) {
        Utils.checkNotNull(expectedDateOfNextOrder, "expectedDateOfNextOrder");
        this.expectedDateOfNextOrder = expectedDateOfNextOrder;
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
        PredictiveAnalytics other = (PredictiveAnalytics) o;
        return 
            Objects.deepEquals(this.historicClv, other.historicClv) &&
            Objects.deepEquals(this.predictedClv, other.predictedClv) &&
            Objects.deepEquals(this.totalClv, other.totalClv) &&
            Objects.deepEquals(this.historicNumberOfOrders, other.historicNumberOfOrders) &&
            Objects.deepEquals(this.predictedNumberOfOrders, other.predictedNumberOfOrders) &&
            Objects.deepEquals(this.averageDaysBetweenOrders, other.averageDaysBetweenOrders) &&
            Objects.deepEquals(this.averageOrderValue, other.averageOrderValue) &&
            Objects.deepEquals(this.churnProbability, other.churnProbability) &&
            Objects.deepEquals(this.expectedDateOfNextOrder, other.expectedDateOfNextOrder);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            historicClv,
            predictedClv,
            totalClv,
            historicNumberOfOrders,
            predictedNumberOfOrders,
            averageDaysBetweenOrders,
            averageOrderValue,
            churnProbability,
            expectedDateOfNextOrder);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PredictiveAnalytics.class,
                "historicClv", historicClv,
                "predictedClv", predictedClv,
                "totalClv", totalClv,
                "historicNumberOfOrders", historicNumberOfOrders,
                "predictedNumberOfOrders", predictedNumberOfOrders,
                "averageDaysBetweenOrders", averageDaysBetweenOrders,
                "averageOrderValue", averageOrderValue,
                "churnProbability", churnProbability,
                "expectedDateOfNextOrder", expectedDateOfNextOrder);
    }
    
    public final static class Builder {
 
        private JsonNullable<Double> historicClv = JsonNullable.undefined();
 
        private JsonNullable<Double> predictedClv = JsonNullable.undefined();
 
        private JsonNullable<Double> totalClv = JsonNullable.undefined();
 
        private JsonNullable<Long> historicNumberOfOrders = JsonNullable.undefined();
 
        private JsonNullable<Double> predictedNumberOfOrders = JsonNullable.undefined();
 
        private JsonNullable<Double> averageDaysBetweenOrders = JsonNullable.undefined();
 
        private JsonNullable<Double> averageOrderValue = JsonNullable.undefined();
 
        private JsonNullable<Double> churnProbability = JsonNullable.undefined();
 
        private JsonNullable<OffsetDateTime> expectedDateOfNextOrder = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Total value of all historically placed orders
         */
        public Builder historicClv(double historicClv) {
            Utils.checkNotNull(historicClv, "historicClv");
            this.historicClv = JsonNullable.of(historicClv);
            return this;
        }

        /**
         * Total value of all historically placed orders
         */
        public Builder historicClv(JsonNullable<Double> historicClv) {
            Utils.checkNotNull(historicClv, "historicClv");
            this.historicClv = historicClv;
            return this;
        }

        /**
         * Predicted value of all placed orders in the next 365 days
         */
        public Builder predictedClv(double predictedClv) {
            Utils.checkNotNull(predictedClv, "predictedClv");
            this.predictedClv = JsonNullable.of(predictedClv);
            return this;
        }

        /**
         * Predicted value of all placed orders in the next 365 days
         */
        public Builder predictedClv(JsonNullable<Double> predictedClv) {
            Utils.checkNotNull(predictedClv, "predictedClv");
            this.predictedClv = predictedClv;
            return this;
        }

        /**
         * Sum of historic and predicted CLV
         */
        public Builder totalClv(double totalClv) {
            Utils.checkNotNull(totalClv, "totalClv");
            this.totalClv = JsonNullable.of(totalClv);
            return this;
        }

        /**
         * Sum of historic and predicted CLV
         */
        public Builder totalClv(JsonNullable<Double> totalClv) {
            Utils.checkNotNull(totalClv, "totalClv");
            this.totalClv = totalClv;
            return this;
        }

        /**
         * Number of already placed orders
         */
        public Builder historicNumberOfOrders(long historicNumberOfOrders) {
            Utils.checkNotNull(historicNumberOfOrders, "historicNumberOfOrders");
            this.historicNumberOfOrders = JsonNullable.of(historicNumberOfOrders);
            return this;
        }

        /**
         * Number of already placed orders
         */
        public Builder historicNumberOfOrders(JsonNullable<Long> historicNumberOfOrders) {
            Utils.checkNotNull(historicNumberOfOrders, "historicNumberOfOrders");
            this.historicNumberOfOrders = historicNumberOfOrders;
            return this;
        }

        /**
         * Predicted number of placed orders in the next 365 days
         */
        public Builder predictedNumberOfOrders(double predictedNumberOfOrders) {
            Utils.checkNotNull(predictedNumberOfOrders, "predictedNumberOfOrders");
            this.predictedNumberOfOrders = JsonNullable.of(predictedNumberOfOrders);
            return this;
        }

        /**
         * Predicted number of placed orders in the next 365 days
         */
        public Builder predictedNumberOfOrders(JsonNullable<Double> predictedNumberOfOrders) {
            Utils.checkNotNull(predictedNumberOfOrders, "predictedNumberOfOrders");
            this.predictedNumberOfOrders = predictedNumberOfOrders;
            return this;
        }

        /**
         * Average number of days between orders (None if only one order has been placed)
         */
        public Builder averageDaysBetweenOrders(double averageDaysBetweenOrders) {
            Utils.checkNotNull(averageDaysBetweenOrders, "averageDaysBetweenOrders");
            this.averageDaysBetweenOrders = JsonNullable.of(averageDaysBetweenOrders);
            return this;
        }

        /**
         * Average number of days between orders (None if only one order has been placed)
         */
        public Builder averageDaysBetweenOrders(JsonNullable<Double> averageDaysBetweenOrders) {
            Utils.checkNotNull(averageDaysBetweenOrders, "averageDaysBetweenOrders");
            this.averageDaysBetweenOrders = averageDaysBetweenOrders;
            return this;
        }

        /**
         * Average value of placed orders
         */
        public Builder averageOrderValue(double averageOrderValue) {
            Utils.checkNotNull(averageOrderValue, "averageOrderValue");
            this.averageOrderValue = JsonNullable.of(averageOrderValue);
            return this;
        }

        /**
         * Average value of placed orders
         */
        public Builder averageOrderValue(JsonNullable<Double> averageOrderValue) {
            Utils.checkNotNull(averageOrderValue, "averageOrderValue");
            this.averageOrderValue = averageOrderValue;
            return this;
        }

        /**
         * Probability the customer has churned
         */
        public Builder churnProbability(double churnProbability) {
            Utils.checkNotNull(churnProbability, "churnProbability");
            this.churnProbability = JsonNullable.of(churnProbability);
            return this;
        }

        /**
         * Probability the customer has churned
         */
        public Builder churnProbability(JsonNullable<Double> churnProbability) {
            Utils.checkNotNull(churnProbability, "churnProbability");
            this.churnProbability = churnProbability;
            return this;
        }

        /**
         * Expected date of next order, as calculated at the time of their most recent order
         */
        public Builder expectedDateOfNextOrder(OffsetDateTime expectedDateOfNextOrder) {
            Utils.checkNotNull(expectedDateOfNextOrder, "expectedDateOfNextOrder");
            this.expectedDateOfNextOrder = JsonNullable.of(expectedDateOfNextOrder);
            return this;
        }

        /**
         * Expected date of next order, as calculated at the time of their most recent order
         */
        public Builder expectedDateOfNextOrder(JsonNullable<OffsetDateTime> expectedDateOfNextOrder) {
            Utils.checkNotNull(expectedDateOfNextOrder, "expectedDateOfNextOrder");
            this.expectedDateOfNextOrder = expectedDateOfNextOrder;
            return this;
        }
        
        public PredictiveAnalytics build() {
            return new PredictiveAnalytics(
                historicClv,
                predictedClv,
                totalClv,
                historicNumberOfOrders,
                predictedNumberOfOrders,
                averageDaysBetweenOrders,
                averageOrderValue,
                churnProbability,
                expectedDateOfNextOrder);
        }
    }
}

