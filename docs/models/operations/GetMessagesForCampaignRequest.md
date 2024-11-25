# GetMessagesForCampaignRequest


## Fields

| Field                                                                                                                                            | Type                                                                                                                                             | Required                                                                                                                                         | Description                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------ |
| `id`                                                                                                                                             | *String*                                                                                                                                         | :heavy_check_mark:                                                                                                                               | N/A                                                                                                                                              |
| `fieldsCampaignMessage`                                                                                                                          | List\<[GetMessagesForCampaignQueryParamFieldsCampaignMessage](../../models/operations/GetMessagesForCampaignQueryParamFieldsCampaignMessage.md)> | :heavy_minus_sign:                                                                                                                               | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                          |
| `fieldsCampaign`                                                                                                                                 | List\<[GetMessagesForCampaignQueryParamFieldsCampaign](../../models/operations/GetMessagesForCampaignQueryParamFieldsCampaign.md)>               | :heavy_minus_sign:                                                                                                                               | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                          |
| `fieldsTemplate`                                                                                                                                 | List\<[GetMessagesForCampaignQueryParamFieldsTemplate](../../models/operations/GetMessagesForCampaignQueryParamFieldsTemplate.md)>               | :heavy_minus_sign:                                                                                                                               | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#sparse-fieldsets                          |
| `include`                                                                                                                                        | List\<[GetMessagesForCampaignQueryParamInclude](../../models/operations/GetMessagesForCampaignQueryParamInclude.md)>                             | :heavy_minus_sign:                                                                                                                               | For more information please visit https://developers.klaviyo.com/en/v2024-10-15/reference/api-overview#relationships                             |
| `revision`                                                                                                                                       | *String*                                                                                                                                         | :heavy_check_mark:                                                                                                                               | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                              |