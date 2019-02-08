package no.hvl.data102;

public abstract class CD {

	private int cdId; // Unique ID
	private String artist; //Artist
	private String title; //CD title
	private int year; //Release year
	private Genre genre; //CD Genre
	private String publ; // Record Label
	
	public CD(){
		this(0,"","",0,"", null);
	}
	
	public CD(int cdId, String artist, String title, int year, String publ, Genre genre){
		this.cdId = cdId;
		this.artist = artist;
		this.title = title;
		this.year = year;
		this. publ = publ;
		this.genre = genre;	
	}
	
	public Genre getGenre() {
		return genre;
	}
		
	public int getCdId() {
		return cdId;
	}

	public void setCdId(int cdId) {
		this.cdId = cdId;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	public String getPubl() {
		return publ;
	}

	public void setPubl(String publ) {
		this.publ = publ;
	}
	//Todo
	@Override
	public String toString() {
		return "Artist: " + artist + "\nTittel: " + title + 
				"\nLangseringsår: " + year + "\nPlateselskap: " + publ + 
				"\nSjanger: " + genre +"";
	}
}
