package inner;

import java.util.Random;

public class TimerVersion2 {
	
	public static void generatePassword(int length) {
		class PasswortErsteller{
			public void generate() {
				Random r = new Random();
				
				
				String tokens = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!§$%&/()=?,._-<>|#'+*~'";
			    String pw = "";
			    for (int i = 0; i < length; i++) {
			        pw += (tokens.charAt(r.nextInt(tokens.length())));
			    }
			    System.out.println(pw);
			}
		}
		PasswortErsteller pe = new PasswortErsteller();
		pe.generate();
	}

	public static void main(String[] args) {
		generatePassword(20);
	}
}


