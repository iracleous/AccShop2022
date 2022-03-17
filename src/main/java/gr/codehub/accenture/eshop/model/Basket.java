package gr.codehub.accenture.eshop.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Data
@Entity
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime date;
    @ManyToOne
    private Customer customer;
    @OneToMany(mappedBy = "basket")
    private List<BasketProduct> basketProductList;
}
