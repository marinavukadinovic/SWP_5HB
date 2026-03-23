package generics;

public class BoxTest {

	public static void main(String[] args) {
		
		Box<String> Stringbox = new Box<>("Hallo");
		Box<Integer> Intbox = new Box <> (12);
		Box<Double> Doublebox = new Box<> (12.2);
		
		
		System.out.println(Stringbox);
		System.out.println(Intbox);
		System.out.println(Doublebox);
		
		
		
	
	}
	



}