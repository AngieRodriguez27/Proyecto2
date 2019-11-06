import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;


public class MyLabel extends JLabel implements MouseMotionListener{
	
	
	public MyLabel(String text){
	super.setText(text);
	addMouseMotionListener(this);

	}

	public void mouseDragged(MouseEvent mme) {
	setLocation(
	this.getX() + mme.getX() - this.getWidth() / 2,
 	this.getY() + mme.getY() - this.getHeight() / 2
	);
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
