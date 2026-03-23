public class ListBoxTest {
	
    public static void main(String[] args) {
    	
        ListBox<Integer> intBox = new ListBox<>();
        intBox.addElement(11);
        intBox.addElement(22);
        intBox.addElement(33ss);

        ListBox<Double> doubleBox = new ListBox<>();
        doubleBox.addElement(1.1);
        doubleBox.addElement(2.2);

        System.out.println("Summe Integer-Box: " + intBox.sumElements());
        System.out.println("Summe Double-Box: " + doubleBox.sumElements());
    }}