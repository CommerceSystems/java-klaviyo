# BulkSubscribeProfilesRequest


## Fields

| Field                                                                                                                                                                                                                                                                                                                                                   | Type                                                                                                                                                                                                                                                                                                                                                    | Required                                                                                                                                                                                                                                                                                                                                                | Description                                                                                                                                                                                                                                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `revision`                                                                                                                                                                                                                                                                                                                                              | *String*                                                                                                                                                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                      | API endpoint revision (format: YYYY-MM-DD[.suffix])                                                                                                                                                                                                                                                                                                     |
| `subscriptionCreateJobCreateQuery`                                                                                                                                                                                                                                                                                                                      | [SubscriptionCreateJobCreateQuery](../../models/components/SubscriptionCreateJobCreateQuery.md)                                                                                                                                                                                                                                                         | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                      | Subscribes one or more profiles to marketing. Currently, supports email and SMS only. All profiles will be added to the provided list. Either email or phone number is required. Both may be specified to subscribe to both channels.<br/>If a profile cannot be found matching the given identifier(s), a new profile will be created and then subscribed. |