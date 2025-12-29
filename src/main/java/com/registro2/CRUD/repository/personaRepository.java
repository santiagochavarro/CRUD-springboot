package com.registro2.CRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.registro2.CRUD.model.persona;


//Seconecta con la base de datos para guardar, buscar, actualizar o borrar datos sin escribir SQL
public interface personaRepository extends JpaRepository<persona, Long> {
    //extends JpaRepository usa las funciones básicas de CRUD para manejar los datos en la base de datos
}