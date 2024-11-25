/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.models.operations;

import com.commercesystems.klaviyo_java.utils.LazySingletonValue;
import com.commercesystems.klaviyo_java.utils.Utils;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public class GetAccountsRequestBuilder {

    private Optional<? extends List<FieldsAccount>> fieldsAccount = Optional.empty();
    private String revision;
    private final SDKMethodInterfaces.MethodCallGetAccounts sdk;

    public GetAccountsRequestBuilder(SDKMethodInterfaces.MethodCallGetAccounts sdk) {
        this.sdk = sdk;
    }
                
    public GetAccountsRequestBuilder fieldsAccount(List<FieldsAccount> fieldsAccount) {
        Utils.checkNotNull(fieldsAccount, "fieldsAccount");
        this.fieldsAccount = Optional.of(fieldsAccount);
        return this;
    }

    public GetAccountsRequestBuilder fieldsAccount(Optional<? extends List<FieldsAccount>> fieldsAccount) {
        Utils.checkNotNull(fieldsAccount, "fieldsAccount");
        this.fieldsAccount = fieldsAccount;
        return this;
    }

    public GetAccountsRequestBuilder revision(String revision) {
        Utils.checkNotNull(revision, "revision");
        this.revision = revision;
        return this;
    }

    public GetAccountsResponse call() throws Exception {
        if (revision == null) {
            revision = _SINGLETON_VALUE_Revision.value();
        }
        return sdk.getAccounts(
            fieldsAccount,
            revision);
    }

    private static final LazySingletonValue<String> _SINGLETON_VALUE_Revision =
            new LazySingletonValue<>(
                    "revision",
                    "\"2024-10-15\"",
                    new TypeReference<String>() {});
}