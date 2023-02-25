package n1ejercicio1;

public class Viento implements  Instrumento  {
	

	static {
		
		System.out.println("Mensaje del bloque static . Carga de la clase Viento ");
	}
	{
		System.out.println("Mensaje  bloque de inicializacion.  Ejecucion antes de la instancion del objeto Viento");
	
	}
	public void tocar() {
		  
		  System.out.println("Està sonant un instrument de vent");
	  };

}
