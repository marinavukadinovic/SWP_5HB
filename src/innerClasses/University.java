package innerClasses;

public class University {
	
	public University() {}
	
	public class Student{		
		public void showData(String name, int id) {
			System.out.println("Name: " + name + " | ID: " + id);
		}
	}

}
