package no.hvl.data102;

import no.hvl.data102.CircularQueue;

public class ClientQueue{
	public static void main(String[] args) {
		
		CircularQueue<Character> symbolQueue = new CircularQueue<Character>();

		String string = " Denne 'queue' er en FIFO datastruktur.";
		int lengde = string.length();

		for (int i = 0; i < lengde; i++) {
			symbolQueue.enqueue(new Character(string.charAt(i)));
		}
		while (!symbolQueue.isEmpty()) {
			Character tegn_obj = (Character) symbolQueue.dequeue();
			System.out.print(tegn_obj);
		}

	}

}// class
