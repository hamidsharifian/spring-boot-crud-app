package com.example.repository;

import com.example.entities.Customer;
import com.example.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepostiroty extends CrudRepository<Product, String> {

}
