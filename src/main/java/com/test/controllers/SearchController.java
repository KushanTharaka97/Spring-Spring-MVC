package com.test.controllers;


import com.test.beans.Product;
import com.test.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SearchController {


    @Autowired
    ProductRepository productRepository;


    @GetMapping("/search")
    public String search(@RequestParam("search") String name, Model model){
        System.out.println("In search controller "+name);

        List<Product> products = new ArrayList<>();
        products = productRepository.searchByName(name);
        model.addAttribute("products", products);
        return "search";
    }

}
