package EjercicioJava4;

public class SmartPhone extends SmartDevice {

	double tamPantalla;
	String modelo;
	
	
	
	public SmartPhone() {
	}



	public SmartPhone(int bateria, String marca, double tamPantalla, String modelo) {
		super(bateria, marca);
		this.tamPantalla= tamPantalla;
		this.modelo=modelo;
		
	}

	
	
}
