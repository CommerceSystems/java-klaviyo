# Reporting
(*reporting()*)

## Overview

reporting

### Available Operations

* [queryCampaignValues](#querycampaignvalues) - Query Campaign Values
* [queryFlowValues](#queryflowvalues) - Query Flow Values
* [queryFlowSeries](#queryflowseries) - Query Flow Series
* [queryFormValues](#queryformvalues) - Query Form Values
* [queryFormSeries](#queryformseries) - Query Form Series
* [querySegmentValues](#querysegmentvalues) - Query Segment Values
* [querySegmentSeries](#querysegmentseries) - Query Segment Series

## queryCampaignValues

Returns the requested campaign analytics values data<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `2/m`<br>Daily: `225/d`

**Scopes:**
`campaigns:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CampaignValuesReportEnum;
import com.commercesystems.klaviyo_java.models.components.CampaignValuesRequestDTO;
import com.commercesystems.klaviyo_java.models.components.CampaignValuesRequestDTOResourceObject;
import com.commercesystems.klaviyo_java.models.components.CampaignValuesRequestDTOResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.CampaignValuesRequestDTOResourceObjectStatistics;
import com.commercesystems.klaviyo_java.models.components.CampaignValuesRequestDTOResourceObjectTimeframe;
import com.commercesystems.klaviyo_java.models.components.CustomTimeframe;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.QueryCampaignValuesResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        QueryCampaignValuesResponse res = sdk.reporting().queryCampaignValues()
                .pageCursor("<value>")
                .revision("2024-10-15")
                .campaignValuesRequestDTO(CampaignValuesRequestDTO.builder()
                    .data(CampaignValuesRequestDTOResourceObject.builder()
                        .type(CampaignValuesReportEnum.CAMPAIGN_VALUES_REPORT)
                        .attributes(CampaignValuesRequestDTOResourceObjectAttributes.builder()
                            .statistics(List.of(
                                CampaignValuesRequestDTOResourceObjectStatistics.OPENS,
                                CampaignValuesRequestDTOResourceObjectStatistics.OPEN_RATE))
                            .timeframe(CampaignValuesRequestDTOResourceObjectTimeframe.of(CustomTimeframe.builder()
                                .start(OffsetDateTime.parse("2022-11-08T00:00:00+00:00"))
                                .end(OffsetDateTime.parse("2022-11-08T00:00:00+00:00"))
                                .build()))
                            .conversionMetricId("RESQ6t")
                            .filter("and(equals(campaign_id,\"abc123\"),contains-any(send_channel,[\"email\",\"sms\"]))")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postCampaignValuesResponseDTO().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `pageCursor`                                                                                                      | *Optional\<String>*                                                                                               | :heavy_minus_sign:                                                                                                | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination |
| `revision`                                                                                                        | *String*                                                                                                          | :heavy_check_mark:                                                                                                | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                               |
| `campaignValuesRequestDTO`                                                                                        | [CampaignValuesRequestDTO](../../models/components/CampaignValuesRequestDTO.md)                                   | :heavy_check_mark:                                                                                                | N/A                                                                                                               |

### Response

**[QueryCampaignValuesResponse](../../models/operations/QueryCampaignValuesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## queryFlowValues

Returns the requested flow analytics values data<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `2/m`<br>Daily: `225/d`

**Scopes:**
`flows:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.FlowValuesReportEnum;
import com.commercesystems.klaviyo_java.models.components.FlowValuesRequestDTO;
import com.commercesystems.klaviyo_java.models.components.FlowValuesRequestDTOResourceObject;
import com.commercesystems.klaviyo_java.models.components.FlowValuesRequestDTOResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.FlowValuesRequestDTOResourceObjectStatistics;
import com.commercesystems.klaviyo_java.models.components.FlowValuesRequestDTOResourceObjectTimeframe;
import com.commercesystems.klaviyo_java.models.components.Key;
import com.commercesystems.klaviyo_java.models.components.Timeframe;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.QueryFlowValuesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        QueryFlowValuesResponse res = sdk.reporting().queryFlowValues()
                .pageCursor("<value>")
                .revision("2024-10-15")
                .flowValuesRequestDTO(FlowValuesRequestDTO.builder()
                    .data(FlowValuesRequestDTOResourceObject.builder()
                        .type(FlowValuesReportEnum.FLOW_VALUES_REPORT)
                        .attributes(FlowValuesRequestDTOResourceObjectAttributes.builder()
                            .statistics(List.of(
                                FlowValuesRequestDTOResourceObjectStatistics.OPENS,
                                FlowValuesRequestDTOResourceObjectStatistics.OPEN_RATE))
                            .timeframe(FlowValuesRequestDTOResourceObjectTimeframe.of(Timeframe.builder()
                                .key(Key.THIS_WEEK)
                                .build()))
                            .conversionMetricId("RESQ6t")
                            .filter("and(equals(flow_id,\"abc123\"),contains-any(send_channel,[\"email\",\"sms\"]))")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postFlowValuesResponseDTO().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `pageCursor`                                                                                                      | *Optional\<String>*                                                                                               | :heavy_minus_sign:                                                                                                | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination |
| `revision`                                                                                                        | *String*                                                                                                          | :heavy_check_mark:                                                                                                | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                               |
| `flowValuesRequestDTO`                                                                                            | [FlowValuesRequestDTO](../../models/components/FlowValuesRequestDTO.md)                                           | :heavy_check_mark:                                                                                                | N/A                                                                                                               |

### Response

**[QueryFlowValuesResponse](../../models/operations/QueryFlowValuesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## queryFlowSeries

Returns the requested flow analytics series data<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `2/m`<br>Daily: `225/d`

**Scopes:**
`flows:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.FlowSeriesReportEnum;
import com.commercesystems.klaviyo_java.models.components.FlowSeriesRequestDTO;
import com.commercesystems.klaviyo_java.models.components.FlowSeriesRequestDTOResourceObject;
import com.commercesystems.klaviyo_java.models.components.FlowSeriesRequestDTOResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.FlowSeriesRequestDTOResourceObjectInterval;
import com.commercesystems.klaviyo_java.models.components.FlowSeriesRequestDTOResourceObjectStatistics;
import com.commercesystems.klaviyo_java.models.components.FlowSeriesRequestDTOResourceObjectTimeframe;
import com.commercesystems.klaviyo_java.models.components.Key;
import com.commercesystems.klaviyo_java.models.components.Timeframe;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.QueryFlowSeriesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        QueryFlowSeriesResponse res = sdk.reporting().queryFlowSeries()
                .pageCursor("<value>")
                .revision("2024-10-15")
                .flowSeriesRequestDTO(FlowSeriesRequestDTO.builder()
                    .data(FlowSeriesRequestDTOResourceObject.builder()
                        .type(FlowSeriesReportEnum.FLOW_SERIES_REPORT)
                        .attributes(FlowSeriesRequestDTOResourceObjectAttributes.builder()
                            .statistics(List.of(
                                FlowSeriesRequestDTOResourceObjectStatistics.OPENS,
                                FlowSeriesRequestDTOResourceObjectStatistics.OPEN_RATE))
                            .timeframe(FlowSeriesRequestDTOResourceObjectTimeframe.of(Timeframe.builder()
                                .key(Key.LAST_WEEK)
                                .build()))
                            .interval(FlowSeriesRequestDTOResourceObjectInterval.WEEKLY)
                            .conversionMetricId("RESQ6t")
                            .filter("and(equals(flow_id,\"abc123\"),contains-any(send_channel,[\"email\",\"sms\"]))")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postFlowSeriesResponseDTO().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `pageCursor`                                                                                                      | *Optional\<String>*                                                                                               | :heavy_minus_sign:                                                                                                | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination |
| `revision`                                                                                                        | *String*                                                                                                          | :heavy_check_mark:                                                                                                | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                               |
| `flowSeriesRequestDTO`                                                                                            | [FlowSeriesRequestDTO](../../models/components/FlowSeriesRequestDTO.md)                                           | :heavy_check_mark:                                                                                                | N/A                                                                                                               |

### Response

**[QueryFlowSeriesResponse](../../models/operations/QueryFlowSeriesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## queryFormValues

Returns the requested form analytics values data.<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `2/m`<br>Daily: `225/d`

**Scopes:**
`forms:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.CustomTimeframe;
import com.commercesystems.klaviyo_java.models.components.FormValuesReportEnum;
import com.commercesystems.klaviyo_java.models.components.FormValuesRequestDTO;
import com.commercesystems.klaviyo_java.models.components.FormValuesRequestDTOResourceObject;
import com.commercesystems.klaviyo_java.models.components.FormValuesRequestDTOResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.FormValuesRequestDTOResourceObjectStatistics;
import com.commercesystems.klaviyo_java.models.components.FormValuesRequestDTOResourceObjectTimeframe;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.QueryFormValuesResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        QueryFormValuesResponse res = sdk.reporting().queryFormValues()
                .revision("2024-10-15")
                .formValuesRequestDTO(FormValuesRequestDTO.builder()
                    .data(FormValuesRequestDTOResourceObject.builder()
                        .type(FormValuesReportEnum.FORM_VALUES_REPORT)
                        .attributes(FormValuesRequestDTOResourceObjectAttributes.builder()
                            .statistics(List.of(
                                FormValuesRequestDTOResourceObjectStatistics.VIEWED_FORM,
                                FormValuesRequestDTOResourceObjectStatistics.SUBMIT_RATE))
                            .timeframe(FormValuesRequestDTOResourceObjectTimeframe.of(CustomTimeframe.builder()
                                .start(OffsetDateTime.parse("2022-11-08T00:00:00+00:00"))
                                .end(OffsetDateTime.parse("2022-11-08T00:00:00+00:00"))
                                .build()))
                            .filter("and(equals(form_id,\"abc123\"),any(form_version_id,[\"xyz123\",\"ghi456\"]))")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postFormValuesResponseDTO().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `revision`                                                              | *String*                                                                | :heavy_check_mark:                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                     |
| `formValuesRequestDTO`                                                  | [FormValuesRequestDTO](../../models/components/FormValuesRequestDTO.md) | :heavy_check_mark:                                                      | N/A                                                                     |

### Response

**[QueryFormValuesResponse](../../models/operations/QueryFormValuesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## queryFormSeries

Returns the requested form analytics series data.<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `2/m`<br>Daily: `225/d`

**Scopes:**
`forms:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.FormSeriesReportEnum;
import com.commercesystems.klaviyo_java.models.components.FormSeriesRequestDTO;
import com.commercesystems.klaviyo_java.models.components.FormSeriesRequestDTOResourceObject;
import com.commercesystems.klaviyo_java.models.components.FormSeriesRequestDTOResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.FormSeriesRequestDTOResourceObjectInterval;
import com.commercesystems.klaviyo_java.models.components.FormSeriesRequestDTOResourceObjectStatistics;
import com.commercesystems.klaviyo_java.models.components.FormSeriesRequestDTOResourceObjectTimeframe;
import com.commercesystems.klaviyo_java.models.components.Key;
import com.commercesystems.klaviyo_java.models.components.Timeframe;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.QueryFormSeriesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        QueryFormSeriesResponse res = sdk.reporting().queryFormSeries()
                .revision("2024-10-15")
                .formSeriesRequestDTO(FormSeriesRequestDTO.builder()
                    .data(FormSeriesRequestDTOResourceObject.builder()
                        .type(FormSeriesReportEnum.FORM_SERIES_REPORT)
                        .attributes(FormSeriesRequestDTOResourceObjectAttributes.builder()
                            .statistics(List.of(
                                FormSeriesRequestDTOResourceObjectStatistics.VIEWED_FORM,
                                FormSeriesRequestDTOResourceObjectStatistics.SUBMIT_RATE))
                            .timeframe(FormSeriesRequestDTOResourceObjectTimeframe.of(Timeframe.builder()
                                .key(Key.LAST_MONTH)
                                .build()))
                            .interval(FormSeriesRequestDTOResourceObjectInterval.WEEKLY)
                            .filter("and(equals(form_id,\"abc123\"),any(form_version_id,[\"xyz123\",\"ghi456\"]))")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postFormSeriesResponseDTO().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `revision`                                                              | *String*                                                                | :heavy_check_mark:                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                     |
| `formSeriesRequestDTO`                                                  | [FormSeriesRequestDTO](../../models/components/FormSeriesRequestDTO.md) | :heavy_check_mark:                                                      | N/A                                                                     |

### Response

**[QueryFormSeriesResponse](../../models/operations/QueryFormSeriesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## querySegmentValues

Returns the requested segment analytics values data.<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `2/m`<br>Daily: `225/d`

**Scopes:**
`segments:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.Key;
import com.commercesystems.klaviyo_java.models.components.SegmentValuesReportEnum;
import com.commercesystems.klaviyo_java.models.components.SegmentValuesRequestDTO;
import com.commercesystems.klaviyo_java.models.components.SegmentValuesRequestDTOResourceObject;
import com.commercesystems.klaviyo_java.models.components.SegmentValuesRequestDTOResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.SegmentValuesRequestDTOResourceObjectStatistics;
import com.commercesystems.klaviyo_java.models.components.SegmentValuesRequestDTOResourceObjectTimeframe;
import com.commercesystems.klaviyo_java.models.components.Timeframe;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.QuerySegmentValuesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        QuerySegmentValuesResponse res = sdk.reporting().querySegmentValues()
                .revision("2024-10-15")
                .segmentValuesRequestDTO(SegmentValuesRequestDTO.builder()
                    .data(SegmentValuesRequestDTOResourceObject.builder()
                        .type(SegmentValuesReportEnum.SEGMENT_VALUES_REPORT)
                        .attributes(SegmentValuesRequestDTOResourceObjectAttributes.builder()
                            .statistics(List.of(
                                SegmentValuesRequestDTOResourceObjectStatistics.TOTAL_MEMBERS,
                                SegmentValuesRequestDTOResourceObjectStatistics.NET_MEMBERS_CHANGED))
                            .timeframe(SegmentValuesRequestDTOResourceObjectTimeframe.of(Timeframe.builder()
                                .key(Key.LAST_YEAR)
                                .build()))
                            .filter("any(segment_id,[\"xyz123\",\"ghi456\"])")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postSegmentValuesResponseDTO().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `revision`                                                                    | *String*                                                                      | :heavy_check_mark:                                                            | API endpoint revision (format: YYYY-MM-DD[.suffix])                           |
| `segmentValuesRequestDTO`                                                     | [SegmentValuesRequestDTO](../../models/components/SegmentValuesRequestDTO.md) | :heavy_check_mark:                                                            | N/A                                                                           |

### Response

**[QuerySegmentValuesResponse](../../models/operations/QuerySegmentValuesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## querySegmentSeries

Returns the requested segment analytics series data.<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `2/m`<br>Daily: `225/d`

**Scopes:**
`segments:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.Key;
import com.commercesystems.klaviyo_java.models.components.SegmentSeriesReportEnum;
import com.commercesystems.klaviyo_java.models.components.SegmentSeriesRequestDTO;
import com.commercesystems.klaviyo_java.models.components.SegmentSeriesRequestDTOResourceObject;
import com.commercesystems.klaviyo_java.models.components.SegmentSeriesRequestDTOResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.SegmentSeriesRequestDTOResourceObjectInterval;
import com.commercesystems.klaviyo_java.models.components.SegmentSeriesRequestDTOResourceObjectStatistics;
import com.commercesystems.klaviyo_java.models.components.SegmentSeriesRequestDTOResourceObjectTimeframe;
import com.commercesystems.klaviyo_java.models.components.Timeframe;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.QuerySegmentSeriesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        QuerySegmentSeriesResponse res = sdk.reporting().querySegmentSeries()
                .revision("2024-10-15")
                .segmentSeriesRequestDTO(SegmentSeriesRequestDTO.builder()
                    .data(SegmentSeriesRequestDTOResourceObject.builder()
                        .type(SegmentSeriesReportEnum.SEGMENT_SERIES_REPORT)
                        .attributes(SegmentSeriesRequestDTOResourceObjectAttributes.builder()
                            .statistics(List.of(
                                SegmentSeriesRequestDTOResourceObjectStatistics.TOTAL_MEMBERS,
                                SegmentSeriesRequestDTOResourceObjectStatistics.NET_MEMBERS_CHANGED))
                            .timeframe(SegmentSeriesRequestDTOResourceObjectTimeframe.of(Timeframe.builder()
                                .key(Key.LAST_WEEK)
                                .build()))
                            .interval(SegmentSeriesRequestDTOResourceObjectInterval.WEEKLY)
                            .filter("any(segment_id,[\"xyz123\",\"ghi456\"])")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postSegmentSeriesResponseDTO().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `revision`                                                                    | *String*                                                                      | :heavy_check_mark:                                                            | API endpoint revision (format: YYYY-MM-DD[.suffix])                           |
| `segmentSeriesRequestDTO`                                                     | [SegmentSeriesRequestDTO](../../models/components/SegmentSeriesRequestDTO.md) | :heavy_check_mark:                                                            | N/A                                                                           |

### Response

**[QuerySegmentSeriesResponse](../../models/operations/QuerySegmentSeriesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |