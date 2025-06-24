package com.example.mgnt_sys.repository;

import com.example.mgnt_sys.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByCustomername(String Customername);
}
