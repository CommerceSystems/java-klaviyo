# APIJobErrorPayload


## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `id`                                                  | *String*                                              | :heavy_check_mark:                                    | Unique identifier for the error.                      | e4eebb08-b055-4a6f-bb13-c8cb69c9eb94                  |
| `code`                                                | *String*                                              | :heavy_check_mark:                                    | A code for classifying the error type.                | invalid                                               |
| `title`                                               | *String*                                              | :heavy_check_mark:                                    | A high-level message about the error.                 | Invalid input                                         |
| `detail`                                              | *String*                                              | :heavy_check_mark:                                    | Specific details about the error.                     | The payload provided in the request is invalid.       |
| `source`                                              | [ErrorSource](../../models/components/ErrorSource.md) | :heavy_check_mark:                                    | N/A                                                   |                                                       |