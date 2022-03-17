package gr.codehub.accenture.eshop.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
  private int  id;
  private String name;
  private double price;
  @OneToMany(mappedBy = "product")
  private List<BasketProduct> basketProductList;
}
