# Client
(*client()*)

## Overview

client

### Available Operations

* [createClientSubscription](#createclientsubscription) - Create Client Subscription
* [createClientPushToken](#createclientpushtoken) - Create or Update Client Push Token
* [unregisterClientPushToken](#unregisterclientpushtoken) - Unregister Client Push Token
* [createClientEvent](#createclientevent) - Create Client Event
* [createClientProfile](#createclientprofile) - Create or Update Client Profile
* [bulkCreateClientEvents](#bulkcreateclientevents) - Bulk Create Client Events
* [createClientBackInStockSubscription](#createclientbackinstocksubscription) - Create Client Back In Stock Subscription

## createClientSubscription

*Rate limits*:<br>Burst: `100/s`<br>Steady: `700/m`

**Scopes:**
`subscriptions:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.Append;
import com.commercesystems.klaviyo_java.models.components.Latitude;
import com.commercesystems.klaviyo_java.models.components.ListEnum;
import com.commercesystems.klaviyo_java.models.components.Longitude;
import com.commercesystems.klaviyo_java.models.components.OnsiteSubscriptionCreateQueryDeprecatedOct24;
import com.commercesystems.klaviyo_java.models.components.OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObject;
import com.commercesystems.klaviyo_java.models.components.OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectList;
import com.commercesystems.klaviyo_java.models.components.OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectProfile;
import com.commercesystems.klaviyo_java.models.components.OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.components.ProfileEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileLocation;
import com.commercesystems.klaviyo_java.models.components.ProfileMeta;
import com.commercesystems.klaviyo_java.models.components.ProfileMetaPatchProperties;
import com.commercesystems.klaviyo_java.models.components.ProfileUpsertQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.ProfileUpsertQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.ProfileUpsertQueryResourceObjectProperties;
import com.commercesystems.klaviyo_java.models.components.SubscriptionEnum;
import com.commercesystems.klaviyo_java.models.components.Unappend;
import com.commercesystems.klaviyo_java.models.components.Unset;
import com.commercesystems.klaviyo_java.models.operations.CreateClientSubscriptionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
            .build();

        CreateClientSubscriptionResponse res = sdk.client().createClientSubscription()
                .companyId("PUBLIC_API_KEY")
                .revision("2024-10-15")
                .onsiteSubscriptionCreateQueryDeprecatedOct24(OnsiteSubscriptionCreateQueryDeprecatedOct24.builder()
                    .data(OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObject.builder()
                        .type(SubscriptionEnum.SUBSCRIPTION)
                        .attributes(OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectAttributes.builder()
                            .profile(OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectProfile.builder()
                                .data(ProfileUpsertQueryResourceObject.builder()
                                    .type(ProfileEnum.PROFILE)
                                    .attributes(ProfileUpsertQueryResourceObjectAttributes.builder()
                                        .email("sarah.mason@klaviyo-demo.com")
                                        .phoneNumber("+15005550006")
                                        .anonymousId("01GDDKASAP8TKDDA2GRZDSVP4H")
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
                                        .properties(ProfileUpsertQueryResourceObjectProperties.builder()
                                            .build())
                                        .build())
                                    .meta(ProfileMeta.builder()
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
                            .customSource("Homepage footer signup form")
                            .build())
                        .relationships(OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectRelationships.builder()
                            .list(OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectList.builder()
                                .data(OnsiteSubscriptionCreateQueryDeprecatedOct24ResourceObjectData.builder()
                                    .type(ListEnum.LIST)
                                    .id("Y6nRLr")
                                    .build())
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  | Example                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `companyId`                                                                                                                  | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. | PUBLIC_API_KEY                                                                                                               |
| `revision`                                                                                                                   | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                          |                                                                                                                              |
| `onsiteSubscriptionCreateQueryDeprecatedOct24`                                                                               | [OnsiteSubscriptionCreateQueryDeprecatedOct24](../../models/components/OnsiteSubscriptionCreateQueryDeprecatedOct24.md)      | :heavy_check_mark:                                                                                                           | N/A                                                                                                                          |                                                                                                                              |

### Response

**[CreateClientSubscriptionResponse](../../models/operations/CreateClientSubscriptionResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## createClientPushToken

Create or update a push token.

This endpoint is specifically designed to be called from our mobile SDKs ([iOS](https://github.com/klaviyo/klaviyo-swift-sdk) and [Android](https://github.com/klaviyo/klaviyo-android-sdk)) and requires a [public API key (site ID)](https://www.klaviyo.com/settings/account/api-keys). Never use a private API key with our client-side endpoints.
You must have push notifications enabled to use this endpoint.

To migrate push tokens from another platform to Klaviyo, please use our server-side [POST /api/push-tokens](https://developers.klaviyo.com/en/reference/create_push_token) endpoint instead.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `300/m`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.Append;
import com.commercesystems.klaviyo_java.models.components.Background;
import com.commercesystems.klaviyo_java.models.components.DeviceMetadata;
import com.commercesystems.klaviyo_java.models.components.EnablementStatus;
import com.commercesystems.klaviyo_java.models.components.Environment;
import com.commercesystems.klaviyo_java.models.components.KlaviyoSDK;
import com.commercesystems.klaviyo_java.models.components.Latitude;
import com.commercesystems.klaviyo_java.models.components.Longitude;
import com.commercesystems.klaviyo_java.models.components.OsName;
import com.commercesystems.klaviyo_java.models.components.Platform;
import com.commercesystems.klaviyo_java.models.components.ProfileEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileLocation;
import com.commercesystems.klaviyo_java.models.components.ProfileMeta;
import com.commercesystems.klaviyo_java.models.components.ProfileMetaPatchProperties;
import com.commercesystems.klaviyo_java.models.components.PushProfileUpsertQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.PushProfileUpsertQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.PushProfileUpsertQueryResourceObjectProperties;
import com.commercesystems.klaviyo_java.models.components.PushTokenCreateQuery;
import com.commercesystems.klaviyo_java.models.components.PushTokenCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.PushTokenCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.PushTokenCreateQueryResourceObjectProfile;
import com.commercesystems.klaviyo_java.models.components.PushTokenEnum;
import com.commercesystems.klaviyo_java.models.components.Unappend;
import com.commercesystems.klaviyo_java.models.components.Unset;
import com.commercesystems.klaviyo_java.models.components.Vendor;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateClientPushTokenResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
            .build();

        CreateClientPushTokenResponse res = sdk.client().createClientPushToken()
                .companyId("PUBLIC_API_KEY")
                .revision("2024-10-15")
                .pushTokenCreateQuery(PushTokenCreateQuery.builder()
                    .data(PushTokenCreateQueryResourceObject.builder()
                        .type(PushTokenEnum.PUSH_TOKEN)
                        .attributes(PushTokenCreateQueryResourceObjectAttributes.builder()
                            .token("1234567890")
                            .platform(Platform.IOS)
                            .vendor(Vendor.APNS)
                            .profile(PushTokenCreateQueryResourceObjectProfile.builder()
                                .data(PushProfileUpsertQueryResourceObject.builder()
                                    .type(ProfileEnum.PROFILE)
                                    .attributes(PushProfileUpsertQueryResourceObjectAttributes.builder()
                                        .phoneNumber("+15005550006")
                                        .anonymousId("01GDDKASAP8TKDDA2GRZDSVP4H")
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
                                        .properties(PushProfileUpsertQueryResourceObjectProperties.builder()
                                            .build())
                                        .meta(ProfileMeta.builder()
                                            .patchProperties(ProfileMetaPatchProperties.builder()
                                                .append(Append.builder()
                                                    .build())
                                                .unappend(Unappend.builder()
                                                    .build())
                                                .unset(Unset.of("skus"))
                                                .build())
                                            .build())
                                        .email("sarah.mason@klaviyo-demo.com")
                                        .build())
                                    .build())
                                .build())
                            .enablementStatus(EnablementStatus.AUTHORIZED)
                            .background(Background.AVAILABLE)
                            .deviceMetadata(DeviceMetadata.builder()
                                .deviceId("1234567890")
                                .klaviyoSDK(KlaviyoSDK.SWIFT)
                                .sdkVersion("1.0.0")
                                .deviceModel("iPhone12,1")
                                .osName(OsName.IOS)
                                .osVersion("14.0")
                                .manufacturer("Apple")
                                .appName("Klaviyo")
                                .appVersion("1.0.0")
                                .appBuild("1")
                                .appId("com.klaviyo.app")
                                .environment(Environment.RELEASE)
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  | Example                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `companyId`                                                                                                                  | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. | PUBLIC_API_KEY                                                                                                               |
| `revision`                                                                                                                   | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                          |                                                                                                                              |
| `pushTokenCreateQuery`                                                                                                       | [PushTokenCreateQuery](../../models/components/PushTokenCreateQuery.md)                                                      | :heavy_check_mark:                                                                                                           | N/A                                                                                                                          |                                                                                                                              |

### Response

**[CreateClientPushTokenResponse](../../models/operations/CreateClientPushTokenResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## unregisterClientPushToken

Unregister a push token.

This endpoint is specifically designed to be called from our mobile SDKs ([iOS](https://github.com/klaviyo/klaviyo-swift-sdk) and [Android](https://github.com/klaviyo/klaviyo-android-sdk)) and requires a [public API key (site ID)](https://www.klaviyo.com/settings/account/api-keys). Never use a private API key with our client-side endpoints.
You must have push notifications enabled to use this endpoint.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.Append;
import com.commercesystems.klaviyo_java.models.components.Latitude;
import com.commercesystems.klaviyo_java.models.components.Longitude;
import com.commercesystems.klaviyo_java.models.components.ProfileEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileLocation;
import com.commercesystems.klaviyo_java.models.components.ProfileMeta;
import com.commercesystems.klaviyo_java.models.components.ProfileMetaPatchProperties;
import com.commercesystems.klaviyo_java.models.components.ProfileUpsertQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.ProfileUpsertQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.ProfileUpsertQueryResourceObjectProperties;
import com.commercesystems.klaviyo_java.models.components.PushTokenUnregisterEnum;
import com.commercesystems.klaviyo_java.models.components.PushTokenUnregisterQuery;
import com.commercesystems.klaviyo_java.models.components.PushTokenUnregisterQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.PushTokenUnregisterQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.PushTokenUnregisterQueryResourceObjectPlatform;
import com.commercesystems.klaviyo_java.models.components.PushTokenUnregisterQueryResourceObjectProfile;
import com.commercesystems.klaviyo_java.models.components.PushTokenUnregisterQueryResourceObjectVendor;
import com.commercesystems.klaviyo_java.models.components.Unappend;
import com.commercesystems.klaviyo_java.models.components.Unset;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UnregisterClientPushTokenResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
            .build();

        UnregisterClientPushTokenResponse res = sdk.client().unregisterClientPushToken()
                .companyId("PUBLIC_API_KEY")
                .revision("2024-10-15")
                .pushTokenUnregisterQuery(PushTokenUnregisterQuery.builder()
                    .data(PushTokenUnregisterQueryResourceObject.builder()
                        .type(PushTokenUnregisterEnum.PUSH_TOKEN_UNREGISTER)
                        .attributes(PushTokenUnregisterQueryResourceObjectAttributes.builder()
                            .token("1234567890")
                            .platform(PushTokenUnregisterQueryResourceObjectPlatform.ANDROID)
                            .profile(PushTokenUnregisterQueryResourceObjectProfile.builder()
                                .data(ProfileUpsertQueryResourceObject.builder()
                                    .type(ProfileEnum.PROFILE)
                                    .attributes(ProfileUpsertQueryResourceObjectAttributes.builder()
                                        .email("sarah.mason@klaviyo-demo.com")
                                        .phoneNumber("+15005550006")
                                        .anonymousId("01GDDKASAP8TKDDA2GRZDSVP4H")
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
                                        .properties(ProfileUpsertQueryResourceObjectProperties.builder()
                                            .build())
                                        .build())
                                    .meta(ProfileMeta.builder()
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
                            .vendor(PushTokenUnregisterQueryResourceObjectVendor.APNS)
                            .build())
                        .build())
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  | Example                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `companyId`                                                                                                                  | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. | PUBLIC_API_KEY                                                                                                               |
| `revision`                                                                                                                   | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                          |                                                                                                                              |
| `pushTokenUnregisterQuery`                                                                                                   | [PushTokenUnregisterQuery](../../models/components/PushTokenUnregisterQuery.md)                                              | :heavy_check_mark:                                                                                                           | N/A                                                                                                                          |                                                                                                                              |

### Response

**[UnregisterClientPushTokenResponse](../../models/operations/UnregisterClientPushTokenResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createClientEvent

Create a new event to track a profile's activity.

This endpoint is specifically designed to be called from publicly-browseable, client-side environments only and requires a [public API key (site ID)](https://www.klaviyo.com/settings/account/api-keys). Never use a private API key with our client-side endpoints.

To create events from server-side applications, please use [POST /api/events](https://developers.klaviyo.com/en/reference/create_event).

Note that to update a profile's existing identifiers (e.g., email), you must use a server-side endpoint authenticated by a private API key. Attempts to do so via client-side endpoints will return a 202, however the identifier field(s) will not be updated.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

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
import com.commercesystems.klaviyo_java.models.operations.CreateClientEventResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
            .build();

        CreateClientEventResponse res = sdk.client().createClientEvent()
                .companyId("PUBLIC_API_KEY")
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  | Example                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `companyId`                                                                                                                  | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. | PUBLIC_API_KEY                                                                                                               |
| `revision`                                                                                                                   | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                          |                                                                                                                              |
| `eventCreateQueryV2`                                                                                                         | [EventCreateQueryV2](../../models/components/EventCreateQueryV2.md)                                                          | :heavy_check_mark:                                                                                                           | N/A                                                                                                                          |                                                                                                                              |

### Response

**[CreateClientEventResponse](../../models/operations/CreateClientEventResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createClientProfile

Create or update properties about a profile without tracking an associated event.

This endpoint is specifically designed to be called from publicly-browseable, client-side environments only and requires a [public API key (site ID)](https://www.klaviyo.com/settings/account/api-keys). Never use a private API key with our client-side endpoints.

To create or update profiles from server-side applications, please use [POST /api/profile-import](https://developers.klaviyo.com/en/reference/create_or_update_profile).

Note that to update a profile's existing identifiers (e.g., email), you must use a server-side endpoint authenticated by a private API key. Attempts to do so via client-side endpoints will return a 202, however the identifier field(s) will not be updated.<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`profiles:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.Append;
import com.commercesystems.klaviyo_java.models.components.Latitude;
import com.commercesystems.klaviyo_java.models.components.Longitude;
import com.commercesystems.klaviyo_java.models.components.OnsiteProfileCreateQuery;
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
import com.commercesystems.klaviyo_java.models.operations.CreateClientProfileResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
            .build();

        CreateClientProfileResponse res = sdk.client().createClientProfile()
                .companyId("PUBLIC_API_KEY")
                .revision("2024-10-15")
                .onsiteProfileCreateQuery(OnsiteProfileCreateQuery.builder()
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
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  | Example                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `companyId`                                                                                                                  | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. | PUBLIC_API_KEY                                                                                                               |
| `revision`                                                                                                                   | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                          |                                                                                                                              |
| `onsiteProfileCreateQuery`                                                                                                   | [OnsiteProfileCreateQuery](../../models/components/OnsiteProfileCreateQuery.md)                                              | :heavy_check_mark:                                                                                                           | N/A                                                                                                                          |                                                                                                                              |

### Response

**[CreateClientProfileResponse](../../models/operations/CreateClientProfileResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## bulkCreateClientEvents

Create new events to track a profile's activity.

This endpoint is specifically designed to be called from publicly-browseable, client-side environments only and requires a [public API key (site ID)](https://www.klaviyo.com/settings/account/api-keys). Never use a private API key with our client-side endpoints.

To create events from server-side applications, please use [POST /api/event-bulk-create-jobs](https://developers.klaviyo.com/en/reference/bulk_create_events).

Accepts a maximum of `1000` events per request.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

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
import com.commercesystems.klaviyo_java.models.components.EventEnum;
import com.commercesystems.klaviyo_java.models.components.Events;
import com.commercesystems.klaviyo_java.models.components.EventsBulkCreateQuery;
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
import com.commercesystems.klaviyo_java.models.operations.BulkCreateClientEventsResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
            .build();

        BulkCreateClientEventsResponse res = sdk.client().bulkCreateClientEvents()
                .companyId("PUBLIC_API_KEY")
                .revision("2024-10-15")
                .eventsBulkCreateQuery(EventsBulkCreateQuery.builder()
                    .data(EventsBulkCreateQueryResourceObject.builder()
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
                        .build())
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  | Example                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `companyId`                                                                                                                  | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. | PUBLIC_API_KEY                                                                                                               |
| `revision`                                                                                                                   | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                          |                                                                                                                              |
| `eventsBulkCreateQuery`                                                                                                      | [EventsBulkCreateQuery](../../models/components/EventsBulkCreateQuery.md)                                                    | :heavy_check_mark:                                                                                                           | N/A                                                                                                                          |                                                                                                                              |

### Response

**[BulkCreateClientEventsResponse](../../models/operations/BulkCreateClientEventsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createClientBackInStockSubscription

Subscribe a profile to receive back in stock notifications. Check out [our Back in Stock API guide](https://developers.klaviyo.com/en/docs/how_to_set_up_custom_back_in_stock) for more details.

This endpoint is specifically designed to be called from publicly-browseable, client-side environments only and requires a [public API key (site ID)](https://www.klaviyo.com/settings/account/api-keys). Never use a private API key with our client-side endpoints.

To create back in stock subscriptions from server-side applications, please use [POST /api/back-in-stock-subscriptions](https://developers.klaviyo.com/en/reference/create_back_in_stock_subscription).<br><br>*Rate limits*:<br>Burst: `350/s`<br>Steady: `3500/m`

**Scopes:**
`catalogs:write`
`profiles:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.BackInStockSubscriptionEnum;
import com.commercesystems.klaviyo_java.models.components.CatalogVariantEnum;
import com.commercesystems.klaviyo_java.models.components.ClientBISSubscriptionCreateQuery;
import com.commercesystems.klaviyo_java.models.components.ClientBISSubscriptionCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.ClientBISSubscriptionCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.ClientBISSubscriptionCreateQueryResourceObjectChannels;
import com.commercesystems.klaviyo_java.models.components.ClientBISSubscriptionCreateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.ClientBISSubscriptionCreateQueryResourceObjectProfile;
import com.commercesystems.klaviyo_java.models.components.ClientBISSubscriptionCreateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.components.ClientBISSubscriptionCreateQueryResourceObjectVariant;
import com.commercesystems.klaviyo_java.models.components.ProfileEnum;
import com.commercesystems.klaviyo_java.models.components.ProfileIdentifierDTOResourceObject;
import com.commercesystems.klaviyo_java.models.components.ProfileIdentifierDTOResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateClientBackInStockSubscriptionResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
            .build();

        CreateClientBackInStockSubscriptionResponse res = sdk.client().createClientBackInStockSubscription()
                .companyId("PUBLIC_API_KEY")
                .revision("2024-10-15")
                .clientBISSubscriptionCreateQuery(ClientBISSubscriptionCreateQuery.builder()
                    .data(ClientBISSubscriptionCreateQueryResourceObject.builder()
                        .type(BackInStockSubscriptionEnum.BACK_IN_STOCK_SUBSCRIPTION)
                        .attributes(ClientBISSubscriptionCreateQueryResourceObjectAttributes.builder()
                            .channels(List.of(
                                ClientBISSubscriptionCreateQueryResourceObjectChannels.EMAIL,
                                ClientBISSubscriptionCreateQueryResourceObjectChannels.SMS))
                            .profile(ClientBISSubscriptionCreateQueryResourceObjectProfile.builder()
                                .data(ProfileIdentifierDTOResourceObject.builder()
                                    .type(ProfileEnum.PROFILE)
                                    .attributes(ProfileIdentifierDTOResourceObjectAttributes.builder()
                                        .email("sarah.mason@klaviyo-demo.com")
                                        .phoneNumber("+15005550006")
                                        .build())
                                    .id("01GDDKASAP8TKDDA2GRZDSVP4H")
                                    .build())
                                .build())
                            .build())
                        .relationships(ClientBISSubscriptionCreateQueryResourceObjectRelationships.builder()
                            .variant(ClientBISSubscriptionCreateQueryResourceObjectVariant.builder()
                                .data(ClientBISSubscriptionCreateQueryResourceObjectData.builder()
                                    .type(CatalogVariantEnum.CATALOG_VARIANT)
                                    .id("$custom:::$default:::SAMPLE-DATA-ITEM-1-VARIANT-MEDIUM")
                                    .build())
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  | Example                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `companyId`                                                                                                                  | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | Your Public API Key / Site ID. See [this article](https://help.klaviyo.com/hc/en-us/articles/115005062267) for more details. | PUBLIC_API_KEY                                                                                                               |
| `revision`                                                                                                                   | *String*                                                                                                                     | :heavy_check_mark:                                                                                                           | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                          |                                                                                                                              |
| `clientBISSubscriptionCreateQuery`                                                                                           | [ClientBISSubscriptionCreateQuery](../../models/components/ClientBISSubscriptionCreateQuery.md)                              | :heavy_check_mark:                                                                                                           | N/A                                                                                                                          |                                                                                                                              |

### Response

**[CreateClientBackInStockSubscriptionResponse](../../models/operations/CreateClientBackInStockSubscriptionResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |