package app.eda;

import java.util.Scanner;

import app.eda.hash.SeparateChainingHashST;

public class App {

	public static void main(String[] a) {
		System.out.println("Inicializado...");
		System.out.println("Testando HASH");
		System.out.println("1. Testando Encadeamento Separado");
		
		SeparateChainingHashST<Integer, Integer> st = new SeparateChainingHashST<Integer, Integer>(5);
		Scanner in = new Scanner(System.in);
		int i = 0, opcao = 0;

		do {
			
			System.out.println("Digite 1 para adicionar itens");
			System.out.println("Digite 2 para mostrá-los");
			
			opcao = in.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Digite qualquer tecla para iniciar: (sair para finalizar o loop)");
				
//					for(i = 0; in.hasNext(); i++) {
					while(in.nextInt()!=-1) {
						System.out.println("Digite valores: ");
						Integer key = in.nextInt();
						
						st.put(key, ++i);
						st.hashCode();
					}
					break;
			case 2:
				System.out.println("Mostrando valores...");
//				for(int j = 0; j <= st.size(); j++) {
//					System.out.println("Valores => " + st.get(j));
//				}
				
					for(Integer as : st.keys()) {
						System.out.println("Dado => " + as);
					}
				
				break;
			}			


		}while(in.hasNext());
		
//		in.close();		
	}
	
}