package com.j1000tonm.dscommerce.services;

import com.j1000tonm.dscommerce.dto.ProductDTO;
import com.j1000tonm.dscommerce.entities.Product;
import com.j1000tonm.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        Product product = repository.findById(id).get();
        return new ProductDTO(product);
    }
}
