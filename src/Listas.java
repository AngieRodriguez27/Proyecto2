
import java.awt.image.BufferedImage;


public class Listas {
    
    String codigo;
    BufferedImage imagen;

    public Listas() {
    }

    public Listas(String codigo, BufferedImage imagen) {
        this.codigo = codigo;
        this.imagen = imagen;
    }

    public String getCodigo() {
        return codigo;
    }

    public BufferedImage getImagen() {
        return imagen;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "El codigo del sospechozo es: "+getCodigo()
                +"\nEl retrato es: "+ getImagen();
    }
    
    
    
    
}
