# GetImagesRequest


## Fields

| Field                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Type                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Required                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `fieldsImage`                                                                                                                                                                                                                                                                                                                                                                                                                                                         | List\<[FieldsImage](../../models/operations/FieldsImage.md)>                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                    | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                                                                                                                                                                                                                                                                                                                                               |
| `filter`                                                                                                                                                                                                                                                                                                                                                                                                                                                              | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                    | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`id`: `any`, `equals`<br>`updated_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`format`: `any`, `equals`<br>`name`: `any`, `contains`, `ends-with`, `equals`, `starts-with`<br>`size`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than`<br>`hidden`: `any`, `equals` |
| `pageCursor`                                                                                                                                                                                                                                                                                                                                                                                                                                                          | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                    | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination                                                                                                                                                                                                                                                                                                                                                     |
| `pageSize`                                                                                                                                                                                                                                                                                                                                                                                                                                                            | *Optional\<Long>*                                                                                                                                                                                                                                                                                                                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                    | Default: 20. Min: 1. Max: 100.                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| `sort`                                                                                                                                                                                                                                                                                                                                                                                                                                                                | [Optional\<GetImagesQueryParamSort>](../../models/operations/GetImagesQueryParamSort.md)                                                                                                                                                                                                                                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                    | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sorting                                                                                                                                                                                                                                                                                                                                                        |
| `revision`                                                                                                                                                                                                                                                                                                                                                                                                                                                            | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                              | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                    | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                                                                                                                                                                                                                                                                   |