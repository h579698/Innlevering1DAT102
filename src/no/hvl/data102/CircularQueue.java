package no.hvl.data102;

import no.hvl.data102.EmptyCollectionException;

public class CircularQueue<T> implements QueueADT<T>{
	private final static int START_CAPACITY = 100;
	private int front, back, size;
	private T[] queue;
	//creates an empty queue with a specified length
	public CircularQueue(int capacity) {
		front = back = size = 0;
		queue = (T[]) (new Object[capacity]);
	}
	//Creates an empty queue
	public CircularQueue() {
		this(START_CAPACITY);
	}
	//Adds the specified element to the top of the queue.
	// Extends the capacity for queue if the exisiting capacity is reached.
	public void enqueue(T element) {
		if(size() == queue.length) {
			extend();
		}
		queue[back] = element;
		back = (back+1) % queue.length;
		size++;
	}
	//	Removes the top element and adds a reference to it
	public T dequeue() throws EmptyCollectionException{
		if (isEmpty()) {
			throw new EmptyCollectionException("queue");
		}
		T result = queue[front];
		queue[front] = null;
		front = (front+1) % queue.length;
		size--;

		return result;
	}
	//Returns the topelement without removing it, if queue is empty -> null
	public T first() throws EmptyCollectionException{
		if (isEmpty())
			throw new EmptyCollectionException("queue");

		return queue[front];
	}
	//Returns if the queue is empty, true is empty
	public boolean isEmpty() {
		return (size == 0);
	}
	//Returns size elements.
	public int size() {
		return size;
	}
	//Creates a new array to save the contents of the previous array, with an extended capacity
	private void extend() {
		T[] larger = (T[])(new Object[queue.length*2]);

		for (int i=0; i<size; i++) {
			larger[i] = queue[front];
			front = (front + 1) % queue.length;
		}
		front = 0;
		back = size;
		queue = larger;
	}

}
