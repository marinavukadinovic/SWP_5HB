package inner;


public class TimerVersion1 {
	
	public static void startTimer(int sekunden) {
		class MyTimer{
			public void start() {
				System.out.println("Noch " + sekunden + " Sekunden");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}				
			}
		}
		MyTimer mt = new MyTimer();
		mt.start();
	}
	
	public static void main (String [] args) {
		int sekunden = 10;
		while (!(sekunden <= 0)) {
			startTimer(sekunden);
			sekunden--;
		}
		System.out.println("ENDE");
	}
}

