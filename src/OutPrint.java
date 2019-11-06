import java.awt.image.BufferedImage;
import java.io.*;
public class OutPrint {
    
    public void output(String codigo, BufferedImage panel){
          try {
          FileWriter Archivo = new FileWriter("C:\\Users\\angie\\Desktop\\proyecto\\criminal.txt");
          PrintWriter pw = new PrintWriter(Archivo);
          pw.println("Suspect´s code: "+codigo);
          pw.print(panel);
          pw.close();
          
          
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
