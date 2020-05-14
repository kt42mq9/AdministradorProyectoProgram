package administradorproyecto;
/**
 *
 * @author pacheco
 */
public class Lider extends Miembro{
    
    private Integer numero;
    
    public Lider(String rfc, String nombre, Integer numero, Double nomina) {
        super(rfc, nombre, nomina);
        this.numero=numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
}
