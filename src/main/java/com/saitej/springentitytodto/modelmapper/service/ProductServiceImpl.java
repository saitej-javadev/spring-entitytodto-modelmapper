package com.saitej.springentitytodto.modelmapper.service;

import com.saitej.springentitytodto.modelmapper.converters.Convert;
import com.saitej.springentitytodto.modelmapper.dto.ProductDTO;
import com.saitej.springentitytodto.modelmapper.model.Product;
import com.saitej.springentitytodto.modelmapper.repos.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    Convert convert;

    @Autowired
    private ProductRepository productRepository;



   /* with DTO pattern*/

    @Override
    public ProductDTO saveProduct(ProductDTO productDTO) {
        Product product = productRepository.save(convert.dtoToEntity(productDTO));
        return convert.entityToDTO(product);
    }

    @Override
    public ProductDTO findById(Long id) {
        Product product = productRepository.findById(id).get();
        return convert.entityToDTO(product);
    }

    @Override
    public ProductDTO updateProduct(ProductDTO productDTO) {
        Product product = convert.dtoToEntity(productDTO);
        Product productFrmDb = productRepository.findById(product.getId()).get();
        productFrmDb.setId(product.getId());
        productFrmDb.setName(product.getName());
        productFrmDb.setPrice(product.getPrice());
        productFrmDb.setDescription(product.getDescription());
        Product updatedProduct = productRepository.save(productFrmDb);
        return convert.entityToDTO(updatedProduct);
    }

    @Override
    public String DeleteById(Long id) {
        productRepository.deleteById(id);
        return "Product Deleted with id: " +id;
    }



    /*without DTO Pattern*/

    /*@Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product updateProduct(Product product) {
        Product productFrmDb = productRepository.findById(product.getId()).get();
        productFrmDb.setId(product.getId());
        productFrmDb.setName(product.getName());
        productFrmDb.setPrice(product.getPrice());
        productFrmDb.setDescription(product.getDescription());
        Product updatedProduct = productRepository.save(productFrmDb);
        return updatedProduct;
    }

    @Override
    public String deleteById(Long id) {
        productRepository.deleteById(id);
        return "Product Successfully Deleted with id: " +id;
    }*/
}
