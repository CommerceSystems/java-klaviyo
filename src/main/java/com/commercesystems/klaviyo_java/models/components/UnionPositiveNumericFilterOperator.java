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


@JsonDeserialize(using = UnionPositiveNumericFilterOperator._Deserializer.class)
public class UnionPositiveNumericFilterOperator {

    @JsonValue
    private TypedObject value;
    
    private UnionPositiveNumericFilterOperator(TypedObject value) {
        this.value = value;
    }

    public static UnionPositiveNumericFilterOperator of(GreaterThanEnum value) {
        Utils.checkNotNull(value, "value");
        return new UnionPositiveNumericFilterOperator(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<GreaterThanEnum>(){}));
    }

    public static UnionPositiveNumericFilterOperator of(LessThanEnum value) {
        Utils.checkNotNull(value, "value");
        return new UnionPositiveNumericFilterOperator(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<LessThanEnum>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.GreaterThanEnum}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.LessThanEnum}</li>
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
        UnionPositiveNumericFilterOperator other = (UnionPositiveNumericFilterOperator) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<UnionPositiveNumericFilterOperator> {

        public _Deserializer() {
            super(UnionPositiveNumericFilterOperator.class, false,
                  TypeReferenceWithShape.of(new TypeReference<LessThanEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<GreaterThanEnum>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(UnionPositiveNumericFilterOperator.class,
                "value", value);
    }
 
}
