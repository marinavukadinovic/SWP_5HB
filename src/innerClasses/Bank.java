package innerClasses;

public class Bank {
	
	private double balance;
	
	public Bank(double balance) {
		this.balance = balance;
	}
	
	public void showBalance() {
		System.out.println("KONTOSTAND: " + this.balance);
	}
	
	public class Account{
		public void deposit(double amount) {
			balance += amount;
		}
	}

}