
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;

class MyButton extends JButton implements MouseMotionListener{	
	
	public MyButton(String text){
            super.setText(text);
	
            setContentAreaFilled(false);
		
            Dimension tamano = getPreferredSize();
	    tamano.width = tamano.height = Math.max( tamano.width,tamano.height );
	    setPreferredSize( tamano );
	    
            addMouseMotionListener(this);

	}

	protected void paintBorder( Graphics g ) {
       /* g.setColor( getForeground() );
        g.drawOval( 0,0,getSize().width-1,getSize().height-1 );*/        
        }
    

	public void mouseDragged(MouseEvent mme) {

	setLocation(
	this.getX() + mme.getX() - this.getWidth() / 2,
	this.getY() + mme.getY() - this.getHeight() / 2
	);
	}


public void mouseMoved(MouseEvent mme) {

}
}

	
	                
