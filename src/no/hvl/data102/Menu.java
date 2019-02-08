package no.hvl.data102;

public class Menu {
	private Tekstgrensesnitt text;
	private CDarkivADT cda;
	
	public Menu(CDarkivADT cda) {
		text = new Tekstgrensesnitt();
		this.cda = cda;
	}
	
	public void start() {
		
	}
}