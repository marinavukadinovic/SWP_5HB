package inner;

public class Calculator {
	
	public static void calculateAverage(int [] numbers) {
		class DurchschnittsBerechner{
			public double average() {
				int numOfElements = numbers.length;
				double sum = 0;
				for (int i = 0; i < numbers.length; i++) {
					sum += numbers[i];
				}
				return (sum / numOfElements);
			}
		}
		System.out.println(new DurchschnittsBerechner().average());
	}

	public static void main(String[] args) {
		int [] arr = {2, 12, 11};
		calculateAverage(arr);
	}

}
