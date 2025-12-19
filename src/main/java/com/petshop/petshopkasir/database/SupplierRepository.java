package com.petshop.petshopkasir.database;

import com.petshop.petshopkasir.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
