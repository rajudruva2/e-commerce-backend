package com.druvcollections.controller;

import com.druvcollections.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ProductController {

    @GetMapping("/products")
    public List<Product> getProducts() {

        List<Product> products = new ArrayList<>();

        products.add(
                new Product(
                        1,
                        "Premium T-Shirt",
                        499,
                        "https://picsum.photos/300/300?random=1"
                )
        );

        products.add(
                new Product(
                        2,
                        "Running Shoes",
                        1999,
                        "https://picsum.photos/300/300?random=2"
                )
        );

        products.add(
                new Product(
                        3,
                        "Smart Watch",
                        2999,
                        "https://picsum.photos/300/300?random=3"
                )
        );

        return products;
    }

    @GetMapping("/")
    public String health() {
        return "Backend API Running";
    }
}
