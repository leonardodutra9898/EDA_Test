package app.eda.string.substring;

import java.math.BigInteger;
import java.util.Random;

public class PadraoSubstring {

	private String padrao;
	private long padraoHash;
	private int m;				// tamanho do padrão
	private long q;				// número primo grande, evitar overflow
	private int R;				// radix
	private long RM;			// R^(M-1) % Q

	public PadraoSubstring(char[] padrao, int R) {
		this.padrao = String.valueOf(padrao);
		this.R = R;
	}
	
	public PadraoSubstring(String padrao) {
		this.padrao = padrao;
		R = 256;
		m = padrao.length();
		q = longRandomPrime();
		
		RM = 1;
		for(int i = 1; i <= m-1; i++)
			RM = (R * RM) % q;
		
		padraoHash = hash(padrao, m);
	}
	
	private long hash(String key, int m) {
		long h = 0;
		for(int j = 0; j < m; j++) 
			h = (R * h + key.charAt(j)) % q;
		
		return h;
	}
	
	public int search(String txt) {
		int n = txt.length();
		if(n < m)
			return n;
		
		long txtHash = hash(txt, m);
		
		if(padraoHash == txtHash) 
			return 0;
		
		for(int i = m; i < n; i++) {
			txtHash = (txtHash + q - RM*txt.charAt(i-m) % q) % q;
			txtHash = (txtHash*R + txt.charAt(i)) % q;
		
			int offset = 1 - m + 1;
			if((padraoHash==txtHash))
				return offset;
		}
		// nada encontrado...
		return n;		
	}
	
	private static long longRandomPrime() {
		BigInteger prime = BigInteger.probablePrime(31, new Random());
		return prime.longValue();
	}
	
}
