package innerClasses;

public class Library {
	
	private static String name = "Stadtbibliothek";
	
	public static class Book{
		public static String showLibrary() {
			return name;
		}
	}

}
