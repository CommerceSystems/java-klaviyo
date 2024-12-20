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


@JsonDeserialize(using = GetFlowMessageResponseCompoundDocumentContent._Deserializer.class)
public class GetFlowMessageResponseCompoundDocumentContent {

    @JsonValue
    private TypedObject value;
    
    private GetFlowMessageResponseCompoundDocumentContent(TypedObject value) {
        this.value = value;
    }

    public static GetFlowMessageResponseCompoundDocumentContent of(EmailMessageContent value) {
        Utils.checkNotNull(value, "value");
        return new GetFlowMessageResponseCompoundDocumentContent(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<EmailMessageContent>(){}));
    }

    public static GetFlowMessageResponseCompoundDocumentContent of(SMSMessageContent value) {
        Utils.checkNotNull(value, "value");
        return new GetFlowMessageResponseCompoundDocumentContent(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<SMSMessageContent>(){}));
    }

    public static GetFlowMessageResponseCompoundDocumentContent of(MobilePushMessageContent value) {
        Utils.checkNotNull(value, "value");
        return new GetFlowMessageResponseCompoundDocumentContent(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<MobilePushMessageContent>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.EmailMessageContent}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.SMSMessageContent}</li>
     * <li>{@code com.commercesystems.klaviyo_java.models.components.MobilePushMessageContent}</li>
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
        GetFlowMessageResponseCompoundDocumentContent other = (GetFlowMessageResponseCompoundDocumentContent) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<GetFlowMessageResponseCompoundDocumentContent> {

        public _Deserializer() {
            super(GetFlowMessageResponseCompoundDocumentContent.class, false,
                  TypeReferenceWithShape.of(new TypeReference<MobilePushMessageContent>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<EmailMessageContent>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<SMSMessageContent>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetFlowMessageResponseCompoundDocumentContent.class,
                "value", value);
    }
 
}
