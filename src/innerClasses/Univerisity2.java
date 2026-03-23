package innerClasses;

public class Univerisity2{
	
	public Univerisity2() {}
	
	public class Student{
		public void showData(String name, int id) {
		System.out.println("Name:" + name + "ID:" + id);
			
		}
	}
	
public static void main (String [] args) {
	Univerisity2.Student us = new Univerisity2().new Student();
	us.showData("Mary", 11);
}
	
}