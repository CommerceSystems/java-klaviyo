# TrackingSettings
(*trackingSettings()*)

## Overview

tracking settings

### Available Operations

* [getTrackingSettings](#gettrackingsettings) - Get Tracking Settings
* [getTrackingSetting](#gettrackingsetting) - Get Tracking Setting
* [updateTrackingSetting](#updatetrackingsetting) - Update Tracking Setting

## getTrackingSettings

Get all tracking settings in an account. Returns an array with a single tracking setting.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`tracking-settings:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsTrackingSetting;
import com.commercesystems.klaviyo_java.models.operations.GetTrackingSettingsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTrackingSettingsResponse res = sdk.trackingSettings().getTrackingSettings()
                .fieldsTrackingSetting(List.of(
                    FieldsTrackingSetting.UTM_SOURCE))
                .pageCursor("<value>")
                .pageSize(1L)
                .revision("2024-10-15")
                .call();

        if (res.getTrackingSettingResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `fieldsTrackingSetting`                                                                                                 | List\<[FieldsTrackingSetting](../../models/operations/FieldsTrackingSetting.md)>                                        | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |
| `pageCursor`                                                                                                            | *Optional\<String>*                                                                                                     | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination       |
| `pageSize`                                                                                                              | *Optional\<Long>*                                                                                                       | :heavy_minus_sign:                                                                                                      | Default: 1. Min: 1. Max: 1.                                                                                             |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |

### Response

**[GetTrackingSettingsResponse](../../models/operations/GetTrackingSettingsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getTrackingSetting

Get the tracking setting with the given account ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`tracking-settings:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetTrackingSettingResponse;
import com.commercesystems.klaviyo_java.models.operations.QueryParamFieldsTrackingSetting;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetTrackingSettingResponse res = sdk.trackingSettings().getTrackingSetting()
                .id("abCdEf")
                .fieldsTrackingSetting(List.of(
                    QueryParamFieldsTrackingSetting.UTM_ID_FLOW_VALUE))
                .revision("2024-10-15")
                .call();

        if (res.getTrackingSettingResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             | Example                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | The id of the tracking setting (account ID).                                                                            | abCdEf                                                                                                                  |
| `fieldsTrackingSetting`                                                                                                 | List\<[QueryParamFieldsTrackingSetting](../../models/operations/QueryParamFieldsTrackingSetting.md)>                    | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |                                                                                                                         |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |                                                                                                                         |

### Response

**[GetTrackingSettingResponse](../../models/operations/GetTrackingSettingResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## updateTrackingSetting

Update the tracking setting with the given account ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`tracking-settings:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.TrackingSettingEnum;
import com.commercesystems.klaviyo_java.models.components.TrackingSettingPartialUpdateQuery;
import com.commercesystems.klaviyo_java.models.components.TrackingSettingPartialUpdateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.TrackingSettingPartialUpdateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.UpdateTrackingSettingResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        UpdateTrackingSettingResponse res = sdk.trackingSettings().updateTrackingSetting()
                .id("<id>")
                .revision("2024-10-15")
                .trackingSettingPartialUpdateQuery(TrackingSettingPartialUpdateQuery.builder()
                    .data(TrackingSettingPartialUpdateQueryResourceObject.builder()
                        .type(TrackingSettingEnum.TRACKING_SETTING)
                        .id("<id>")
                        .attributes(TrackingSettingPartialUpdateQueryResourceObjectAttributes.builder()
                            .build())
                        .build())
                    .build())
                .call();

        if (res.patchTrackingSettingResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `id`                                                                                              | *String*                                                                                          | :heavy_check_mark:                                                                                | The id of the tracking setting (account ID).                                                      |
| `revision`                                                                                        | *String*                                                                                          | :heavy_check_mark:                                                                                | API endpoint revision (format: YYYY-MM-DD[.suffix])                                               |
| `trackingSettingPartialUpdateQuery`                                                               | [TrackingSettingPartialUpdateQuery](../../models/components/TrackingSettingPartialUpdateQuery.md) | :heavy_check_mark:                                                                                | DTO for updating tracking settings                                                                |

### Response

**[UpdateTrackingSettingResponse](../../models/operations/UpdateTrackingSettingResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |