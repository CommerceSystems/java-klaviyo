# PushMarketing


## Fields

| Field                                                                                             | Type                                                                                              | Required                                                                                          | Description                                                                                       | Example                                                                                           |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `canReceivePushMarketing`                                                                         | *boolean*                                                                                         | :heavy_check_mark:                                                                                | Whether or not this profile is subscribed to receive mobile push.                                 |                                                                                                   |
| `consent`                                                                                         | *String*                                                                                          | :heavy_check_mark:                                                                                | The consent status for mobile push marketing.                                                     | SUBSCRIBED                                                                                        |
| `consentTimestamp`                                                                                | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)         | :heavy_minus_sign:                                                                                | The timestamp when the consent was last changed, in ISO 8601 format (YYYY-MM-DDTHH:MM:SS.mmmmmm). | 2023-02-21T20:07:38+00:00                                                                         |