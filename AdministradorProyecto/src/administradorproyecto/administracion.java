package administradorproyecto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author pacheco
 */
public class administracion {
    
    private String ruta="C:\\Users\\pacheco\\Documents\\NetBeansProjects\\AdministradorProyecto\\txt\\";
    
    public String[] findOne(String buscar, String donde) throws FileNotFoundException, IOException{
        String linea;
        String[] partes=null;
        File archivo = new File(this.ruta+donde+".txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        while((linea=br.readLine())!=null){
            partes=linea.split("\\|");
            if(buscar.equals(partes[0]))
                return partes;
        }
        partes[0]="Nada";
        partes[1]="0.0";
        return partes;
    }
    
    public void imprimir(String cadena){
        System.out.println(cadena);
    }
    
    public void guardar(String donde, String cadena) throws IOException{
        String ruta= this.ruta+donde+".txt";
        File file = new File(ruta);
        if(!file.exists())
            file.createNewFile();
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(cadena);
        bw.close();
    }
    
    public Recurso findOneRecurso(String buscar) throws IOException{
        String[] partes;
        partes=this.findOne(buscar, "recursos");
        Recurso recurso = new Recurso(partes[0], Double.parseDouble(partes[1]));
        return recurso;
    }

}