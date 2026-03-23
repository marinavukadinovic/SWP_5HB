package wildcards;

	import java.util.ArrayList;
	import java.util.List;

	public class HandlerTest {
	    public static void main(String[] args) {
	       
	        Handler<Integer> intHandler = new Handler<>(22);

	        
	        List<Number> numberList = new ArrayList<>();

	       
	        intHandler.addItems(numberList);

	       
	        numberList.add(2.11); 

	        System.out.println();
	        for (Object obj : numberList) {
	            System.out.println(obj);
	        }

	        Handler<Double> doubleHandler = new Handler<>(100.9);
	        doubleHandler.addItems(numberList);

	        System.out.println();
	        for (Object obj : numberList) {
	            System.out.println(obj);
	        }
	    } 
	}


