# Flows
(*flows()*)

## Overview

flows

### Available Operations

* [getFlows](#getflows) - Get Flows
* [getFlow](#getflow) - Get Flow
* [updateFlow](#updateflow) - Update Flow Status
* [deleteFlow](#deleteflow) - Delete Flow
* [getFlowAction](#getflowaction) - Get Flow Action
* [getFlowMessage](#getflowmessage) - Get Flow Message
* [getActionsForFlow](#getactionsforflow) - Get Actions for Flow
* [getActionIdsForFlow](#getactionidsforflow) - Get Action IDs for Flow
* [getTagIdsForFlow](#gettagidsforflow) - Get Tag IDs for Flow
* [getFlowTags](#getflowtags) - Get Flow Tags
* [getFlowActionFlow](#getflowactionflow) - Get Flow For Flow Action
* [getFlowIdForFlowAction](#getflowidforflowaction) - Get Flow ID for Flow Action
* [getMessagesForFlowAction](#getmessagesforflowaction) - Get Messages for Flow Action
* [getMessageIdsForFlowAction](#getmessageidsforflowaction) - Get Message IDs for Flow Action
* [getFlowMessageAction](#getflowmessageaction) - Get Flow Action For Message
* [getActionIdForFlowMessage](#getactionidforflowmessage) - Get Action ID for Flow Message
* [getTemplateIdForFlowMessage](#gettemplateidforflowmessage) - Get Template ID for Flow Message
* [getTemplateForFlowMessage](#gettemplateforflowmessage) - Get Template for Flow Message

## getFlows

Get all flows in an account.

Returns a maximum of 50 flows per request, which can be paginated with cursor-based pagination.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetFlowsRequest;
import com.commercesystems.klaviyo_java.models.operations.GetFlowsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetFlowsRequest req = GetFlowsRequest.builder()
                .revision("2024-10-15")
                .build();

        GetFlowsResponse res = sdk.flows().getFlows()
                .request(req)
                .call();

        if (res.getFlowResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetFlowsRequest](../../models/operations/GetFlowsRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[GetFlowsResponse](../../models/operations/GetFlowsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getFlow

Get a flow with the given flow ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetFlowRequest;
import com.commercesystems.klaviyo_java.models.operations.GetFlowResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetFlowRequest req = GetFlowRequest.builder()
                .id("<id>")
                .revision("2024-10-15")
                .build();

        GetFlowResponse res = sdk.flows().getFlow()
                .request(req)
                .call();

        if (res.getFlowResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetFlowRequest](../../models/operations/GetFlowRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[GetFlowResponse](../../models/operations/GetFlowResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## updateFlow

Update the status of a flow with the given flow ID, and all actions in that flow.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.FlowEnum;
import com.commercesystems.klaviyo_java.models.components.FlowUpdateQuery;
import com.commercesystems.klaviyo_java.models.components.FlowUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.FlowUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UpdateFlowResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateFlowResponse res = sdk.flows().updateFlow()
                .id("<id>")
                .revision("2024-10-15")
                .flowUpdateQuery(FlowUpdateQuery.builder()
                    .data(FlowUpdateQueryResourceObject.builder()
                        .type(FlowEnum.FLOW)
                        .id("<id>")
                        .attributes(FlowUpdateQueryResourceObjectAttributes.builder()
                            .status("<value>")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.patchFlowResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `id`                                                          | *String*                                                      | :heavy_check_mark:                                            | ID of the Flow to update. Ex: XVTP5Q                          |
| `revision`                                                    | *String*                                                      | :heavy_check_mark:                                            | API endpoint revision (format: YYYY-MM-DD[.suffix])           |
| `flowUpdateQuery`                                             | [FlowUpdateQuery](../../models/components/FlowUpdateQuery.md) | :heavy_check_mark:                                            | N/A                                                           |

### Response

**[UpdateFlowResponse](../../models/operations/UpdateFlowResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## deleteFlow

Delete a flow with the given flow ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.DeleteFlowResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        DeleteFlowResponse res = sdk.flows().deleteFlow()
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
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | ID of the Flow to delete. Ex: XVTP5Q                |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |

### Response

**[DeleteFlowResponse](../../models/operations/DeleteFlowResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getFlowAction

Get a flow action from a flow with the given flow action ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetFlowActionRequest;
import com.commercesystems.klaviyo_java.models.operations.GetFlowActionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetFlowActionRequest req = GetFlowActionRequest.builder()
                .id("<id>")
                .revision("2024-10-15")
                .build();

        GetFlowActionResponse res = sdk.flows().getFlowAction()
                .request(req)
                .call();

        if (res.getFlowActionResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetFlowActionRequest](../../models/operations/GetFlowActionRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetFlowActionResponse](../../models/operations/GetFlowActionResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getFlowMessage

Get the flow message of a flow with the given message ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetFlowMessageRequest;
import com.commercesystems.klaviyo_java.models.operations.GetFlowMessageResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetFlowMessageRequest req = GetFlowMessageRequest.builder()
                .id("<id>")
                .revision("2024-10-15")
                .build();

        GetFlowMessageResponse res = sdk.flows().getFlowMessage()
                .request(req)
                .call();

        if (res.getFlowMessageResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetFlowMessageRequest](../../models/operations/GetFlowMessageRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetFlowMessageResponse](../../models/operations/GetFlowMessageResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getActionsForFlow

Get all flow actions associated with the given flow ID.

Returns a maximum of 50 flows per request, which can be paginated with cursor-based pagination.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetActionsForFlowRequest;
import com.commercesystems.klaviyo_java.models.operations.GetActionsForFlowResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetActionsForFlowRequest req = GetActionsForFlowRequest.builder()
                .id("<id>")
                .revision("2024-10-15")
                .build();

        GetActionsForFlowResponse res = sdk.flows().getActionsForFlow()
                .request(req)
                .call();

        if (res.getFlowActionResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetActionsForFlowRequest](../../models/operations/GetActionsForFlowRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetActionsForFlowResponse](../../models/operations/GetActionsForFlowResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getActionIdsForFlow

Get all [relationships](https://developers.klaviyo.com/en/reference/api_overview#relationships) for flow actions associated with the given flow ID.

Flow action relationships can be sorted by the following fields, in ascending and descending order:
`id`,  `status`, `created`, `updated`

Use filters to narrow your results.

Returns a maximum of 50 flow action relationships per request, which can be paginated with offset pagination. Offset pagination uses the following parameters: `page[size]` and `page[number]`.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetActionIdsForFlowRequest;
import com.commercesystems.klaviyo_java.models.operations.GetActionIdsForFlowResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetActionIdsForFlowRequest req = GetActionIdsForFlowRequest.builder()
                .id("<id>")
                .revision("2024-10-15")
                .build();

        GetActionIdsForFlowResponse res = sdk.flows().getActionIdsForFlow()
                .request(req)
                .call();

        if (res.getFlowFlowActionRelationshipListResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetActionIdsForFlowRequest](../../models/operations/GetActionIdsForFlowRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetActionIdsForFlowResponse](../../models/operations/GetActionIdsForFlowResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getTagIdsForFlow

Return the tag IDs of all tags associated with the given flow.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:read`
`tags:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetTagIdsForFlowResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTagIdsForFlowResponse res = sdk.flows().getTagIdsForFlow()
                .id("<id>")
                .revision("2024-10-15")
                .call();

        if (res.getFlowTagRelationshipListResponseCollection().isPresent()) {
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

**[GetTagIdsForFlowResponse](../../models/operations/GetTagIdsForFlowResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getFlowTags

Return all tags associated with the given flow ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:read`
`tags:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetFlowTagsQueryParamFieldsTag;
import com.commercesystems.klaviyo_java.models.operations.GetFlowTagsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetFlowTagsResponse res = sdk.flows().getFlowTags()
                .id("<id>")
                .fieldsTag(List.of(
                    GetFlowTagsQueryParamFieldsTag.NAME))
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
| `fieldsTag`                                                                                                             | List\<[GetFlowTagsQueryParamFieldsTag](../../models/operations/GetFlowTagsQueryParamFieldsTag.md)>                      | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |

### Response

**[GetFlowTagsResponse](../../models/operations/GetFlowTagsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getFlowActionFlow

Get the flow associated with the given action ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetFlowActionFlowQueryParamFieldsFlow;
import com.commercesystems.klaviyo_java.models.operations.GetFlowActionFlowResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetFlowActionFlowResponse res = sdk.flows().getFlowActionFlow()
                .id("<id>")
                .fieldsFlow(List.of(
                    GetFlowActionFlowQueryParamFieldsFlow.CREATED))
                .revision("2024-10-15")
                .call();

        if (res.getFlowResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | N/A                                                                                                                     |
| `fieldsFlow`                                                                                                            | List\<[GetFlowActionFlowQueryParamFieldsFlow](../../models/operations/GetFlowActionFlowQueryParamFieldsFlow.md)>        | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |

### Response

**[GetFlowActionFlowResponse](../../models/operations/GetFlowActionFlowResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getFlowIdForFlowAction

Get the flow associated with the given action ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetFlowIdForFlowActionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetFlowIdForFlowActionResponse res = sdk.flows().getFlowIdForFlowAction()
                .id("<id>")
                .revision("2024-10-15")
                .call();

        if (res.getFlowActionFlowRelationshipResponse().isPresent()) {
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

**[GetFlowIdForFlowActionResponse](../../models/operations/GetFlowIdForFlowActionResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getMessagesForFlowAction

Get all flow messages associated with the given action ID.

Flow messages can be sorted by the following fields, in ascending and descending order:

ascending: `id`,  `name`, `created`, `updated`
descending: `-id`,  `-name`, `-created`, `-updated`

Returns a maximum of 50 flows per request, which can be paginated with offset pagination. Offset pagination uses the following parameters: `page[size]` and `page[number]`<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetMessagesForFlowActionRequest;
import com.commercesystems.klaviyo_java.models.operations.GetMessagesForFlowActionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetMessagesForFlowActionRequest req = GetMessagesForFlowActionRequest.builder()
                .id("<id>")
                .revision("2024-10-15")
                .build();

        GetMessagesForFlowActionResponse res = sdk.flows().getMessagesForFlowAction()
                .request(req)
                .call();

        if (res.getFlowMessageResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [GetMessagesForFlowActionRequest](../../models/operations/GetMessagesForFlowActionRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[GetMessagesForFlowActionResponse](../../models/operations/GetMessagesForFlowActionResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getMessageIdsForFlowAction

Get all relationships for flow messages associated with the given flow action ID.

Returns a maximum of 50 flow message relationships per request, which can be paginated with cursor-based pagination.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetMessageIdsForFlowActionRequest;
import com.commercesystems.klaviyo_java.models.operations.GetMessageIdsForFlowActionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetMessageIdsForFlowActionRequest req = GetMessageIdsForFlowActionRequest.builder()
                .id("<id>")
                .revision("2024-10-15")
                .build();

        GetMessageIdsForFlowActionResponse res = sdk.flows().getMessageIdsForFlowAction()
                .request(req)
                .call();

        if (res.getFlowActionFlowMessageRelationshipResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetMessageIdsForFlowActionRequest](../../models/operations/GetMessageIdsForFlowActionRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetMessageIdsForFlowActionResponse](../../models/operations/GetMessageIdsForFlowActionResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getFlowMessageAction

Get the flow action for a flow message with the given message ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetFlowMessageActionQueryParamFieldsFlowAction;
import com.commercesystems.klaviyo_java.models.operations.GetFlowMessageActionResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetFlowMessageActionResponse res = sdk.flows().getFlowMessageAction()
                .id("<id>")
                .fieldsFlowAction(List.of(
                    GetFlowMessageActionQueryParamFieldsFlowAction.RENDER_OPTIONS_ADD_INFO_LINK))
                .revision("2024-10-15")
                .call();

        if (res.getFlowActionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                               | *String*                                                                                                                           | :heavy_check_mark:                                                                                                                 | N/A                                                                                                                                |
| `fieldsFlowAction`                                                                                                                 | List\<[GetFlowMessageActionQueryParamFieldsFlowAction](../../models/operations/GetFlowMessageActionQueryParamFieldsFlowAction.md)> | :heavy_minus_sign:                                                                                                                 | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets            |
| `revision`                                                                                                                         | *String*                                                                                                                           | :heavy_check_mark:                                                                                                                 | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                |

### Response

**[GetFlowMessageActionResponse](../../models/operations/GetFlowMessageActionResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getActionIdForFlowMessage

Get the [relationship](https://developers.klaviyo.com/en/reference/api_overview#relationships) for a flow message's flow action, given the flow ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`flows:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetActionIdForFlowMessageResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetActionIdForFlowMessageResponse res = sdk.flows().getActionIdForFlowMessage()
                .id("<id>")
                .revision("2024-10-15")
                .call();

        if (res.getFlowMessageFlowActionRelationshipResponse().isPresent()) {
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

**[GetActionIdForFlowMessageResponse](../../models/operations/GetActionIdForFlowMessageResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getTemplateIdForFlowMessage

Returns the ID of the related template<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`templates:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetTemplateIdForFlowMessageResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTemplateIdForFlowMessageResponse res = sdk.flows().getTemplateIdForFlowMessage()
                .id("<id>")
                .revision("2024-10-15")
                .call();

        if (res.getFlowMessageTemplateRelationshipResponse().isPresent()) {
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

**[GetTemplateIdForFlowMessageResponse](../../models/operations/GetTemplateIdForFlowMessageResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getTemplateForFlowMessage

Return the related template<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`templates:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetTemplateForFlowMessageQueryParamFieldsTemplate;
import com.commercesystems.klaviyo_java.models.operations.GetTemplateForFlowMessageResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTemplateForFlowMessageResponse res = sdk.flows().getTemplateForFlowMessage()
                .id("<id>")
                .fieldsTemplate(List.of(
                    GetTemplateForFlowMessageQueryParamFieldsTemplate.NAME))
                .revision("2024-10-15")
                .call();

        if (res.getTemplateResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                     | *String*                                                                                                                                 | :heavy_check_mark:                                                                                                                       | N/A                                                                                                                                      |
| `fieldsTemplate`                                                                                                                         | List\<[GetTemplateForFlowMessageQueryParamFieldsTemplate](../../models/operations/GetTemplateForFlowMessageQueryParamFieldsTemplate.md)> | :heavy_minus_sign:                                                                                                                       | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                  |
| `revision`                                                                                                                               | *String*                                                                                                                                 | :heavy_check_mark:                                                                                                                       | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                      |

### Response

**[GetTemplateForFlowMessageResponse](../../models/operations/GetTemplateForFlowMessageResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |