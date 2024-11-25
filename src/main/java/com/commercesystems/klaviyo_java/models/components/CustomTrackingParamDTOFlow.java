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

/**
 * CustomTrackingParamDTOFlow - The value of the tracking parameter when applied to a flow.
 */

@JsonDeserialize(using = CustomTrackingParamDTOFlow._Deserializer.class)
public class CustomTrackingParamDTOFlow {

    @JsonValue
    private TypedObject value;
    
    private CustomTrackingParamDTOFlow(TypedObject value) {
        this.value = value;
    }

    public static CustomTrackingParamDTOFlow of(FlowFlowTrackingSettingDynamicParam value) {
        Utils.checkNotNull(value, "value");
        return new CustomTrackingParamDTOFlow(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<FlowFlowTrackingSettingDynamicParam>(){}));
    }

    public static CustomTrackingParamDTOFlow of(FlowFlowTrackingSettingStaticParam value) {
        Utils.checkNotNull(value, "value");
        return new CustomTrackingParamDTOFlow(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<FlowFlowTrackingSettingStaticParam>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.FlowFlowTrackingSettingDynamicParam}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.FlowFlowTrackingSettingStaticParam}</li>
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
        CustomTrackingParamDTOFlow other = (CustomTrackingParamDTOFlow) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<CustomTrackingParamDTOFlow> {

        public _Deserializer() {
            super(CustomTrackingParamDTOFlow.class, false,
                  TypeReferenceWithShape.of(new TypeReference<FlowFlowTrackingSettingStaticParam>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<FlowFlowTrackingSettingDynamicParam>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(CustomTrackingParamDTOFlow.class,
                "value", value);
    }
 
}
