# Coupons
(*coupons()*)

## Overview

coupons

### Available Operations

* [getCoupons](#getcoupons) - Get Coupons
* [createCoupon](#createcoupon) - Create Coupon
* [getCoupon](#getcoupon) - Get Coupon
* [updateCoupon](#updatecoupon) - Update Coupon
* [deleteCoupon](#deletecoupon) - Delete Coupon
* [getCouponCodes](#getcouponcodes) - Get Coupon Codes
* [createCouponCode](#createcouponcode) - Create Coupon Code
* [getCouponCode](#getcouponcode) - Get Coupon Code
* [updateCouponCode](#updatecouponcode) - Update Coupon Code
* [deleteCouponCode](#deletecouponcode) - Delete Coupon Code
* [getBulkCreateCouponCodeJobs](#getbulkcreatecouponcodejobs) - Get Bulk Create Coupon Code Jobs
* [bulkCreateCouponCodes](#bulkcreatecouponcodes) - Bulk Create Coupon Codes
* [getBulkCreateCouponCodesJob](#getbulkcreatecouponcodesjob) - Get Bulk Create Coupon Codes Job
* [getCouponForCouponCode](#getcouponforcouponcode) - Get Coupon For Coupon Code
* [getCouponIdForCouponCode](#getcouponidforcouponcode) - Get Coupon ID for Coupon Code
* [getCouponCodesForCoupon](#getcouponcodesforcoupon) - Get Coupon Codes For Coupon
* [getCodeIdsForCoupon](#getcodeidsforcoupon) - Get Code IDs for Coupon

## getCoupons

Get all coupons in an account.

To learn more, see our [Coupons API guide](https://developers.klaviyo.com/en/docs/use_klaviyos_coupons_api).<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`coupons:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsCoupon;
import com.commercesystems.klaviyo_java.models.operations.GetCouponsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCouponsResponse res = sdk.coupons().getCoupons()
                .fieldsCoupon(List.of(
                    FieldsCoupon.EXTERNAL_ID))
                .pageCursor("<value>")
                .revision("2024-10-15")
                .call();

        if (res.getCouponResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `fieldsCoupon`                                                                                                          | List\<[FieldsCoupon](../../models/operations/FieldsCoupon.md)>                                                          | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |
| `pageCursor`                                                                                                            | *Optional\<String>*                                                                                                     | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination       |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |

### Response

**[GetCouponsResponse](../../models/operations/GetCouponsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createCoupon

Creates a new coupon.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`coupons:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CouponCreateQuery;
import com.commercesystems.klaviyo_java.models.components.CouponCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CouponCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CouponEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateCouponResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CreateCouponResponse res = sdk.coupons().createCoupon()
                .revision("2024-10-15")
                .couponCreateQuery(CouponCreateQuery.builder()
                    .data(CouponCreateQueryResourceObject.builder()
                        .type(CouponEnum.COUPON)
                        .attributes(CouponCreateQueryResourceObjectAttributes.builder()
                            .externalId("10OFF")
                            .description("10% off for purchases over $50")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postCouponResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `revision`                                                        | *String*                                                          | :heavy_check_mark:                                                | API endpoint revision (format: YYYY-MM-DD[.suffix])               |
| `couponCreateQuery`                                               | [CouponCreateQuery](../../models/components/CouponCreateQuery.md) | :heavy_check_mark:                                                | N/A                                                               |

### Response

**[CreateCouponResponse](../../models/operations/CreateCouponResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCoupon

Get a specific coupon with the given coupon ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`coupons:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCouponResponse;
import com.commercesystems.klaviyo_java.models.operations.QueryParamFieldsCoupon;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCouponResponse res = sdk.coupons().getCoupon()
                .id("10OFF")
                .fieldsCoupon(List.of(
                    QueryParamFieldsCoupon.DESCRIPTION))
                .revision("2024-10-15")
                .call();

        if (res.getCouponResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             | Example                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | The internal id of a Coupon is equivalent to its external id stored within an integration.                              | 10OFF                                                                                                                   |
| `fieldsCoupon`                                                                                                          | List\<[QueryParamFieldsCoupon](../../models/operations/QueryParamFieldsCoupon.md)>                                      | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |                                                                                                                         |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |                                                                                                                         |

### Response

**[GetCouponResponse](../../models/operations/GetCouponResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## updateCoupon

*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`coupons:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CouponEnum;
import com.commercesystems.klaviyo_java.models.components.CouponUpdateQuery;
import com.commercesystems.klaviyo_java.models.components.CouponUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CouponUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UpdateCouponResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateCouponResponse res = sdk.coupons().updateCoupon()
                .id("10OFF")
                .revision("2024-10-15")
                .couponUpdateQuery(CouponUpdateQuery.builder()
                    .data(CouponUpdateQueryResourceObject.builder()
                        .type(CouponEnum.COUPON)
                        .id("10OFF")
                        .attributes(CouponUpdateQueryResourceObjectAttributes.builder()
                            .description("10% off for purchases over $50")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.patchCouponResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                  | Type                                                                                       | Required                                                                                   | Description                                                                                | Example                                                                                    |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `id`                                                                                       | *String*                                                                                   | :heavy_check_mark:                                                                         | The internal id of a Coupon is equivalent to its external id stored within an integration. | 10OFF                                                                                      |
| `revision`                                                                                 | *String*                                                                                   | :heavy_check_mark:                                                                         | API endpoint revision (format: YYYY-MM-DD[.suffix])                                        |                                                                                            |
| `couponUpdateQuery`                                                                        | [CouponUpdateQuery](../../models/components/CouponUpdateQuery.md)                          | :heavy_check_mark:                                                                         | N/A                                                                                        |                                                                                            |

### Response

**[UpdateCouponResponse](../../models/operations/UpdateCouponResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## deleteCoupon

Delete the coupon with the given coupon ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`coupons:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.DeleteCouponResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        DeleteCouponResponse res = sdk.coupons().deleteCoupon()
                .id("10OFF")
                .revision("2024-10-15")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                  | Type                                                                                       | Required                                                                                   | Description                                                                                | Example                                                                                    |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `id`                                                                                       | *String*                                                                                   | :heavy_check_mark:                                                                         | The internal id of a Coupon is equivalent to its external id stored within an integration. | 10OFF                                                                                      |
| `revision`                                                                                 | *String*                                                                                   | :heavy_check_mark:                                                                         | API endpoint revision (format: YYYY-MM-DD[.suffix])                                        |                                                                                            |

### Response

**[DeleteCouponResponse](../../models/operations/DeleteCouponResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCouponCodes

Gets a list of coupon codes associated with a coupon/coupons or a profile/profiles.

A coupon/coupons or a profile/profiles must be provided as required filter params.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`coupon-codes:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCouponCodesRequest;
import com.commercesystems.klaviyo_java.models.operations.GetCouponCodesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCouponCodesRequest req = GetCouponCodesRequest.builder()
                .revision("2024-10-15")
                .build();

        GetCouponCodesResponse res = sdk.coupons().getCouponCodes()
                .request(req)
                .call();

        if (res.getCouponCodeResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetCouponCodesRequest](../../models/operations/GetCouponCodesRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetCouponCodesResponse](../../models/operations/GetCouponCodesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createCouponCode

Synchronously creates a coupon code for the given coupon.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`coupon-codes:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.Coupon;
import com.commercesystems.klaviyo_java.models.components.CouponCodeCreateQuery;
import com.commercesystems.klaviyo_java.models.components.CouponCodeCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CouponCodeCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CouponCodeCreateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.CouponCodeCreateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.components.CouponCodeEnum;
import com.commercesystems.klaviyo_java.models.components.CouponEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateCouponCodeResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CreateCouponCodeResponse res = sdk.coupons().createCouponCode()
                .revision("2024-10-15")
                .couponCodeCreateQuery(CouponCodeCreateQuery.builder()
                    .data(CouponCodeCreateQueryResourceObject.builder()
                        .type(CouponCodeEnum.COUPON_CODE)
                        .attributes(CouponCodeCreateQueryResourceObjectAttributes.builder()
                            .uniqueCode("ASD325FHK324UJDOI2M3JNES99")
                            .expiresAt(OffsetDateTime.parse("2023-01-01T00:00:00Z"))
                            .build())
                        .relationships(CouponCodeCreateQueryResourceObjectRelationships.builder()
                            .coupon(Coupon.builder()
                                .data(CouponCodeCreateQueryResourceObjectData.builder()
                                    .type(CouponEnum.COUPON)
                                    .id("10OFF")
                                    .build())
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postCouponCodeResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `revision`                                                                | *String*                                                                  | :heavy_check_mark:                                                        | API endpoint revision (format: YYYY-MM-DD[.suffix])                       |
| `couponCodeCreateQuery`                                                   | [CouponCodeCreateQuery](../../models/components/CouponCodeCreateQuery.md) | :heavy_check_mark:                                                        | N/A                                                                       |

### Response

**[CreateCouponCodeResponse](../../models/operations/CreateCouponCodeResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCouponCode

Returns a Coupon Code specified by the given identifier.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`coupon-codes:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCouponCodeRequest;
import com.commercesystems.klaviyo_java.models.operations.GetCouponCodeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCouponCodeRequest req = GetCouponCodeRequest.builder()
                .id("10OFF-ASD325FHK324UJDOI2M3JNES99")
                .revision("2024-10-15")
                .build();

        GetCouponCodeResponse res = sdk.coupons().getCouponCode()
                .request(req)
                .call();

        if (res.getCouponCodeResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetCouponCodeRequest](../../models/operations/GetCouponCodeRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetCouponCodeResponse](../../models/operations/GetCouponCodeResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## updateCouponCode

Updates a coupon code specified by the given identifier synchronously. We allow updating the 'status' and
'expires_at' of coupon codes.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`coupon-codes:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CouponCodeEnum;
import com.commercesystems.klaviyo_java.models.components.CouponCodeUpdateQuery;
import com.commercesystems.klaviyo_java.models.components.CouponCodeUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CouponCodeUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UpdateCouponCodeResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateCouponCodeResponse res = sdk.coupons().updateCouponCode()
                .id("10OFF-ASD325FHK324UJDOI2M3JNES99")
                .revision("2024-10-15")
                .couponCodeUpdateQuery(CouponCodeUpdateQuery.builder()
                    .data(CouponCodeUpdateQueryResourceObject.builder()
                        .type(CouponCodeEnum.COUPON_CODE)
                        .id("10OFF-ASD325FHK324UJDOI2M3JNES99")
                        .attributes(CouponCodeUpdateQueryResourceObjectAttributes.builder()
                            .expiresAt(OffsetDateTime.parse("2023-01-01T00:00:00Z"))
                            .build())
                        .build())
                    .build())
                .call();

        if (res.patchCouponCodeResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 | Example                                                                                                     |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                        | *String*                                                                                                    | :heavy_check_mark:                                                                                          | The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with. | 10OFF-ASD325FHK324UJDOI2M3JNES99                                                                            |
| `revision`                                                                                                  | *String*                                                                                                    | :heavy_check_mark:                                                                                          | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                         |                                                                                                             |
| `couponCodeUpdateQuery`                                                                                     | [CouponCodeUpdateQuery](../../models/components/CouponCodeUpdateQuery.md)                                   | :heavy_check_mark:                                                                                          | N/A                                                                                                         |                                                                                                             |

### Response

**[UpdateCouponCodeResponse](../../models/operations/UpdateCouponCodeResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## deleteCouponCode

Deletes a coupon code specified by the given identifier synchronously. If a profile has been assigned to the
coupon code, an exception will be raised<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`coupon-codes:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.DeleteCouponCodeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        DeleteCouponCodeResponse res = sdk.coupons().deleteCouponCode()
                .id("10OFF-ASD325FHK324UJDOI2M3JNES99")
                .revision("2024-10-15")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 | Example                                                                                                     |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                        | *String*                                                                                                    | :heavy_check_mark:                                                                                          | The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with. | 10OFF-ASD325FHK324UJDOI2M3JNES99                                                                            |
| `revision`                                                                                                  | *String*                                                                                                    | :heavy_check_mark:                                                                                          | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                         |                                                                                                             |

### Response

**[DeleteCouponCodeResponse](../../models/operations/DeleteCouponCodeResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getBulkCreateCouponCodeJobs

Get all coupon code bulk create jobs.

Returns a maximum of 100 jobs per request.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`coupon-codes:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsCouponCodeBulkCreateJob;
import com.commercesystems.klaviyo_java.models.operations.GetBulkCreateCouponCodeJobsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetBulkCreateCouponCodeJobsResponse res = sdk.coupons().getBulkCreateCouponCodeJobs()
                .fieldsCouponCodeBulkCreateJob(List.of(
                    FieldsCouponCodeBulkCreateJob.STATUS))
                .filter("<value>")
                .pageCursor("<value>")
                .revision("2024-10-15")
                .call();

        if (res.getCouponCodeCreateJobResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                               | Type                                                                                                                                                                    | Required                                                                                                                                                                | Description                                                                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `fieldsCouponCodeBulkCreateJob`                                                                                                                                         | List\<[FieldsCouponCodeBulkCreateJob](../../models/operations/FieldsCouponCodeBulkCreateJob.md)>                                                                        | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                                                 |
| `filter`                                                                                                                                                                | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`status`: `equals` |
| `pageCursor`                                                                                                                                                            | *Optional\<String>*                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination                                                       |
| `revision`                                                                                                                                                              | *String*                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                     |

### Response

**[GetBulkCreateCouponCodeJobsResponse](../../models/operations/GetBulkCreateCouponCodeJobsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## bulkCreateCouponCodes

Create a coupon-code-bulk-create-job to bulk create a list of coupon codes.

Max number of coupon codes per job we allow for is 1000.
Max number of jobs queued at once we allow for is 100.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`coupon-codes:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.Coupon;
import com.commercesystems.klaviyo_java.models.components.CouponCodeBulkCreateJobEnum;
import com.commercesystems.klaviyo_java.models.components.CouponCodeCreateJobCreateQuery;
import com.commercesystems.klaviyo_java.models.components.CouponCodeCreateJobCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CouponCodeCreateJobCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CouponCodeCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CouponCodeCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CouponCodeCreateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.CouponCodeCreateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.components.CouponCodeEnum;
import com.commercesystems.klaviyo_java.models.components.CouponCodes;
import com.commercesystems.klaviyo_java.models.components.CouponEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.BulkCreateCouponCodesResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        BulkCreateCouponCodesResponse res = sdk.coupons().bulkCreateCouponCodes()
                .revision("2024-10-15")
                .couponCodeCreateJobCreateQuery(CouponCodeCreateJobCreateQuery.builder()
                    .data(CouponCodeCreateJobCreateQueryResourceObject.builder()
                        .type(CouponCodeBulkCreateJobEnum.COUPON_CODE_BULK_CREATE_JOB)
                        .attributes(CouponCodeCreateJobCreateQueryResourceObjectAttributes.builder()
                            .couponCodes(CouponCodes.builder()
                                .data(List.of(
                                    CouponCodeCreateQueryResourceObject.builder()
                                        .type(CouponCodeEnum.COUPON_CODE)
                                        .attributes(CouponCodeCreateQueryResourceObjectAttributes.builder()
                                            .uniqueCode("ASD325FHK324UJDOI2M3JNES99")
                                            .expiresAt(OffsetDateTime.parse("2023-01-01T00:00:00Z"))
                                            .build())
                                        .relationships(CouponCodeCreateQueryResourceObjectRelationships.builder()
                                            .coupon(Coupon.builder()
                                                .data(CouponCodeCreateQueryResourceObjectData.builder()
                                                    .type(CouponEnum.COUPON)
                                                    .id("10OFF")
                                                    .build())
                                                .build())
                                            .build())
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postCouponCodeCreateJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `revision`                                                                                  | *String*                                                                                    | :heavy_check_mark:                                                                          | API endpoint revision (format: YYYY-MM-DD[.suffix])                                         |
| `couponCodeCreateJobCreateQuery`                                                            | [CouponCodeCreateJobCreateQuery](../../models/components/CouponCodeCreateJobCreateQuery.md) | :heavy_check_mark:                                                                          | N/A                                                                                         |

### Response

**[BulkCreateCouponCodesResponse](../../models/operations/BulkCreateCouponCodesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getBulkCreateCouponCodesJob

Get a coupon code bulk create job with the given job ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`coupon-codes:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetBulkCreateCouponCodesJobRequest;
import com.commercesystems.klaviyo_java.models.operations.GetBulkCreateCouponCodesJobResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetBulkCreateCouponCodesJobRequest req = GetBulkCreateCouponCodesJobRequest.builder()
                .jobId("01GSQPBF74KQ5YTDEPP41T1BZH")
                .revision("2024-10-15")
                .build();

        GetBulkCreateCouponCodesJobResponse res = sdk.coupons().getBulkCreateCouponCodesJob()
                .request(req)
                .call();

        if (res.getCouponCodeCreateJobResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [GetBulkCreateCouponCodesJobRequest](../../models/operations/GetBulkCreateCouponCodesJobRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[GetBulkCreateCouponCodesJobResponse](../../models/operations/GetBulkCreateCouponCodesJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCouponForCouponCode

Get the coupon associated with a given coupon code ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`coupons:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCouponForCouponCodeQueryParamFieldsCoupon;
import com.commercesystems.klaviyo_java.models.operations.GetCouponForCouponCodeResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCouponForCouponCodeResponse res = sdk.coupons().getCouponForCouponCode()
                .id("10OFF")
                .fieldsCoupon(List.of(
                    GetCouponForCouponCodeQueryParamFieldsCoupon.DESCRIPTION))
                .revision("2024-10-15")
                .call();

        if (res.getCouponResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    | Example                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                           | *String*                                                                                                                       | :heavy_check_mark:                                                                                                             | The ID of the coupon to look up the relationship of.                                                                           | 10OFF                                                                                                                          |
| `fieldsCoupon`                                                                                                                 | List\<[GetCouponForCouponCodeQueryParamFieldsCoupon](../../models/operations/GetCouponForCouponCodeQueryParamFieldsCoupon.md)> | :heavy_minus_sign:                                                                                                             | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets        |                                                                                                                                |
| `revision`                                                                                                                     | *String*                                                                                                                       | :heavy_check_mark:                                                                                                             | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                            |                                                                                                                                |

### Response

**[GetCouponForCouponCodeResponse](../../models/operations/GetCouponForCouponCodeResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCouponIdForCouponCode

Gets the coupon relationship associated with the given coupon code id<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`coupons:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCouponIdForCouponCodeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCouponIdForCouponCodeResponse res = sdk.coupons().getCouponIdForCouponCode()
                .id("10OFF-ASD325FHK324UJDOI2M3JNES99")
                .revision("2024-10-15")
                .call();

        if (res.getCouponCodeRelationshipCouponResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               | Example                                                   |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `id`                                                      | *String*                                                  | :heavy_check_mark:                                        | The ID of the coupon code to look up the relationship of. | 10OFF-ASD325FHK324UJDOI2M3JNES99                          |
| `revision`                                                | *String*                                                  | :heavy_check_mark:                                        | API endpoint revision (format: YYYY-MM-DD[.suffix])       |                                                           |

### Response

**[GetCouponIdForCouponCodeResponse](../../models/operations/GetCouponIdForCouponCodeResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCouponCodesForCoupon

Gets a list of coupon codes associated with the given coupon id<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`coupon-codes:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCouponCodesForCouponRequest;
import com.commercesystems.klaviyo_java.models.operations.GetCouponCodesForCouponResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCouponCodesForCouponRequest req = GetCouponCodesForCouponRequest.builder()
                .id("10OFF")
                .revision("2024-10-15")
                .build();

        GetCouponCodesForCouponResponse res = sdk.coupons().getCouponCodesForCoupon()
                .request(req)
                .call();

        if (res.getCouponCodeResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetCouponCodesForCouponRequest](../../models/operations/GetCouponCodesForCouponRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetCouponCodesForCouponResponse](../../models/operations/GetCouponCodesForCouponResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCodeIdsForCoupon

Gets a list of coupon code relationships associated with the given coupon id<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`coupon-codes:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCodeIdsForCouponResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCodeIdsForCouponResponse res = sdk.coupons().getCodeIdsForCoupon()
                .id("10OFF")
                .pageCursor("<value>")
                .revision("2024-10-15")
                .call();

        if (res.getCouponRelationshipCouponCodesListResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       | Example                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                              | *String*                                                                                                          | :heavy_check_mark:                                                                                                | The ID of the coupon to look up the relationship of.                                                              | 10OFF                                                                                                             |
| `pageCursor`                                                                                                      | *Optional\<String>*                                                                                               | :heavy_minus_sign:                                                                                                | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination |                                                                                                                   |
| `revision`                                                                                                        | *String*                                                                                                          | :heavy_check_mark:                                                                                                | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                               |                                                                                                                   |

### Response

**[GetCodeIdsForCouponResponse](../../models/operations/GetCodeIdsForCouponResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |