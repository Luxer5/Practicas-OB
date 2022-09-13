
public class EjericioT8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona persona1= new Persona();
		
		persona1.setEdad(45);
		persona1.setNombre("Paco");
		persona1.setTelefono(589641235);
		
		System.out.println("Nombre: "+persona1.getNombre());
		System.out.println("Edad: "+persona1.getEdad());
		System.out.println("Telefono: "+persona1.getTelefono());
	}
	
	 
}

class Persona {
	
	private int edad;
	private String nombre;
	private int telefono;
	
	
	public void setEdad(int edad) {
		this.edad= edad;
	}
	
	public int getEdad() {
		return this.edad;
	}
	public void setNombre(String nombre) {
		this.nombre= nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setTelefono(int telefono) {
		this.telefono= telefono;
	}
	
	public int getTelefono() {
		return this.telefono;
	}
}