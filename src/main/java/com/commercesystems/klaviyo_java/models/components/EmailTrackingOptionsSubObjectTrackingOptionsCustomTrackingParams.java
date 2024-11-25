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


@JsonDeserialize(using = EmailTrackingOptionsSubObjectTrackingOptionsCustomTrackingParams._Deserializer.class)
public class EmailTrackingOptionsSubObjectTrackingOptionsCustomTrackingParams {

    @JsonValue
    private TypedObject value;
    
    private EmailTrackingOptionsSubObjectTrackingOptionsCustomTrackingParams(TypedObject value) {
        this.value = value;
    }

    public static EmailTrackingOptionsSubObjectTrackingOptionsCustomTrackingParams of(DynamicTrackingParam value) {
        Utils.checkNotNull(value, "value");
        return new EmailTrackingOptionsSubObjectTrackingOptionsCustomTrackingParams(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<DynamicTrackingParam>(){}));
    }

    public static EmailTrackingOptionsSubObjectTrackingOptionsCustomTrackingParams of(StaticTrackingParam value) {
        Utils.checkNotNull(value, "value");
        return new EmailTrackingOptionsSubObjectTrackingOptionsCustomTrackingParams(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<StaticTrackingParam>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.DynamicTrackingParam}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.StaticTrackingParam}</li>
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
        EmailTrackingOptionsSubObjectTrackingOptionsCustomTrackingParams other = (EmailTrackingOptionsSubObjectTrackingOptionsCustomTrackingParams) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<EmailTrackingOptionsSubObjectTrackingOptionsCustomTrackingParams> {

        public _Deserializer() {
            super(EmailTrackingOptionsSubObjectTrackingOptionsCustomTrackingParams.class, false,
                  TypeReferenceWithShape.of(new TypeReference<StaticTrackingParam>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<DynamicTrackingParam>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(EmailTrackingOptionsSubObjectTrackingOptionsCustomTrackingParams.class,
                "value", value);
    }
 
}
