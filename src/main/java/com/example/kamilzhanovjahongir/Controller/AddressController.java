package com.example.kamilzhanovjahongir.Controller;

import com.example.kamilzhanovjahongir.entity.Address;
import com.example.kamilzhanovjahongir.service.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    private final AddressService service;

    public AddressController(AddressService service) {
        this.service = service;
    }

    @PostMapping
    public Address create(@RequestBody Address address) {
        return service.save(address);
    }

    @GetMapping
    public List<Address> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Address getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Address update(@PathVariable Long id, @RequestBody Address address) {
        address.setId(id);
        return service.save(address);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
