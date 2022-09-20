package EjercicioJava5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CocheCRUD cocheCRUD = new cocheCRUDImpl();
		
		cocheCRUD.save();
		cocheCRUD.findAll();
		cocheCRUD.delete();
		
	}

}
