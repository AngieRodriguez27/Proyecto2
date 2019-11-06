
import java.applet.AudioClip;
public class Song1 implements IMusic{
AudioClip sound;
    @Override
    public void songs(String ruta) {
        try{
        sound = java.applet.Applet.newAudioClip(getClass().getResource(ruta));
        sound.play();
        }catch(Exception e){ 
        }
    }
 
}
