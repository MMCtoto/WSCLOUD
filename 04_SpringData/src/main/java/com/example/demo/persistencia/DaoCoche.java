package com.example.demo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidad.Coche;

//Para crear el DAO tenemos que crear una interface que extienda de JPAre... parametrizar dos valores
//1-Coche, la entidad que queremos mapear
//2-El tipo de clave primaria de la entidad que estamos mapeando
//Lo ultimo que tenemos que hacer, como es una app Spring, es dar de alta este objketo en el contexto
@Repository
public interface DaoCoche extends JpaRepository<Coche, Integer> {


}
