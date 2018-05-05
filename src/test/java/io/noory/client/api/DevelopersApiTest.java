package io.noory.client.api;

import io.noory.client.invoker.ApiException;
import io.noory.client.model.Customer;
import io.noory.client.model.CustomerCreateDto;
import io.noory.client.model.CustomerUpdateDto;
import io.noory.client.model.InlineResponse400;
import io.noory.client.model.SourceCreateDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DevelopersApi
 */
@Ignore
public class DevelopersApiTest {

    private final DevelopersApi api = new DevelopersApi();

    
    /**
     * adds a customer
     *
     * Adds a customer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCustomerTest() throws ApiException {
        CustomerCreateDto customerCreateDto = null;
        Customer response = api.addCustomer(customerCreateDto);

        // TODO: test validations
    }
    
    /**
     * Delete a single customer record.
     *
     * Delete a single customer record. Deletion does not remove the record from the database but soft deletes it by setting the deleted attribute to true. You can still access the customer record but it won&#39;t show up in listings 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCustomerTest() throws ApiException {
        String id = null;
        Customer response = api.deleteCustomer(id);

        // TODO: test validations
    }
    
    /**
     * GETs a single customer its external ID
     *
     * GETs a single customer its external ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getByExternalIDTest() throws ApiException {
        String externalId = null;
        Customer response = api.getByExternalID(externalId);

        // TODO: test validations
    }
    
    /**
     * Gets a single customer
     *
     * Gets a single customer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerTest() throws ApiException {
        String id = null;
        Customer response = api.getCustomer(id);

        // TODO: test validations
    }
    
    /**
     * Gets a list of customers
     *
     * Gets a list of customers; supports filtering, size, page by 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCustomersTest() throws ApiException {
        String search = null;
        Integer page = null;
        Integer size = null;
        List<Customer> response = api.listCustomers(search, page, size);

        // TODO: test validations
    }
    
    /**
     * Marks a customer payment source as default
     *
     * Marks a customer payment source as default 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void markCustomerSourceDefaultTest() throws ApiException {
        String id = null;
        String sid = null;
        Customer response = api.markCustomerSourceDefault(id, sid);

        // TODO: test validations
    }
    
    /**
     * Updates a customer
     *
     * Update a customer&#39;s record 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerTest() throws ApiException {
        String id = null;
        CustomerUpdateDto customerUpdateDto = null;
        Customer response = api.updateCustomer(id, customerUpdateDto);

        // TODO: test validations
    }
    
    /**
     * Adds a payment source to customer
     *
     * Adds a payment source to customer 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomerSourcesTest() throws ApiException {
        String id = null;
        SourceCreateDto sourceCreateDto = null;
        Customer response = api.updateCustomerSources(id, sourceCreateDto);

        // TODO: test validations
    }
    
}
