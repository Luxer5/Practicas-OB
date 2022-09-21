package EjercicioJava789;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palabra ="hola mundo";
		System.out.println(reverse(palabra));
	}
	
	public static String reverse(String texto) {
		
		String textorev="";
		
		for (int i=texto.length()-1; i>=0;i--){
			textorev=textorev+texto.charAt(i);
		}
		
		return textorev;
	}

}
