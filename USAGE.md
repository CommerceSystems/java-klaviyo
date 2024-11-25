<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.commercesystems.klaviyo_java.KlaviyoJava;
import com.commercesystems.klaviyo_java.models.errors.ClientError;
import com.commercesystems.klaviyo_java.models.errors.ServerError;
import com.commercesystems.klaviyo_java.models.operations.FieldsAccount;
import com.commercesystems.klaviyo_java.models.operations.GetAccountsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ClientError, ServerError, Exception {

        KlaviyoJava sdk = KlaviyoJava.builder()
                .klaviyoAPIKey("<YOUR_API_KEY_HERE>")
            .build();

        GetAccountsResponse res = sdk.accounts().getAccounts()
                .fieldsAccount(List.of(
                    FieldsAccount.CONTACT_INFORMATION_ORGANIZATION_NAME))
                .revision("2024-10-15")
                .call();

        if (res.getAccountResponseCollection().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->