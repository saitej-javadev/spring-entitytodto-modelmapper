package com.saitej.springentitytodto.modelmapper.service;


import com.saitej.springentitytodto.modelmapper.dto.ProductDTO;
import com.saitej.springentitytodto.modelmapper.model.Product;

import java.util.Properties;

public interface ProductService {
   /* without DTO pattern*/

   /* Product saveProduct(Product product);
    Product findById(Long id);
    Product updateProduct(Product product);
    String deleteById(Long id);*/

  /* with DTO pattern*/

   ProductDTO saveProduct(ProductDTO productDTO);
   ProductDTO findById(Long id);
   ProductDTO updateProduct(ProductDTO productDTO);
   String DeleteById(Long id);
}
