package app.eda.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<I> implements Iterable<I>{

	private Node<I> first;
	private Node<I> last;
	private int n;
	
	
	private static class Node<I>{
		private I item;
		private Node<I> next;
	}
	
	public LinkedList() {
		first = null;
		last = null;
		n = 0;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public int size() {
		return n;
	}
	
	public void enqueue(I i) {
		Node<I> oldLast = last;
		last = new Node<I>();
		last.item = i;
		last.next = null;
		
			if(isEmpty())
				first = last;
			else
				oldLast.next = last;
		
		n++;
	}
	
	public void dequeue() {
		if(isEmpty())
			throw new NoSuchElementException();
		
		I i = first.item;
		
	}
	
	
	
	@Override
	public Iterator<I> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
