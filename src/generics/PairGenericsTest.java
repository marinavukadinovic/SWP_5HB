package generics;

public class PairGenericsTest {
		
		public static void main(String[] args) {
			final PairGenerics <Double, Double> pdd = new PairGenerics <Double, Double>("12.14,14.12");
			System.out.println(pdd);
			final PairGenerics <String, Integer> psi = new PairGenerics <String, Integer> ("Hallo", 12);
			
		
		}
	
		 
}
