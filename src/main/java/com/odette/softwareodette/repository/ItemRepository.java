package com.odette.softwareodette.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.odette.softwareodette.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
    // JpaRepository ya provee métodos CRUD básicos (findAll, save, delete, etc.)
}

