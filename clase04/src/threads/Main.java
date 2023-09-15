package threads;

public class Main {
	
	public static void main(String[] args) {
		
		Hilo1 hilo1 = new Hilo1();
		Thread hilo2 = new Thread(new Hilo2());
		
		Hilo1 hilo3 = new Hilo1(); 
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
	}
}
