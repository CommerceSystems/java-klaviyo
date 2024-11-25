/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.components;


import com.commercesystems.klaviyo_java.utils.OneOfDeserializer;
import com.commercesystems.klaviyo_java.utils.TypedObject;
import com.commercesystems.klaviyo_java.utils.Utils.JsonShape;
import com.commercesystems.klaviyo_java.utils.Utils.TypeReferenceWithShape;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;


@JsonDeserialize(using = FlowActionResponseObjectResourceTrackingOptions._Deserializer.class)
public class FlowActionResponseObjectResourceTrackingOptions {

    @JsonValue
    private TypedObject value;
    
    private FlowActionResponseObjectResourceTrackingOptions(TypedObject value) {
        this.value = value;
    }

    public static FlowActionResponseObjectResourceTrackingOptions of(EmailTrackingOptions value) {
        Utils.checkNotNull(value, "value");
        return new FlowActionResponseObjectResourceTrackingOptions(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<EmailTrackingOptions>(){}));
    }

    public static FlowActionResponseObjectResourceTrackingOptions of(SMSTrackingOptions value) {
        Utils.checkNotNull(value, "value");
        return new FlowActionResponseObjectResourceTrackingOptions(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SMSTrackingOptions>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.EmailTrackingOptions}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.SMSTrackingOptions}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowActionResponseObjectResourceTrackingOptions other = (FlowActionResponseObjectResourceTrackingOptions) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<FlowActionResponseObjectResourceTrackingOptions> {

        public _Deserializer() {
            super(FlowActionResponseObjectResourceTrackingOptions.class, false,
                  TypeReferenceWithShape.of(new TypeReference<EmailTrackingOptions>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SMSTrackingOptions>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(FlowActionResponseObjectResourceTrackingOptions.class,
                "value", value);
    }
 
}