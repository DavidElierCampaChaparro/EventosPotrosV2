package basesdedatos;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author David Elier Campa Chaparro 245178
 */
public class Conexion {
    String bd = "";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "root";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection connection;
    
    public Conexion(String bd){
        this.bd = bd;
    }
    
   /**
    * En este método se consigue la conexión con la base de datos
    * @return regresa la conexión a la base de datos
    */    
    public Connection conectar(){
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url+bd, user, password);
            System.out.println("se conectó a la base de datos "+ bd);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no se pudo conectar a la base de datos "+ bd);
        }
        return connection;
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public void desconectar(){
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
    

