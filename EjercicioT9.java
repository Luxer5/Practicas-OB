
public class EjercicioT9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cliente cliente1 = new cliente();
		cliente1.edad=25;
		cliente1.nombre= "Pedro";
		cliente1.telefono= 123456;
		cliente1.setCredito(1000);
		
		trabajador trab1 = new trabajador();
		trab1.edad=36;
		trab1.nombre= "Mario";
		trab1.telefono= 654321;
		trab1.setSalario(2000);
		
		System.out.println("El clinete se llama: " + cliente1.nombre);
		System.out.println("Edad: " + cliente1.edad);
		System.out.println("Numero de telefono : " + cliente1.telefono);
		System.out.println("Su credito es : " + cliente1.getCredito());
		
		System.out.println("El trabajador se llama: " + trab1.nombre);
		System.out.println("Edad: " + trab1.edad);
		System.out.println("Numero de telefono : " + trab1.telefono);
		System.out.println("Su salario es: " + trab1.getSalario());
	}

}

 class persona{
	public int edad;
	public String nombre;
	public int telefono;
	
	
}

class cliente extends persona{
	private int credito;
	
	public void setCredito(int credito) {
		this.credito= credito;
	}
	
	public int getCredito() {
		return this.credito;
	}
}

class trabajador extends persona{
	private int salario;
	
	public void setSalario(int salario) {
		this.salario= salario;
	}
	
	public int getSalario() {
		return this.salario;
	}
}
