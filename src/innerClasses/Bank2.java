package innerClasses;

public class Bank2{
	
	private double balance;
	
	public Bank2(double balance) {
		this.balance = balance;
	}
	
	public void showBalance() {
		System.out.println("Kontostand:" + this.balance);
		
	}
	
	public class Account{
		public double deposit (double amount) {
			return amount;
	
		}
		
	}
	
public static void main (String [] args) {
	
}
		
	}
