package gr.codehub.accenture.eshop.repository;


import gr.codehub.accenture.eshop.model.Basket;
import gr.codehub.accenture.eshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasketRepository extends JpaRepository<Basket, Integer> {

    @Query( value ="Select bp.product from BasketProduct bp where bp.basket.id = :basketId")
    List<Product> getProductsFromBasket(int basketId);
}
