package com.petshop.petshopkasir.controller;

import com.petshop.petshopkasir.model.Supplier;
import com.petshop.petshopkasir.service.SupplierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    private final SupplierService service;

    public SupplierController(SupplierService service) {
        this.service = service;
    }

    @GetMapping
    public List<Supplier> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Supplier create(@RequestBody Supplier supplier) {
        return service.save(supplier);
    }

    @PutMapping("/{id}")
    public Supplier update(@PathVariable Integer id, @RequestBody Supplier supplier) {
        return service.update(id, supplier);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        service.delete(id);
        return "Supplier berhasil dihapus";
    }
}
