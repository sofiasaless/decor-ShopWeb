package com.decor_shop_web.shopWeb.service;

import com.decor_shop_web.shopWeb.model.Product;
import com.decor_shop_web.shopWeb.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> listAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    public Product replace(Product product) {
        return productRepository.save(product);
    }

}
