package app.eda;

import app.eda.hash.EncadeamentoSeparadoTest;
import app.eda.hash.SondagemLinear;

public class App {

	public static void main(String[] a) {
		
		/////////////// ENCADEAMENTO SEPARADO \\\\\\\\\\\

//		EncadeamentoSeparadoTest sChainning = new EncadeamentoSeparadoTest();
//		sChainning.encadeamentoSeparado();
		
		/////////////// SONDAGEM LINEAR \\\\\\\\\\\\\\\\\\
		
		SondagemLinear sLinear = new SondagemLinear();
		sLinear.sondagemLinearTest(9);
		
		
	}
	
}