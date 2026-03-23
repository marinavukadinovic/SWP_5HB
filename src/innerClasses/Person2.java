package innerClasses;

public class Person2{
	
	private String name;
	
	public Person2(String name) {
		this.name = name;
	}
	
	public class Details{
		public void showName() {
		System.out.println(Person2.this.name);
		}
	}
	
public static void main (String[] args) {
	Person2.Details pd = new Person2("Mary").new Details();
	pd.showName();
	
}

}