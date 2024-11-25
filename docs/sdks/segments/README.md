# Segments
(*segments()*)

## Overview

segments

### Available Operations

* [getSegments](#getsegments) - Get Segments
* [createSegment](#createsegment) - Create Segment
* [getSegment](#getsegment) - Get Segment
* [updateSegment](#updatesegment) - Update Segment
* [deleteSegment](#deletesegment) - Delete Segment
* [getTagIdsForSegment](#gettagidsforsegment) - Get Tag IDs for Segment
* [getTagsForSegment](#gettagsforsegment) - Get Tags for Segment
* [getProfileIdsForSegment](#getprofileidsforsegment) - Get Profile IDs for Segment
* [getProfilesForSegment](#getprofilesforsegment) - Get Profiles for Segment
* [getSegmentRelationshipsFlowTriggers](#getsegmentrelationshipsflowtriggers) - Get Segment Relationships Flow Triggers
* [getSegmentFlowTriggers](#getsegmentflowtriggers) - Get Segment Flow Triggers

## getSegments

Get all segments in an account.

Filter to request a subset of all segments. Segments can be filtered by `name`, `created`, and `updated` fields.

Returns a maximum of 10 results per page.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`segments:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetSegmentsRequest;
import com.commercesystems.klaviyo_java.models.operations.GetSegmentsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetSegmentsRequest req = GetSegmentsRequest.builder()
                .revision("2024-10-15")
                .build();

        GetSegmentsResponse res = sdk.segments().getSegments()
                .request(req)
                .call();

        if (res.getSegmentListResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetSegmentsRequest](../../models/operations/GetSegmentsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetSegmentsResponse](../../models/operations/GetSegmentsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createSegment

Create a segment.<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `15/m`<br>Daily: `100/d`

**Scopes:**
`segments:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.ConditionGroup;
import com.commercesystems.klaviyo_java.models.components.Conditions;
import com.commercesystems.klaviyo_java.models.components.DateEnum;
import com.commercesystems.klaviyo_java.models.components.Measurement;
import com.commercesystems.klaviyo_java.models.components.NumericEnum;
import com.commercesystems.klaviyo_java.models.components.NumericOperatorFilter;
import com.commercesystems.klaviyo_java.models.components.NumericOperatorFilterValue;
import com.commercesystems.klaviyo_java.models.components.Operator;
import com.commercesystems.klaviyo_java.models.components.ProfileMetricCondition;
import com.commercesystems.klaviyo_java.models.components.ProfileMetricConditionTimeframeFilter;
import com.commercesystems.klaviyo_java.models.components.ProfileMetricEnum;
import com.commercesystems.klaviyo_java.models.components.RelativeAnniversaryDateFilter;
import com.commercesystems.klaviyo_java.models.components.RelativeAnniversaryDateFilterOperator;
import com.commercesystems.klaviyo_java.models.components.RelativeAnniversaryDateFilterUnit;
import com.commercesystems.klaviyo_java.models.components.SegmentCreateQuery;
import com.commercesystems.klaviyo_java.models.components.SegmentCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.SegmentCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.SegmentDefinition;
import com.commercesystems.klaviyo_java.models.components.SegmentEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateSegmentResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CreateSegmentResponse res = sdk.segments().createSegment()
                .revision("2024-10-15")
                .segmentCreateQuery(SegmentCreateQuery.builder()
                    .data(SegmentCreateQueryResourceObject.builder()
                        .type(SegmentEnum.SEGMENT)
                        .attributes(SegmentCreateQueryResourceObjectAttributes.builder()
                            .name("<value>")
                            .definition(SegmentDefinition.builder()
                                .conditionGroups(List.of(
                                    ConditionGroup.builder()
                                        .conditions(List.of(
                                            Conditions.of(ProfileMetricCondition.builder()
                                                .type(ProfileMetricEnum.PROFILE_METRIC)
                                                .metricId("<id>")
                                                .measurement(Measurement.COUNT)
                                                .measurementFilter(NumericOperatorFilter.builder()
                                                    .type(NumericEnum.NUMERIC)
                                                    .operator(Operator.NOT_EQUALS)
                                                    .value(NumericOperatorFilterValue.of(8407.20d))
                                                    .build())
                                                .timeframeFilter(ProfileMetricConditionTimeframeFilter.of(RelativeAnniversaryDateFilter.builder()
                                                    .type(DateEnum.DATE)
                                                    .operator(RelativeAnniversaryDateFilterOperator.ANNIVERSARY_NEXT)
                                                    .unit(RelativeAnniversaryDateFilterUnit.HOUR)
                                                    .quantity(68698L)
                                                    .build()))
                                                .build())))
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postSegmentCreateResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `revision`                                                          | *String*                                                            | :heavy_check_mark:                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                 |
| `segmentCreateQuery`                                                | [SegmentCreateQuery](../../models/components/SegmentCreateQuery.md) | :heavy_check_mark:                                                  | N/A                                                                 |

### Response

**[CreateSegmentResponse](../../models/operations/CreateSegmentResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getSegment

Get a segment with the given segment ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`<br><br>Rate limits when using the `additional-fields[segment]=profile_count` parameter in your API request:<br>Burst: `1/s`<br>Steady: `15/m`<br><br>To learn more about how the `additional-fields` parameter impacts rate limits, check out our [Rate limits, status codes, and errors](https://developers.klaviyo.com/en/v2024-10-15/docs/rate_limits_and_error_handling) guide.

**Scopes:**
`segments:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetSegmentRequest;
import com.commercesystems.klaviyo_java.models.operations.GetSegmentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetSegmentRequest req = GetSegmentRequest.builder()
                .id("<id>")
                .revision("2024-10-15")
                .build();

        GetSegmentResponse res = sdk.segments().getSegment()
                .request(req)
                .call();

        if (res.getSegmentRetrieveResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetSegmentRequest](../../models/operations/GetSegmentRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetSegmentResponse](../../models/operations/GetSegmentResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## updateSegment

Update a segment with the given segment ID.<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `15/m`<br>Daily: `100/d`

**Scopes:**
`segments:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.ConditionGroup;
import com.commercesystems.klaviyo_java.models.components.Conditions;
import com.commercesystems.klaviyo_java.models.components.Consent;
import com.commercesystems.klaviyo_java.models.components.DateEnum;
import com.commercesystems.klaviyo_java.models.components.EmailEnum;
import com.commercesystems.klaviyo_java.models.components.InvalidEmailDateEnum;
import com.commercesystems.klaviyo_java.models.components.InvalidEmailDateFilter;
import com.commercesystems.klaviyo_java.models.components.InvalidEmailDateFilterFilter;
import com.commercesystems.klaviyo_java.models.components.NoEmailMarketingConsent;
import com.commercesystems.klaviyo_java.models.components.NoEmailMarketingConsentCanReceiveMarketing;
import com.commercesystems.klaviyo_java.models.components.NoEmailMarketingConsentConsentStatus;
import com.commercesystems.klaviyo_java.models.components.NoEmailMarketingSubscribed;
import com.commercesystems.klaviyo_java.models.components.NoEmailMarketingSubscribedFilters;
import com.commercesystems.klaviyo_java.models.components.ProfileMarketingConsentCondition;
import com.commercesystems.klaviyo_java.models.components.ProfileMarketingConsentEnum;
import com.commercesystems.klaviyo_java.models.components.RelativeAnniversaryDateFilter;
import com.commercesystems.klaviyo_java.models.components.RelativeAnniversaryDateFilterOperator;
import com.commercesystems.klaviyo_java.models.components.RelativeAnniversaryDateFilterUnit;
import com.commercesystems.klaviyo_java.models.components.SegmentDefinition;
import com.commercesystems.klaviyo_java.models.components.SegmentEnum;
import com.commercesystems.klaviyo_java.models.components.SegmentPartialUpdateQuery;
import com.commercesystems.klaviyo_java.models.components.SegmentPartialUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.SegmentPartialUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.SubscribedEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UpdateSegmentResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateSegmentResponse res = sdk.segments().updateSegment()
                .id("<id>")
                .revision("2024-10-15")
                .segmentPartialUpdateQuery(SegmentPartialUpdateQuery.builder()
                    .data(SegmentPartialUpdateQueryResourceObject.builder()
                        .type(SegmentEnum.SEGMENT)
                        .id("<id>")
                        .attributes(SegmentPartialUpdateQueryResourceObjectAttributes.builder()
                            .definition(SegmentDefinition.builder()
                                .conditionGroups(List.of(
                                    ConditionGroup.builder()
                                        .conditions(List.of(
                                            Conditions.of(ProfileMarketingConsentCondition.builder()
                                                .type(ProfileMarketingConsentEnum.PROFILE_MARKETING_CONSENT)
                                                .consent(Consent.of(NoEmailMarketingConsent.builder()
                                                    .channel(EmailEnum.EMAIL)
                                                    .canReceiveMarketing(NoEmailMarketingConsentCanReceiveMarketing.FALSE)
                                                    .consentStatus(NoEmailMarketingConsentConsentStatus.of(NoEmailMarketingSubscribed.builder()
                                                        .subscription(SubscribedEnum.SUBSCRIBED)
                                                        .filters(List.of(
                                                            NoEmailMarketingSubscribedFilters.of(InvalidEmailDateFilter.builder()
                                                                .field(InvalidEmailDateEnum.INVALID_EMAIL_DATE)
                                                                .filter(InvalidEmailDateFilterFilter.of(RelativeAnniversaryDateFilter.builder()
                                                                    .type(DateEnum.DATE)
                                                                    .operator(RelativeAnniversaryDateFilterOperator.ANNIVERSARY_NEXT)
                                                                    .unit(RelativeAnniversaryDateFilterUnit.DAY)
                                                                    .quantity(117995L)
                                                                    .build()))
                                                                .build())))
                                                        .build()))
                                                    .build()))
                                                .build())))
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.patchSegmentPartialUpdateResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `id`                                                                              | *String*                                                                          | :heavy_check_mark:                                                                | N/A                                                                               |
| `revision`                                                                        | *String*                                                                          | :heavy_check_mark:                                                                | API endpoint revision (format: YYYY-MM-DD[.suffix])                               |
| `segmentPartialUpdateQuery`                                                       | [SegmentPartialUpdateQuery](../../models/components/SegmentPartialUpdateQuery.md) | :heavy_check_mark:                                                                | N/A                                                                               |

### Response

**[UpdateSegmentResponse](../../models/operations/UpdateSegmentResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## deleteSegment

Delete a segment with the given segment ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`segments:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.DeleteSegmentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        DeleteSegmentResponse res = sdk.segments().deleteSegment()
                .id("<id>")
                .revision("2024-10-15")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | N/A                                                 |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |

### Response

**[DeleteSegmentResponse](../../models/operations/DeleteSegmentResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getTagIdsForSegment

If `related_resource` is `tags`, returns the tag IDs of all tags associated with the given segment ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`segments:read`
`tags:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetTagIdsForSegmentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTagIdsForSegmentResponse res = sdk.segments().getTagIdsForSegment()
                .id("<id>")
                .revision("2024-10-15")
                .call();

        if (res.getSegmentTagRelationshipListResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | N/A                                                 |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |

### Response

**[GetTagIdsForSegmentResponse](../../models/operations/GetTagIdsForSegmentResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getTagsForSegment

Return all tags associated with the given segment ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`segments:read`
`tags:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetTagsForSegmentQueryParamFieldsTag;
import com.commercesystems.klaviyo_java.models.operations.GetTagsForSegmentResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTagsForSegmentResponse res = sdk.segments().getTagsForSegment()
                .id("<id>")
                .fieldsTag(List.of(
                    GetTagsForSegmentQueryParamFieldsTag.NAME))
                .revision("2024-10-15")
                .call();

        if (res.getTagResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | N/A                                                                                                                     |
| `fieldsTag`                                                                                                             | List\<[GetTagsForSegmentQueryParamFieldsTag](../../models/operations/GetTagsForSegmentQueryParamFieldsTag.md)>          | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |

### Response

**[GetTagsForSegmentResponse](../../models/operations/GetTagsForSegmentResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getProfileIdsForSegment

Get all profile membership [relationships](https://developers.klaviyo.com/en/reference/api_overview#relationships) for the given segment ID.<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`profiles:read`
`segments:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetProfileIdsForSegmentRequest;
import com.commercesystems.klaviyo_java.models.operations.GetProfileIdsForSegmentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetProfileIdsForSegmentRequest req = GetProfileIdsForSegmentRequest.builder()
                .id("Y6nRLr")
                .revision("2024-10-15")
                .build();

        GetProfileIdsForSegmentResponse res = sdk.segments().getProfileIdsForSegment()
                .request(req)
                .call();

        if (res.getSegmentRelationshipsResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetProfileIdsForSegmentRequest](../../models/operations/GetProfileIdsForSegmentRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetProfileIdsForSegmentResponse](../../models/operations/GetProfileIdsForSegmentResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getProfilesForSegment

Get all profiles within a segment with the given segment ID.

Filter to request a subset of all profiles. Profiles can be filtered by `email`, `phone_number`, `push_token`, and `joined_group_at` fields. Profiles can be sorted by the following fields, in ascending and descending order: `joined_group_at`<br><br>*Rate limits*:<br>Burst: `75/s`<br>Steady: `700/m`

**Scopes:**
`profiles:read`
`segments:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetProfilesForSegmentRequest;
import com.commercesystems.klaviyo_java.models.operations.GetProfilesForSegmentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetProfilesForSegmentRequest req = GetProfilesForSegmentRequest.builder()
                .id("<id>")
                .revision("2024-10-15")
                .build();

        GetProfilesForSegmentResponse res = sdk.segments().getProfilesForSegment()
                .request(req)
                .call();

        if (res.getSegmentMemberResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetProfilesForSegmentRequest](../../models/operations/GetProfilesForSegmentRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetProfilesForSegmentResponse](../../models/operations/GetProfilesForSegmentResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getSegmentRelationshipsFlowTriggers

Get all flow [relationships](https://developers.klaviyo.com/en/reference/api_overview#relationships) where the given segment is being used as the trigger.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:read`
`segments:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetSegmentRelationshipsFlowTriggersResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetSegmentRelationshipsFlowTriggersResponse res = sdk.segments().getSegmentRelationshipsFlowTriggers()
                .id("Y6nRLr")
                .revision("2024-10-15")
                .call();

        if (res.getSegmentFlowTriggersRelationshipsResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              | Example                                                                  |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `id`                                                                     | *String*                                                                 | :heavy_check_mark:                                                       | Primary key that uniquely identifies this segment. Generated by Klaviyo. | Y6nRLr                                                                   |
| `revision`                                                               | *String*                                                                 | :heavy_check_mark:                                                       | API endpoint revision (format: YYYY-MM-DD[.suffix])                      |                                                                          |

### Response

**[GetSegmentRelationshipsFlowTriggersResponse](../../models/operations/GetSegmentRelationshipsFlowTriggersResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getSegmentFlowTriggers

Get all flows where the given segment ID is being used as the trigger.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:read`
`segments:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetSegmentFlowTriggersQueryParamFieldsFlow;
import com.commercesystems.klaviyo_java.models.operations.GetSegmentFlowTriggersResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetSegmentFlowTriggersResponse res = sdk.segments().getSegmentFlowTriggers()
                .id("Y6nRLr")
                .fieldsFlow(List.of(
                    GetSegmentFlowTriggersQueryParamFieldsFlow.CREATED))
                .revision("2024-10-15")
                .call();

        if (res.getFlowResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                | Example                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                       | *String*                                                                                                                   | :heavy_check_mark:                                                                                                         | Primary key that uniquely identifies this segment. Generated by Klaviyo.                                                   | Y6nRLr                                                                                                                     |
| `fieldsFlow`                                                                                                               | List\<[GetSegmentFlowTriggersQueryParamFieldsFlow](../../models/operations/GetSegmentFlowTriggersQueryParamFieldsFlow.md)> | :heavy_minus_sign:                                                                                                         | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets    |                                                                                                                            |
| `revision`                                                                                                                 | *String*                                                                                                                   | :heavy_check_mark:                                                                                                         | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                        |                                                                                                                            |

### Response

**[GetSegmentFlowTriggersResponse](../../models/operations/GetSegmentFlowTriggersResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |