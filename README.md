# spring-entitytodto-modelmapper

# To Configure ModelMapper 
_STEP-1_    **Add Maven dependency as below in pom.xml file**
<pre>
<code>
   &lt;dependency&gt;
               &lt;groupId&gt;org.modelmapper&lt;/groupId&gt;
               &lt;artifactId&gt;modelmapper&lt;/artifactId&gt;
               &lt;version&gt;3.1.0&lt;/version&gt;
           &lt;/dependency&gt;
</code>
</pre>

_STEP-1_
**And make ModelMapper as Spring Bean with @Bean using java configuration** .


**-----------------------------sample example ---------------------**
<pre>
<code>
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
  </code>
  </pre>  
