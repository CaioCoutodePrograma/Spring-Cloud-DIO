package one.digitalinnovation.productcatalog.controller;

import one.digitalinnovation.productcatalog.model.Product;
import one.digitalinnovation.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    Optional<Product> findById(@PathVariable Long id){
        return productRepository.findById(id);
    }
}
