package com.example.comprar_ingresso_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.comprar_ingresso_api.Entities.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface IEventoRepository extends JpaRepository<Evento, Long> {
}
