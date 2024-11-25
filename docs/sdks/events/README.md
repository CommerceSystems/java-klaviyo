# Events
(*events()*)

## Overview

events

### Available Operations

* [getEvents](#getevents) - Get Events
* [createEvent](#createevent) - Create Event
* [getEvent](#getevent) - Get Event
* [bulkCreateEvents](#bulkcreateevents) - Bulk Create Events
* [getMetricIdForEvent](#getmetricidforevent) - Get Metric ID for Event
* [getEventMetric](#geteventmetric) - Get Event Metric
* [getProfileIdForEvent](#getprofileidforevent) - Get Profile ID for Event
* [getEventProfile](#geteventprofile) - Get Event Profile

## getEvents

Get all events in an account

Requests can be sorted by the following fields:
`datetime`, `timestamp`

Returns a maximum of 200 events per page.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`events:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetEventsRequest;
import com.commercesystems.klaviyo_java.models.operations.GetEventsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetEventsRequest req = GetEventsRequest.builder()
                .revision("2024-10-15")
                .build();

        GetEventsResponse res = sdk.events().getEvents()
                .request(req)
                .call();

        if (res.getEventResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetEventsRequest](../../models/operations/GetEventsRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetEventsResponse](../../models/operations/GetEventsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createEvent

Create a new event to track a profile's activity.

Note that this endpoint allows you to create a new profile or update an existing profile's properties.

At a minimum, profile and metric objects should include at least one profile identifier (e.g., `id`, `email`, or `phone_number`) and the metric `name`, respectively.

Successful response indicates that the event was validated and submitted for processing, but does not guarantee that processing is complete.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`events:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.Append;
import com.commercesystems.klaviyo_java.models.components.EventCreateQueryV2;
import com.commercesystems.klaviyo_java.models.components.EventCreateQueryV2ResourceObject;
import com.commercesystems.klaviyo_java.models.components.EventCreateQueryV2ResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.EventCreateQueryV2ResourceObjectProfile;
import com.commercesystems.klaviyo_java.models.components.EventCreateQueryV2ResourceObjectProperties;
import com.commercesystems.klaviyo_java.models.components.EventEnum;
import com.commercesystems.klaviyo_java.models.components.EventProfileCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.EventProfileCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.EventProfileCreateQueryResourceObjectProperties;
import com.commercesystems.klaviyo_java.models.components.Latitude;
import com.commercesystems.klaviyo_java.models.components.Longitude;
import com.commercesystems.klaviyo_java.models.components.Metric;
import com.commercesystems.klaviyo_java.models.components.MetricCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.MetricCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.MetricEnum;
import com.commercesystems.klaviyo_java.models.components.OnsiteProfileMeta;
import com.commercesystems.klaviyo_java.models.components.ProfileEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileLocation;
import com.commercesystems.klaviyo_java.models.components.ProfileMetaPatchProperties;
import com.commercesystems.klaviyo_java.models.components.Unappend;
import com.commercesystems.klaviyo_java.models.components.Unset;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateEventResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CreateEventResponse res = sdk.events().createEvent()
                .revision("2024-10-15")
                .eventCreateQueryV2(EventCreateQueryV2.builder()
                    .data(EventCreateQueryV2ResourceObject.builder()
                        .type(EventEnum.EVENT)
                        .attributes(EventCreateQueryV2ResourceObjectAttributes.builder()
                            .properties(EventCreateQueryV2ResourceObjectProperties.builder()
                                .build())
                            .metric(Metric.builder()
                                .data(MetricCreateQueryResourceObject.builder()
                                    .type(MetricEnum.METRIC)
                                    .attributes(MetricCreateQueryResourceObjectAttributes.builder()
                                        .name("Viewed Product")
                                        .build())
                                    .build())
                                .build())
                            .profile(EventCreateQueryV2ResourceObjectProfile.builder()
                                .data(EventProfileCreateQueryResourceObject.builder()
                                    .type(ProfileEnum.PROFILE)
                                    .attributes(EventProfileCreateQueryResourceObjectAttributes.builder()
                                        .email("sarah.mason@klaviyo-demo.com")
                                        .phoneNumber("+15005550006")
                                        .firstName("Sarah")
                                        .lastName("Mason")
                                        .organization("Example Corporation")
                                        .locale("en-US")
                                        .title("Regional Manager")
                                        .image("https://images.pexels.com/photos/3760854/pexels-photo-3760854.jpeg")
                                        .location(ProfileLocation.builder()
                                            .address1("89 E 42nd St")
                                            .address2("1st floor")
                                            .city("New York")
                                            .country("United States")
                                            .latitude(Latitude.of("40.7128"))
                                            .longitude(Longitude.of("74.0060"))
                                            .region("NY")
                                            .zip("10017")
                                            .timezone("America/New_York")
                                            .ip("127.0.0.1")
                                            .build())
                                        .properties(EventProfileCreateQueryResourceObjectProperties.builder()
                                            .build())
                                        .meta(OnsiteProfileMeta.builder()
                                            .patchProperties(ProfileMetaPatchProperties.builder()
                                                .append(Append.builder()
                                                    .build())
                                                .unappend(Unappend.builder()
                                                    .build())
                                                .unset(Unset.of("skus"))
                                                .build())
                                            .build())
                                        .build())
                                    .build())
                                .build())
                            .time(OffsetDateTime.parse("2022-11-08T00:00:00+00:00"))
                            .value(9.99d)
                            .valueCurrency("USD")
                            .build())
                        .build())
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `revision`                                                          | *String*                                                            | :heavy_check_mark:                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                 |
| `eventCreateQueryV2`                                                | [EventCreateQueryV2](../../models/components/EventCreateQueryV2.md) | :heavy_check_mark:                                                  | N/A                                                                 |

### Response

**[CreateEventResponse](../../models/operations/CreateEventResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getEvent

Get an event with the given event ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`events:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetEventRequest;
import com.commercesystems.klaviyo_java.models.operations.GetEventResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetEventRequest req = GetEventRequest.builder()
                .id("<id>")
                .revision("2024-10-15")
                .build();

        GetEventResponse res = sdk.events().getEvent()
                .request(req)
                .call();

        if (res.getEventResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetEventRequest](../../models/operations/GetEventRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[GetEventResponse](../../models/operations/GetEventResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## bulkCreateEvents

Create a batch of events for one or more profiles.

Note that this endpoint allows you to create new profiles or update existing profile properties.

At a minimum, profile and metric objects should include at least one profile identifier (e.g., `id`, `email`, or `phone_number`) and the metric `name`, respectively.

Accepts up to 1,000 events per request. The maximum allowed payload size is 5MB.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`events:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.Append;
import com.commercesystems.klaviyo_java.models.components.BaseEventCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.BaseEventCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.BaseEventCreateQueryResourceObjectMetric;
import com.commercesystems.klaviyo_java.models.components.BaseEventCreateQueryResourceObjectProperties;
import com.commercesystems.klaviyo_java.models.components.EventBulkCreateEnum;
import com.commercesystems.klaviyo_java.models.components.EventBulkCreateJobEnum;
import com.commercesystems.klaviyo_java.models.components.EventEnum;
import com.commercesystems.klaviyo_java.models.components.Events;
import com.commercesystems.klaviyo_java.models.components.EventsBulkCreate;
import com.commercesystems.klaviyo_java.models.components.EventsBulkCreateJob;
import com.commercesystems.klaviyo_java.models.components.EventsBulkCreateJobResourceObject;
import com.commercesystems.klaviyo_java.models.components.EventsBulkCreateJobResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.EventsBulkCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.EventsBulkCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.EventsBulkCreateQueryResourceObjectProfile;
import com.commercesystems.klaviyo_java.models.components.Latitude;
import com.commercesystems.klaviyo_java.models.components.Longitude;
import com.commercesystems.klaviyo_java.models.components.MetricCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.MetricCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.MetricEnum;
import com.commercesystems.klaviyo_java.models.components.OnsiteProfileCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.OnsiteProfileCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.OnsiteProfileCreateQueryResourceObjectProperties;
import com.commercesystems.klaviyo_java.models.components.OnsiteProfileMeta;
import com.commercesystems.klaviyo_java.models.components.ProfileEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileLocation;
import com.commercesystems.klaviyo_java.models.components.ProfileMetaPatchProperties;
import com.commercesystems.klaviyo_java.models.components.Unappend;
import com.commercesystems.klaviyo_java.models.components.Unset;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.BulkCreateEventsResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        BulkCreateEventsResponse res = sdk.events().bulkCreateEvents()
                .revision("2024-10-15")
                .eventsBulkCreateJob(EventsBulkCreateJob.builder()
                    .data(EventsBulkCreateJobResourceObject.builder()
                        .type(EventBulkCreateJobEnum.EVENT_BULK_CREATE_JOB)
                        .attributes(EventsBulkCreateJobResourceObjectAttributes.builder()
                            .eventsBulkCreate(EventsBulkCreate.builder()
                                .data(List.of(
                                    EventsBulkCreateQueryResourceObject.builder()
                                        .type(EventBulkCreateEnum.EVENT_BULK_CREATE)
                                        .attributes(EventsBulkCreateQueryResourceObjectAttributes.builder()
                                            .profile(EventsBulkCreateQueryResourceObjectProfile.builder()
                                                .data(OnsiteProfileCreateQueryResourceObject.builder()
                                                    .type(ProfileEnum.PROFILE)
                                                    .attributes(OnsiteProfileCreateQueryResourceObjectAttributes.builder()
                                                        .email("sarah.mason@klaviyo-demo.com")
                                                        .phoneNumber("+15005550006")
                                                        .firstName("Sarah")
                                                        .lastName("Mason")
                                                        .organization("Example Corporation")
                                                        .locale("en-US")
                                                        .title("Regional Manager")
                                                        .image("https://images.pexels.com/photos/3760854/pexels-photo-3760854.jpeg")
                                                        .location(ProfileLocation.builder()
                                                            .address1("89 E 42nd St")
                                                            .address2("1st floor")
                                                            .city("New York")
                                                            .country("United States")
                                                            .latitude(Latitude.of("40.7128"))
                                                            .longitude(Longitude.of("74.0060"))
                                                            .region("NY")
                                                            .zip("10017")
                                                            .timezone("America/New_York")
                                                            .ip("127.0.0.1")
                                                            .build())
                                                        .properties(OnsiteProfileCreateQueryResourceObjectProperties.builder()
                                                            .build())
                                                        .build())
                                                    .meta(OnsiteProfileMeta.builder()
                                                        .patchProperties(ProfileMetaPatchProperties.builder()
                                                            .append(Append.builder()
                                                                .build())
                                                            .unappend(Unappend.builder()
                                                                .build())
                                                            .unset(Unset.of("skus"))
                                                            .build())
                                                        .build())
                                                    .build())
                                                .build())
                                            .events(Events.builder()
                                                .data(List.of(
                                                    BaseEventCreateQueryResourceObject.builder()
                                                        .type(EventEnum.EVENT)
                                                        .attributes(BaseEventCreateQueryResourceObjectAttributes.builder()
                                                            .properties(BaseEventCreateQueryResourceObjectProperties.builder()
                                                                .build())
                                                            .metric(BaseEventCreateQueryResourceObjectMetric.builder()
                                                                .data(MetricCreateQueryResourceObject.builder()
                                                                    .type(MetricEnum.METRIC)
                                                                    .attributes(MetricCreateQueryResourceObjectAttributes.builder()
                                                                        .name("Viewed Product")
                                                                        .build())
                                                                    .build())
                                                                .build())
                                                            .time(OffsetDateTime.parse("2022-11-08T00:00:00+00:00"))
                                                            .value(9.99d)
                                                            .valueCurrency("USD")
                                                            .build())
                                                        .build()))
                                                .build())
                                            .build())
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `revision`                                                            | *String*                                                              | :heavy_check_mark:                                                    | API endpoint revision (format: YYYY-MM-DD[.suffix])                   |
| `eventsBulkCreateJob`                                                 | [EventsBulkCreateJob](../../models/components/EventsBulkCreateJob.md) | :heavy_check_mark:                                                    | N/A                                                                   |

### Response

**[BulkCreateEventsResponse](../../models/operations/BulkCreateEventsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getMetricIdForEvent

Get a list of related Metrics for an Event<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`events:read`
`metrics:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetMetricIdForEventResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetMetricIdForEventResponse res = sdk.events().getMetricIdForEvent()
                .id("<id>")
                .revision("2024-10-15")
                .call();

        if (res.getEventMetricRelationshipResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | ID of the event                                     |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |

### Response

**[GetMetricIdForEventResponse](../../models/operations/GetMetricIdForEventResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getEventMetric

Get the metric for an event with the given event ID.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`events:read`
`metrics:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetEventMetricQueryParamFieldsMetric;
import com.commercesystems.klaviyo_java.models.operations.GetEventMetricResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetEventMetricResponse res = sdk.events().getEventMetric()
                .id("<id>")
                .fieldsMetric(List.of(
                    GetEventMetricQueryParamFieldsMetric.UPDATED))
                .revision("2024-10-15")
                .call();

        if (res.getMetricResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | ID of the event                                                                                                         |
| `fieldsMetric`                                                                                                          | List\<[GetEventMetricQueryParamFieldsMetric](../../models/operations/GetEventMetricQueryParamFieldsMetric.md)>          | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |

### Response

**[GetEventMetricResponse](../../models/operations/GetEventMetricResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getProfileIdForEvent

Get profile [relationships](https://developers.klaviyo.com/en/reference/api_overview#relationships) for an event with the given event ID.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`events:read`
`profiles:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetProfileIdForEventResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetProfileIdForEventResponse res = sdk.events().getProfileIdForEvent()
                .id("<id>")
                .revision("2024-10-15")
                .call();

        if (res.getEventProfileRelationshipResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | ID of the event                                     |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |

### Response

**[GetProfileIdForEventResponse](../../models/operations/GetProfileIdForEventResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getEventProfile

Get the profile associated with an event with the given event ID.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`events:read`
`profiles:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.AdditionalFieldsProfile;
import com.commercesystems.klaviyo_java.models.operations.GetEventProfileQueryParamFieldsProfile;
import com.commercesystems.klaviyo_java.models.operations.GetEventProfileResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetEventProfileResponse res = sdk.events().getEventProfile()
                .id("<id>")
                .additionalFieldsProfile(List.of(
                    AdditionalFieldsProfile.PREDICTIVE_ANALYTICS))
                .fieldsProfile(List.of(
                    GetEventProfileQueryParamFieldsProfile.LOCATION_LATITUDE))
                .revision("2024-10-15")
                .call();

        if (res.getProfileResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                         | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | ID of the event                                                                                                              |
| `additionalFieldsProfile`                                                                                                    | List\<[AdditionalFieldsProfile](../../models/operations/AdditionalFieldsProfile.md)>                                         | :heavy_minus_sign:                                                                                                           | Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics' |
| `fieldsProfile`                                                                                                              | List\<[GetEventProfileQueryParamFieldsProfile](../../models/operations/GetEventProfileQueryParamFieldsProfile.md)>           | :heavy_minus_sign:                                                                                                           | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets      |
| `revision`                                                                                                                   | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                          |

### Response

**[GetEventProfileResponse](../../models/operations/GetEventProfileResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |