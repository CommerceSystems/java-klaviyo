# UpdateCampaignRequest


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `id`                                                                                | *String*                                                                            | :heavy_check_mark:                                                                  | The campaign ID to be retrieved                                                     |
| `revision`                                                                          | *String*                                                                            | :heavy_check_mark:                                                                  | API endpoint revision (format: YYYY-MM-DD[.suffix])                                 |
| `campaignPartialUpdateQuery`                                                        | [CampaignPartialUpdateQuery](../../models/components/CampaignPartialUpdateQuery.md) | :heavy_check_mark:                                                                  | Update a campaign and return it                                                     |