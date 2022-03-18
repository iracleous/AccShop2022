package gr.codehub.accenture.eshop.repository;


import gr.codehub.accenture.eshop.model.BasketProduct;
import gr.codehub.accenture.eshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface BasketProductRepository extends JpaRepository<BasketProduct,Integer> {

    @Query("Select bp from BasketProduct bp where bp.basket.id = :basketId and bp.product.id= :productId")
    Optional<BasketProduct> findByBasketAndProduct(int basketId, int productId);
}
