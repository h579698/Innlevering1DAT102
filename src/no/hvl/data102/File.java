package no.hvl.data102;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;


public class File {
	static final String SPLIT = "#";
	//Allows us to read a saved CDArkiv from a textfile
	public void readFromFile(CDarkivADT cdarkiv, String filename){
		try {
			Scanner sc = new Scanner(new FileReader(filename));
			int size = Integer.parseInt(sc.nextLine());
			
			for(int i = 0; i < size; i++) {
				String [] array = sc.nextLine().split(SPLIT);
				int cdId = Integer.parseInt(array[0]);
				String artist = array[1];
				String title = array[2];
				int year = Integer.parseInt(array[3]);
				String publ = array[4];
				Genre genre = Genre.findGenre(array[5]);

				cdarkiv.addCD(new CD(cdId, artist, title, year, publ, genre));
			}
			sc.close();
		} 
		catch(FileNotFoundException e) {
			System.out.println("Finner ikke filen: " + e);
		}
	}
		 
	// Save a 'CDArkiv'array to file
	public void saveToFile(CDarkivADT cdarkiv, String filename){
		try {
			//0 henter size cd og infoene i cd.
			int size = cdarkiv.getSize();
			//1 filewriter
			FileWriter cdFile = new FileWriter(filename);
			//2 PrintWriter
			PrintWriter output = new PrintWriter(cdFile);
			//3 skriver ut size cd-info på den første linjen.
			output.println(cdarkiv.getSize());
			//4 skriv postene array for array
			for(int i = 0; i < size; i++) {
				CD cd = cdArray[i]; //går gjennom alle CD og skriver ut 
				output.print(cd.getCdId());
				output.print(SPLIT);
				output.print(cd.getArtist());
				output.print(SPLIT);
				output.print(cd.getTitle());
				output.print(SPLIT);
				output.print(cd.getYear());
				output.print(SPLIT);
				output.print(cd.getGenre());
				output.print(SPLIT);
				output.println(cd.getPubl());	
			}
			output.close();
		}
		catch (IOException e){
			System.out.println("Feil ved skriving til fil: " + e);
			System.exit(0);
		}
		
	} 
	
}
