package gr.codehub.accenture.eshop.repository;


import gr.codehub.accenture.eshop.model.BasketProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BasketProductRepository extends JpaRepository<BasketProduct,Integer> {
}
