package com.saitej.springentitytodto.modelmapper.controller;


import com.saitej.springentitytodto.modelmapper.dto.ProductDTO;
import com.saitej.springentitytodto.modelmapper.model.Product;
import com.saitej.springentitytodto.modelmapper.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping(value = "api/v1/product")
public class ProductController {

    @Autowired
    ProductService productService;


    @GetMapping(value = "{id}")
    ResponseEntity<ProductDTO> getProduct(@PathVariable("id") Long id){
        return ResponseEntity.ok(productService.findById(id));
    }
}
