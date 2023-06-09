/*
 * SwaggerPetstoreOpenAPI30Lib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package io.swagger.petstore3;

import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.authentication.Authentication;
import io.apimatic.coreinterfaces.compatibility.CompatibilityFactory;
import io.apimatic.coreinterfaces.http.HttpClient;
import io.apimatic.okhttpclient.adapter.OkClient;
import io.swagger.petstore3.controllers.PetController;
import io.swagger.petstore3.controllers.StoreController;
import io.swagger.petstore3.controllers.UserController;
import io.swagger.petstore3.http.client.HttpCallback;
import io.swagger.petstore3.http.client.HttpClientConfiguration;
import io.swagger.petstore3.http.client.ReadonlyHttpClientConfiguration;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Gateway class for the library.
 * This class acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public final class SwaggerPetstoreOpenAPI30Client implements Configuration {

    /**
     * Private store for controllers.
     */
    private PetController pet;
    private StoreController store;
    private UserController user;

    private static final CompatibilityFactory compatibilityFactory = new CompatibilityFactoryImpl();

    private static String userAgent = "APIMATIC 3.0";

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * CustomHeaderAuthenticationManager.
     */
    private CustomHeaderAuthenticationManager customHeaderAuthenticationManager;

    /**
     * Map of authentication Managers.
     */
    private Map<String, Authentication> authentications;


    /**
     * Callback to be called before and after the HTTP call for an endpoint is made.
     */
    private final HttpCallback httpCallback;

    private SwaggerPetstoreOpenAPI30Client(Environment environment, HttpClient httpClient,
            ReadonlyHttpClientConfiguration httpClientConfig, String apiKey,
            Map<String, Authentication> authentications, HttpCallback httpCallback) {
        this.environment = environment;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;
        this.httpCallback = httpCallback;
        this.authentications = 
                (authentications == null) ? new HashMap<>() : new HashMap<>(authentications);
        if (this.authentications.containsKey("global")) {
            this.customHeaderAuthenticationManager =
                    (CustomHeaderAuthenticationManager) this.authentications.get("global");
        }

        if (!this.authentications.containsKey("global")
                || !getCustomHeaderAuthenticationCredentials().equals(apiKey)) {
            this.customHeaderAuthenticationManager = new CustomHeaderAuthenticationManager(
                    apiKey);
            this.authentications.put("global", customHeaderAuthenticationManager);
        }

        GlobalConfiguration globalConfig = new GlobalConfiguration.Builder()
                .authentication(this.authentications).compatibilityFactory(compatibilityFactory)
                .httpClient(httpClient).baseUri(server -> getBaseUri(server))
                .callback(httpCallback)
                .userAgent(userAgent)
                .build();
        pet = new PetController(globalConfig);
        store = new StoreController(globalConfig);
        user = new UserController(globalConfig);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of PetController.
     * @return pet
     */
    public PetController getPetController() {
        return pet;
    }

    /**
     * Get the instance of StoreController.
     * @return store
     */
    public StoreController getStoreController() {
        return store;
    }

    /**
     * Get the instance of UserController.
     * @return user
     */
    public UserController getUserController() {
        return user;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    private HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * The credentials to use with CustomHeaderAuthentication.
     * @return customHeaderAuthenticationCredentials
     */
    public CustomHeaderAuthenticationCredentials getCustomHeaderAuthenticationCredentials() {
        return customHeaderAuthenticationManager;
    }
    /**
     * The timeout to use for making HTTP requests.
     * @deprecated This method will be removed in a future version. Use
     *             {@link #getHttpClientConfig()} instead.
     *
     * @return timeout
     */
    @Deprecated
    public long timeout() {
        return httpClientConfig.getTimeout();
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        return environmentMapper(environment, server);
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.ENUM_DEFAULT);
    }


    /**
     * Get base URI by current environment.
     * 
     * @param server string for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(String server) {
        return getBaseUri(Server.fromString(server));
    }


    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        if (environment.equals(Environment.PRODUCTION)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "https://petstore3.swagger.io/api/v3";
            }
        }
        return "https://petstore3.swagger.io/api/v3";
    }

    /**
     * Converts this SwaggerPetstoreOpenAPI30Client into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SwaggerPetstoreOpenAPI30Client [" + "environment=" + environment
                + ", httpClientConfig=" + httpClientConfig + ", authentications=" + authentications
                + "]";
    }

    /**
     * Builds a new {@link SwaggerPetstoreOpenAPI30Client.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link SwaggerPetstoreOpenAPI30Client.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.httpClient = getHttpClient();
        builder.apiKey = getCustomHeaderAuthenticationCredentials().getApiKey();
        builder.authentications = authentications;
        builder.httpCallback = httpCallback;
        builder.httpClientConfig(configBldr -> configBldr =
                ((HttpClientConfiguration) httpClientConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link SwaggerPetstoreOpenAPI30Client}.
     */
    public static class Builder {

        private Environment environment = Environment.PRODUCTION;
        private HttpClient httpClient;
        private String apiKey = "";
        private Map<String, Authentication> authentications = null;
        private HttpCallback httpCallback = null;
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();


        /**
         * Credentials setter for CustomHeaderAuthentication.
         * @param apiKey String value for apiKey.
         * @return Builder
         */
        public Builder customHeaderAuthenticationCredentials(String apiKey) {
            if (apiKey == null) {
                throw new NullPointerException("ApiKey cannot be null.");
            }
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @deprecated This method will be removed in a future version. Use
         *             {@link #httpClientConfig(Consumer) httpClientConfig} instead.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        @Deprecated
        public Builder timeout(long timeout) {
            this.httpClientConfigBuilder.timeout(timeout);
            return this;
        }

        /**
         * HttpCallback.
         * @param httpCallback Callback to be called before and after the HTTP call.
         * @return Builder
         */
        public Builder httpCallback(HttpCallback httpCallback) {
            this.httpCallback = httpCallback;
            return this;
        }

        /**
         * Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param action Consumer for the builder of httpClientConfiguration.
         * @return Builder
         */
        public Builder httpClientConfig(Consumer<HttpClientConfiguration.Builder> action) {
            action.accept(httpClientConfigBuilder);
            return this;
        }

        /**
         * Builds a new SwaggerPetstoreOpenAPI30Client object using the set fields.
         * @return SwaggerPetstoreOpenAPI30Client
         */
        public SwaggerPetstoreOpenAPI30Client build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();
            httpClient = new OkClient(httpClientConfig.getConfiguration(), compatibilityFactory);

            return new SwaggerPetstoreOpenAPI30Client(environment, httpClient, httpClientConfig,
                    apiKey, authentications, httpCallback);
        }
    }
}