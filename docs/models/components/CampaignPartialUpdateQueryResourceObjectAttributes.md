# CampaignPartialUpdateQueryResourceObjectAttributes


## Fields

| Field                                                                                                                                                        | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  | Example                                                                                                                                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `name`                                                                                                                                                       | *JsonNullable\<String>*                                                                                                                                      | :heavy_minus_sign:                                                                                                                                           | The campaign name                                                                                                                                            | My new campaign                                                                                                                                              |
| `audiences`                                                                                                                                                  | [Optional\<AudiencesSubObject>](../../models/components/AudiencesSubObject.md)                                                                               | :heavy_minus_sign:                                                                                                                                           | N/A                                                                                                                                                          |                                                                                                                                                              |
| `sendOptions`                                                                                                                                                | [JsonNullable\<CampaignPartialUpdateQueryResourceObjectSendOptions>](../../models/components/CampaignPartialUpdateQueryResourceObjectSendOptions.md)         | :heavy_minus_sign:                                                                                                                                           | Options to use when sending a campaign                                                                                                                       |                                                                                                                                                              |
| `trackingOptions`                                                                                                                                            | [JsonNullable\<CampaignPartialUpdateQueryResourceObjectTrackingOptions>](../../models/components/CampaignPartialUpdateQueryResourceObjectTrackingOptions.md) | :heavy_minus_sign:                                                                                                                                           | The tracking options associated with the campaign                                                                                                            |                                                                                                                                                              |
| `sendStrategy`                                                                                                                                               | [Optional\<SendStrategySubObject>](../../models/components/SendStrategySubObject.md)                                                                         | :heavy_minus_sign:                                                                                                                                           | N/A                                                                                                                                                          |                                                                                                                                                              |