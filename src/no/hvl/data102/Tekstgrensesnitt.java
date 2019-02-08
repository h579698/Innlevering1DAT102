package no.hvl.data102;

import java.util.Scanner;

public class Tekstgrensesnitt {
	Scanner sc = new Scanner(System.in);
	// lese opplysningene om en CD fra tastatur
	 public CD readCD() {
//		Scanner sc = new Scanner(System.in);
		
		System.out.println("Skriv inn CD-nummer");
		int cdId = sc.nextInt();
		sc.nextLine();
		System.out.println("Skriv inn artist");
		String artist = sc.nextLine();
		System.out.println("Skriv inn tittel");
		String title = sc.nextLine();
		System.out.println("Skriv inn årstall");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.println("Skriv inn sjanger");
		Genre genre = Genre.findGenre(sc.nextLine());
		System.out.println("Skriv inn plateselskap");
		String publ = sc.nextLine();	
		
		return (new CD(
				cdId, 
				artist, 
				title, 
				year, 
				publ,
				genre));
	 }
	 
	// vise en CD med alle opplysninger på skjerm (husk tekst for sjanger)
	 public void visCD(CD cd) {
		 System.out.println(cd.toString());
	 }
	 
	// Skrive ut alle CD-er med en spesiell substring i tittelen
	 public void skrivUtCdDelstrengITittel(CDarkivADT cda, String substring) {
		 CD[] subTitle = cda.searchTitle(substring);
		 for(int i = 0; i < subTitle.length; i++) {
			 System.out.println(subTitle[i].getTitle());
		 }
	 }
	 
	// Skriver ut alle CD-er av en artist / en gruppe
	 public void skrivUtCdArtist(CDarkivADT cda, String substring) {
		 CD[] subArt = cda.searchTitle(substring);
		 for(int i = 0; i < subArt.length; i++) {
			 System.out.println(subArt[i].getArtist());
		 }
	 }
	 
	// Skrive ut en enkel statistikk som inneholder antall CD-er totalt
	// og hvor mange det er i hver sjanger
	 public void skrivUtStatistikk(CDarkivADT cda){
		 System.out.println("Antall CD'er per sjanger");
		 for(Genre s : Genre.values()) {
			 System.out.println(s.toString() + ": " + cda.getSize(s));
		 }
	 }
	//… Ev. andre metoder
}
