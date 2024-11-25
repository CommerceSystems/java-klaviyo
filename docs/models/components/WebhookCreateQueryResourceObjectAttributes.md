# WebhookCreateQueryResourceObjectAttributes


## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  | Example                                                      |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `name`                                                       | *String*                                                     | :heavy_check_mark:                                           | A name for the webhook.                                      | My Webhook                                                   |
| `description`                                                | *JsonNullable\<String>*                                      | :heavy_minus_sign:                                           | A description for the webhook.                               | A webhook for sms events                                     |
| `endpointUrl`                                                | *String*                                                     | :heavy_check_mark:                                           | A url to send webhook calls to. Must be https.               | https://www.example.com/example/path                         |
| `secretKey`                                                  | *String*                                                     | :heavy_check_mark:                                           | A secret key, that will be used for webhook request signing. | INSERT_SECRET_KEY                                            |