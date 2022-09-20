package EjercicioJava4;

public class SmartWatch extends SmartDevice {

	double tamCorrea;
	String modelo;
	
	
	public SmartWatch() {
	}


	public SmartWatch(int bateria, String marca, double tamCorrea, String modelo) {
		super(bateria, marca);
		this.tamCorrea= tamCorrea;
		this.modelo=modelo;
		// TODO Auto-generated constructor stub
	}
	
	
	
}
