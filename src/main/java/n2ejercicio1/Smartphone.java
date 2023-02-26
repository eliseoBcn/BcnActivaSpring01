package n2ejercicio1;

public class Smartphone  extends Telefono implements Camara, Reloj {

	public Smartphone(String marca, String modelo) {
		super(marca, modelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void alarma() {
		// TODO Auto-generated method stub
		System.out.println("Està sonant l’alarm");
	}

	@Override
	public void fotografiar() {
		// TODO Auto-generated method stub
		System.out.println("S’està fent una foto");
	}

}
