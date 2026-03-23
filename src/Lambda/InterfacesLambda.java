package Lambda;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class InterfacesLambda {

	public static void main(String[] args) {
		
		// Aufgabe 1
		Runnable runnable = () -> {System.out.println("Software läuft");};
		runnable.run();
		
		ActionListener listener = (ActionEvent e) -> {System.out.println("Aktion: " + e.getID() + e.getActionCommand());};
		listener.actionPerformed(new ActionEvent(new Object(), 10, "Andreas"));
		
		Supplier<Double> supplier = () -> {return Math.random();};
		System.out.println(supplier.get());
		
		Consumer<Point> consumer = (Point p) -> {System.out.println("X: " + p.getX() + "Y: " + p.getY());};
		consumer.accept(new Point(2,3));
		
		Comparator<Integer> comparator = (Integer i1, Integer i2) -> {return i1 > i2 ? i1 : i2;};
		System.out.println(comparator.compare(2, 3));
		System.out.println(comparator.compare(5, 3));
		
		// Aufgabe 2
		DoubleSupplier ds = () -> {return Math.random();};
		System.out.println(ds.getAsDouble());
		
		LongToDoubleFunction ltdf = (long value) -> {return (double)value;};
		System.out.println(ltdf.applyAsDouble(9L));
		
		UnaryOperator<String> up = (String s) -> {return s+s;};
		System.out.println(up.apply("Abc"));
		
	}}
