package net.java.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import net.java.springboot.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
