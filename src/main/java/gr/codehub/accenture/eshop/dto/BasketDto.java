package gr.codehub.accenture.eshop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class BasketDto {
    private int basketId;
    private LocalDateTime date;
    private List<ProductDto> products;

    public BasketDto addList(){
        products = new ArrayList<>();
        return this;
    }
}
