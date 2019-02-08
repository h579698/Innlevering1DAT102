package no.hvl.data102;
import no.hvl.data102.CDarkivADT;

public class CDarkiv2 implements CDarkivADT{
	private int size;
	private LinearNode<CD> start;

	public CDarkiv2 () {
		start = null;
		size = 0;
	}
	@Override
	public CD[] getCDArray() {
		CD[] tab = new CD[size];
		LinearNode <CD> temp = start;
		
		for(int i = 0; i < size; i++) {
			tab[i] = temp.getElement();
			temp = temp.getNext();
		}
		return tab;
	}
	@Override
	public void addCD(CD newCd) {
		LinearNode <CD> temp = new LinearNode<CD>(newCd);
		temp.setNext(start);
		start = temp;
		size++;
	}
	@Override //POP
	public boolean removeCD(int cdId) {
		if(empty()) {
			return false;
		} else if(start.getElement().getCdId() == cdId) {
			start = start.getNext();
			size--;
			return true;
		}
		LinearNode<CD> temp = start.getNext();
		LinearNode<CD> prev = start;
		boolean deleted = false;
		while((temp != null)&& !deleted) {
			if(temp.getElement().getCdId() == cdId) {
				prev.setNext(temp.getNext());
				size--;
				deleted = true;
			} else {
				prev = temp;
				temp = temp.getNext();
			}
		}
		return deleted;
	}
	@Override
	public CD[] searchTitle(String substring) {
		CD[] tab = new CD[size];
		int ind = 0;
		LinearNode<CD> temp = start;
		for(int i = 0; i < size; i++) {
			if(temp.getElement().getTitle().contains(substring)) {
				tab[ind] = temp.getElement();
				ind++;
			}
			temp = temp.getNext();
		}
		return tab;
	}
	@Override
	public CD[] searchArtist(String substring) {
		CD[] tab = new CD[size];
		int ind = 0;
		LinearNode<CD> temp = start;
		for(int i = 0; i < size; i++) {
			if(temp.getElement().getArtist().contains(substring)) {
				tab[ind] = temp.getElement();
				ind++;
			}
			temp = temp.getNext();
		}
		return tab;
	}
	@Override
	public int getSize() {
		return size;
	}
	 @Override
	public int getSize(Genre genre) {
		 LinearNode<CD> temp = start;
		 int sizeGenres = 0;
		 for(int i = 0; i < size; i++) {
			 if(temp.getElement().getGenre() == genre) {
				 sizeGenres++;
			 }
			 temp = temp.getNext();
		 }
			return sizeGenres;
	 }

	 public boolean empty() {
		 return (size == 0);
	 }
	 
}
