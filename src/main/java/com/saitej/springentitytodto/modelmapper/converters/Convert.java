package com.saitej.springentitytodto.modelmapper.converters;

import com.saitej.springentitytodto.modelmapper.dto.ProductDTO;
import com.saitej.springentitytodto.modelmapper.model.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Convert {


    @Autowired
    ModelMapper modelMapper;


  /*  public static Product dtoToEntity(ProductDTO productDTO) {
        Product product = new Product();
        product.setId(productDTO.getId());
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setDescription(productDTO.getDescription());
        return product;
    }*/


    public  Product dtoToEntity(ProductDTO productDTO) {
      return this.modelMapper.map(productDTO,Product.class);
    }

    /*public  ProductDTO entityToDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setPrice(product.getPrice());
        productDTO.setDescription(product.getDescription());

        return productDTO;
    }*/

    public ProductDTO entityToDTO(Product product){
        return this.modelMapper.map(product,ProductDTO.class);
    }
}
