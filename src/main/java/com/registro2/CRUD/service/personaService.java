package com.registro2.CRUD.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.registro2.CRUD.model.persona;
import com.registro2.CRUD.repository.personaRepository;

@Service // Define esta clase como capa de servicio
public class personaService {

    @Autowired // SeConecta automáticamente con PersonaRepository para usar todas sus funciones
    private personaRepository personaRepository;

    // Muestra la lista de personas registradas
    public List<persona> listarTodas() {
        return personaRepository.findAll();
    }

    // Guarda una nueva persona o la actualiza
    public persona guardar(persona persona) {
        return personaRepository.save(persona);
    }

    // Busca una persona por su ID; si no existe, devuelve null
    public persona obtenerPorId(long id) {
        return personaRepository.findById(id).orElse(null);
    }

    // Elimina un registro 
    public void eliminar(Long id) {
        personaRepository.deleteById(id);
    }
}