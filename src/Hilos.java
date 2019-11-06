
import javax.swing.JOptionPane;

  
import javax.swing.*;
import java.awt.*;


public class Hilos extends Thread{

        IMusic songs1;
        
        private int retardo;
        private int numeroH;

        public Hilos(int retardo, int numeroH){
            this.retardo = retardo;
            this.numeroH = numeroH;
        }

    @Override
    public void run() {
                try {
                sleep(retardo);
		} catch(InterruptedException e ) {                   
		} 
                
                System.out.println("\n");
          switch(numeroH){
            case 1: 
            int song;
            song = Integer.parseInt(JOptionPane.showInputDialog("Choose song:"
                    + "\n[1] = Waje me up"
                    + "\n[2] = Believer Imgine Dragons"));
            ring(song);
	    break;
                
                
            case 2: 
                MyWindow window = new MyWindow();
		window.setVisible(true);
		window.setPreferredSize(new Dimension(1000,400));
		window.pack();
                window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                                  
            break;
       
           }
        System.out.println( "Hilo #: "+numeroH+" con un retardo de: "+retardo);
    }
    
            
    
    public void ring(int election){
            switch(election){
                
                case 1:
                    songs1 = new Song1();
                    songs1.songs("/Music/Wake.wav");

                    
                    break;
                case 2:
                    songs1 = new Song1();
                    songs1.songs("/Music/Believer.wav");
                    
                    break;
                    
            }
        }
        
        

        
        
}
