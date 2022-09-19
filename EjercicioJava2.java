
public class EjercicioJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("El precio con iva es: ");
		System.out.println(getPrecioIVA(100));
		
	}

	
	static double getPrecioIVA(double precio) {
		double iva= 1.21;
		return precio*iva;
	}
}
