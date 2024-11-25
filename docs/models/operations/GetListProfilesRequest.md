# GetListProfilesRequest


## Fields

| Field                                                                                                                                                                                                                                                                                                                                                       | Type                                                                                                                                                                                                                                                                                                                                                        | Required                                                                                                                                                                                                                                                                                                                                                    | Description                                                                                                                                                                                                                                                                                                                                                 | Example                                                                                                                                                                                                                                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `id`                                                                                                                                                                                                                                                                                                                                                        | *String*                                                                                                                                                                                                                                                                                                                                                    | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                          | Primary key that uniquely identifies this list. Generated by Klaviyo.                                                                                                                                                                                                                                                                                       | Y6nRLr                                                                                                                                                                                                                                                                                                                                                      |
| `additionalFieldsProfile`                                                                                                                                                                                                                                                                                                                                   | List\<[QueryParamAdditionalFieldsProfile](../../models/operations/QueryParamAdditionalFieldsProfile.md)>                                                                                                                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                          | Request additional fields not included by default in the response. Supported values: 'subscriptions', 'predictive_analytics'                                                                                                                                                                                                                                |                                                                                                                                                                                                                                                                                                                                                             |
| `fieldsProfile`                                                                                                                                                                                                                                                                                                                                             | List\<[GetListProfilesQueryParamFieldsProfile](../../models/operations/GetListProfilesQueryParamFieldsProfile.md)>                                                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                          | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                                                                                                                                                                                                                                     |                                                                                                                                                                                                                                                                                                                                                             |
| `filter`                                                                                                                                                                                                                                                                                                                                                    | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                          | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#filtering<br>Allowed field(s)/operator(s):<br>`email`: `any`, `equals`<br>`phone_number`: `any`, `equals`<br>`push_token`: `any`, `equals`<br>`_kx`: `equals`<br>`joined_group_at`: `greater-or-equal`, `greater-than`, `less-or-equal`, `less-than` |                                                                                                                                                                                                                                                                                                                                                             |
| `pageCursor`                                                                                                                                                                                                                                                                                                                                                | *Optional\<String>*                                                                                                                                                                                                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                          | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#pagination                                                                                                                                                                                                                                           |                                                                                                                                                                                                                                                                                                                                                             |
| `pageSize`                                                                                                                                                                                                                                                                                                                                                  | *Optional\<Long>*                                                                                                                                                                                                                                                                                                                                           | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                          | Default: 20. Min: 1. Max: 100.                                                                                                                                                                                                                                                                                                                              |                                                                                                                                                                                                                                                                                                                                                             |
| `sort`                                                                                                                                                                                                                                                                                                                                                      | [Optional\<GetListProfilesQueryParamSort>](../../models/operations/GetListProfilesQueryParamSort.md)                                                                                                                                                                                                                                                        | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                          | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sorting                                                                                                                                                                                                                                              |                                                                                                                                                                                                                                                                                                                                                             |
| `revision`                                                                                                                                                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                                                                                                                                                    | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                          | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                                                                                                                                                         |                                                                                                                                                                                                                                                                                                                                                             |