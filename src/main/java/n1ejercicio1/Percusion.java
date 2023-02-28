package n1ejercicio1;

public class Percusion  extends Instrumento  {
	
	
	   public Percusion (String nombre, Double precio ) { 
			 super(nombre,precio);
			 
	  } 
	   @Override 
	   public void tocar() {
		  
		  System.out.println("Està sonant un instrument de percussio");
	  };
}
