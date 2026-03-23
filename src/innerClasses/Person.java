package innerClasses;

public class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public class Details{
		public void showName() {
			System.out.println(Person.this.name);
		}
	}

}
