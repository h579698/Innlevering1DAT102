package no.hvl.data102;

public interface CDarkivADT {
	//Returns an array of CDs
	public CD[] getCDArray();
	//Adds a new CD
	public void addCD(CD newCD);
	//Deletes a CD if it exists
	public boolean removeCD(int cdId);
	public CD[] searchTitle(String substring);
	//Searches and finds a CD if the inputted substring is a substring of Artists
	public CD[] searchArtist(String substring);
	 //Returns the number of CDs in the library/collection
	public int getSize();//
	 //Returns the size of the CDs in the library/collection by a given genre
	public int getSize(Genre genre);
	 
}
