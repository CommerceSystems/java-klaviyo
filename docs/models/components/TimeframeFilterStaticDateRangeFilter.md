# TimeframeFilterStaticDateRangeFilter


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `type`                                                                                    | [DateEnum](../../models/components/DateEnum.md)                                           | :heavy_check_mark:                                                                        | N/A                                                                                       |                                                                                           |
| `operator`                                                                                | [TimeframeFilterOperator](../../models/components/TimeframeFilterOperator.md)             | :heavy_check_mark:                                                                        | Operators for static date range filters.<br/><br/>E.g. "between 2023-01-01 and 2023-02-01" |                                                                                           |
| `start`                                                                                   | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_check_mark:                                                                        | N/A                                                                                       | 2022-11-08T00:00:00+00:00                                                                 |
| `end`                                                                                     | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_check_mark:                                                                        | N/A                                                                                       | 2022-11-08T00:00:00+00:00                                                                 |