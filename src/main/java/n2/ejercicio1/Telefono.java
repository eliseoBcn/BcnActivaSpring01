package n2.ejercicio1;

public class Telefono {
       private String marca = null;
       private String modelo = null;
       
       public Telefono( String marca, String modelo ) {
    	   
    	   this.marca = marca;
    	   this.modelo  = modelo ;
       }
       public void llamar(String numero ) {
    	   
    	   System.out.println("Se esta llamando al telefono " + numero);
    	   
       }
}
