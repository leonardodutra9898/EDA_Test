package app.eda.st;

public interface StringST<V> extends ST<String, V>{
	
	Iterable<String> keysWithPrefix(String s);
	Iterable<String> keysThatMatch(String s);	
	String longestPrefixOf(String s);
	
}
