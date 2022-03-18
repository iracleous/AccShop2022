package gr.codehub.accenture.eshop.service;

import gr.codehub.accenture.eshop.dto.ProductDto;
import gr.codehub.accenture.eshop.model.Basket;
import gr.codehub.accenture.eshop.model.BasketProduct;
import gr.codehub.accenture.eshop.model.Customer;
import gr.codehub.accenture.eshop.model.Product;
import gr.codehub.accenture.eshop.repository.BasketProductRepository;
import gr.codehub.accenture.eshop.repository.BasketRepository;
import gr.codehub.accenture.eshop.repository.CustomerRepository;
import gr.codehub.accenture.eshop.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EshopServiceImpl implements EshopService{
    private CustomerRepository customerRepository;
    private ProductRepository productRepository;
    private BasketRepository basketRepository;
    private BasketProductRepository basketProductRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        customer.setRegistrationDate(LocalDateTime.now());
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

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> readProduct() {
        return null;
    }

    @Override
    public Product readProduct(int productId) {
        return null;
    }

    @Override
    public Product updateProduct(int productId, Product product) {
        return null;
    }

    @Override
    public boolean deleteProduct(int productId) {
        return false;
    }

    @Override
    public int createBasket(int customerId) {
        Optional<Customer> customerOpt = customerRepository.findById(customerId);

        if (customerOpt.isEmpty()) return -1;
        Basket basket  = new Basket();
        basket.setDate( LocalDateTime.now());
        basket.setCustomer(customerOpt.get());

        basketRepository.save(basket);
        return basket.getId();
    }

    @Override
    public boolean addToBasket(int basketId, int productId) {

        Optional<Basket> basketOpt = basketRepository.findById(basketId);
        Optional<Product> productOpt = productRepository.findById(productId);
        if (basketOpt.isEmpty()  || productOpt.isEmpty())
            return false;
        BasketProduct basketProduct = new BasketProduct();
        basketProduct.setBasket(basketOpt.get());
        basketProduct.setProduct(productOpt.get());
        basketProductRepository.save(basketProduct);

        return true;
    }

    @Override
    public List<ProductDto> productsInBasket(int basketId) {
        Optional<Basket> basketOpt = basketRepository.findById(basketId);
        if (basketOpt.isEmpty()   )
            return null;
        //todo
        List<ProductDto> productDtoList = new ArrayList<>();



        return null;
    }





}
