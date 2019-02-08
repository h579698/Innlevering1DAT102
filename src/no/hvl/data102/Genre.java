package no.hvl.data102;
import no.hvl.data102.Genre;

public enum Genre {
	POP(1), ROCK(2), OPERA(3), KLASSISK(4);
	
	private int num;

	private Genre(int n) {
		this.num = n;
	}

	public int getNr() {
		return num;
	}
	
	public static Genre findGenre(String name) {
		Genre genre = null; 
		for(Genre genreName : Genre.values() ) {
			if(genreName.toString().equals(name.toUpperCase())) {
				genre = genreName;
			}
		}
		return genre;
	}
	
}
