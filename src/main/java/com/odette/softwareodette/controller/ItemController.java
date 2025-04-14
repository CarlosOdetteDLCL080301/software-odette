package com.odette.softwareodette.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odette.softwareodette.model.Item;
import com.odette.softwareodette.repository.ItemRepository;

@RestController  // Combina @Controller + @ResponseBody para REST
public class ItemController {

    private final ItemRepository repository;

    // Inyección de dependencia vía constructor
    public ItemController(ItemRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/items")
    public List<Item> getAllItems() {
        // Devuelve todos los items en formato JSON
        return repository.findAll();
    }
}
