package com.mycompany.primeraAPI.controller;

import com.mycompany.primeraAPI.model.Persona;
import com.mycompany.primeraAPI.service.PersonaService;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaludoController {

    private final PersonaService personaService;

    public SaludoController(PersonaService personaService){
        this.personaService = personaService;
    }

    @GetMapping("/holaNombre/{nombre}/{edad}")
    public Persona holaMundoNombre(@PathVariable String nombre,
                                   @PathVariable int edad){
        return personaService.crearPersona(nombre, edad);
    }

    @PostMapping("/crearPersona")
    public Persona crearNuevaPersona(@RequestBody Persona nuevaPersona){
        System.out.println("Persona recibida en el backend. Nombre: " + nuevaPersona.getNombre());

        return nuevaPersona;
    }
;
}