package gr.codehub.accenture.eshop.service;

import gr.codehub.accenture.eshop.model.Customer;
import gr.codehub.accenture.eshop.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EshopServiceImpl implements EshopService{
    private CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> readCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer readCustomer(int customerId) {
        return customerRepository.findById(customerId).get();
    }

    @Override
    public Customer updateCustomer(int customerId, Customer customer) {
        Optional<Customer> customerDb = customerRepository.findById(customerId);
        if (customerDb.isEmpty())
            return null;
        customerDb.get().setEmail(customer.getEmail());
        return customerRepository.save(customerDb.get());
    }

    @Override
    public boolean deleteCustomer(int customerId) {
        Optional<Customer> customerDb = customerRepository.findById(customerId);
        if (customerDb.isEmpty())
            return false;
        customerRepository.delete(customerDb.get());
        return true;
    }
}
