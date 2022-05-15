# spring-entitytodto-modelmapper

# To Configure ModelMapper 
add Maven dependency as below in pom.xml file
   <dependency>
            <groupId>org.modelmapper</groupId>
            <artifactId>modelmapper</artifactId>
            <version>3.1.0</version>
        </dependency>

and make ModelMapper as Spring Bean with @Bean using java configuration .
-----------------------------sample example ---------------------
@Component
public class Convert {

    @Autowired
    ModelMapper modelMapper;

    public  Product dtoToEntity(ProductDTO productDTO) {
      return this.modelMapper.map(productDTO,Product.class);
    }
    public ProductDTO entityToDTO(Product product){
        return this.modelMapper.map(product,ProductDTO.class);
    }
}
    
