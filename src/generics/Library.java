package generics;

import java.util.ArrayList;

public class Library <T,U,V> {
	
	ArrayList<T> book = new ArrayList<>();
	ArrayList<U> video = new ArrayList<>();
	ArrayList<V> newspaper = new ArrayList<>();
	
	public Library(ArrayList<T> book, ArrayList<U> video, ArrayList<V> newspaper) {
		super();
		this.book = book;
		this.video = video;
		this.newspaper = newspaper;
	}
	


	public ArrayList<T> getBook() {
		return book;
	}

	public ArrayList<U> getVideo() {
		return video;
	}


	public ArrayList<V> getNewspaper() {
		return newspaper;
	}


	@Override
	public String toString() {
		return "Library [first=" + book + ", second=" + video + ", third=" + newspaper + "]";
	}
	
	
	

}
