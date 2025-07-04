package com.example.customerapi.repository;

import com.example.customerapi.dto.CustomerDTO;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CustomerRepository {

    private final Map<Long, CustomerDTO> customerMap = new HashMap<>();
    private Long idCounter = 1L;

    public CustomerDTO save(CustomerDTO customer) {
        if (customer.getId() == null) {
            customer.setId(idCounter++);
        }
        customerMap.put(customer.getId(), customer);
        return customer;
    }

    public Optional<CustomerDTO> findById(Long id) {
        return Optional.ofNullable(customerMap.get(id));
    }

    public List<CustomerDTO> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    public boolean existsById(Long id) {
        return customerMap.containsKey(id);
    }

    public void deleteById(Long id) {
        customerMap.remove(id);
    }
}
