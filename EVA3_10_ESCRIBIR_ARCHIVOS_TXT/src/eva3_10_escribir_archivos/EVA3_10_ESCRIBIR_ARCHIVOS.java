/*

 */
package eva3_10_escribir_archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EVA3_10_ESCRIBIR_ARCHIVOS {


    public static void main(String[] args) {
      String RUTA = "C:\\Archivos\\";
      
        try { 
            writeUsingFiles(RUTA + "archivosFiles.txt", "Prueba de escritura xdddd");
            writeUsingFileWriter(RUTA + "archivosFilesWriter.txt", "Prueba de escritura otra vez xdddd\n"
                    + "ñakñak");
             writeUsingBufferedWriter(RUTA + "archivosBuff.txt", "Muchas pruebas de escritura lol\n"
                     + "1234567890\n"
                     + "si\n");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRIBIR_ARCHIVOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
 public static void writeUsingFiles(String ruta, String datos) throws IOException{
     Path path = Paths.get(ruta);
     Files.write(path,datos.getBytes());
   
 }   
    
    
 public static void writeUsingFileWriter(String ruta, String datos) throws IOException{
     File file = new File(ruta);
   FileWriter filewriter = new FileWriter(file); 
   filewriter.write(datos);
   filewriter.close();
  }   
 
 
 public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
         File file = new File(ruta);
    FileWriter filewriter = new FileWriter(file); 
       BufferedWriter buffwriter = new BufferedWriter(filewriter);  
       
  for(int i=0; i<10; i++){
     buffwriter.write(datos);
     buffwriter.write("\n");
  }
   buffwriter.close();
   filewriter.close();
  
  
 }
    
}
