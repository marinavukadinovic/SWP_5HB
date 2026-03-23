package innerClasses;

public class Calculator2{
	
	public static class Addition{
		public static int add(int a, int b) {
			return a+b;
		}
		
	}
	
	
public static void main (String [] args) {

	System.out.println(Calculator2.Addition.add(7, 4));
	System.out.println(Calculator2.Addition.add(4, 8));
	
}}
