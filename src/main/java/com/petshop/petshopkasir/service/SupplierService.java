package com.petshop.petshopkasir.service;

import com.petshop.petshopkasir.database.SupplierRepository;
import com.petshop.petshopkasir.model.Supplier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    private final SupplierRepository repository;

    public SupplierService(SupplierRepository repository) {
        this.repository = repository;
    }

    public List<Supplier> getAll() {
        return repository.findAll();
    }

    public Supplier getById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Supplier tidak ditemukan"));
    }

    public Supplier save(Supplier supplier) {
        return repository.save(supplier);
    }

    public Supplier update(Integer id, Supplier supplier) {
        Supplier s = getById(id);
        s.setNamaSupplier(supplier.getNamaSupplier());
        s.setNoTelp(supplier.getNoTelp());
        return repository.save(s);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
