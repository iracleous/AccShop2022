package gr.codehub.accenture.eshop.dto;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@RequiredArgsConstructor
public class BasketDto {
    @NonNull
    private int basketId;
    @NonNull
    private LocalDateTime date;
    private List<ProductDto> products;

    public BasketDto addList(){
        products = new ArrayList<>();
        return this;
    }
}
