
package com.portfolio.TorresBarotto.Interface;

import com.portfolio.TorresBarotto.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer un lista de personas
    public List<Persona> getPersona();
    
    //Guardar objeto tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto por ID
    public void deletePersona(Long id);
    
    //Buscar persona por ID
    public Persona findPersona(Long id);
}
