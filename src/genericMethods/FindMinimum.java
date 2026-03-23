package genericMethods;

public class FindMinimum {

	  public static <T extends Comparable<T>> T findMin(T a, T b) {
	        return (a.compareTo(b) <= 0) ? a : b;
	    }
}