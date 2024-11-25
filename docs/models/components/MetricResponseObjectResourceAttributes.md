# MetricResponseObjectResourceAttributes


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `name`                                                               | *JsonNullable\<String>*                                              | :heavy_minus_sign:                                                   | The name of the metric                                               |
| `created`                                                            | *JsonNullable\<String>*                                              | :heavy_minus_sign:                                                   | Creation time in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)        |
| `updated`                                                            | *JsonNullable\<String>*                                              | :heavy_minus_sign:                                                   | Last updated time in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm)    |
| `integration`                                                        | [JsonNullable\<Integration>](../../models/components/Integration.md) | :heavy_minus_sign:                                                   | The integration associated with the event                            |