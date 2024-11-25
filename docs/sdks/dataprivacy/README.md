# DataPrivacy
(*dataPrivacy()*)

## Overview

data privacy

### Available Operations

* [requestProfileDeletion](#requestprofiledeletion) - Request Profile Deletion

## requestProfileDeletion

Request a deletion for the profiles corresponding to one of the following identifiers: `email`, `phone_number`, or `id`. If multiple identifiers are provided, we will return an error.

All profiles that match the provided identifier will be deleted.

The deletion occurs asynchronously; however, once it has completed, the deleted profile will appear on the [Deleted Profiles page](https://www.klaviyo.com/account/deleted).

For more information on the deletion process, please refer to our [Help Center docs on how to handle GDPR and CCPA deletion requests](https://help.klaviyo.com/hc/en-us/articles/360004217631-How-to-Handle-GDPR-Requests#record-gdpr-and-ccpa%20%20-deletion-requests2).<br><br>*Rate limits*:<br>Burst: `3/s`<br>Steady: `60/m`

**Scopes:**
`data-privacy:write`

### Example Usage

```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.components.DataPrivacyCreateDeletionJobQuery;
import com.commercesystems.klaviyo_java.models.components.DataPrivacyCreateDeletionJobQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.DataPrivacyCreateDeletionJobQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.DataPrivacyCreateDeletionJobQueryResourceObjectProfile;
import com.commercesystems.klaviyo_java.models.components.DataPrivacyDeletionJobEnum;
import com.commercesystems.klaviyo_java.models.components.DataPrivacyProfileQueryResourceObject;
import com.commercesystems.klaviyo_java.models.components.DataPrivacyProfileQueryResourceObjectAttributes;
import com.commercesystems.klaviyo_java.models.components.ProfileEnum;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.RequestProfileDeletionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        RequestProfileDeletionResponse res = sdk.dataPrivacy().requestProfileDeletion()
                .revision("2024-10-15")
                .dataPrivacyCreateDeletionJobQuery(DataPrivacyCreateDeletionJobQuery.builder()
                    .data(DataPrivacyCreateDeletionJobQueryResourceObject.builder()
                        .type(DataPrivacyDeletionJobEnum.DATA_PRIVACY_DELETION_JOB)
                        .attributes(DataPrivacyCreateDeletionJobQueryResourceObjectAttributes.builder()
                            .profile(DataPrivacyCreateDeletionJobQueryResourceObjectProfile.builder()
                                .data(DataPrivacyProfileQueryResourceObject.builder()
                                    .type(ProfileEnum.PROFILE)
                                    .attributes(DataPrivacyProfileQueryResourceObjectAttributes.builder()
                                        .email("sarah.mason@klaviyo-demo.com")
                                        .phoneNumber("+15005550006")
                                        .build())
                                    .id("01GDDKASAP8TKDDA2GRZDSVP4H")
                                    .build())
                                .build())
                            .build())
                        .build())
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `revision`                                                                                        | *String*                                                                                          | :heavy_check_mark:                                                                                | API endpoint revision (format: YYYY-MM-DD[.suffix])                                               |
| `dataPrivacyCreateDeletionJobQuery`                                                               | [DataPrivacyCreateDeletionJobQuery](../../models/components/DataPrivacyCreateDeletionJobQuery.md) | :heavy_check_mark:                                                                                | N/A                                                                                               |

### Response

**[RequestProfileDeletionResponse](../../models/operations/RequestProfileDeletionResponse.md)**

### Errors

| Error Type                | Status Code               | Content Type              |
| ------------------------- | ------------------------- | ------------------------- |
| models/errors/ClientError | 4XX                       | application/vnd.api+json  |
| models/errors/ServerError | 5XX                       | application/vnd.api+json  |