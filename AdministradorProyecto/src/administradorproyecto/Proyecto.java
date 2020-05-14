package administradorproyecto;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author pacheco
 */
public class Proyecto {
    private String nombre;
    private ArrayList<Actividad> actividades=new ArrayList<Actividad>();
    private Double total;
    private String cadena;


    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    public Proyecto(String nombre){
        this.nombre=nombre;
        this.total=0.0;
        this.cadena="";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void addActividad(Actividad actividad){
        this.setTotal(actividad.getTotal());
        actividades.add(actividad);
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total += total;
    }
    
    public void cadena(){
        this.cadena=this.getNombre()+"\n";
        this.cadena+="Costo total: $"+this.getTotal()+"\n";
        ArrayList<Actividad> actividades=this.getActividades();
        this.cadena+="Lista de actividades:\n";
        //añadir actividades al proyecto
        for(Actividad actividad : actividades){
            this.cadena+=actividad.getNumero()+".  "+actividad.getNombre()+"  $"+actividad.getTotal()+"\n";
            this.cadena+="Fecha inicial: "+actividad.getFechaInicial()+"\n";
            ArrayList<Lider> lideres= actividad.getLideres();
            ArrayList<Colaborador> colaboradores= actividad.getColaboradores();
            ArrayList<Recurso> recursos= actividad.getRecursos();
            ArrayList<Objetivo> objetivos= actividad.getObjetivos();
            this.cadena+="-----Lider:"+"\n";
            for(Lider lider: lideres)
                this.cadena+="-------"+lider.getRfc()+"   "+lider.getNombre()+"  $"+lider.getNomina()+"\n";
            this.cadena+="-----Colaborador:"+"\n";
            for(Colaborador colaborador: colaboradores)
                this.cadena+="-------"+colaborador.getRfc()+"   "+colaborador.getNombre()+"   "+colaborador.getRol()+"  $"+colaborador.getNomina()+"\n";
            this.cadena+="-----Recurso:"+"\n";
            for(Recurso recurso : recursos)
                this.cadena+="-------"+recurso.getNombre()+"   "+recurso.getCosto()+"\n";
            this.cadena+="-----Objetivos:"+"\n";
            for(Objetivo objetivo: objetivos)
                this.cadena+="-------"+objetivo.getNumero()+"."+objetivo.getNombre()+"\n";
        }
    }
    
    public String getCadena() {
        return cadena;
    }
}