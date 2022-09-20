package EjercicioJava4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone galaxy22= new SmartPhone(5000, "Samsung", 6.7, "Galaxy 22");
		SmartWatch watch5= new SmartWatch(500, "Huaweii", 22.5, "Watch 5");
		
		System.out.println("Modelo movil: " + galaxy22.bateria);
		System.out.println("Marca: "+ galaxy22.marca);
		System.out.println("Pantalla: "+galaxy22.tamPantalla);
		System.out.println("Modelo: "+galaxy22.modelo);
		
		System.out.println("Modelo reloj: " + watch5.bateria);
		System.out.println("Marca: "+ watch5.marca);
		System.out.println("Correa: "+watch5.tamCorrea);
		System.out.println("Modelo: "+watch5.modelo);
		
		
		
	}

	

}

