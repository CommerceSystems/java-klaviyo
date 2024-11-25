/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum QueryParamFieldsCampaign {
    NAME("name"),
    STATUS("status"),
    ARCHIVED("archived"),
    AUDIENCES("audiences"),
    AUDIENCES_INCLUDED("audiences.included"),
    AUDIENCES_EXCLUDED("audiences.excluded"),
    SEND_OPTIONS("send_options"),
    SEND_OPTIONS_USE_SMART_SENDING("send_options.use_smart_sending"),
    TRACKING_OPTIONS("tracking_options"),
    TRACKING_OPTIONS_ADD_TRACKING_PARAMS("tracking_options.add_tracking_params"),
    TRACKING_OPTIONS_CUSTOM_TRACKING_PARAMS("tracking_options.custom_tracking_params"),
    TRACKING_OPTIONS_IS_TRACKING_CLICKS("tracking_options.is_tracking_clicks"),
    TRACKING_OPTIONS_IS_TRACKING_OPENS("tracking_options.is_tracking_opens"),
    SEND_STRATEGY("send_strategy"),
    SEND_STRATEGY_METHOD("send_strategy.method"),
    SEND_STRATEGY_OPTIONS_STATIC("send_strategy.options_static"),
    SEND_STRATEGY_OPTIONS_STATIC_DATETIME("send_strategy.options_static.datetime"),
    SEND_STRATEGY_OPTIONS_STATIC_IS_LOCAL("send_strategy.options_static.is_local"),
    SEND_STRATEGY_OPTIONS_STATIC_SEND_PAST_RECIPIENTS_IMMEDIATELY("send_strategy.options_static.send_past_recipients_immediately"),
    SEND_STRATEGY_OPTIONS_THROTTLED("send_strategy.options_throttled"),
    SEND_STRATEGY_OPTIONS_THROTTLED_DATETIME("send_strategy.options_throttled.datetime"),
    SEND_STRATEGY_OPTIONS_THROTTLED_THROTTLE_PERCENTAGE("send_strategy.options_throttled.throttle_percentage"),
    SEND_STRATEGY_OPTIONS_STO("send_strategy.options_sto"),
    SEND_STRATEGY_OPTIONS_STO_DATE("send_strategy.options_sto.date"),
    CREATED_AT("created_at"),
    SCHEDULED_AT("scheduled_at"),
    UPDATED_AT("updated_at"),
    SEND_TIME("send_time");

    @JsonValue
    private final String value;

    private QueryParamFieldsCampaign(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
