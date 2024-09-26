package com.example.accessingdatajpa.repository;

import com.example.accessingdatajpa.model.Customer;
import com.example.accessingdatajpa.model.Property;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);

    public List<Property> getAllProperties();

}
