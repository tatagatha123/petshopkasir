package com.petshop.petshopkasir.database;

import com.petshop.petshopkasir.model.Produk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdukRepository extends JpaRepository<Produk, Integer> {
}
