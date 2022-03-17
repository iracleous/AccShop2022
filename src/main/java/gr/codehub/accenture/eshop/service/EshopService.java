package gr.codehub.accenture.eshop.service;

import gr.codehub.accenture.eshop.model.Customer;

import java.util.List;

public interface EshopService {
    Customer createCustomer(Customer customer);
    List<Customer> readCustomer();
    Customer readCustomer(int customerId);
    Customer updateCustomer(int customerId, Customer customer);
    boolean deleteCustomer(int customerId);
}
