package app.eda.hash;

import java.util.Scanner;

import app.eda.hash.strategy.SeparateChainingHashST;

public class EncadeamentoSeparadoTest {

	public void encadeamentoSeparado() {
		/////////////// ENCADEAMENTO SEPARADO \\\\\\\\\\\\\\\\\\
		
		System.out.println("Inicializado...");
		System.out.println("Testando HASH");
		System.out.println("1. Testando Encadeamento Separado");
		
		SeparateChainingHashST<Integer, Integer> st = new SeparateChainingHashST<Integer, Integer>(9);
		Scanner in = new Scanner(System.in);
		int i = 0, opcao = 0;
		boolean verificador = true;

		do {
			
			System.out.println("Digite 1 para adicionar itens");
			System.out.println("Digite 2 para mostrá-los");
			System.out.println("Digite 3 para finalizar tudo");
			
			opcao = in.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Digite 0 para iniciar: (-1 para finalizar o loop)");
				
//					for(i = 0; in.hasNext(); i++) {
					while(in.nextInt()!=-1) {
						System.out.println("Digite valores: ");
						Integer key = in.nextInt();
						
						st.put(key, ++i);
						System.out.println("a == > " + st.hashCode());
						System.out.println("Digite -1 para voltar ao menu: ");
					}
					break;
			case 2:
				System.out.println("Mostrando valores...");
					for(Integer as : st.keys()) {
						System.out.println("Dado => " + as + ", hash == " + as.hashCode());
					}
				
				break;
			case 3:
				verificador = false;
				break;
			}			


		}while(verificador);
	}
	
}
