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
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Longitude - Longitude coordinate. We recommend providing a precision of four decimal places.
 */

@JsonDeserialize(using = Longitude._Deserializer.class)
public class Longitude {

    @JsonValue
    private TypedObject value;
    
    private Longitude(TypedObject value) {
        this.value = value;
    }

    public static Longitude of(String value) {
        Utils.checkNotNull(value, "value");
        return new Longitude(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }

    public static Longitude of(double value) {
        Utils.checkNotNull(value, "value");
        return new Longitude(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Double>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code java.lang.String}</li>
     * <li>{@code double}</li>
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
        Longitude other = (Longitude) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<Longitude> {

        public _Deserializer() {
            super(Longitude.class, false,
                  TypeReferenceWithShape.of(new TypeReference<Double>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<String>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(Longitude.class,
                "value", value);
    }
 
}
