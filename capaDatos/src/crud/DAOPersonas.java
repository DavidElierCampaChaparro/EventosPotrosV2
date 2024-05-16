package crud;

import java.sql.Connection;
import basesdedatos.Conexion;
import objetosNegocio.Persona;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.PreparedStatement;


/**
* @author David Elier Campa Chaparro 245178
* @author Maximiliano Reyna Aquilar 244877
*/
public class DAOPersonas implements IDAOPersonas {

    /**
     * Consulta una persona por medio de su nombre y contraseña
     * @param nombre el nombre para realizar la consulta
     * @param contrasena la contraseña para realizar la consulta
     * @return Persona retorna la persona en caso de que si se haya encontrado, se consulta la Persona completa
     *          para saber si es admin o no y poder generar el Frame del admin o el Frame del usuario
     */
    @Override
    public Persona consultarPersonaLogin(String nombre, String contrasena) {
        Conexion conexion = new Conexion("cia");
        String consulta = "select Id, Nombre, HorasCultura, Contrasena, esAdmin from personas where Id = ? and contrasena = ?;";
        ResultSet rs;
        Persona personaConsultada = null;
        
        try {
            Connection cn = conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, contrasena);
            
            rs = pst.executeQuery();
            
            if(rs.next()){
                personaConsultada = new Persona();
                personaConsultada.setID(rs.getInt("Id"));
                personaConsultada.setNombre(rs.getString("Nombre"));
                personaConsultada.setHorasCultura(rs.getInt("HorasCultura"));
                personaConsultada.setContrasena(rs.getString("Contrasena"));
                personaConsultada.setEsAdmin(rs.getBoolean("esAdmin"));
            }
            
            conexion.desconectar();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Usuario no encontrado" + e.toString());
        
        }
        
        return personaConsultada;
    }
    
    /**
     * Este método está pensado para consultar una persona por medio de su ID
     * y mostrarlo en el FrmPerfil
     * @param ID El id de la persona que se consulta
     * @return regresa una persona con todos sus atributos
     */
    @Override
    public Persona consultarPersona(int ID) {
        Conexion conexion = new Conexion("cia");
        String consulta = "select Id, Nombre, HorasCultura, Contrasena, esAdmin from personas where Id = ?;";
        ResultSet rs;
        Persona personaConsultada = null;
        
        try {
            Connection cn = conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(consulta);
            pst.setInt(1, ID);
            
            rs = pst.executeQuery();
            
            if(rs.next()){
                personaConsultada = new Persona();
                personaConsultada.setID(rs.getInt("Id"));
                personaConsultada.setNombre(rs.getString("Nombre"));
                personaConsultada.setHorasCultura(rs.getInt("HorasCultura"));
                personaConsultada.setContrasena(rs.getString("Contrasena"));
            }
            
            conexion.desconectar();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Usuario no encontrado" + e.toString());
        
        }
        
        return personaConsultada;
    }
    
    
}
