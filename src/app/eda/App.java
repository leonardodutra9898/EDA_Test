package app.eda;

import app.eda.string.substring.PadraoSubstring;

public class App {

	public static void main(String[] a) {
		
/* *************        1� QUEST�O	*****************************************/		
		
		/////////////// ENCADEAMENTO SEPARADO \\\\\\\\\\\

//		EncadeamentoSeparadoTest sChainning = new EncadeamentoSeparadoTest();
//		sChainning.encadeamentoSeparado();
		
		/////////////// SONDAGEM LINEAR \\\\\\\\\\\\\\\\\\
		
//		SondagemLinearTest sLinear = new SondagemLinearTest();
//		sLinear.sondagemLinearTest(9);
		
/* ****************************************************************************/

		
/* *************        3� QUEST�O	*****************************************/

String padrao = "y";
String txt = "kakas df ase wjj js leo ajka kjdasafs";
//
PadraoSubstring ps = new PadraoSubstring(padrao);
int offset = ps.search(txt);
//
System.out.println("Texto ==> " + txt);
System.out.println("OffSet ==> " + offset);

/* ****************************************************************************/
	}
	
}