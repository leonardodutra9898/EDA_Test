package app.eda.hash;

import java.util.Scanner;

import app.eda.hash.strategy.LinearProbingHashST;

public class SondagemLinear {

	public void sondagemLinearTest(int m) {
		
		LinearProbingHashST<Integer, Integer> linearP = new LinearProbingHashST<Integer, Integer>(m);
		Scanner in = new Scanner(System.in);
		
		int opcao = 0;
		boolean verificador = true;
		
		do {
		
			System.out.println("Digite uma opção para o Menu");
			System.out.println("1 => Adicionar itens");
			System.out.println("2 => Listar itens");
			
			opcao = in.nextInt();

			switch(opcao) {
			case 1:
				for(int i = 0; i < m; i++) {
					System.out.println("Digite uma chave como inteiro");
					Integer k = in.nextInt();
					
					linearP.put(k, i);
//					System.out.println("Item add.");
				}
				break;
			case 2:
				System.out.println("Vazio ? = " + linearP.isEmpty() + ", total de " + linearP.size());
				for(Integer vs : linearP.keys()) {
					System.out.println("ver ==> " + vs + " -- hash => " + vs.hashCode());
				}
				break;
			}
			
		}while(verificador);
		
		in.close();
	}
	
}
