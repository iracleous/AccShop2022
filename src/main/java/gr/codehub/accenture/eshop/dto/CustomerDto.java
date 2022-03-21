package gr.codehub.accenture.eshop.dto;

import gr.codehub.accenture.eshop.model.CustomerType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private int id;
    private String name;
    private String email;
    private int age;
    private LocalDateTime registrationDate;
    private CustomerType customerType;
    private List<BasketDto> baskets;
}
