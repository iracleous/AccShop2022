package gr.codehub.accenture.eshop.controller;

import gr.codehub.accenture.eshop.dto.ProductDto;
import gr.codehub.accenture.eshop.model.Basket;
import gr.codehub.accenture.eshop.model.Customer;
import gr.codehub.accenture.eshop.model.Product;
import gr.codehub.accenture.eshop.service.EshopService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {

    private EshopService eshopService;

    @PostMapping(value="/product" )
    public Product createProduct (@RequestBody Product product){
        return eshopService.createProduct(product);
    }


    @PostMapping(value="/basket/customer/{customerId}" )
    public int createBasket (@PathVariable("customerId") int customerId){
        return eshopService.createBasket(customerId);
    }

     @PostMapping(value="/basket/{basketId}/product/{productId}" )
    public boolean addProductToBasket (@PathVariable("basketId") int basketId,    @PathVariable("productId") int productId  ){
        return eshopService.addToBasket(basketId, productId);
    }

    @GetMapping(value="/basket/{basketId}")
    public List<ProductDto> productsInBasket(@PathVariable("basketId") int basketId){
        return eshopService.productsInBasket(basketId);
    }

    @GetMapping(value="/product" )
    public List<ProductDto>  getAllProducts(){
        return  eshopService.readProduct();
    }
}
