# Reviews
(*reviews()*)

## Overview

reviews

### Available Operations

* [getReviews](#getreviews) - Get Reviews
* [getReview](#getreview) - Get Review

## getReviews

Get all reviews.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`reviews:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetReviewsRequest;
import com.commercesystems.klaviyo_java.models.operations.GetReviewsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetReviewsRequest req = GetReviewsRequest.builder()
                .revision("2024-10-15")
                .build();

        GetReviewsResponse res = sdk.reviews().getReviews()
                .request(req)
                .call();

        if (res.getReviewResponseDto20240715CollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetReviewsRequest](../../models/operations/GetReviewsRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetReviewsResponse](../../models/operations/GetReviewsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getReview

Get the review with the given ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`reviews:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetReviewRequest;
import com.commercesystems.klaviyo_java.models.operations.GetReviewResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetReviewRequest req = GetReviewRequest.builder()
                .id("2134228")
                .revision("2024-10-15")
                .build();

        GetReviewResponse res = sdk.reviews().getReview()
                .request(req)
                .call();

        if (res.getReviewResponseDto20240715CompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetReviewRequest](../../models/operations/GetReviewRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetReviewResponse](../../models/operations/GetReviewResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |