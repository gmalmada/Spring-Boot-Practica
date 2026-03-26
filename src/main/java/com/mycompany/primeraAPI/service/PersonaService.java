package com.mycompany.primeraAPI.service;

import com.mycompany.primeraAPI.model.Persona;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    public Persona crearPersona(String nombre, int edad){
        return new Persona(nombre, edad);
    }



}
