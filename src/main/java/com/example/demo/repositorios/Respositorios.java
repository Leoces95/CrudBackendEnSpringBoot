package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modelos.Modelo;


@Repository
public interface Respositorios extends JpaRepository<Modelo, Integer>{	

}
