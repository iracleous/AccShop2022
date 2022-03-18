package gr.codehub.accenture.eshop.service;

import gr.codehub.accenture.eshop.dto.ProductDto;
import gr.codehub.accenture.eshop.model.Customer;
import gr.codehub.accenture.eshop.model.Product;

import java.util.List;

public interface EshopService {
    Customer createCustomer(Customer customer);
    List<Customer> readCustomer();
    Customer readCustomer(int customerId);
    Customer updateCustomer(int customerId, Customer customer);
    boolean deleteCustomer(int customerId);

    Product createProduct(Product product);
    List<ProductDto> readProduct();
    Product readProduct(int productId);
    Product updateProduct(int productId, Product product);
    boolean deleteProduct(int productId);


    int createBasket(int customerId);
    boolean addToBasket(int basketId, int productId);
    List<ProductDto> productsInBasket(int basketId);

}
