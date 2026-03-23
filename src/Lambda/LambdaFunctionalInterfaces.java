package Lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaFunctionalInterfaces {

	public static void main(String[] args) {
		
		// Aufgabe 1 - Runnable
		Runnable runFromOneToTen = () -> {
			int i = 0;
			while (i < 11) {
				System.out.println(i);
				i++;
			}
		};
		runFromOneToTen.run();
		
		// Aufgabe 2 - Supplier
		Supplier<Integer> getRandomNumber = () -> { 
			double rand = 100*Math.random();
			return (int) rand;};
		
		System.out.println("1. Durchgang: " + getRandomNumber.get());
		System.out.println("2. Durchgang: " + getRandomNumber.get());
		System.out.println("3. Durchgang: " + getRandomNumber.get());
		
		// Aufgabe 3 - Consumer
		Consumer<String> toCapitalLetters= (String s) -> {System.out.println(s.toUpperCase());};
		toCapitalLetters.accept("Andreas");
		toCapitalLetters.accept("katze");
		toCapitalLetters.accept("hAuS");
		
		// Aufgabe 4 - Comparator
		List<String> stringList = new ArrayList<String>();
		stringList.add("Andreas");
		stringList.add("SWP");
		stringList.add("Stiege");
		
		Comparator<String> compareStringList = (String a, String b) -> {return Integer.compare(a.length(), b.length());}; 
		stringList.sort(compareStringList);
		System.out.println(stringList.toString());
		
		// Aufgabe 5 - ActionListener
		ActionEvent ae = new ActionEvent(new Object(), 10, "abc");
		ActionListener al = (ActionEvent actionevent) -> {System.out.println("Button pressed: " + actionevent.getActionCommand());};
		al.actionPerformed(ae);
		
		// Aufgabe 6 - Listen sortieren
		List<String> names = List.of("Max", "Anna", "Clara", "Bernd");
		Comparator<String> sortAlphabetic = (String a, String b) -> {return a.compareTo(b);};
		names.sort(sortAlphabetic);
	}
}
