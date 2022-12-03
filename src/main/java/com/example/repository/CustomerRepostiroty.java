package com.example.repository;

import com.example.entities.Customer;
import com.example.entities.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepostiroty extends CrudRepository<Customer, String> {

}
