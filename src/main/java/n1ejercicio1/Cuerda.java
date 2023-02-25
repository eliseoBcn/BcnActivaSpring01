package n1ejercicio1;

public class Cuerda implements  Instrumento  {
	
	public static int  cuerda = 0; 
	
	static {
		
		System.out.println("Mensaje del bloque static . Carga de la clase Cuerda ");
	}
	  public void tocar() {
		  
		  System.out.println("Està sonant un instrument de corda");
	  };
}
