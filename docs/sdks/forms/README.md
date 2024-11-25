# Forms
(*forms()*)

## Overview

forms

### Available Operations

* [getForms](#getforms) - Get Forms
* [getForm](#getform) - Get Form
* [getFormVersion](#getformversion) - Get Form Version
* [getVersionsForForm](#getversionsforform) - Get Versions for Form
* [getVersionIdsForForm](#getversionidsforform) - Get Version IDs for Form
* [getFormIdForFormVersion](#getformidforformversion) - Get Form ID for Form Version
* [getFormForFormVersion](#getformforformversion) - Get Form for Form Version

## getForms

Get all forms in an account.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`forms:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetFormsRequest;
import com.commercesystems.klaviyo_java.models.operations.GetFormsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetFormsRequest req = GetFormsRequest.builder()
                .revision("2024-10-15")
                .build();

        GetFormsResponse res = sdk.forms().getForms()
                .request(req)
                .call();

        if (res.getFormResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetFormsRequest](../../models/operations/GetFormsRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[GetFormsResponse](../../models/operations/GetFormsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getForm

Get the form with the given ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`forms:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetFormRequest;
import com.commercesystems.klaviyo_java.models.operations.GetFormResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetFormRequest req = GetFormRequest.builder()
                .id("Y6nRLr")
                .revision("2024-10-15")
                .build();

        GetFormResponse res = sdk.forms().getForm()
                .request(req)
                .call();

        if (res.getFormResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetFormRequest](../../models/operations/GetFormRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[GetFormResponse](../../models/operations/GetFormResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getFormVersion

Get the form version with the given ID.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`forms:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetFormVersionResponse;
import com.commercesystems.klaviyo_java.models.operations.QueryParamFieldsFormVersion;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetFormVersionResponse res = sdk.forms().getFormVersion()
                .id("1234567")
                .fieldsFormVersion(List.of(
                    QueryParamFieldsFormVersion.FORM_TYPE))
                .revision("2024-10-15")
                .call();

        if (res.getFormVersionResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             | Example                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | The ID of the form version                                                                                              | 1234567                                                                                                                 |
| `fieldsFormVersion`                                                                                                     | List\<[QueryParamFieldsFormVersion](../../models/operations/QueryParamFieldsFormVersion.md)>                            | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |                                                                                                                         |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |                                                                                                                         |

### Response

**[GetFormVersionResponse](../../models/operations/GetFormVersionResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getVersionsForForm

Get the form versions for the given form.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`forms:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetVersionsForFormRequest;
import com.commercesystems.klaviyo_java.models.operations.GetVersionsForFormResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetVersionsForFormRequest req = GetVersionsForFormRequest.builder()
                .id("Y6nRLr")
                .revision("2024-10-15")
                .build();

        GetVersionsForFormResponse res = sdk.forms().getVersionsForForm()
                .request(req)
                .call();

        if (res.getFormVersionResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetVersionsForFormRequest](../../models/operations/GetVersionsForFormRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetVersionsForFormResponse](../../models/operations/GetVersionsForFormResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getVersionIdsForForm

Get the IDs of the form versions for the given form.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`forms:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetVersionIdsForFormResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetVersionIdsForFormResponse res = sdk.forms().getVersionIdsForForm()
                .id("Y6nRLr")
                .revision("2024-10-15")
                .call();

        if (res.getFormFormVersionRelationshipsResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The ID of the form                                  | Y6nRLr                                              |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |                                                     |

### Response

**[GetVersionIdsForFormResponse](../../models/operations/GetVersionIdsForFormResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getFormIdForFormVersion

Get the ID of the form associated with the given form version.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`forms:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetFormIdForFormVersionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetFormIdForFormVersionResponse res = sdk.forms().getFormIdForFormVersion()
                .id("1234567")
                .revision("2024-10-15")
                .call();

        if (res.getFormVersionFormRelationshipResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The ID of the form version                          | 1234567                                             |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |                                                     |

### Response

**[GetFormIdForFormVersionResponse](../../models/operations/GetFormIdForFormVersionResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getFormForFormVersion

Get the form associated with the given form version.<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`forms:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetFormForFormVersionQueryParamFieldsForm;
import com.commercesystems.klaviyo_java.models.operations.GetFormForFormVersionResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetFormForFormVersionResponse res = sdk.forms().getFormForFormVersion()
                .id("1234567")
                .fieldsForm(List.of(
                    GetFormForFormVersionQueryParamFieldsForm.UPDATED_AT))
                .revision("2024-10-15")
                .call();

        if (res.getFormResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              | Example                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                     | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | The ID of the form version                                                                                               | 1234567                                                                                                                  |
| `fieldsForm`                                                                                                             | List\<[GetFormForFormVersionQueryParamFieldsForm](../../models/operations/GetFormForFormVersionQueryParamFieldsForm.md)> | :heavy_minus_sign:                                                                                                       | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets  |                                                                                                                          |
| `revision`                                                                                                               | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                      |                                                                                                                          |

### Response

**[GetFormForFormVersionResponse](../../models/operations/GetFormForFormVersionResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |