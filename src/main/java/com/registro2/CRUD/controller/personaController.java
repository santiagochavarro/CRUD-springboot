package com.registro2.CRUD.controller;

import com.registro2.CRUD.model.persona;
import com.registro2.CRUD.service.personaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller // Es un controlador web para tener de todo el HTML)
@RequestMapping("/personas") // Las rutas que empiecen con /personas son manejadas por este controlador
public class personaController { 

    @Autowired //Usa las funciones de PersonaService guardar, eliminar etc
    private personaService personaService;
    
    @GetMapping // Se ejecuta cuando alguien abre la página para ver la lista de personas (GET)
    public String listarPersonas(Model model) { 
        model.addAttribute("personas", personaService.listarTodas()); 
        return "persona-list"; // Carga persona-list.html
    }      
    
    @GetMapping("/nuevo") // Muestra el formulario para un nuevo registro
    public String mostrarFormularioNuevaPersona(Model model) {  
        model.addAttribute("persona", new persona()); 
        return "persona-form"; // Carga persona-form.html
    }   
    
    @PostMapping // Procesa los datos creados en el formulario Guardar o Actualizar
    public String guardarPersona(@ModelAttribute("persona") persona persona) {    
        try {
            personaService.guardar(persona); 
            return "redirect:/personas"; // Recarga la lista tras guardar exitosamente
        } catch (Exception e) {
            return "persona-form"; // Si fall vuelve al formulario
        }
    }   
    
    @GetMapping("/editar/{id}") // Busca una persona por su ID
    public String mostrarFormularioEditarPersona(@PathVariable Long id, Model model) { 
        model.addAttribute("persona", personaService.obtenerPorId(id)); 
        return "persona-form";  
    }    
    
    @GetMapping("/eliminar/{id}") // Elimina un registro
    public String eliminarPersona(@PathVariable Long id) {
        personaService.eliminar(id); 
        return "redirect:/personas";
    }
}