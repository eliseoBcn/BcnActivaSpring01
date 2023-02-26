package n1ejercicio2;

public class Concesiorario {
	public static void main(String[] args) {
		
		/*acceso a variable estatica de la clase sin instanciarla   */
		
		System.out.println("Coche 1 modelo : " + Coche.modelo);
		
		/*llamando metodo estatico */
		
		Coche.frenar();
		
		/* Constructor que añade la potencia del Coche ( tipo final )  */
		 
	    Coche coche = new Coche(23333);
		
		//coche.potencia = 0303;  NO DEJA CAMBIARLA PORQUE ES FINAL
		
		
		coche.acelerar();
	
 
		
		Coche coche2 = new Coche(333);
		
		System.out.println("Coche 1 modelo : " + coche.modelo);		
		System.out.println("Coche 2 modelo : " + coche2.modelo);
		
		/* Cambiamos valor a la variable estatica */
		coche.modelo = "150";
		
		System.out.println("Coche 1 modelo : " + coche.modelo);		
		System.out.println("Coche 2 modelo : " + coche2.modelo);
	}
}
