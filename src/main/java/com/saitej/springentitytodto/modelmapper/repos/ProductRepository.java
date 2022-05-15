package com.saitej.springentitytodto.modelmapper.repos;

import com.saitej.springentitytodto.modelmapper.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
