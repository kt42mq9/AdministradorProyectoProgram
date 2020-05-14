package administradorproyecto;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author pacheco
 */
public class AdministradorProyecto {
    public static ArrayList<Proyecto> proyectos=new ArrayList<Proyecto>();
    public static void main(String[] args) throws IOException {
        administracion adm=new administracion();
        Proyecto proyecto1=new Proyecto("Puente peatonal");
        //crear actividades
        Actividad simentar=new Actividad(1,"Simentar","En proceso");
        Actividad colar=new Actividad(2,"Colar","En proceso");
        //crear objetivos
        Objetivo objetivo1=new Objetivo(1,"Conseguir resistencia en el suelo.");
        Objetivo objetivo2=new Objetivo(1,"Obtener arena fina");
        //crear lideres
        Lider lupe=new Lider("LUPE123","Guadalupe",5,1000.0);
        Lider misael=new Lider("GAGM001215","Misael",3,1000.0);
        //crear colaboradores
        Colaborador luis=new Colaborador("LA012345","Luislao","Albañil",200.0);
        Colaborador jorge=new Colaborador("AMMJ09","Jorge","Cuchara chica",200.0);
        Colaborador sofia=new Colaborador("TREJO","Sofia","Arquitecta",800.0);
        //crear recursos
        //añadir los recursos a las actividades
        simentar.addRecurso(adm.findOneRecurso("cemento"),5.0);
        simentar.addRecurso(adm.findOneRecurso("varilla"),2.0);
        simentar.addRecurso(adm.findOneRecurso("grava"),1.0);
        simentar.addRecurso(adm.findOneRecurso("CocaLight"), 5.00);
        colar.addRecurso(adm.findOneRecurso("cemento"),3.0);
        colar.addRecurso(adm.findOneRecurso("varilla"),1.0);
        colar.addRecurso(adm.findOneRecurso("grava"),2.0);
        colar.addRecurso(adm.findOneRecurso("arena"),1.0);
        colar.addRecurso(adm.findOneRecurso("cal"),1.0);
        
        //añadir miembros a las actividades
        simentar.addLideres(misael);
        simentar.addColaborador(sofia);
        simentar.addColaborador(luis);
        
        colar.addLideres(lupe);
        colar.addColaborador(sofia);
        colar.addColaborador(jorge);
        //añadir los objetivos a las actividades
        simentar.addObjetivo(objetivo1);
        
        colar.addObjetivo(objetivo2);
        //añadir las actividades
        proyecto1.addActividad(simentar);
        proyecto1.addActividad(colar);
        //añadir los proyectos
        proyectos.add(proyecto1);
        
        for(Proyecto proyecto : proyectos){;
            proyecto.cadena();
            adm.imprimir(proyecto.getCadena());
            adm.guardar(proyecto.getNombre(), proyecto.getCadena());
        }
    }
}