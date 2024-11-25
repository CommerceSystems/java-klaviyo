# Metrics
(*metrics()*)

## Overview

metrics

### Available Operations

* [getMetrics](#getmetrics) - Get Metrics
* [getMetric](#getmetric) - Get Metric
* [getMetricProperty](#getmetricproperty) - Get Metric Property
* [queryMetricAggregates](#querymetricaggregates) - Query Metric Aggregates
* [getMetricRelationshipsFlowTriggers](#getmetricrelationshipsflowtriggers) - Get Metric Relationships Flow Triggers
* [getMetricFlowTriggers](#getmetricflowtriggers) - Get Metric Flow Triggers
* [getMetricIdForMetricProperty](#getmetricidformetricproperty) - Get Metric ID for Metric Property
* [getPropertiesForMetric](#getpropertiesformetric) - Get Properties for Metric
* [getPropertyIdsForMetric](#getpropertyidsformetric) - Get Property IDs for Metric
* [getMetricForMetricProperty](#getmetricformetricproperty) - Get Metric for Metric Property

## getMetrics

Get all metrics in an account.

Requests can be filtered by the following fields:
integration `name`, integration `category`

Returns a maximum of 200 results per page.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`metrics:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetMetricsRequest;
import com.commercesystems.klaviyo_java.models.operations.GetMetricsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetMetricsRequest req = GetMetricsRequest.builder()
                .revision("2024-10-15")
                .build();

        GetMetricsResponse res = sdk.metrics().getMetrics()
                .request(req)
                .call();

        if (res.getMetricResponseCollectionCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetMetricsRequest](../../models/operations/GetMetricsRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetMetricsResponse](../../models/operations/GetMetricsResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getMetric

Get a metric with the given metric ID.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`metrics:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetMetricRequest;
import com.commercesystems.klaviyo_java.models.operations.GetMetricResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetMetricRequest req = GetMetricRequest.builder()
                .id("<id>")
                .revision("2024-10-15")
                .build();

        GetMetricResponse res = sdk.metrics().getMetric()
                .request(req)
                .call();

        if (res.getMetricResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetMetricRequest](../../models/operations/GetMetricRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetMetricResponse](../../models/operations/GetMetricResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getMetricProperty

Get a metric property with the given metric property ID.<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `15/m`

**Scopes:**
`metrics:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetMetricPropertyRequest;
import com.commercesystems.klaviyo_java.models.operations.GetMetricPropertyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetMetricPropertyRequest req = GetMetricPropertyRequest.builder()
                .id("925e385b52fb405715f3616c337cc65c")
                .revision("2024-10-15")
                .build();

        GetMetricPropertyResponse res = sdk.metrics().getMetricProperty()
                .request(req)
                .call();

        if (res.getMetricPropertyResponseCompoundDocument().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetMetricPropertyRequest](../../models/operations/GetMetricPropertyRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetMetricPropertyResponse](../../models/operations/GetMetricPropertyResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## queryMetricAggregates

Query and aggregate event data associated with a metric, including native Klaviyo metrics, integration-specific metrics, and custom events. Queries must be passed in the JSON body of your `POST` request.

To request campaign and flow performance data that matches the data shown in Klaviyo's UI, we recommend the [Reporting API](https://developers.klaviyo.com/en/reference/reporting_api_overview).

Results can be filtered and grouped by time, event, or profile dimensions.

To learn more about how to use this endpoint, check out our new [Using the Query Metric Aggregates Endpoint guide](https://developers.klaviyo.com/en/docs/using-the-query-metric-aggregates-endpoint).

For a comprehensive list of request body parameters, native Klaviyo metrics, and their associated attributes for grouping and filtering, please refer to the [metrics attributes guide](https://developers.klaviyo.com/en/docs/supported_metrics_and_attributes).<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`metrics:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.By;
import com.commercesystems.klaviyo_java.models.components.Interval;
import com.commercesystems.klaviyo_java.models.components.MetricAggregateEnum;
import com.commercesystems.klaviyo_java.models.components.MetricAggregateQuery;
import com.commercesystems.klaviyo_java.models.components.MetricAggregateQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.MetricAggregateQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.MetricAggregateQueryResourceObjectMeasurements;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.QueryMetricAggregatesResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        QueryMetricAggregatesResponse res = sdk.metrics().queryMetricAggregates()
                .revision("2024-10-15")
                .metricAggregateQuery(MetricAggregateQuery.builder()
                    .data(MetricAggregateQueryResourceObject.builder()
                        .type(MetricAggregateEnum.METRIC_AGGREGATE)
                        .attributes(MetricAggregateQueryResourceObjectAttributes.builder()
                            .metricId("0rG4eQ")
                            .measurements(List.of(
                                MetricAggregateQueryResourceObjectMeasurements.COUNT))
                            .filter(List.of(
                                "greater-or-equal(datetime,2022-12-01T00:00:00)",
                                "less-than(datetime,2022-12-08T00:00:00"))
                            .interval(Interval.DAY)
                            .pageSize(500L)
                            .by(List.of(
                                By.DOLLAR_MESSAGE))
                            .timezone("America/New_York")
                            .build())
                        .build())
                    .build())
                .call();

        if (res.postMetricAggregateResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `revision`                                                              | *String*                                                                | :heavy_check_mark:                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                     |
| `metricAggregateQuery`                                                  | [MetricAggregateQuery](../../models/components/MetricAggregateQuery.md) | :heavy_check_mark:                                                      | Retrieve Metric Aggregations                                            |

### Response

**[QueryMetricAggregatesResponse](../../models/operations/QueryMetricAggregatesResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getMetricRelationshipsFlowTriggers

Get all flows where the given metric is being used as the trigger.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`flows:read`
`metrics:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetMetricRelationshipsFlowTriggersResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetMetricRelationshipsFlowTriggersResponse res = sdk.metrics().getMetricRelationshipsFlowTriggers()
                .id("<id>")
                .revision("2024-10-15")
                .call();

        if (res.getMetricFlowTriggersRelationshipsResponseCollection().isPresent()) {
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

**[GetMetricRelationshipsFlowTriggersResponse](../../models/operations/GetMetricRelationshipsFlowTriggersResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getMetricFlowTriggers

Get all flows where the given metric is being used as the trigger.<br><br>*Rate limits*:<br>Burst: `10/s`<br>Steady: `150/m`

**Scopes:**
`flows:read`
`metrics:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetMetricFlowTriggersQueryParamFieldsFlow;
import com.commercesystems.klaviyo_java.models.operations.GetMetricFlowTriggersResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetMetricFlowTriggersResponse res = sdk.metrics().getMetricFlowTriggers()
                .id("<id>")
                .fieldsFlow(List.of(
                    GetMetricFlowTriggersQueryParamFieldsFlow.NAME))
                .revision("2024-10-15")
                .call();

        if (res.getFlowResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                     | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `fieldsFlow`                                                                                                             | List\<[GetMetricFlowTriggersQueryParamFieldsFlow](../../models/operations/GetMetricFlowTriggersQueryParamFieldsFlow.md)> | :heavy_minus_sign:                                                                                                       | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets  |
| `revision`                                                                                                               | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                      |

### Response

**[GetMetricFlowTriggersResponse](../../models/operations/GetMetricFlowTriggersResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getMetricIdForMetricProperty

Get the ID of the metric for the given metric property.<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `15/m`

**Scopes:**
`metrics:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetMetricIdForMetricPropertyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetMetricIdForMetricPropertyResponse res = sdk.metrics().getMetricIdForMetricProperty()
                .id("925e385b52fb405715f3616c337cc65c")
                .revision("2024-10-15")
                .call();

        if (res.getMetricPropertyRelationshipMetricResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The ID of the metric property                       | 925e385b52fb405715f3616c337cc65c                    |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |                                                     |

### Response

**[GetMetricIdForMetricPropertyResponse](../../models/operations/GetMetricIdForMetricPropertyResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getPropertiesForMetric

Get the metric properties for the given metric ID.<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `15/m`

**Scopes:**
`metrics:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetPropertiesForMetricResponse;
import com.commercesystems.klaviyo_java.models.operations.QueryParamAdditionalFieldsMetricProperty;
import com.commercesystems.klaviyo_java.models.operations.QueryParamFieldsMetricProperty;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetPropertiesForMetricResponse res = sdk.metrics().getPropertiesForMetric()
                .id("925e38")
                .additionalFieldsMetricProperty(List.of(
                    QueryParamAdditionalFieldsMetricProperty.SAMPLE_VALUES))
                .fieldsMetricProperty(List.of(
                    QueryParamFieldsMetricProperty.LABEL))
                .revision("2024-10-15")
                .call();

        if (res.getMetricPropertyResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             | Example                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                    | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | The ID of the metric                                                                                                    | 925e38                                                                                                                  |
| `additionalFieldsMetricProperty`                                                                                        | List\<[QueryParamAdditionalFieldsMetricProperty](../../models/operations/QueryParamAdditionalFieldsMetricProperty.md)>  | :heavy_minus_sign:                                                                                                      | Request additional fields not included by default in the response. Supported values: 'sample_values'                    |                                                                                                                         |
| `fieldsMetricProperty`                                                                                                  | List\<[QueryParamFieldsMetricProperty](../../models/operations/QueryParamFieldsMetricProperty.md)>                      | :heavy_minus_sign:                                                                                                      | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets |                                                                                                                         |
| `revision`                                                                                                              | *String*                                                                                                                | :heavy_check_mark:                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                     |                                                                                                                         |

### Response

**[GetPropertiesForMetricResponse](../../models/operations/GetPropertiesForMetricResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getPropertyIdsForMetric

Get the IDs of metric properties for the given metric.<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `15/m`

**Scopes:**
`metrics:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetPropertyIdsForMetricResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetPropertyIdsForMetricResponse res = sdk.metrics().getPropertyIdsForMetric()
                .id("925e38")
                .revision("2024-10-15")
                .call();

        if (res.getMetricRelationshipMetricPropertyResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                           | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `id`                                                | *String*                                            | :heavy_check_mark:                                  | The ID of the metric                                | 925e38                                              |
| `revision`                                          | *String*                                            | :heavy_check_mark:                                  | API endpoint revision (format: YYYY-MM-DD[.suffix]) |                                                     |

### Response

**[GetPropertyIdsForMetricResponse](../../models/operations/GetPropertyIdsForMetricResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |

## getMetricForMetricProperty

Get the metric for the given metric property ID.<br><br>*Rate limits*:<br>Burst: `1/s`<br>Steady: `15/m`

**Scopes:**
`metrics:read`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.GetMetricForMetricPropertyQueryParamFieldsMetric;
import com.commercesystems.klaviyo_java.models.operations.GetMetricForMetricPropertyResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetMetricForMetricPropertyResponse res = sdk.metrics().getMetricForMetricProperty()
                .id("925e385b52fb405715f3616c337cc65c")
                .fieldsMetric(List.of(
                    GetMetricForMetricPropertyQueryParamFieldsMetric.CREATED))
                .revision("2024-10-15")
                .call();

        if (res.getMetricResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            | Example                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                   | *String*                                                                                                                               | :heavy_check_mark:                                                                                                                     | The ID of the metric property                                                                                                          | 925e385b52fb405715f3616c337cc65c                                                                                                       |
| `fieldsMetric`                                                                                                                         | List\<[GetMetricForMetricPropertyQueryParamFieldsMetric](../../models/operations/GetMetricForMetricPropertyQueryParamFieldsMetric.md)> | :heavy_minus_sign:                                                                                                                     | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                |                                                                                                                                        |
| `revision`                                                                                                                             | *String*                                                                                                                               | :heavy_check_mark:                                                                                                                     | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                    |                                                                                                                                        |

### Response

**[GetMetricForMetricPropertyResponse](../../models/operations/GetMetricForMetricPropertyResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |