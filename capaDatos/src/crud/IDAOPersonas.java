package crud;

import objetosNegocio.Persona;


/**
* @author David Elier Campa Chaparro 245178
* @author Maximiliano Reyna Aquilar 244877
*/
public interface IDAOPersonas {
    public Persona consultarPersonaLogin(String Id, String contrasena);
    public Persona consultarPersona(int ID);
}
