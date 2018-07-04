package app.eda.tries;

import app.eda.st.StringST;

public class TrieST<V> implements StringST<V> {

	private final static int R = 256;
	private Node root = new Node();
	
	private static class Node{
		private Object val;
		private Node[] next = new Node[R];
	}
	
	@Override
	public void put(String key, V value) {
		root = put(root, key, value, 0);
	}
	
	private Node put(Node x, String key, V value, int d) {
		if(x == null)
			x = new Node();
		
		if(d == key.length()) {
			x.val = value;
			return x;
		}
		
		char c = key.charAt(d);
		
		
	}

	@Override
	public V get(String key) {
		Node x = get(root, key, 0);
		if(x == null) return null;
		return (V) x.val;
	}

	private Node get(Node x, String key, int d) {
		if(x == null) 
			return null;
		
		if(d == key.length())
			return x;
		
		char c = key.charAt(d);
		return get(x.next[c], key, d+1);
	}
	
	@Override
	public boolean contains(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void delete(String key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterable<String> keys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<String> keysWithPrefix(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<String> keysThatMatch(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String longestPrefixOf(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}
