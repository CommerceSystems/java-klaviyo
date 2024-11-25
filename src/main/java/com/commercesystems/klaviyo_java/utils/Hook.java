/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.commercesystems.klaviyo_java.utils;

import java.io.InputStream;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.commercesystems.klaviyo_java.SecuritySource;

/**
 * Holder class for hook-associated types. This class does not get
 * instantiated.
 */
public final class Hook {

    private Hook() {
        // prevent instantiation
    }

    /**
     * Context for a hook call.
     */
    public interface HookContext {
        String operationId();
        Optional<List<String>> oauthScopes();
        Optional<SecuritySource> securitySource();
    }
    
    /**
     * Context for a BeforeRequest hook call.
     */
    public interface BeforeRequestContext extends HookContext {
    }
    
    public static final class BeforeRequestContextImpl implements BeforeRequestContext {
        
        private final String operationId;
        private final Optional<List<String>> oauthScopes;
        private final Optional<SecuritySource> securitySource;
        
        public BeforeRequestContextImpl(String operationId, Optional<List<String>> oauthScopes, Optional<SecuritySource> securitySource) {
            this.operationId = operationId;
            this.oauthScopes = oauthScopes;
            this.securitySource = securitySource;
        }
        
        @Override
        public String operationId() {
            return operationId;
        }
        
        @Override
        public Optional<SecuritySource> securitySource() {
            return securitySource;
        }
        
        @Override
        public Optional<List<String>> oauthScopes() {
            return oauthScopes;
        }
    }
    
    /**
     * Context for an AfterSuccess hook call.
     */
    public interface AfterSuccessContext extends HookContext {
    }
    
    public static final class AfterSuccessContextImpl implements AfterSuccessContext {
        
        private final String operationId;
        private final Optional<List<String>> oauthScopes;
        private final Optional<SecuritySource> securitySource;
        
        public AfterSuccessContextImpl(String operationId, Optional<List<String>> oauthScopes, Optional<SecuritySource> securitySource) {
            Utils.checkNotNull(securitySource, "securitySource");
            this.operationId = operationId;
            this.oauthScopes = oauthScopes;
            this.securitySource = securitySource;
        }
        
        @Override
        public String operationId() {
            return operationId;
        }
        
        @Override
        public Optional<SecuritySource> securitySource() {
            return securitySource;
        }
        
        @Override 
        public Optional<List<String>> oauthScopes() {
            return oauthScopes;
        }
    }

    /**
     * Context for an AfterError hook call.
     */
    public interface AfterErrorContext extends HookContext {
    }
    
    public static final class AfterErrorContextImpl implements AfterErrorContext {
        
        private final String operationId;
        private final Optional<List<String>> oauthScopes;
        private final Optional<SecuritySource> securitySource;
        
        public AfterErrorContextImpl(String operationId, Optional<List<String>> oauthScopes, Optional<SecuritySource> securitySource) {
            Utils.checkNotNull(securitySource, "securitySource");
            this.operationId = operationId;
            this.oauthScopes = oauthScopes;
            this.securitySource = securitySource;
        }
        
        @Override
        public String operationId() {
            return operationId;
        }
        
        @Override
        public Optional<SecuritySource> securitySource() {
            return securitySource;
        }
        
        @Override
        public Optional<List<String>> oauthScopes() {
            return oauthScopes;
        }
    }

    /**
     * Specifies how a request is transformed before sending.
     */
    public interface BeforeRequest {

        /**
         * Transforms the given {@link HttpRequest} before sending.
         * 
         * <p>Note that {@link HttpRequest} is immutable. To modify the request you can use
         * {@link HttpRequest#newBuilder(HttpRequest, BiPredicate<String, String>)} with 
         * JDK 16 and later (which will copy the request for modification in a builder). 
         * If that method is not available then use {@link Helpers#copy} (which also returns
         * a builder).
         * 
         * @param context context for the hook call
         * @param request request to be transformed
         * @return transformed request
         * @throws Exception on error
         */
        HttpRequest beforeRequest(BeforeRequestContext context, HttpRequest request) throws Exception;

        /**
         * The default action is to return the request untouched.
         */
        static BeforeRequest DEFAULT = (context, request) -> request;
    }

    /**
     * Specifies how a response is transformed before response processing.
     */
    public interface AfterSuccess {

        /**
         * Transforms the given response before response processing occurs.
         * 
         * @param context  context for the hook call
         * @param response response to be transformed
         * @return transformed response
         * @throws Exception on error
         */
        HttpResponse<InputStream> afterSuccess(AfterSuccessContext context, HttpResponse<InputStream> response)
                throws Exception;

        /**
         * The default action is to return the response untouched.
         */
        static AfterSuccess DEFAULT = (context, response) -> response;
    }

    /**
     * Specifies what happens if a request action throws an Exception.
     */
    public interface AfterError {

        /**
         * Either returns an HttpResponse or throws an Exception. Must be passed either 
         * a response or an error (both can't be absent).
         * 
         * @param context  context for the error
         * @param response response information if available.
         * @param error    the optional exception. If response present then the error is for-info
         *                 only, it was the last error in the chain of AfterError hook 
         *                 calls leading to this one
         * @return HTTP response if method decides that an exception is not to be thrown
         * @throws Exception if error to be propagated
         */
        HttpResponse<InputStream> afterError(
            AfterErrorContext context, 
            Optional<HttpResponse<InputStream>> response, 
            Optional<Exception> error) throws Exception;

        /**
         * The default action is to rethrow the given error.
         */
        static AfterError DEFAULT = (context, response, error) -> {
            Utils.checkArgument(
               response.isPresent() ^ error.isPresent(),
               "one and only one of response or error must be present");
            if (error.isPresent()) {
                throw error.get();
            } else {
                return response.get();
            }
        };
    }

    public static final class SdkInitData {
         private final String baseUrl;
         private final HTTPClient client;
         
         public SdkInitData(String baseUrl, HTTPClient client) {
             this.baseUrl = baseUrl;
             this.client = client;
         }
         
         public String baseUrl() {
             return baseUrl;
         }
         
         public HTTPClient client() {
             return client;
         }
    }

    /**
     * Transforms the HTTPClient before use.
     */
    public interface SdkInit {

        /**
         * Returns a transformed {@link HTTPClient} and {@code baseUrl} for use in requests.
         * 
         * @param data data to transform
         * @return the transformed data
         */
        SdkInitData sdkInit(SdkInitData data);

        /**
         * The default action is to return the client untouched.
         */
        static SdkInit DEFAULT = data -> data;

    }
    
    public static final class IdempotencyHook implements BeforeRequest {
    
        @Override
        public HttpRequest beforeRequest(BeforeRequestContext context, HttpRequest request) throws Exception {
            HttpRequest.Builder b = Helpers.copy(request);
            b.header("Idempotency-Key", UUID.randomUUID().toString());
            return b.build();
        }
    }
}
