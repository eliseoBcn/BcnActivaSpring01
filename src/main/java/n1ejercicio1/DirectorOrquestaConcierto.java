package n1ejercicio1;

public class DirectorOrquestaConcierto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/* Cargamos la clase y la instaciamos */
		
		Viento viento = new Viento("viento", 222.33);
		
		
		/*  Instanciamos la clase ya cargada  */
		Viento viento2  = new Viento("mozart", 2222.33);
		
		
		/* Al acceder a la variable estatica  cargamos la clase */
		
		Cuerda.cuerda++;
		
		Cuerda cuerda = new Cuerda("cuerda343", 7777.55);
		
		Percusion percusion = new Percusion("percusionmio", 444444.44);
		
		
		/*  Cada instrumento lo ponemos a tocar con su metodo correspondiente de la interface Instrumento */
		
		viento.tocar();
		cuerda.tocar();
		percusion.tocar();
		
	}

}
