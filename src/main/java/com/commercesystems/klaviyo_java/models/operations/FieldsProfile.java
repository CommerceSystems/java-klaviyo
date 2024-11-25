/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum FieldsProfile {
    EMAIL("email"),
    PHONE_NUMBER("phone_number"),
    EXTERNAL_ID("external_id"),
    FIRST_NAME("first_name"),
    LAST_NAME("last_name"),
    ORGANIZATION("organization"),
    LOCALE("locale"),
    TITLE("title"),
    IMAGE("image"),
    CREATED("created"),
    UPDATED("updated"),
    LAST_EVENT_DATE("last_event_date"),
    LOCATION("location"),
    LOCATION_ADDRESS1("location.address1"),
    LOCATION_ADDRESS2("location.address2"),
    LOCATION_CITY("location.city"),
    LOCATION_COUNTRY("location.country"),
    LOCATION_LATITUDE("location.latitude"),
    LOCATION_LONGITUDE("location.longitude"),
    LOCATION_REGION("location.region"),
    LOCATION_ZIP("location.zip"),
    LOCATION_TIMEZONE("location.timezone"),
    LOCATION_IP("location.ip"),
    PROPERTIES("properties");

    @JsonValue
    private final String value;

    private FieldsProfile(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}