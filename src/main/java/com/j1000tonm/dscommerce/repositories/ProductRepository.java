package com.j1000tonm.dscommerce.repositories;

import com.j1000tonm.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Long> {
}
