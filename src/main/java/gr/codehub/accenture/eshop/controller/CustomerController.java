package gr.codehub.accenture.eshop.controller;

import gr.codehub.accenture.eshop.dto.ResponseResult;
import gr.codehub.accenture.eshop.model.Customer;
import gr.codehub.accenture.eshop.service.EshopService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerController {
    private EshopService eshopService;

    @GetMapping(value="" )
    public String ping (){
        return "ok";
    }

    @GetMapping(value="/customer" )
    public ResponseResult<List<Customer>> get (){
         return eshopService.readCustomer();
    }
    @GetMapping(value="/customer/{customerId}" )
    public Customer get (@PathVariable("customerId") int customerId){
        return eshopService.readCustomer(customerId);
    }

    @PostMapping(value="/customer")
    public Customer create(@RequestBody Customer customer)
    {
        return eshopService.createCustomer(customer);
    }

    @PutMapping(value="/customer/{customerId}")
    public Customer update(@PathVariable("customerId") int customerId,@RequestBody Customer customer )
    {
        return eshopService.updateCustomer(customerId,customer);
    }

    @DeleteMapping(value="/customer/{customerId}" )
    public ResponseResult<Boolean> delete (@PathVariable("customerId") int customerId){
      return eshopService.deleteCustomer(customerId);
    }

}
