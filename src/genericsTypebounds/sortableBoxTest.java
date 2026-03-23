package genericsTypebounds;

public class sortableBoxTest {

	public static void main(String[] args) {
		
		Integer i1 = 20;
		Integer i2 = 40;
		String s1 = "Sonne";
		String s2 = "Regen";
		
		sortableBox<Integer> sb1 = new sortableBox<Integer>(i1);
		sortableBox<Integer> sb2 = new sortableBox<Integer>(i2);
		sortableBox<String> sb3 = new sortableBox<String>(s1);
		sortableBox<String> sb4 = new sortableBox<String>(s2);
		
		
		System.out.println("sb1 mit sb2: " + sb1.compareToOtherBox(sb2));
		System.out.println("sb2 mit sb1: " + sb2.compareToOtherBox(sb1));
		System.out.println("sb3 mit sb4: " + sb3.compareToOtherBox(sb4));
		System.out.println("sb4 mit sb3: " + sb4.compareToOtherBox(sb3));
		
	}

}
