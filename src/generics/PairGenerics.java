package generics;

public class PairGenerics <T,U> {

	private final T first;
	private final U second;
	
	public PairGenerics ( T first,  U second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public U getSecond() {
		return second;
	}
	
	public void swap (){
		System.out.println(second + "" + first);
	}




}