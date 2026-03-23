package innerClasses;

public class Main {
		
	public static void main(String [] args) {
		System.out.println("--- Aufgabe 1 ---");
		System.out.println(Calculator.Addition.add(10, 20));
		System.out.println(Calculator.Addition.add(5, 55));
		
		System.out.println("--- Aufgabe 2 ---");
		System.out.println(Library.Book.showLibrary());
		
		System.out.println("--- Aufgabe 3 ---");
		System.out.println(Mathmatics.Factorial.berechne(4));
		System.out.println(Mathmatics.Factorial.berechne(2));
		
		System.out.println("--- Aufgabe 4 ---");
		Person.Details pd = new Person("Mary").new Details();
		pd.showName();
		Person.Details pd1 = new Person("Julia").new Details();
		pd1.showName();
		
		System.out.println("--- Aufgabe 5 ---");
		University.Student us1 = new University().new Student();
		us1.showData("Mary", 16);
		University.Student us2 = new University().new Student();
		us2.showData("Julia", 2);
		
		System.out.println("--- Aufgabe 6 ---");
		Bank b = new Bank(1000);
		Bank.Account acc = b.new Account();
		acc.deposite(100);
		b.showBalance();
		
	}
}
