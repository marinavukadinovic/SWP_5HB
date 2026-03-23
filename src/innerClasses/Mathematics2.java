package innerClasses;

public class Mathematics2{
	
	public static class Factorial{
		public static int berechne(int n) {
			int fac = 1;
			while (n>0) {
				fac *=n;
			n--;
			}	
			return fac;
			}
		}
	
public static void main (String [] args) {
	System.out.println(Mathematics2.Factorial.berechne(4));
	
}
	}
