package com.suleiman.spring.files.upload.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suleiman.spring.files.upload.model.Agente;

public interface AgenteRepository extends JpaRepository<Agente, Long> {

    List<Agente> findBySigla(String sigla);
}
