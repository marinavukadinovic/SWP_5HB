package genericMethods;

public class ElementCounter {

	public static <T extends Comparable<T>> int countGreaterThan(T arr[], T num) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].compareTo(num) > 0) {
				counter++;
			}
		}
		return counter;
	}

}


