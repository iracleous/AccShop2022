package gr.codehub.accenture.eshop.service;

import gr.codehub.accenture.eshop.dto.BasketDto;
import gr.codehub.accenture.eshop.dto.CustomerDto;
import gr.codehub.accenture.eshop.dto.ProductDto;
import gr.codehub.accenture.eshop.dto.ResponseResult;
import gr.codehub.accenture.eshop.model.Customer;
import gr.codehub.accenture.eshop.model.Product;

import java.util.List;

public interface EshopService {
    Customer createCustomer(Customer customer);
    ResponseResult<List<Customer>> readCustomer();
    Customer readCustomer(int customerId);
    Customer updateCustomer(int customerId, Customer customer);
    ResponseResult<Boolean> deleteCustomer(int customerId);

    Product createProduct(Product product);
    List<ProductDto> readProduct();

    List<ProductDto> readProduct(String pageCount, String pageSize);
    Product readProduct(int productId);
    Product updateProduct(int productId, Product product);
    boolean deleteProduct(int productId);


    ResponseResult<Integer> createBasket(int customerId);
    boolean addToBasket(int basketId, int productId);
    List<ProductDto> productsInBasket(int basketId);
    List<ProductDto> productsInBasket1(int basketId);

    ResponseResult<List<BasketDto>> customerBasketProducts(int customerId);

    ResponseResult<Boolean> deleteCustomerBasket(int customerId);



}
