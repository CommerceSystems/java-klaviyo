# CampaignPartialUpdateQueryResourceObjectTrackingOptionsSMSTrackingOptionsSubObject


## Fields

| Field                                                                                                                                                                                                                                              | Type                                                                                                                                                                                                                                               | Required                                                                                                                                                                                                                                           | Description                                                                                                                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `addTrackingParams`                                                                                                                                                                                                                                | *JsonNullable\<Boolean>*                                                                                                                                                                                                                           | :heavy_minus_sign:                                                                                                                                                                                                                                 | Whether the campaign needs custom tracking parameters. If set to False, tracking params will not be used.                                                                                                                                          |
| `customTrackingParams`                                                                                                                                                                                                                             | List\<[SMSTrackingOptionsSubObjectTrackingOptionsCampaignPartialUpdateQueryResourceObjectCustomTrackingParams](../../models/components/SMSTrackingOptionsSubObjectTrackingOptionsCampaignPartialUpdateQueryResourceObjectCustomTrackingParams.md)> | :heavy_minus_sign:                                                                                                                                                                                                                                 | A list of custom tracking parameters. If an empty list is given and add_tracking_params is True, uses company defaults.                                                                                                                            |