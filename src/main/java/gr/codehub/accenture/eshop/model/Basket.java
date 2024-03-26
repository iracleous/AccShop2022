package gr.codehub.accenture.eshop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Data
@Entity
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime date;
    @JsonIgnore
    @ManyToOne
    private Customer customer;
    @OneToMany(mappedBy = "basket")
    private List<BasketProduct> basketProductList;
}
