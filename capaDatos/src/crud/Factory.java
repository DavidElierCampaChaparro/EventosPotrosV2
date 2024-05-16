package crud;

    /**
     * @author David Elier Campa Chaparro 245178
     * @author Maximiliano Reyna Aquilar 244877
     */
public class Factory {
    private static IDAOEventos eventos;
    private static IDAOPersonas personas;
    
    public static IDAOEventos getEventos() {
        return (eventos == null) ? (eventos = new DAOEventos()) : eventos;
    }
    
    public static IDAOPersonas getPersonas(){
        return (personas == null) ? (personas = new DAOPersonas()) : personas;
    }
    
}
