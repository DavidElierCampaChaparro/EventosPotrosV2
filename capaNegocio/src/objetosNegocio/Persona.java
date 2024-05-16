package objetosNegocio;


/**
* @author David Elier Campa Chaparro 245178
* @author Maximiliano Reyna Aquilar 244877
*/
public class Persona {
    int ID;
    String Nombre;
    int HorasCultura;
    String contrasena;
    boolean esAdmin;
    
    public Persona() {
    }

    public Persona(int ID, String Nombre, int HorasCultura, String contrasena, boolean esAdmin) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.HorasCultura = HorasCultura;
        this.contrasena = contrasena;
        this.esAdmin = esAdmin;
    }
    
    public int getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getHorasCultura() {
        return HorasCultura;
    }

    public String getContrasena() {
        return contrasena;
    }

    public boolean isEsAdmin() {
        return esAdmin;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setHorasCultura(int HorasCultura) {
        this.HorasCultura = HorasCultura;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    }
    
}
