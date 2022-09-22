package EjercicioJava789;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palabra ="hola mundo";
		System.out.println(reverse(palabra));
		
		String enteros[] = { "Paco", "Perez","Alvaro"};
		
		for (String nombre:enteros) {
			System.out.println(nombre);
		}
		
		int arraybidi[][] = {
			{1,2,3},{10, 20, 30}
		};
		
		for (int i= 0; i<arraybidi.length; i++) {
			
			for (int j=0; j<arraybidi[i].length; j++) {
				System.out.println("Estoy en  i= "+ i + ",  j= " + j + ". Valor= " + arraybidi[i][j] );
			}
		}
		
		Vector <Integer> vector = new Vector();
		
		vector.add(100);
		vector.add(200);
		vector.add(300);
		vector.add(400);
		vector.add(500);
		
		vector.remove(2);
		vector.remove(1);
		
		System.out.println(vector);
		
		//El problema de utilizar  un vector con capacidad por defecto y meterle 100 elementos es que 
		// se va a ir doblando la capacidad todo el tiempo mientras no pueda entrar ningun dato por lo que vamos 
		//a tener un vector con una capacidad mucho mayor que la que se va a utilizar en realidad

		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Elemento 1");
		lista.add("Elemento 2");
		lista.add("Elemento 3");
		lista.add("Elemento 4");
		
		LinkedList<String> listaEnlazada= new LinkedList<String>(lista);
		
		System.out.println("ArrayList: " + lista);
		System.out.println("LinkedList: " + listaEnlazada);
		
		ArrayList<Integer> lista2= new ArrayList<Integer>();
		for (int i =1; i<=10; i++) {
			lista2.add(i);
		}
		
		for (int i =0; i<lista2.size(); i++) {
			System.out.println(lista2.get(i));
			if (lista2.get(i)%2 ==0) {
				System.out.println(lista2.get(i));
				lista2.remove(i);
			}
		}
		System.out.println("La nueva ArrayList es: " + lista2);
		
		try {
			DividePorCero(5, 0);
		}catch(ArithmeticException e) {
			System.out.println("Esto no se puede hacer");
		}
		
	}
	
	public static String reverse(String texto) {
		
		String textorev="";
		
		for (int i=texto.length()-1; i>=0;i--){
			textorev=textorev+texto.charAt(i);
		}
		
		return textorev;
	}
	
	public static void DividePorCero(int a, int b) throws ArithmeticException {
		
		int resultado ;
		try {
			resultado= a/b;
		}catch (ArithmeticException e) {
			throw new ArithmeticException();
		}
		System.out.println("Demo de codigo");
	}
	

		
}
