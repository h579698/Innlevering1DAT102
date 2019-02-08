package no.hvl.data102;

import no.hvl.data102.CD;
import no.hvl.data102.Genre;
import no.hvl.data102.CDarkivADT;

public class CDarkiv implements CDarkivADT{
//[]
//{}
	private CD[] cdArray;
	private int size;
	private final int INITIALVALUE = 10; 
	
	public CDarkiv(){
		cdArray = new CD[INITIALVALUE];
		size = 0;
	}  
	
	@Override
	public CD[] getCDArray(){
		return cdArray;
	}
	
	@Override
	//Adds a CD to the database 
	public void addCD(CD newCD){
		if(size==cdArray.length) {
			expandArray();
		}
		cdArray[size] = newCD;
		size++;
	}
	@Override
	//Removes a CD from the database
	public boolean removeCD(int cdId){
		boolean deleted = false;
		for(int i=0; i<size; i++) {
			if(cdArray[i].getCdId() == cdId) {
				cdArray[cdId] = cdArray[size-1];
				cdArray[size]=null;
				size--;
			}
		}
		return deleted;
	}
	@Override
	//Returns a CD given that the inputed string is a substring
	public CD[] searchTitle(String substring){
		CD[] temp = new CD[cdArray.length];
		int size = 0;
		for(int i=0; i<size; i++){
			if(cdArray[i].getTitle().contains(substring)) {
				temp[size] = cdArray[i];
			}
		}
		return temp;
	}
	@Override
	//Returns artists with the given Singtring being a substring
	public CD[] searchArtist(String substring){
		CD[] temp = new CD[cdArray.length];
		int size = 0;
		for(int i=0; i<size; i++){
			if(cdArray[i].getArtist().contains(substring)) {
				temp[size] = cdArray[i];
			}
		}
		return temp;
	}
	@Override
	//Returns an integer with the amount of CDs
	public int getSize(){
		return size;
		
	}
	@Override
	 // Returns the amount of CDs by a given genre
	public int getSize(Genre genre) {
		int genres = 0;
		for(int i = 0; i < size; i++) {
			if(cdArray[i].getGenre() == genre) {
				genres++;
			}
		}
		return genres;
	}
	//Extends the capacity of the library
	private void expandArray() { 
		CD[] tempStorage = new CD[(int)Math.ceil(1.3 * cdArray.length)];
		for (int i = 0; i < size; i++){
			tempStorage[i] = cdArray[i];
		}
		cdArray = tempStorage;
	}
	
}
