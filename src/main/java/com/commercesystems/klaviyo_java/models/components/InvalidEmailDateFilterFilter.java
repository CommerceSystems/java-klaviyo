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


@JsonDeserialize(using = InvalidEmailDateFilterFilter._Deserializer.class)
public class InvalidEmailDateFilterFilter {

    @JsonValue
    private TypedObject value;
    
    private InvalidEmailDateFilterFilter(TypedObject value) {
        this.value = value;
    }

    public static InvalidEmailDateFilterFilter of(StaticDateFilter value) {
        Utils.checkNotNull(value, "value");
        return new InvalidEmailDateFilterFilter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<StaticDateFilter>(){}));
    }

    public static InvalidEmailDateFilterFilter of(StaticDateRangeFilter value) {
        Utils.checkNotNull(value, "value");
        return new InvalidEmailDateFilterFilter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<StaticDateRangeFilter>(){}));
    }

    public static InvalidEmailDateFilterFilter of(RelativeDateOperatorBaseFilter value) {
        Utils.checkNotNull(value, "value");
        return new InvalidEmailDateFilterFilter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<RelativeDateOperatorBaseFilter>(){}));
    }

    public static InvalidEmailDateFilterFilter of(RelativeAnniversaryDateFilter value) {
        Utils.checkNotNull(value, "value");
        return new InvalidEmailDateFilterFilter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<RelativeAnniversaryDateFilter>(){}));
    }

    public static InvalidEmailDateFilterFilter of(RelativeDateRangeFilter value) {
        Utils.checkNotNull(value, "value");
        return new InvalidEmailDateFilterFilter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<RelativeDateRangeFilter>(){}));
    }

    public static InvalidEmailDateFilterFilter of(CalendarDateFilter value) {
        Utils.checkNotNull(value, "value");
        return new InvalidEmailDateFilterFilter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<CalendarDateFilter>(){}));
    }

    public static InvalidEmailDateFilterFilter of(AnniversaryDateFilter value) {
        Utils.checkNotNull(value, "value");
        return new InvalidEmailDateFilterFilter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AnniversaryDateFilter>(){}));
    }

    public static InvalidEmailDateFilterFilter of(IsSetExistenceFilter value) {
        Utils.checkNotNull(value, "value");
        return new InvalidEmailDateFilterFilter(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<IsSetExistenceFilter>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.StaticDateFilter}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.StaticDateRangeFilter}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.RelativeDateOperatorBaseFilter}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.RelativeAnniversaryDateFilter}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.RelativeDateRangeFilter}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.CalendarDateFilter}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.AnniversaryDateFilter}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.IsSetExistenceFilter}</li>
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
        InvalidEmailDateFilterFilter other = (InvalidEmailDateFilterFilter) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<InvalidEmailDateFilterFilter> {

        public _Deserializer() {
            super(InvalidEmailDateFilterFilter.class, false,
                  TypeReferenceWithShape.of(new TypeReference<RelativeDateRangeFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<RelativeAnniversaryDateFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<RelativeDateOperatorBaseFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<StaticDateRangeFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<CalendarDateFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<StaticDateFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<IsSetExistenceFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<AnniversaryDateFilter>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(InvalidEmailDateFilterFilter.class,
                "value", value);
    }
 
}