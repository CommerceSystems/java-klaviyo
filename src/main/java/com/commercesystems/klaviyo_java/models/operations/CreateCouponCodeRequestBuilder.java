/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.CouponCodeCreateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class CreateCouponCodeRequestBuilder {

    private String revision;
    private CouponCodeCreateQuery couponCodeCreateQuery;
    private final SDKMethodInterfaces.MethodCallCreateCouponCode sdk;

    public CreateCouponCodeRequestBuilder(SDKMethodInterfaces.MethodCallCreateCouponCode sdk) {
        this.sdk = sdk;
    }

    public CreateCouponCodeRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public CreateCouponCodeRequestBuilder couponCodeCreateQuery(CouponCodeCreateQuery couponCodeCreateQuery) {
        Utils.checkNotNull(couponCodeCreateQuery, "couponCodeCreateQuery");
        this.couponCodeCreateQuery = couponCodeCreateQuery;
        return this;
    }

    public CreateCouponCodeResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.createCouponCode(
            revision,
            couponCodeCreateQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}