package app.eda;

import java.util.Scanner;

import app.eda.hash.SeparateChainingHashST;

public class App {

	public static void main(String[] a) {
		System.out.println("Inicializado...");
		System.out.println("Testando HASH");
		System.out.println("1. Testando Encadeamento Separado");
		
		SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<String, Integer>(5);
		Scanner in = new Scanner(System.in);
		
		
			for(int i = 0; in.hasNext(); i++) {
				System.out.println("Digite algo para entrada");
				String key = in.nextLine();
				st.put(key, i);
			}
		in.close();
	}
	
}
