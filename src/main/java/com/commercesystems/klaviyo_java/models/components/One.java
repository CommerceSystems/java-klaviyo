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


@JsonDeserialize(using = One._Deserializer.class)
public class One {

    @JsonValue
    private TypedObject value;
    
    private One(TypedObject value) {
        this.value = value;
    }

    public static One of(StatusDateFilter value) {
        Utils.checkNotNull(value, "value");
        return new One(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<StatusDateFilter>(){}));
    }

    public static One of(APIMethodFilter value) {
        Utils.checkNotNull(value, "value");
        return new One(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<APIMethodFilter>(){}));
    }

    public static One of(InboundMessageMethodFilter value) {
        Utils.checkNotNull(value, "value");
        return new One(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<InboundMessageMethodFilter>(){}));
    }

    public static One of(PreferencePageMethodFilter value) {
        Utils.checkNotNull(value, "value");
        return new One(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<PreferencePageMethodFilter>(){}));
    }

    public static One of(ManualRemoveMethodFilter value) {
        Utils.checkNotNull(value, "value");
        return new One(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ManualRemoveMethodFilter>(){}));
    }

    public static One of(SpamComplaintMethodFilter value) {
        Utils.checkNotNull(value, "value");
        return new One(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SpamComplaintMethodFilter>(){}));
    }

    public static One of(MailboxProviderMethodFilter value) {
        Utils.checkNotNull(value, "value");
        return new One(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<MailboxProviderMethodFilter>(){}));
    }

    public static One of(ConstantContactIntegrationMethodFilter value) {
        Utils.checkNotNull(value, "value");
        return new One(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ConstantContactIntegrationMethodFilter>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.StatusDateFilter}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.APIMethodFilter}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.InboundMessageMethodFilter}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.PreferencePageMethodFilter}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.ManualRemoveMethodFilter}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.SpamComplaintMethodFilter}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.MailboxProviderMethodFilter}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.ConstantContactIntegrationMethodFilter}</li>
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
        One other = (One) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<One> {

        public _Deserializer() {
            super(One.class, false,
                  TypeReferenceWithShape.of(new TypeReference<ConstantContactIntegrationMethodFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<APIMethodFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<MailboxProviderMethodFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SpamComplaintMethodFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ManualRemoveMethodFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<PreferencePageMethodFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<InboundMessageMethodFilter>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<StatusDateFilter>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(One.class,
                "value", value);
    }
 
}
