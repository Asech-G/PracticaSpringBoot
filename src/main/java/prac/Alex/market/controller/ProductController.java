package prac.Alex.market.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping(path = "/prodcut")
    public String getProduct(){
        return "Hey Soy un producto";
    }
}