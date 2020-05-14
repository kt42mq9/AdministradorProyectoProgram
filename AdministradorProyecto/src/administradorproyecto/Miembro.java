package administradorproyecto;
/**
 *
 * @author pacheco
 */
public abstract class Miembro{
    private String rfc;
    private String nombre;
    private Double nomina;

    public Miembro(String rfc, String nombre, Double nomina) {
        this.rfc = rfc;
        this.nomina = nomina;
        this.nombre = nombre;
    }

    public Double getNomina() {
        return nomina;
    }

    public void setNomina(Double nomina) {
        this.nomina = nomina;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}