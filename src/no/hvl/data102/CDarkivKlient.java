package no.hvl.data102;

public class CDarkivKlient {
	public static void main(String[] args) {
		CDarkivADT cda = new CDarkiv2();
		Menu menu = new Menu(cda);
		menu.start();
	}
}
