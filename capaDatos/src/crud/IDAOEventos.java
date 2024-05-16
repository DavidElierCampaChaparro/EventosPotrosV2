package crud;
import objetosNegocio.Evento;
import javax.swing.table.DefaultTableModel;


/**
* @author David Elier Campa Chaparro 245178
* @author Maximiliano Reyna Aquilar 244877
*/
public interface IDAOEventos {
    public Evento consultarEvento(Evento evento);
    public void insertarEvento(Evento evento);
    public void eliminarEvento(Evento evento);
    public DefaultTableModel mostrarEventos();
    public void actualizarEvento(Evento evento);
    
}
