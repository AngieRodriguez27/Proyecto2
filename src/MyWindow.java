
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyWindow extends JFrame implements ActionListener{
    
        JLabel l1,l2,l3,l4;  
        JButton bt1,bt2,bt3,bt4;
        JButton rostro;
        JButton pelo;
        JButton ojos;
        JButton nariz;
        JButton boca;
        JTextField t1;
        OutPrint pdf;
        JPanel panel1, panel2, panel3, panel4,panel5,panel6;
        JPanel panel7;
        JButton limpiar;        
        
        //catracteristicas
        MyButton ros1,ros2;
        MyButton pel1,pel2;
        MyButton ojo1,ojo2;
        MyButton nar1,nar2;
        MyButton boc1,boc2;
        
        //variables
           
     String codigo;
     BufferedImage imagen, b1;
     
     ArrayList delincuentes = new ArrayList();
        
        
	public MyWindow(){
	super("Criminal Software");
        iniciarCompon();	
	}
        
        
        private void iniciarCompon(){

            //paneles
        panel1 = new JPanel(); // creamos el panel
        panel1.setBounds(0, 0, 350, 400);
        panel1.setLayout(null);
        panel1.setBackground(Color.WHITE);
        panel1.setVisible(true);
        this.getContentPane().add(panel1);//Agregamos el panel a la ventana
        
        panel2 = new JPanel(); // creamos el panel
        panel2.setBounds(350, 0, 280, 400);
        panel2.setLayout(null);
        panel2.setVisible(true);
        this.getContentPane().add(panel2);//Agregamos el panel a la ventana
        
        panel3 = new JPanel(); // creamos el panel
        panel3.setBounds(630, 0, 370, 400);
        panel3.setLayout(null);
        panel3.setBackground(Color.WHITE);
        panel3.setVisible(false);
        this.getContentPane().add(panel3);//Agregamos el panel a la ventana
        
        panel4 = new JPanel(); // creamos el panel
        panel4.setBounds(630, 0, 370, 400);
        panel4.setLayout(null);
        panel4.setBackground(Color.WHITE);
        panel4.setVisible(false);
        this.getContentPane().add(panel4);//Agregamos el panel a la ventana
      
        panel5 = new JPanel(); // creamos el panel
        panel5.setBounds(630, 0, 370, 400);
        panel5.setLayout(null);
        panel5.setBackground(Color.WHITE);
        panel5.setVisible(false);
        this.getContentPane().add(panel5);//Agregamos el panel a la ventana
      
        panel6 = new JPanel(); // creamos el panel
        panel6.setBounds(630, 0, 370, 400);
        panel6.setLayout(null);
        panel6.setBackground(Color.WHITE);
        panel6.setVisible(false);
        this.getContentPane().add(panel6);//Agregamos el panel a la ventana
              
        panel7 = new JPanel(); // creamos el panel
        panel7.setBounds(630, 0, 370, 400);
        panel7.setLayout(null);
        panel7.setBackground(Color.WHITE);
        panel7.setVisible(false);
        this.getContentPane().add(panel7);//Agregamos el panel a la ventana
        
        //panel 1
        l2 = new JLabel("Drawing the criminal");       
        l2.setBounds(70,10,200,30);
        l2.setFont(new Font("arial",Font.BOLD,18));
        panel1.add(l2);

        bt1 = new JButton("Imprint");
        bt1.setBounds(105,278,100,30);
        bt1.setBackground(Color.LIGHT_GRAY);
        panel1.add(bt1);
        
        bt2 = new JButton("Exit");
        bt2.setBounds(105,320,100,30);
        bt2.setBackground(Color.LIGHT_GRAY);
        panel1.add(bt2);
        
        
        
        //panel 2
        l1 = new JLabel ("Portray the criminal");       
        l1.setBounds(20,10,220,30);
        l1.setFont(new Font("arial",Font.BOLD,23));
        l1.setForeground(Color.DARK_GRAY);
        panel2.add(l1);
         
        l3 = new JLabel("Suspect´s code: ");       
        l3.setBounds(80,60,200,30);
        l3.setFont(new Font("arial",Font.BOLD,13));
        panel2.add(l3);     

        t1 = new JTextField();       
        t1.setBounds(40,90,200,25);
        panel2.add(t1);  
        
        bt3 = new JButton("Add");
        bt3.setBounds(35,125,100,20);
        bt3.setBackground(Color.LIGHT_GRAY);
        bt3.setMnemonic('a');
        panel2.add(bt3);
        
        bt4 = new JButton("Search");
        bt4.setBounds(145,125,100,20);
        bt4.setBackground(Color.LIGHT_GRAY);
        bt4.setMnemonic('s');
        panel2.add(bt4);
                        
        rostro = new JButton("Face");
        rostro.setBounds(95,160,100,30);
        rostro.setBackground(Color.LIGHT_GRAY);
        panel2.add(rostro);
        
        pelo = new JButton("Hair");
        pelo.setBounds(95,195,100,30);
        pelo.setBackground(Color.LIGHT_GRAY);
        panel2.add(pelo);
        
        ojos = new JButton("Eye");
        ojos.setBounds(95,230,100,30);
        ojos.setBackground(Color.LIGHT_GRAY);
        panel2.add(ojos);
        
        nariz = new JButton("Nose");
        nariz.setBounds(95,265,100,30);
        nariz.setBackground(Color.LIGHT_GRAY);
        panel2.add(nariz);
        
        boca = new JButton("Mouth");
        boca.setBounds(95,300,100,30);
        boca.setBackground(Color.LIGHT_GRAY);
        panel2.add(boca);
        
        limpiar = new JButton("Clean");
        limpiar.setBounds(95,335,100,20);
        limpiar.setBackground(Color.LIGHT_GRAY);
        limpiar.setMnemonic('c');
        panel2.add(limpiar);       
   
        
       carateristicas();

        
        //Escuchar botones
        bt1.addActionListener(this);  
        bt2.addActionListener(this); 
        bt3.addActionListener(this);  
        bt4.addActionListener(this); 
        limpiar .addActionListener(this);  
        
        ojo1.addActionListener(this); 
        ojo2.addActionListener(this); 
        ros1.addActionListener(this); 
        ros2.addActionListener(this); 
        nar1.addActionListener(this); 
        nar2.addActionListener(this); 
        boc1.addActionListener(this); 
        boc2.addActionListener(this); 
        pel1.addActionListener(this); 
        pel2.addActionListener(this); 
        

        rostro.addActionListener(this);
        pelo.addActionListener(this);
        boca.addActionListener(this);
        ojos.addActionListener(this);
        nariz.addActionListener(this);
        }
        
        
        public void carateristicas(){
             //Panel 3: rostros
        l3 = new JLabel("Features' palette");       
        l3.setBounds(80,10,200,30);
        l3.setFont(new Font("arial",Font.BOLD,18));
        panel3.add(l3);
        
        ros1 = new MyButton("1");
	ros1.setBounds(10, 70, 146, 200);
        ImageIcon face1 = new ImageIcon(getClass().getResource("/Image/face1.png"));
        ros1.setIcon(face1);
        panel3.add(ros1);
        
        ros2 = new MyButton("2");
	ros2.setBounds(170, 70, 138, 200);
        ImageIcon face2 = new ImageIcon(getClass().getResource("/Image/face2.png"));
        ros2.setIcon(face2);
        panel3.add(ros2);
        
        
        //Panel 4: pelos
        l3 = new JLabel("Features' palette");       
        l3.setBounds(70,10,200,30);
        l3.setFont(new Font("arial",Font.BOLD,18));
        panel4.add(l3);
        
        pel1 = new MyButton("3");
	pel1.setBounds(10, 70, 160, 110);
        ImageIcon hair1 = new ImageIcon(getClass().getResource("/Image/hair1.png"));
        pel1.setIcon(hair1);
        panel4.add(pel1);
 
        pel2 = new MyButton("4");
	pel2.setBounds(170, 70, 170, 110);
        ImageIcon hair2 = new ImageIcon(getClass().getResource("/Image/hair2.png"));
        pel2.setIcon(hair2);
        panel4.add(pel2);
        
        //Panel 5: ojos
        l3 = new JLabel("Features' palette");       
        l3.setBounds(70,10,200,30);
        l3.setFont(new Font("arial",Font.BOLD,18));
        panel5.add(l3);

        ojo1 = new MyButton("5");
	ojo1.setBounds(15, 70, 113, 40);
        ImageIcon eye1 = new ImageIcon(getClass().getResource("/Image/eye1.png"));
        ojo1.setIcon(eye1);
        panel5.add(ojo1);
 
        ojo2 = new MyButton("6");
	ojo2.setBounds(170, 70, 115, 40);
        ImageIcon eye2 = new ImageIcon(getClass().getResource("/Image/eye2.png"));
        ojo2.setIcon(eye2);
        panel5.add(ojo2);
        
        //Panel 6: nariz
        l3 = new JLabel("Features' palette");       
        l3.setBounds(70,10,200,30);
        l3.setFont(new Font("arial",Font.BOLD,18));
        panel6.add(l3);
        
        nar1 = new MyButton("7");
	nar1.setBounds(10, 70, 33, 60);
        ImageIcon nose1 = new ImageIcon(getClass().getResource("/Image/nose1.png"));
        nar1.setIcon(nose1);
        panel6.add(nar1);
        
        nar2 = new MyButton("8");
	nar2.setBounds(120, 70, 32, 60);
        ImageIcon nose2 = new ImageIcon(getClass().getResource("/Image/nose2.png"));
        nar2.setIcon(nose2);
        panel6.add(nar2);

                
        //Panel 7: boca
        l3 = new JLabel("Features' palette");       
        l3.setBounds(740,10,200,30);
        l3.setFont(new Font("arial",Font.BOLD,18));
        panel7.add(l3);
        
        boc1 = new MyButton("9");
	boc1.setBounds(680, 70, 54, 40);
        ImageIcon mouth1 = new ImageIcon(getClass().getResource("/Image/mouth1.png"));
        boc1.setIcon(mouth1);
        panel7.add(boc1);

        
        boc2 = new MyButton("0");
	boc2.setBounds(750, 70, 54, 40);
        ImageIcon mouth2 = new ImageIcon(getClass().getResource("/Image/mouth2.png"));
        boc2.setIcon(mouth2);
        panel7.add(boc2);
        }

        
        public BufferedImage createImagen(JPanel panel){
            int w = panel.getWidth();
            int h = panel.getHeight();
            
            b1 = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = b1.createGraphics();
            panel.paint(g);
            
            return b1;
        }
        
        public void actionPerformed (ActionEvent e) {
            
        	            
	            String nameButton = e.getActionCommand();

	                if ("Imprint".equals(nameButton)){
	                	
                          JOptionPane.showMessageDialog(null, "download PDF");                          
                           pdf = new OutPrint();
	                   pdf.output(codigo, imagen);
                           t1.setText("");   

	                   }
                        if ("Exit".equals(nameButton)){
	                  Iterator it = delincuentes.iterator();
                          while ( it.hasNext() ) { 
                          Object objeto = it.next(); 
                          Listas sospechozo = (Listas)objeto; 
                          JOptionPane.showMessageDialog(null, sospechozo); 
                          }
                          JOptionPane.showMessageDialog(null, "Bye");
                          System.exit(0);
	                	
	                  
                        }
                        
                       if ("Add".equals(nameButton)){
	                	
                           codigo = t1.getText();
                           imagen = createImagen(panel1);
                           delincuentes.add(new Listas(codigo, imagen));
	                   JOptionPane.showMessageDialog(null, "Done.");
	                   t1.setText("");
                        }
                                                
                        if ("Search".equals(nameButton)){
                            boolean encontrado =false;
                            Iterator it = delincuentes.iterator();
                            while ( it.hasNext() ) { 
                            Object objeto = it.next(); 
                            Listas sospechozo = (Listas)objeto; 
                            if(t1.getText().equals(sospechozo.getCodigo())){
                                JOptionPane.showMessageDialog(null, sospechozo); 
                                encontrado = true;
                            }
                        }
                            if(encontrado == false){
                            JOptionPane.showMessageDialog(null, "Sospechozo no encontrado"); 
                            }
                        }
                        if ("Clean".equals(nameButton)){
                           
                           panel3.add(ros1); 
                           ros1.setBounds(10, 70, 146, 200);
                           panel3.add(ros2);  
                           ros2.setBounds(170, 70, 138, 200);
                           panel4.add(pel1);  
                           pel1.setBounds(10, 70, 160, 110);
                           panel4.add(pel2);  
                           pel2.setBounds(170, 70, 170, 110);
                           panel5.add(ojo1); 
                           ojo1.setBounds(10, 70, 113, 40);
                           panel5.add(ojo2); 
                           ojo2.setBounds(170, 70, 115, 40);
                           panel6.add(nar1); 
                           nar1.setBounds(10, 70, 33, 60);
                           panel6.add(nar2); 
                           nar2.setBounds(120, 70, 32, 60);
                           panel7.add(boc1);  
                           boc1.setBounds(680, 70, 54, 40);
                           panel7.add(boc2);  
                           boc2.setBounds(750, 70, 54, 40); 
                        }
                        if ("1".equals(nameButton)){
	                	
                              panel1.add(ros1);  
	                  }    
                        if ("2".equals(nameButton)){
	                	
                              panel1.add(ros2);   
	                  } 
                        if ("3".equals(nameButton)){
	                	
                              panel1.add(pel1);   
	                  } 
                        if ("4".equals(nameButton)){
	                	
                              panel1.add(pel2);   
	                  } 
                        if ("5".equals(nameButton)){
	                	
                              panel1.add(ojo1);   
	                  }
                        if ("6".equals(nameButton)){
	                	
                              panel1.add(ojo2);   
	                  } 
                        if ("7".equals(nameButton)){
	                	
                              panel1.add(nar1);   
	                  } 
                        if ("8".equals(nameButton)){
	                	
                              panel1.add(nar2);   
	                  } 
                        if ("9".equals(nameButton)){
                              panel1.add(boc1);
                              boc1.setBounds(130, 180, 54, 60);
	                  } 
                        if ("0".equals(nameButton)){
                              panel1.add(boc2);  
                              boc2.setBounds(130, 180, 54, 60);
	                  } 
	                 if ("Face".equals(nameButton)){
	                	
                              panel3.setVisible(true);
                              panel4.setVisible(false);
                              panel5.setVisible(false);
                              panel6.setVisible(false);
                              panel7.setVisible(false);
	                  }   
                         if ("Hair".equals(nameButton)){
	                	
                              panel3.setVisible(false);
                              panel4.setVisible(true);
                              panel5.setVisible(false);
                              panel6.setVisible(false);
                              panel7.setVisible(false);
	                  } 
                         if ("Eye".equals(nameButton)){
	                	
                              panel3.setVisible(false);
                              panel4.setVisible(false);
                              panel5.setVisible(true);
                              panel6.setVisible(false);
                              panel7.setVisible(false);
	                  } 
                         if ("Nose".equals(nameButton)){
	                	
                              panel3.setVisible(false);
                              panel4.setVisible(false);
                              panel5.setVisible(false);
                              panel6.setVisible(true);
                              panel7.setVisible(false);
	                  } 
                         if ("Mouth".equals(nameButton)){
	                	
                              panel3.setVisible(false);
                              panel4.setVisible(false);
                              panel5.setVisible(false);
                              panel6.setVisible(false);
                              panel7.setVisible(true);
	                  } 
                         
        }

}





