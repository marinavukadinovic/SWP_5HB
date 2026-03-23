package generics;

public class Tripple <T,U,V> {
	
	private final T first;
	private final U second;
	private final V third;
	
	public Tripple(T first, U second, V third) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	
	public T getFirst() {
		return first;
	}
	public U getSecond() {
		return second;
	}
	public V getThird() {
		return third;
	}


	@Override
	public String toString() {
		return "Tripple [first=" + first + ", second=" + second + ", third=" + third + "]";
	}
	
	
}
