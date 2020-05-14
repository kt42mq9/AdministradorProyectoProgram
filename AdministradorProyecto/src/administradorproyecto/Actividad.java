package administradorproyecto;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author pacheco
 */
public class Actividad {
    
    private Integer numero;
    private String nombre;
    private String estado;
    private Date fechaInicial;
    private Date fechaFinal;
    private ArrayList<Recurso> recursos=new ArrayList<Recurso>();
    private ArrayList<Colaborador> colaboradores=new ArrayList<Colaborador>();
    private ArrayList<Lider> lideres=new ArrayList<Lider>();
    private ArrayList<Objetivo> objetivos=new ArrayList<Objetivo>();
    private Double total;
    
    public Actividad(Integer numero, String nombre, String estado) {
        this.numero = numero;
        this.nombre = nombre;
        this.total=0.0;
        this.fechaInicial=new Date();
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void addColaborador(Colaborador colaborador){
        colaboradores.add(colaborador);
    }

    public ArrayList<Colaborador> getColaboradores() {
        return colaboradores;
    }
    
    public void addRecurso(Recurso recurso, Double cantidad){
        this.setTotal(recurso.getCosto()*cantidad);
        for(int i=0;i<cantidad;i++)
            recursos.add(recurso);
    }

    public ArrayList<Recurso> getRecursos() {
        return recursos;
    }

    public void addLideres(Lider lider){
        lideres.add(lider);
    }

    public ArrayList<Lider> getLideres() {
        return lideres;
    }
    
    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total += total;
    }
    
    public ArrayList<Objetivo> getObjetivos() {
        return objetivos;
    }

    public void addObjetivo(Objetivo objetivo){
        this.objetivos.add(objetivo);
    }
}
