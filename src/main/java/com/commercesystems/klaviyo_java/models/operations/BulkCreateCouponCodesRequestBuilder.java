/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.models.components.CouponCodeCreateJobCreateQuery;
import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;

public class BulkCreateCouponCodesRequestBuilder {

    private String revision;
    private CouponCodeCreateJobCreateQuery couponCodeCreateJobCreateQuery;
    private final SDKMethodInterfaces.MethodCallBulkCreateCouponCodes sdk;

    public BulkCreateCouponCodesRequestBuilder(SDKMethodInterfaces.MethodCallBulkCreateCouponCodes sdk) {
        this.sdk = sdk;
    }

    public BulkCreateCouponCodesRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public BulkCreateCouponCodesRequestBuilder couponCodeCreateJobCreateQuery(CouponCodeCreateJobCreateQuery couponCodeCreateJobCreateQuery) {
        Utils.checkNotNull(couponCodeCreateJobCreateQuery, "couponCodeCreateJobCreateQuery");
        this.couponCodeCreateJobCreateQuery = couponCodeCreateJobCreateQuery;
        return this;
    }

    public BulkCreateCouponCodesResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.bulkCreateCouponCodes(
            revision,
            couponCodeCreateJobCreateQuery);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}