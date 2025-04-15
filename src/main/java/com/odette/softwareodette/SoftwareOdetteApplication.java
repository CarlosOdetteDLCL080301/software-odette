package com.odette.softwareodette;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.odette.softwareodette.model.Item;
import com.odette.softwareodette.repository.ItemRepository;

@SpringBootApplication  // Activa configuración automática de Spring Boot
public class SoftwareOdetteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoftwareOdetteApplication.class, args);
    }

    // Bean que corre al inicio para poblar datos de ejemplo
    @Bean
    public CommandLineRunner loadData(ItemRepository repo) {
        return args -> {
            // Guarda algunos items de ejemplo en la BD
            repo.save(new Item(null, "Pri elemento"));
            repo.save(new Item(null, "cans elemento"));

        };
    }
}
