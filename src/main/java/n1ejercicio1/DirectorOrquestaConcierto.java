package n1ejercicio1;

public class DirectorOrquestaConcierto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/* Cargamos la clase y la instaciamos */
		
		Viento viento = new Viento();
		
		
		/*  Instanciamos la clase ya cargada  */
		Viento viento2  = new Viento();
		
		
		/* Al acceder a la variable estatica  cargamos la clase */
		
		Cuerda.cuerda++;
		
		Cuerda cuerda = new Cuerda();
		
		Percusion percusion = new Percusion();
		
		
		/*  Cada instrumento lo ponemos a tocar con su metodo correspondiente de la interface Instrumento */
		
		viento.tocar();
		cuerda.tocar();
		percusion.tocar();
		
	}

}
