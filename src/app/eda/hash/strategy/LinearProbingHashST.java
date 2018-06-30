package app.eda.hash.strategy;

import app.eda.st.ST;
import app.eda.util.Queue;

public class LinearProbingHashST<K, V> implements ST<K, V>{

	private int n;
	private int m = 16;
	private K[] keys;
	private V[] values;

	
	public LinearProbingHashST(int m) {
		this.m = m;
		n = 0;
		
		keys = (K[]) new Object[m];
		values = (V[]) new Object[m];
	}
	
    private int hash(K key) {
        return (key.hashCode() & 0x7fffffff) % m;
    }
	
	private void resize(int m) {
		LinearProbingHashST<K,V> temp = new LinearProbingHashST<K, V>(m);
		
			for(int i = 0; i < m; i++) {
				if(keys[i] != null) {
					temp.put(keys[i], values[i]);
				}
			}
			
			keys = temp.keys;
			values = temp.values;
			m = temp.m;
		
	}
    
    
	@Override
	public void put(K key, V value) {
		
		if(n >= m/2) 
			resize(2*m);
		
		int i;
		for(i = hash(key); keys[i] != null; i = (i + 1) % m) {
			if(keys[i].equals(key)) {
				values[i] = value;
				return;
			}
		}
		
		keys[i] = key;
		values[i] = value;
		System.out.println("Add into list Hash=" + i + " K=" + keys[i] + ", V=" + values[i]);
		n++;
	}

	@Override
	public void delete(K key) {
		if(!contains(key))
			return;
		
		int i = hash(key);
		while(!key.equals(keys[i])) {
			i = (i + 1) % m;
		}
			
		keys[i] = null;
		values[i] = null;
		
		i = (i + 1) % m;
		while(keys[i] != null) {
			K keyToRehash = keys[i];
			V valueToRehash = values[i];
			keys[i] = null;
			values[i] = null;
			n--;
			put(keyToRehash, valueToRehash);
			i = (i + 1) % m;
		}
		
		n--;
		
		if((n > 0) && (n <= m/8))
			resize(m/2);
	}
	
	
	@Override
	public V get(K key) {
		for(int i = hash(key); keys[i] != null; i = (i + 1) % m) {
			if(keys[i].equals(key)) {
				return values[i];
			}
		}
		return null;
	}

	@Override
	public boolean contains(K key) {
		if(key == null)
			throw new IllegalArgumentException("Nulo...");
		
		return get(key) != null;
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
	       Queue<K> queue = new Queue<K>();
	        for (int i = 0; i < m; i++) {
	            if (keys[i] != null) 
	            	queue.enqueue(keys[i]);
	        }
	        return queue;
	}

}
