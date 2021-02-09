package com.example.demo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidad.VideoJuego;

@Repository
public interface DaoVideojuegos extends JpaRepository<VideoJuego,Integer> {

}
