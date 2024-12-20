/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * Dimension - Dimensions for numeric profile predictive analytics conditions.
 */
public enum Dimension {
    AVERAGE_DAYS_BETWEEN_ORDERS("average_days_between_orders"),
    AVERAGE_ORDER_VALUE("average_order_value"),
    CHURN_PROBABILITY("churn_probability"),
    HISTORIC_CLV("historic_clv"),
    HISTORIC_NUMBER_OF_ORDERS("historic_number_of_orders"),
    PREDICTED_CLV("predicted_clv"),
    PREDICTED_NUMBER_OF_ORDERS("predicted_number_of_orders"),
    TOTAL_CLV("total_clv");

    @JsonValue
    private final String value;

    private Dimension(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
