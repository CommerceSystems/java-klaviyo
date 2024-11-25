# Webhooks
(*webhooks()*)

## Overview

webhooks

### Available Operations

* [getWebhooks](#getwebhooks) - Get Webhooks
* [createWebhook](#createwebhook) - Create Webhook
* [getWebhook](#getwebhook) - Get Webhook
* [updateWebhook](#updatewebhook) - Update Webhook
* [deleteWebhook](#deletewebhook) - Delete Webhook
* [getWebhookTopics](#getwebhooktopics) - Get Webhook Topics
* [getWebhookTopic](#getwebhooktopic) - Get Webhook Topic

## getWebhooks

Get all webhooks in an account.<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `15/m`

**Scopes:**
`webhooks:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsWebhook;
import com.commercesystems.klaviyo_java.models.operations.GetWebhooksQueryParamInclude;
import com.commercesystems.klaviyo_java.models.operations.GetWebhooksResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetWebhooksResponse res = sdk.webhooks().getWebhooks()
                .fieldsWebhook(List.of(
                    FieldsWebhook.CREATED_AT))
                .include(List.of(
                    GetWebhooksQueryParamInclude.WEBHOOK_TOPICS))
                .revision("2024-10-15")
                .call();

        if (res.getWebhookResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `fieldsWebhook`                                                                                                         | List\<[FieldsWebhook](../../models/operations/FieldsWebhook.md)>                                                        | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |
| `include`                                                                                                               | List\<[GetWebhooksQueryParamInclude](../../models/operations/GetWebhooksQueryParamInclude.md)>                          | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships    |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |

### Response

**[GetWebhooksResponse](../../models/operations/GetWebhooksResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## createWebhook

Create a new Webhook<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `15/m`

**Scopes:**
`webhooks:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.WebhookCreateQuery;
import com.commercesystems.klaviyo_java.models.components.WebhookCreateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.WebhookCreateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.WebhookCreateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.WebhookCreateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.components.WebhookEnum;
import com.commercesystems.klaviyo_java.models.components.WebhookTopicEnum;
import com.commercesystems.klaviyo_java.models.components.WebhookTopics;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.CreateWebhookResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        CreateWebhookResponse res = sdk.webhooks().createWebhook()
                .revision("2024-10-15")
                .webhookCreateQuery(WebhookCreateQuery.builder()
                    .data(WebhookCreateQueryResourceObject.builder()
                        .type(WebhookEnum.WEBHOOK)
                        .attributes(WebhookCreateQueryResourceObjectAttributes.builder()
                            .name("My Webhook")
                            .endpointUrl("https://www.example.com/example/path")
                            .secretKey("INSERT_SECRET_KEY")
                            .description("A webhook for sms events")
                            .build())
                        .relationships(WebhookCreateQueryResourceObjectRelationships.builder()
                            .webhookTopics(WebhookTopics.builder()
                                .data(List.of(
                                    WebhookCreateQueryResourceObjectData.builder()
                                        .type(WebhookTopicEnum.WEBHOOK_TOPIC)
                                        .id("event:klaviyo.sent_sms")
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postWebhookResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `revision`                                                          | *String*                                                            | :heavy_check_mark:                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                 |
| `webhookCreateQuery`                                                | [WebhookCreateQuery](../../models/components/WebhookCreateQuery.md) | :heavy_check_mark:                                                  | N/A                                                                 |

### Response

**[CreateWebhookResponse](../../models/operations/CreateWebhookResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getWebhook

Get the webhook with the given ID.<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `15/m`

**Scopes:**
`webhooks:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetWebhookQueryParamInclude;
import com.commercesystems.klaviyo_java.models.operations.GetWebhookResponse;
import com.commercesystems.klaviyo_java.models.operations.QueryParamFieldsWebhook;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetWebhookResponse res = sdk.webhooks().getWebhook()
                .id("<id>")
                .fieldsWebhook(List.of(
                    QueryParamFieldsWebhook.DESCRIPTION))
                .include(List.of(
                    GetWebhookQueryParamInclude.WEBHOOK_TOPICS))
                .revision("2024-10-15")
                .call();

        if (res.getWebhookResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | The ID of the webhook.                                                                                                  |
| `fieldsWebhook`                                                                                                         | List\<[QueryParamFieldsWebhook](../../models/operations/QueryParamFieldsWebhook.md)>                                    | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |
| `include`                                                                                                               | List\<[GetWebhookQueryParamInclude](../../models/operations/GetWebhookQueryParamInclude.md)>                            | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships    |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |

### Response

**[GetWebhookResponse](../../models/operations/GetWebhookResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## updateWebhook

Update the webhook with the given ID.<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `15/m`

**Scopes:**
`webhooks:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.WebhookEnum;
import com.commercesystems.klaviyo_java.models.components.WebhookPartialUpdateQuery;
import com.commercesystems.klaviyo_java.models.components.WebhookPartialUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.WebhookPartialUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.WebhookPartialUpdateQueryResourceObjectData;
import com.commercesystems.klaviyo_java.models.components.WebhookPartialUpdateQueryResourceObjectRelationships;
import com.commercesystems.klaviyo_java.models.components.WebhookPartialUpdateQueryResourceObjectWebhookTopics;
import com.commercesystems.klaviyo_java.models.components.WebhookTopicEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UpdateWebhookResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateWebhookResponse res = sdk.webhooks().updateWebhook()
                .id("<id>")
                .revision("2024-10-15")
                .webhookPartialUpdateQuery(WebhookPartialUpdateQuery.builder()
                    .data(WebhookPartialUpdateQueryResourceObject.builder()
                        .type(WebhookEnum.WEBHOOK)
                        .id("<id>")
                        .attributes(WebhookPartialUpdateQueryResourceObjectAttributes.builder()
                            .endpointUrl("https://www.example.com/example/path")
                            .build())
                        .relationships(WebhookPartialUpdateQueryResourceObjectRelationships.builder()
                            .webhookTopics(WebhookPartialUpdateQueryResourceObjectWebhookTopics.builder()
                                .data(List.of(
                                    WebhookPartialUpdateQueryResourceObjectData.builder()
                                        .type(WebhookTopicEnum.WEBHOOK_TOPIC)
                                        .id("event:klaviyo.sent_sms")
                                        .build()))
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        if (res.patchWebhookResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `id`                                                                              | *String*                                                                          | :heavy_check_mark:                                                                | The ID of the webhook.                                                            |
| `revision`                                                                        | *String*                                                                          | :heavy_check_mark:                                                                | API endpoint revision (format: YYYY-MM-DD[.suffix])                               |
| `webhookPartialUpdateQuery`                                                       | [WebhookPartialUpdateQuery](../../models/components/WebhookPartialUpdateQuery.md) | :heavy_check_mark:                                                                | N/A                                                                               |

### Response

**[UpdateWebhookResponse](../../models/operations/UpdateWebhookResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## deleteWebhook

Delete a webhook with the given ID.<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `15/m`

**Scopes:**
`webhooks:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.DeleteWebhookResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        DeleteWebhookResponse res = sdk.webhooks().deleteWebhook()
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
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The ID of the webhook.                              |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |

### Response

**[DeleteWebhookResponse](../../models/operations/DeleteWebhookResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getWebhookTopics

Get all webhook topics in a Klaviyo account.<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `15/m`

**Scopes:**
`webhooks:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetWebhookTopicsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetWebhookTopicsResponse res = sdk.webhooks().getWebhookTopics()
                .revision("2024-10-15")
                .call();

        if (res.getWebhookTopicResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |

### Response

**[GetWebhookTopicsResponse](../../models/operations/GetWebhookTopicsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getWebhookTopic

Get the webhook topic with the given ID.<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `15/m`

**Scopes:**
`webhooks:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetWebhookTopicResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetWebhookTopicResponse res = sdk.webhooks().getWebhookTopic()
                .id("event:klaviyo.sent_sms")
                .revision("2024-10-15")
                .call();

        if (res.getWebhookTopicResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The ID of the webhook topic.                        | event:klaviyo.sent_sms                              |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |                                                     |

### Response

**[GetWebhookTopicResponse](../../models/operations/GetWebhookTopicResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |