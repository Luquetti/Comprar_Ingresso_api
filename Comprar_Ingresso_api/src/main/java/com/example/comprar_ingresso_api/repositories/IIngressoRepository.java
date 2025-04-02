package com.example.comprar_ingresso_api.repositories;

import com.example.comprar_ingresso_api.Entities.Ingresso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;;

public interface IIngressoRepository  extends JpaRepository<Ingresso, Long> {
}
