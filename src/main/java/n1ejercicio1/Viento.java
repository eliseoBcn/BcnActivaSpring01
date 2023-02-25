package n1ejercicio1;

public class Viento  extends  Instrumento  {
	

	static {
		
		System.out.println("Mensaje del bloque static . Carga de la clase Viento ");
	}
	{
		System.out.println("Mensaje  bloque de inicializacion.  Ejecucion antes de la instancion del objeto Viento");
	
	}
	
    public Viento  (String nombre, Double precio ) { 
			 super(nombre,precio);
			 
			  } 
	   
	public void tocar() {
		  
		  System.out.println("Està sonant un instrument de vent");
	  };

}
