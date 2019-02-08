package no.hvl.data102;

import no.hvl.data102.EmptyCollectionException;

public interface QueueADT<Character>{
	public void enqueue (Character element);
	public Character dequeue() throws EmptyCollectionException;
	public Character first() throws EmptyCollectionException;
	public boolean isEmpty();
	public int size();
}
