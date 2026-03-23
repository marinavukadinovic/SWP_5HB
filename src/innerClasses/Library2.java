package innerClasses;

public class Library2{
	
	private static String name = "Stadtbibliothek";
	
	public static class Book{
		public static String showLibrary() {
			return name;
		}
	}
	
public static void main (String[] args) {
	System.out.println(Library2.Book.showLibrary());
}
	
}
