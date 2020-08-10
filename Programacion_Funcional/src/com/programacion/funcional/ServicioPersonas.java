package com.programacion.funcional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ServicioPersonas {
	
	static List<Persona> lista= new ArrayList<Persona>();
    static {
         
        lista.add(new Persona("pedro"));
        lista.add(new Persona("angel"));
        lista.add(new Persona("ana"));
    }
     
     
    public Optional<Persona> buscar(String nombre) {
         
         /*for (Persona p:lista) {
             if (p.getNombre() == nombre) {
                 return Optional.of(p);
             }
         }  
         return Optional.empty(); */
    	
    	return lista.stream().filter(p->p.getNombre()==nombre).findFirst();
    }

}
