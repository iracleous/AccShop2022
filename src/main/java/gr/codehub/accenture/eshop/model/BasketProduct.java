package gr.codehub.accenture.eshop.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class BasketProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int quantity;

    @ManyToOne
    private Basket basket;
    @ManyToOne
    private Product product;
}
