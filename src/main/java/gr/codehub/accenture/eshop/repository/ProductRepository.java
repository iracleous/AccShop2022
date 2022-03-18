package gr.codehub.accenture.eshop.repository;

import gr.codehub.accenture.eshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

   // @Query(value = "Select p from Product p inner join BasketProduct bp inner join Basket b where b = :basketId")
  //  List<Product> findAllProduct(int basketId);

}
