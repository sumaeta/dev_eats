package com.dev.eats.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.eats.domain.modal.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{

}
