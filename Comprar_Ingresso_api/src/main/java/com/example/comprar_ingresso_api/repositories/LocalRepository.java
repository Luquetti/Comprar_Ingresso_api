package com.example.comprar_ingresso_api.repositories;

import com.example.comprar_ingresso_api.Entities.Local;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface LocalRepository extends JpaRepository<Local, Long> {
}
