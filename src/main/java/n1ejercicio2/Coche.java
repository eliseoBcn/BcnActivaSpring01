package n1ejercicio2;

public class Coche {
	
	
	static final String marca = "SEAT";

 
	static String modelo ="127";
		
	final int potencia ;
	public Coche  ( int potencia ) {
		this.potencia = potencia;
		
	}
	public static void frenar() {
		 System.out.println("El vehicle està frenant");
	};
	
	
	public void acelerar() {
		 System.out.println("El vehicle està accelerant");
		
	}
 
			 
}
