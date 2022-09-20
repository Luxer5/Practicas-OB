package EjercicioJava4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone galaxy22= new SmartPhone(5000, "Samsung", 6.7, "Galaxy 22");
		SmartWatch watch5= new SmartWatch(500, "Huawei", 22.5, "Watch 5");
		System.out.println(galaxy22);
		
		System.out.println("Marca movil: "+ galaxy22.marca);
		System.out.println("Bateria: " + galaxy22.bateria);
		System.out.println("Pantalla: "+galaxy22.tamPantalla);
		System.out.println("Modelo: "+galaxy22.modelo);
		
		System.out.println("Marca reloj: " + watch5.marca);
		System.out.println("Bateria: "+ watch5.bateria);
		System.out.println("Correa: "+watch5.tamCorrea);
		System.out.println("Modelo: "+watch5.modelo);
		
		
		
	}

	

}

