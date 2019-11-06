

public class Principal {

     
	public static void main(String[] args) {
            
            Hilos t1,t2;
            
            // Creación de los threads con parámetro tiempo aleatorio
		t1 = new Hilos(100,1);
		t2 = new Hilos(110,2);
		

		// Arrancamos los threads con el método start
		t1.start();
		t2.start();

	}
        
 }

