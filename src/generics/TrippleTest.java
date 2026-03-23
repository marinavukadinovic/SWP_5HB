package generics;

public class TrippleTest {

	public static void main(String[] args) {
		
		Tripple<String,Integer,Double> sidTripple = new Tripple<>("Hallo", 12, 12.3);
		Tripple<Integer,String,Double> isdTripple = new Tripple<>(12,"Hallo", 12.3);
		Tripple<Double,Integer,String> disTripple = new Tripple<>(12.3,12,"Hallo");
		
		System.out.println(sidTripple);
		System.out.println(isdTripple);
		System.out.println(disTripple);
}
}