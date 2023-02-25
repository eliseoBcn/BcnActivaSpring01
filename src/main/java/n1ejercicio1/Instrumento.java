package n1ejercicio1;

public abstract  class  Instrumento {
		private String nombre = null;
		private Double precio = null;
		
	   public Instrumento (String nombre, Double precio ) { 
		   
		   this.nombre = nombre;
		   this.precio = precio;
		  } 
  public abstract  void tocar();
}
