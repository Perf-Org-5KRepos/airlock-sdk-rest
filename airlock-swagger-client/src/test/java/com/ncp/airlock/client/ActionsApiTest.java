/*
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ncp.airlock.client;

import com.ncp.airlock.client.invoker.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActionsApi
 */
@Ignore
public class ActionsApiTest {

    private final ActionsApi api = new ActionsApi();

    
    /**
     * Executes all rules and generates an updated configuration for all features in the specified product based on the latest context.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void calculateTest() throws ApiException {
        String productInstanceId = null;
        Boolean sync = null;
        String response = api.calculate(productInstanceId, sync);

        // TODO: test validations
    }
    
    /**
     * Returns the date of the last calculation performed in unix time format (milliseconds from epoch).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLastCalculateTest() throws ApiException {
        String productInstanceId = null;
        String response = api.getLastCalculate(productInstanceId);

        // TODO: test validations
    }
    
    /**
     * Returns the date of the last calculation performed in unix time format (milliseconds from epoch).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLastPullTest() throws ApiException {
        String productInstanceId = null;
        String response = api.getLastPull(productInstanceId);

        // TODO: test validations
    }
    
    /**
     * Returns locale of the last pull performed.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLastPullLocaleTest() throws ApiException {
        String productInstanceId = null;
        String response = api.getLastPullLocale(productInstanceId);

        // TODO: test validations
    }
    
    /**
     * Returns the date of the last sync performed in unix time format (milliseconds from epoch).
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLastSyncTest() throws ApiException {
        String productInstanceId = null;
        String response = api.getLastSync(productInstanceId);

        // TODO: test validations
    }
    
    /**
     * Downloads the latest rules and strings for a given product from the Airlock server. In case there is no server connectivity, Airlock will continue to use the existing rules and strings.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pullTest() throws ApiException {
        String productInstanceId = null;
        String locale = null;
        String response = api.pull(productInstanceId, locale);

        // TODO: test validations
    }
    
    /**
     * Downloads the latest rules and strings for all products from the Airlock server.In case there is no server connectivity, Airlock will continue to use the existing rules and strings.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pullAllProductsTest() throws ApiException {
        String response = api.pullAllProducts();

        // TODO: test validations
    }
    
    /**
     * Exposes the latest calculation results.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void syncTest() throws ApiException {
        String productInstanceId = null;
        String response = api.sync(productInstanceId);

        // TODO: test validations
    }
    
}