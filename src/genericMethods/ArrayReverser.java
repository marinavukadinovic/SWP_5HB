package genericMethods;

	public class ArrayReverser {
			
			public ArrayReverser() {}
			
			public static <T> T[] reverseArray(T arr []) {
				Object[] tmp = new Object[arr.length];
				int index = 0;
				for(int i = arr.length-1; i >= 0; i--) {
					tmp[index] = arr[i];
					index++;
				}
				return (T[]) tmp;
			}
		}