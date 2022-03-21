package gr.codehub.accenture.eshop.repository;

import gr.codehub.accenture.eshop.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepositoryPageable  extends PagingAndSortingRepository<Product, Integer> {
}
