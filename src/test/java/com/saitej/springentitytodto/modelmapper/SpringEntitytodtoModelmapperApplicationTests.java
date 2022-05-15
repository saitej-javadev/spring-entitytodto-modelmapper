package com.saitej.springentitytodto.modelmapper;
import com.saitej.springentitytodto.modelmapper.dto.ProductDTO;
import com.saitej.springentitytodto.modelmapper.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class SpringEntitytodtoModelmapperApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    void testCreateProduct() {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setName("S20");
        productDTO.setDescription("from Samsung Inc.");
        productDTO.setPrice(800.0);
        productService.saveProduct(productDTO);
        assertNotNull(productDTO);

        ProductDTO productDTO1 = new ProductDTO();
        productDTO1.setName("OnePlus 9Pro");
        productDTO1.setDescription("from One Plus Inc.");
        productDTO1.setPrice(1200.0);
        productService.saveProduct(productDTO1);
        assertNotNull(productDTO1);
    }

    @Test
    void testFindProduct() {
        ProductDTO productDTO = productService.findById(2L);
        System.out.println(productDTO);
    }

    @Test
    void testUpdateProduct() {
        ProductDTO productDTO= productService.findById(2L);
        productDTO.setName("One Plus 8pro");
        productDTO.setPrice(700.0);
        productService.updateProduct(productDTO);
        assertEquals("One Plus 8pro",productDTO.getName());
    }

    @Test
    void testDeleteProduct() {
        String result = productService.DeleteById(4L);
        System.out.println(result);
    }
}