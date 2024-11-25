# ImportErrorResponseObjectResourceAttributes


## Fields

| Field                                                                        | Type                                                                         | Required                                                                     | Description                                                                  | Example                                                                      |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `code`                                                                       | *String*                                                                     | :heavy_check_mark:                                                           | A code for classifying the error type.                                       | invalid                                                                      |
| `title`                                                                      | *String*                                                                     | :heavy_check_mark:                                                           | A high-level message about the error.                                        | Invalid input                                                                |
| `detail`                                                                     | *String*                                                                     | :heavy_check_mark:                                                           | Specific details about the error.                                            | The payload provided in the request is invalid.                              |
| `source`                                                                     | [ErrorSource](../../models/components/ErrorSource.md)                        | :heavy_check_mark:                                                           | N/A                                                                          |                                                                              |
| `originalPayload`                                                            | [JsonNullable\<OriginalPayload>](../../models/components/OriginalPayload.md) | :heavy_minus_sign:                                                           | N/A                                                                          |                                                                              |