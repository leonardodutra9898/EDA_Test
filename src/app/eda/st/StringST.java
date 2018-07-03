package app.eda.st;

public class StringST<V> implements ST<String, V>{

	@Override
	public void put(String key, V value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public V get(String key) {
		// TODO Auto-generated method stub
		return null;
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
	
	public Iterable<String> keysWithPrefix(String s){
		return null;
	}
	
	public Iterable<String> keysThatMatch(String s){
		return null;
	}
	
	public String longestPrefixOf(String s) {
		return null;
	}

	@Override
	public Iterable<String> keys() {
		// TODO Auto-generated method stub
		return null;
	}

}
