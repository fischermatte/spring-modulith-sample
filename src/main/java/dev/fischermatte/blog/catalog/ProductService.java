package dev.fischermatte.blog.catalog;

import dev.fischermatte.blog.catalog.internal.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<ProductDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(entity -> new ProductDTO(entity.getId(), entity.getName(), entity.getDescription()))
                .toList();
    }
}
