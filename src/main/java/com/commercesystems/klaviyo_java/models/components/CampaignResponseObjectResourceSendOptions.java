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
 * CampaignResponseObjectResourceSendOptions - Options to use when sending a campaign
 */

@JsonDeserialize(using = CampaignResponseObjectResourceSendOptions._Deserializer.class)
public class CampaignResponseObjectResourceSendOptions {

    @JsonValue
    private TypedObject value;
    
    private CampaignResponseObjectResourceSendOptions(TypedObject value) {
        this.value = value;
    }

    public static CampaignResponseObjectResourceSendOptions of(EmailSendOptionsSubObject value) {
        Utils.checkNotNull(value, "value");
        return new CampaignResponseObjectResourceSendOptions(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<EmailSendOptionsSubObject>(){}));
    }

    public static CampaignResponseObjectResourceSendOptions of(SMSSendOptionsSubObject value) {
        Utils.checkNotNull(value, "value");
        return new CampaignResponseObjectResourceSendOptions(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SMSSendOptionsSubObject>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.EmailSendOptionsSubObject}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.SMSSendOptionsSubObject}</li>
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
        CampaignResponseObjectResourceSendOptions other = (CampaignResponseObjectResourceSendOptions) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<CampaignResponseObjectResourceSendOptions> {

        public _Deserializer() {
            super(CampaignResponseObjectResourceSendOptions.class, false,
                  TypeReferenceWithShape.of(new TypeReference<SMSSendOptionsSubObject>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<EmailSendOptionsSubObject>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(CampaignResponseObjectResourceSendOptions.class,
                "value", value);
    }
 
}