package gr.codehub.accenture.eshop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private int age;
    private LocalDateTime registrationDate;
    private CustomerType customerType;

    @OneToMany(mappedBy = "customer")
    private List<Basket> baskets;

}
