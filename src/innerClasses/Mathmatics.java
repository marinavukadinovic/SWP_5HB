package innerClasses;

public class Mathmatics {
	
	public static class Factorial{
		public static int berechne(int n) {
			int fac = 1;
			while (n > 0) {
				fac *= n;
				n--;
			}
			return fac;
		}
	}

}
