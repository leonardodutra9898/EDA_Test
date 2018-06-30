package app.eda.hash.strategy;


import app.eda.st.ST;
import app.eda.util.Queue;

public class SeparateChainingHashST<K,V> implements ST<K,V>{

	private int m;
	private Node[] vector;
	private int n; // número de pares chaves-valores
	
	private static class Node{
		private Object key;
		private Object value;
		private Node next;
		
		public Node(Object key, Object value, Node next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	
	public SeparateChainingHashST(int m) {
		this.m = m;
		vector = new Node[m];
	}
	
	private int hash(K key) {
		return (key.hashCode() & 0x7fffffff) % m;
	}
	
	@Override
	public void put(K key, V value) {
		if(value == null) {
			delete(key);
			return;
		}
		
		int i = hash(key);
		for(Node x = vector[i]; x != null; x = x.next) {
			if(key.equals(x.key)) {
				x.value = value;
				return;
			}
		}
		n++;
		vector[i] = new Node(key, value, vector[i]);
		System.out.println("Item add into list");
	}

	@Override
	public V get(K key) {
		int i = hash(key);
		for(Node x = vector[i]; x != null; x = x.next) {
			if(key.equals(x.key))
				return (V)x.value;
		}
		return null;
	}

	@Override
	public boolean contains(K key) {
		return get(key) != null;
	}

	@Override
	public void delete(K key) {
		if(key == null) throw new IllegalArgumentException("Valor nulo para deletar");
		
		if(get(key) != null) {
			n--;
			
		}
	}

	private Node delete(Node x, K key) {
		if(x == null) return null;
		if(key.equals(x.key)) {
			n--;
			return x.next;
		}
		x.next = delete(x.next, key);
		return x;
	}
	
	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public int size() {
		return n;
	}

	@Override
	public Iterable<K> keys() {
		Queue<K> q = new Queue<K>();
		
			for(int i = 0; i < m; i++) {
				for(Node x = vector[i]; x != null; x = x.next) {
					q.enqueue((K)x.key);
				}
			}
		
		return q;
	}

}
