# PostCouponCodeResponseData


## Fields

| Field                                                                                                            | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      | Example                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `type`                                                                                                           | [CouponCodeEnum](../../models/components/CouponCodeEnum.md)                                                      | :heavy_check_mark:                                                                                               | N/A                                                                                                              |                                                                                                                  |
| `id`                                                                                                             | *String*                                                                                                         | :heavy_check_mark:                                                                                               | The id of a coupon code is a combination of its unique code and the id of the coupon it is associated with.      | 10OFF-ASD325FHK324UJDOI2M3JNES99                                                                                 |
| `attributes`                                                                                                     | [PostCouponCodeResponseAttributes](../../models/components/PostCouponCodeResponseAttributes.md)                  | :heavy_check_mark:                                                                                               | N/A                                                                                                              |                                                                                                                  |
| `relationships`                                                                                                  | [Optional\<PostCouponCodeResponseRelationships>](../../models/components/PostCouponCodeResponseRelationships.md) | :heavy_minus_sign:                                                                                               | N/A                                                                                                              |                                                                                                                  |
| `links`                                                                                                          | [ObjectLinks](../../models/components/ObjectLinks.md)                                                            | :heavy_check_mark:                                                                                               | N/A                                                                                                              |                                                                                                                  |