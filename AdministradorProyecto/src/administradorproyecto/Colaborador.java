package administradorproyecto;
/**
 *
 * @author pacheco
 */
public class Colaborador extends Miembro{
    
    private String rol;
    public Colaborador(String rfc, String nombre, String rol, Double nomina) {
        super(rfc, nombre, nomina);
        this.rol=rol;
    }
    
    public void reportEstadoTarea(){
        
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}