package com.example.kamilzhanovjahongir.service;

import com.example.kamilzhanovjahongir.entity.Address;
import com.example.kamilzhanovjahongir.repository.AddressRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    private final AddressRepository repository;

    public AddressService(AddressRepository repository) {
        this.repository = repository;
    }

    public Address save(Address address) {
        return repository.save(address);
    }

    public List<Address> findAll() {
        return repository.findAll();
    }

    public Address findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
