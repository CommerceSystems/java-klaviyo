# Campaigns
(*campaigns()*)

## Overview

campaigns

### Available Operations

* [getCampaigns](#getcampaigns) - Get Campaigns
* [createCampaign](#createcampaign) - Create Campaign
* [getCampaign](#getcampaign) - Get Campaign
* [updateCampaign](#updatecampaign) - Update Campaign
* [deleteCampaign](#deletecampaign) - Delete Campaign
* [getCampaignMessage](#getcampaignmessage) - Get Campaign Message
* [updateCampaignMessage](#updatecampaignmessage) - Update Campaign Message
* [getCampaignSendJob](#getcampaignsendjob) - Get Campaign Send Job
* [cancelCampaignSend](#cancelcampaignsend) - Cancel Campaign Send
* [getCampaignRecipientEstimationJob](#getcampaignrecipientestimationjob) - Get Campaign Recipient Estimation Job
* [getCampaignRecipientEstimation](#getcampaignrecipientestimation) - Get Campaign Recipient Estimation
* [createCampaignClone](#createcampaignclone) - Create Campaign Clone
* [assignTemplateToCampaignMessage](#assigntemplatetocampaignmessage) - Assign Template to Campaign Message
* [sendCampaign](#sendcampaign) - Send Campaign
* [refreshCampaignRecipientEstimation](#refreshcampaignrecipientestimation) - Refresh Campaign Recipient Estimation
* [getCampaignIdForCampaignMessage](#getcampaignidforcampaignmessage) - Get Campaign ID for Campaign Message
* [getCampaignForCampaignMessage](#getcampaignforcampaignmessage) - Get Campaign for Campaign Message
* [getTemplateIdForCampaignMessage](#gettemplateidforcampaignmessage) - Get Template ID for Campaign Message
* [getTemplateForCampaignMessage](#gettemplateforcampaignmessage) - Get Template for Campaign Message
* [getTagIdsForCampaign](#gettagidsforcampaign) - Get Tag IDs for Campaign
* [getCampaignTags](#getcampaigntags) - Get Campaign Tags
* [getMessageIdsForCampaign](#getmessageidsforcampaign) - Get Message IDs for Campaign
* [getMessagesForCampaign](#getmessagesforcampaign) - Get Messages for Campaign

## getCampaigns

Returns some or all campaigns based on filters.

A channel filter is required to list campaigns. Please provide either:
`?filter=equals(messages.channel,'email')` to list email campaigns, or
`?filter=equals(messages.channel,'sms')` to list SMS campaigns.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCampaignsRequest;
import com.commercesystems.klaviyo_java.models.operations.GetCampaignsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCampaignsRequest req = GetCampaignsRequest.builder()
                .filter("equals(messages.channel,'sms')")
                .revision("2024-10-15")
                .build();

        GetCampaignsResponse res = sdk.campaigns().getCampaigns()
                .request(req)
                .call();

        if (res.getCampaignResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetCampaignsRequest](../../models/operations/GetCampaignsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetCampaignsResponse](../../models/operations/GetCampaignsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createCampaign

Creates a campaign given a set of parameters, then returns it.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.AudiencesSubObject;
import com.commercesystems.klaviyo_java.models.components.CampaignCreateQuery;
import com.commercesystems.klaviyo_java.models.components.CampaignCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CampaignCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CampaignEnum;
import com.commercesystems.klaviyo_java.models.components.CampaignMessageCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CampaignMessageCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CampaignMessageCreateQueryResourceObjectContent;
import com.commercesystems.klaviyo_java.models.components.CampaignMessageEnum;
import com.commercesystems.klaviyo_java.models.components.CampaignMessages;
import com.commercesystems.klaviyo_java.models.components.ContentEmailContentSubObject;
import com.commercesystems.klaviyo_java.models.components.DynamicEnum;
import com.commercesystems.klaviyo_java.models.components.DynamicTrackingParam;
import com.commercesystems.klaviyo_java.models.components.RenderOptionsSubObject;
import com.commercesystems.klaviyo_java.models.components.SendStrategySubObject;
import com.commercesystems.klaviyo_java.models.components.StaticScheduleOptions;
import com.commercesystems.klaviyo_java.models.components.TrackingOptions;
import com.commercesystems.klaviyo_java.models.components.TrackingOptionsCustomTrackingParams;
import com.commercesystems.klaviyo_java.models.components.TrackingOptionsEmailTrackingOptionsSubObject;
import com.commercesystems.klaviyo_java.models.components.Value;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateCampaignResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CreateCampaignResponse res = sdk.campaigns().createCampaign()
                .revision("2024-10-15")
                .campaignCreateQuery(CampaignCreateQuery.builder()
                    .data(CampaignCreateQueryResourceObject.builder()
                        .type(CampaignEnum.CAMPAIGN)
                        .attributes(CampaignCreateQueryResourceObjectAttributes.builder()
                            .name("My new campaign")
                            .audiences(AudiencesSubObject.builder()
                                .included(List.of(
                                    "Y6nRLr"))
                                .excluded(List.of(
                                    "UTd5ui"))
                                .build())
                            .campaignMessages(CampaignMessages.builder()
                                .data(List.of(
                                    CampaignMessageCreateQueryResourceObject.builder()
                                        .type(CampaignMessageEnum.CAMPAIGN_MESSAGE)
                                        .attributes(CampaignMessageCreateQueryResourceObjectAttributes.builder()
                                            .channel("email")
                                            .label("My message name")
                                            .content(CampaignMessageCreateQueryResourceObjectContent.of(ContentEmailContentSubObject.builder()
                                                .subject("Buy our product!")
                                                .previewText("My preview text")
                                                .fromEmail("store@my-company.com")
                                                .fromLabel("My Company")
                                                .replyToEmail("reply-to@my-company.com")
                                                .ccEmail("cc@my-company.com")
                                                .bccEmail("bcc@my-company.com")
                                                .build()))
                                            .renderOptions(RenderOptionsSubObject.builder()
                                                .shortenLinks(true)
                                                .addOrgPrefix(true)
                                                .addInfoLink(true)
                                                .build())
                                            .build())
                                        .build()))
                                .build())
                            .sendStrategy(SendStrategySubObject.builder()
                                .method("static")
                                .optionsStatic(StaticScheduleOptions.builder()
                                    .datetime(OffsetDateTime.parse("2022-11-08T00:00:00+00:00"))
                                    .build())
                                .build())
                            .trackingOptions(TrackingOptions.of(TrackingOptionsEmailTrackingOptionsSubObject.builder()
                                .customTrackingParams(List.of(
                                    TrackingOptionsCustomTrackingParams.of(DynamicTrackingParam.builder()
                                        .type(DynamicEnum.DYNAMIC)
                                        .value(Value.CAMPAIGN_NAME)
                                        .name("utm_medium")
                                        .build())))
                                .build()))
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postCampaignResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `revision`                                                            | *String*                                                              | :heavy_check_mark:                                                    | API endpoint revision (format: YYYY-MM-DD[.suffix])                   |
| `campaignCreateQuery`                                                 | [CampaignCreateQuery](../../models/components/CampaignCreateQuery.md) | :heavy_check_mark:                                                    | Creates a campaign from parameters                                    |

### Response

**[CreateCampaignResponse](../../models/operations/CreateCampaignResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCampaign

Returns a specific campaign based on a required id.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCampaignRequest;
import com.commercesystems.klaviyo_java.models.operations.GetCampaignResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCampaignRequest req = GetCampaignRequest.builder()
                .id("<id>")
                .revision("2024-10-15")
                .build();

        GetCampaignResponse res = sdk.campaigns().getCampaign()
                .request(req)
                .call();

        if (res.getCampaignResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetCampaignRequest](../../models/operations/GetCampaignRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetCampaignResponse](../../models/operations/GetCampaignResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## updateCampaign

Update a campaign with the given campaign ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.AudiencesSubObject;
import com.commercesystems.klaviyo_java.models.components.CampaignEnum;
import com.commercesystems.klaviyo_java.models.components.CampaignPartialUpdateQuery;
import com.commercesystems.klaviyo_java.models.components.CampaignPartialUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CampaignPartialUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CampaignPartialUpdateQueryResourceObjectTrackingOptions;
import com.commercesystems.klaviyo_java.models.components.CampaignPartialUpdateQueryResourceObjectTrackingOptionsEmailTrackingOptionsSubObject;
import com.commercesystems.klaviyo_java.models.components.DynamicEnum;
import com.commercesystems.klaviyo_java.models.components.DynamicTrackingParam;
import com.commercesystems.klaviyo_java.models.components.EmailTrackingOptionsSubObjectTrackingOptionsCustomTrackingParams;
import com.commercesystems.klaviyo_java.models.components.SendStrategySubObject;
import com.commercesystems.klaviyo_java.models.components.StaticScheduleOptions;
import com.commercesystems.klaviyo_java.models.components.Value;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UpdateCampaignResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateCampaignResponse res = sdk.campaigns().updateCampaign()
                .id("<id>")
                .revision("2024-10-15")
                .campaignPartialUpdateQuery(CampaignPartialUpdateQuery.builder()
                    .data(CampaignPartialUpdateQueryResourceObject.builder()
                        .type(CampaignEnum.CAMPAIGN)
                        .id("<id>")
                        .attributes(CampaignPartialUpdateQueryResourceObjectAttributes.builder()
                            .name("My new campaign")
                            .audiences(AudiencesSubObject.builder()
                                .included(List.of(
                                    "Y6nRLr"))
                                .excluded(List.of(
                                    "UTd5ui"))
                                .build())
                            .trackingOptions(CampaignPartialUpdateQueryResourceObjectTrackingOptions.of(CampaignPartialUpdateQueryResourceObjectTrackingOptionsEmailTrackingOptionsSubObject.builder()
                                .customTrackingParams(List.of(
                                    EmailTrackingOptionsSubObjectTrackingOptionsCustomTrackingParams.of(DynamicTrackingParam.builder()
                                        .type(DynamicEnum.DYNAMIC)
                                        .value(Value.PROFILE_ID)
                                        .name("utm_medium")
                                        .build())))
                                .build()))
                            .sendStrategy(SendStrategySubObject.builder()
                                .method("static")
                                .optionsStatic(StaticScheduleOptions.builder()
                                    .datetime(OffsetDateTime.parse("2022-11-08T00:00:00+00:00"))
                                    .build())
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.patchCampaignResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `id`                                                                                | *String*                                                                            | :heavy_check_mark:                                                                  | The campaign ID to be retrieved                                                     |
| `revision`                                                                          | *String*                                                                            | :heavy_check_mark:                                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                                 |
| `campaignPartialUpdateQuery`                                                        | [CampaignPartialUpdateQuery](../../models/components/CampaignPartialUpdateQuery.md) | :heavy_check_mark:                                                                  | Update a campaign and return it                                                     |

### Response

**[UpdateCampaignResponse](../../models/operations/UpdateCampaignResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## deleteCampaign

Delete a campaign with the given campaign ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.DeleteCampaignResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        DeleteCampaignResponse res = sdk.campaigns().deleteCampaign()
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
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The campaign ID to be deleted                       |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |

### Response

**[DeleteCampaignResponse](../../models/operations/DeleteCampaignResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCampaignMessage

Returns a specific message based on a required id.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCampaignMessageRequest;
import com.commercesystems.klaviyo_java.models.operations.GetCampaignMessageResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCampaignMessageRequest req = GetCampaignMessageRequest.builder()
                .id("<id>")
                .revision("2024-10-15")
                .build();

        GetCampaignMessageResponse res = sdk.campaigns().getCampaignMessage()
                .request(req)
                .call();

        if (res.getCampaignMessageResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetCampaignMessageRequest](../../models/operations/GetCampaignMessageRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetCampaignMessageResponse](../../models/operations/GetCampaignMessageResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## updateCampaignMessage

Update a campaign message<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CampaignMessageEnum;
import com.commercesystems.klaviyo_java.models.components.CampaignMessagePartialUpdateQuery;
import com.commercesystems.klaviyo_java.models.components.CampaignMessagePartialUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CampaignMessagePartialUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CampaignMessagePartialUpdateQueryResourceObjectContent;
import com.commercesystems.klaviyo_java.models.components.ContentSMSContentSubObjectCreate;
import com.commercesystems.klaviyo_java.models.components.RenderOptionsSubObject;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UpdateCampaignMessageResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateCampaignMessageResponse res = sdk.campaigns().updateCampaignMessage()
                .id("<id>")
                .revision("2024-10-15")
                .campaignMessagePartialUpdateQuery(CampaignMessagePartialUpdateQuery.builder()
                    .data(CampaignMessagePartialUpdateQueryResourceObject.builder()
                        .type(CampaignMessageEnum.CAMPAIGN_MESSAGE)
                        .id("<id>")
                        .attributes(CampaignMessagePartialUpdateQueryResourceObjectAttributes.builder()
                            .label("My message name")
                            .content(CampaignMessagePartialUpdateQueryResourceObjectContent.of(ContentSMSContentSubObjectCreate.builder()
                                .body("My preview sms")
                                .build()))
                            .renderOptions(RenderOptionsSubObject.builder()
                                .shortenLinks(true)
                                .addOrgPrefix(true)
                                .addInfoLink(true)
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.patchCampaignMessageResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `id`                                                                                              | *String*                                                                                          | :heavy_check_mark:                                                                                | The message ID to be retrieved                                                                    |
| `revision`                                                                                        | *String*                                                                                          | :heavy_check_mark:                                                                                | API endpoint revision (format: YYYY-MM-DD[.suffix])                                               |
| `campaignMessagePartialUpdateQuery`                                                               | [CampaignMessagePartialUpdateQuery](../../models/components/CampaignMessagePartialUpdateQuery.md) | :heavy_check_mark:                                                                                | Update a message and return it                                                                    |

### Response

**[UpdateCampaignMessageResponse](../../models/operations/UpdateCampaignMessageResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCampaignSendJob

Get a campaign send job<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsCampaignSendJob;
import com.commercesystems.klaviyo_java.models.operations.GetCampaignSendJobResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCampaignSendJobResponse res = sdk.campaigns().getCampaignSendJob()
                .id("<id>")
                .fieldsCampaignSendJob(List.of(
                    FieldsCampaignSendJob.STATUS))
                .revision("2024-10-15")
                .call();

        if (res.getCampaignSendJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | The ID of the campaign to send                                                                                          |
| `fieldsCampaignSendJob`                                                                                                 | List\<[FieldsCampaignSendJob](../../models/operations/FieldsCampaignSendJob.md)>                                        | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |

### Response

**[GetCampaignSendJobResponse](../../models/operations/GetCampaignSendJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## cancelCampaignSend

Permanently cancel the campaign, setting the status to CANCELED or
revert the campaign, setting the status back to DRAFT<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CampaignSendJobEnum;
import com.commercesystems.klaviyo_java.models.components.CampaignSendJobPartialUpdateQuery;
import com.commercesystems.klaviyo_java.models.components.CampaignSendJobPartialUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CampaignSendJobPartialUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CancelCampaignSendResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CancelCampaignSendResponse res = sdk.campaigns().cancelCampaignSend()
                .id("<id>")
                .revision("2024-10-15")
                .campaignSendJobPartialUpdateQuery(CampaignSendJobPartialUpdateQuery.builder()
                    .data(CampaignSendJobPartialUpdateQueryResourceObject.builder()
                        .type(CampaignSendJobEnum.CAMPAIGN_SEND_JOB)
                        .id("<id>")
                        .attributes(CampaignSendJobPartialUpdateQueryResourceObjectAttributes.builder()
                            .action("cancel")
                            .build())
                        .build())
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                     | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | The ID of the currently sending campaign to cancel or revert                                                             |
| `revision`                                                                                                               | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                      |
| `campaignSendJobPartialUpdateQuery`                                                                                      | [CampaignSendJobPartialUpdateQuery](../../models/components/CampaignSendJobPartialUpdateQuery.md)                        | :heavy_check_mark:                                                                                                       | Permanently cancel the campaign, setting the status to CANCELED or<br/>revert the campaign, setting the status back to DRAFT |

### Response

**[CancelCampaignSendResponse](../../models/operations/CancelCampaignSendResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCampaignRecipientEstimationJob

Retrieve the status of a recipient estimation job triggered
with the `Create Campaign Recipient Estimation Job` endpoint.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsCampaignRecipientEstimationJob;
import com.commercesystems.klaviyo_java.models.operations.GetCampaignRecipientEstimationJobResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCampaignRecipientEstimationJobResponse res = sdk.campaigns().getCampaignRecipientEstimationJob()
                .id("<id>")
                .fieldsCampaignRecipientEstimationJob(List.of(
                    FieldsCampaignRecipientEstimationJob.STATUS))
                .revision("2024-10-15")
                .call();

        if (res.getCampaignRecipientEstimationJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | The ID of the campaign to get recipient estimation status                                                               |
| `fieldsCampaignRecipientEstimationJob`                                                                                  | List\<[FieldsCampaignRecipientEstimationJob](../../models/operations/FieldsCampaignRecipientEstimationJob.md)>          | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |

### Response

**[GetCampaignRecipientEstimationJobResponse](../../models/operations/GetCampaignRecipientEstimationJobResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCampaignRecipientEstimation

Get the estimated recipient count for a campaign with the provided campaign ID.
You can refresh this count by using the `Create Campaign Recipient Estimation Job` endpoint.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsCampaignRecipientEstimation;
import com.commercesystems.klaviyo_java.models.operations.GetCampaignRecipientEstimationResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCampaignRecipientEstimationResponse res = sdk.campaigns().getCampaignRecipientEstimation()
                .id("<id>")
                .fieldsCampaignRecipientEstimation(List.of(
                    FieldsCampaignRecipientEstimation.ESTIMATED_RECIPIENT_COUNT))
                .revision("2024-10-15")
                .call();

        if (res.getCampaignRecipientEstimationResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | The ID of the campaign for which to get the estimated number of recipients                                              |
| `fieldsCampaignRecipientEstimation`                                                                                     | List\<[FieldsCampaignRecipientEstimation](../../models/operations/FieldsCampaignRecipientEstimation.md)>                | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |

### Response

**[GetCampaignRecipientEstimationResponse](../../models/operations/GetCampaignRecipientEstimationResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createCampaignClone

Clones an existing campaign, returning a new campaign based on the original with a new ID and name.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CampaignCloneQuery;
import com.commercesystems.klaviyo_java.models.components.CampaignCloneQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CampaignCloneQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CampaignEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateCampaignCloneResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CreateCampaignCloneResponse res = sdk.campaigns().createCampaignClone()
                .revision("2024-10-15")
                .campaignCloneQuery(CampaignCloneQuery.builder()
                    .data(CampaignCloneQueryResourceObject.builder()
                        .type(CampaignEnum.CAMPAIGN)
                        .id("<id>")
                        .attributes(CampaignCloneQueryResourceObjectAttributes.builder()
                            .newName("My cloned campaign's new name")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postCampaignResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `revision`                                                          | *String*                                                            | :heavy_check_mark:                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                 |
| `campaignCloneQuery`                                                | [CampaignCloneQuery](../../models/components/CampaignCloneQuery.md) | :heavy_check_mark:                                                  | Clones a campaign from an existing campaign                         |

### Response

**[CreateCampaignCloneResponse](../../models/operations/CreateCampaignCloneResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## assignTemplateToCampaignMessage

Creates a non-reusable version of the template and assigns it to the message.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CampaignMessageAssignTemplateQuery;
import com.commercesystems.klaviyo_java.models.components.CampaignMessageAssignTemplateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CampaignMessageAssignTemplateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.CampaignMessageEnum;
import com.commercesystems.klaviyo_java.models.components.Relationships;
import com.commercesystems.klaviyo_java.models.components.Template;
import com.commercesystems.klaviyo_java.models.components.TemplateEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.AssignTemplateToCampaignMessageResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        AssignTemplateToCampaignMessageResponse res = sdk.campaigns().assignTemplateToCampaignMessage()
                .revision("2024-10-15")
                .campaignMessageAssignTemplateQuery(CampaignMessageAssignTemplateQuery.builder()
                    .data(CampaignMessageAssignTemplateQueryResourceObject.builder()
                        .type(CampaignMessageEnum.CAMPAIGN_MESSAGE)
                        .id("<id>")
                        .relationships(Relationships.builder()
                            .template(Template.builder()
                                .data(CampaignMessageAssignTemplateQueryResourceObjectData.builder()
                                    .type(TemplateEnum.TEMPLATE)
                                    .id("RipRmi")
                                    .build())
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postCampaignMessageResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `revision`                                                                                          | *String*                                                                                            | :heavy_check_mark:                                                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                 |
| `campaignMessageAssignTemplateQuery`                                                                | [CampaignMessageAssignTemplateQuery](../../models/components/CampaignMessageAssignTemplateQuery.md) | :heavy_check_mark:                                                                                  | Takes a reusable template, clones it, and assigns the non-reusable clone to the message.            |

### Response

**[AssignTemplateToCampaignMessageResponse](../../models/operations/AssignTemplateToCampaignMessageResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## sendCampaign

Trigger a campaign to send asynchronously<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CampaignSendJobCreateQuery;
import com.commercesystems.klaviyo_java.models.components.CampaignSendJobCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CampaignSendJobEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.SendCampaignResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        SendCampaignResponse res = sdk.campaigns().sendCampaign()
                .revision("2024-10-15")
                .campaignSendJobCreateQuery(CampaignSendJobCreateQuery.builder()
                    .data(CampaignSendJobCreateQueryResourceObject.builder()
                        .type(CampaignSendJobEnum.CAMPAIGN_SEND_JOB)
                        .id("<id>")
                        .build())
                    .build())
                .call();

        if (res.postCampaignSendJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `revision`                                                                          | *String*                                                                            | :heavy_check_mark:                                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                                 |
| `campaignSendJobCreateQuery`                                                        | [CampaignSendJobCreateQuery](../../models/components/CampaignSendJobCreateQuery.md) | :heavy_check_mark:                                                                  | Trigger the campaign to send asynchronously                                         |

### Response

**[SendCampaignResponse](../../models/operations/SendCampaignResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## refreshCampaignRecipientEstimation

Trigger an asynchronous job to update the estimated number of recipients
for the given campaign ID. Use the `Get Campaign Recipient Estimation
Job` endpoint to retrieve the status of this estimation job. Use the
`Get Campaign Recipient Estimation` endpoint to retrieve the estimated
recipient count for a given campaign.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CampaignRecipientEstimationJobCreateQuery;
import com.commercesystems.klaviyo_java.models.components.CampaignRecipientEstimationJobCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.CampaignRecipientEstimationJobEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.RefreshCampaignRecipientEstimationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        RefreshCampaignRecipientEstimationResponse res = sdk.campaigns().refreshCampaignRecipientEstimation()
                .revision("2024-10-15")
                .campaignRecipientEstimationJobCreateQuery(CampaignRecipientEstimationJobCreateQuery.builder()
                    .data(CampaignRecipientEstimationJobCreateQueryResourceObject.builder()
                        .type(CampaignRecipientEstimationJobEnum.CAMPAIGN_RECIPIENT_ESTIMATION_JOB)
                        .id("<id>")
                        .build())
                    .build())
                .call();

        if (res.postCampaignRecipientEstimationJobResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                                        | Type                                                                                                                                                                                                                                                                                                                             | Required                                                                                                                                                                                                                                                                                                                         | Description                                                                                                                                                                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `revision`                                                                                                                                                                                                                                                                                                                       | *String*                                                                                                                                                                                                                                                                                                                         | :heavy_check_mark:                                                                                                                                                                                                                                                                                                               | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                                                                                                                              |
| `campaignRecipientEstimationJobCreateQuery`                                                                                                                                                                                                                                                                                      | [CampaignRecipientEstimationJobCreateQuery](../../models/components/CampaignRecipientEstimationJobCreateQuery.md)                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                                                                                                                               | Trigger an asynchronous job to update the estimated number of recipients<br/>for the given campaign ID. Use the `Get Campaign Recipient Estimation<br/>Job` endpoint to retrieve the status of this estimation job. Use the<br/>`Get Campaign Recipient Estimation` endpoint to retrieve the estimated<br/>recipient count for a given campaign. |

### Response

**[RefreshCampaignRecipientEstimationResponse](../../models/operations/RefreshCampaignRecipientEstimationResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCampaignIdForCampaignMessage

Returns the ID of the related campaign<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCampaignIdForCampaignMessageResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCampaignIdForCampaignMessageResponse res = sdk.campaigns().getCampaignIdForCampaignMessage()
                .id("<id>")
                .revision("2024-10-15")
                .call();

        if (res.getCampaignMessageCampaignRelationshipResponse().isPresent()) {
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

**[GetCampaignIdForCampaignMessageResponse](../../models/operations/GetCampaignIdForCampaignMessageResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCampaignForCampaignMessage

Return the related campaign<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCampaignForCampaignMessageQueryParamFieldsCampaign;
import com.commercesystems.klaviyo_java.models.operations.GetCampaignForCampaignMessageResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCampaignForCampaignMessageResponse res = sdk.campaigns().getCampaignForCampaignMessage()
                .id("<id>")
                .fieldsCampaign(List.of(
                    GetCampaignForCampaignMessageQueryParamFieldsCampaign.SEND_STRATEGY_OPTIONS_STATIC_SEND_PAST_RECIPIENTS_IMMEDIATELY))
                .revision("2024-10-15")
                .call();

        if (res.getCampaignResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                        | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                                             | *String*                                                                                                                                         | :heavy_check_mark:                                                                                                                               | N/A                                                                                                                                              |
| `fieldsCampaign`                                                                                                                                 | List\<[GetCampaignForCampaignMessageQueryParamFieldsCampaign](../../models/operations/GetCampaignForCampaignMessageQueryParamFieldsCampaign.md)> | :heavy_minus_sign:                                                                                                                               | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                          |
| `revision`                                                                                                                                       | *String*                                                                                                                                         | :heavy_check_mark:                                                                                                                               | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                              |

### Response

**[GetCampaignForCampaignMessageResponse](../../models/operations/GetCampaignForCampaignMessageResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getTemplateIdForCampaignMessage

Returns the ID of the related template<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:read`
`templates:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetTemplateIdForCampaignMessageResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTemplateIdForCampaignMessageResponse res = sdk.campaigns().getTemplateIdForCampaignMessage()
                .id("<id>")
                .revision("2024-10-15")
                .call();

        if (res.getCampaignMessageTemplateRelationshipResponse().isPresent()) {
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

**[GetTemplateIdForCampaignMessageResponse](../../models/operations/GetTemplateIdForCampaignMessageResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getTemplateForCampaignMessage

Return the related template<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:read`
`templates:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetTemplateForCampaignMessageResponse;
import com.commercesystems.klaviyo_java.models.operations.QueryParamFieldsTemplate;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTemplateForCampaignMessageResponse res = sdk.campaigns().getTemplateForCampaignMessage()
                .id("<id>")
                .fieldsTemplate(List.of(
                    QueryParamFieldsTemplate.HTML))
                .revision("2024-10-15")
                .call();

        if (res.getTemplateResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | N/A                                                                                                                     |
| `fieldsTemplate`                                                                                                        | List\<[QueryParamFieldsTemplate](../../models/operations/QueryParamFieldsTemplate.md)>                                  | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |

### Response

**[GetTemplateForCampaignMessageResponse](../../models/operations/GetTemplateForCampaignMessageResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getTagIdsForCampaign

Returns the IDs of all tags associated with the given campaign.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`campaigns:read`
`tags:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetTagIdsForCampaignResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTagIdsForCampaignResponse res = sdk.campaigns().getTagIdsForCampaign()
                .id("<id>")
                .revision("2024-10-15")
                .call();

        if (res.getCampaignTagRelationshipListResponseCollection().isPresent()) {
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

**[GetTagIdsForCampaignResponse](../../models/operations/GetTagIdsForCampaignResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getCampaignTags

Return all tags that belong to the given campaign.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`campaigns:read`
`tags:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetCampaignTagsQueryParamFieldsTag;
import com.commercesystems.klaviyo_java.models.operations.GetCampaignTagsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetCampaignTagsResponse res = sdk.campaigns().getCampaignTags()
                .id("<id>")
                .fieldsTag(List.of(
                    GetCampaignTagsQueryParamFieldsTag.NAME))
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
| `fieldsTag`                                                                                                             | List\<[GetCampaignTagsQueryParamFieldsTag](../../models/operations/GetCampaignTagsQueryParamFieldsTag.md)>              | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |

### Response

**[GetCampaignTagsResponse](../../models/operations/GetCampaignTagsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getMessageIdsForCampaign

Returns the IDs of all messages associated with the given campaign.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetMessageIdsForCampaignResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetMessageIdsForCampaignResponse res = sdk.campaigns().getMessageIdsForCampaign()
                .id("<id>")
                .revision("2024-10-15")
                .call();

        if (res.getCampaignMessagesRelationshipListResponseCollection().isPresent()) {
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

**[GetMessageIdsForCampaignResponse](../../models/operations/GetMessageIdsForCampaignResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getMessagesForCampaign

Return all messages that belong to the given campaign.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`campaigns:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetMessagesForCampaignRequest;
import com.commercesystems.klaviyo_java.models.operations.GetMessagesForCampaignResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetMessagesForCampaignRequest req = GetMessagesForCampaignRequest.builder()
                .id("<id>")
                .revision("2024-10-15")
                .build();

        GetMessagesForCampaignResponse res = sdk.campaigns().getMessagesForCampaign()
                .request(req)
                .call();

        if (res.getCampaignMessageResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetMessagesForCampaignRequest](../../models/operations/GetMessagesForCampaignRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetMessagesForCampaignResponse](../../models/operations/GetMessagesForCampaignResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |