package genericsTypebounds;

import java.util.ArrayList;
import java.util.List;

public class ListBox <T extends Number> {

	  private List<T> elements;
	  
	  public ListBox() {
		  this.elements = new ArrayList<>();
	  }

	  
	    public void addElement(T element) {
	        elements.add(element);
	    }

	    
	    public double sumElements() {
	        double sum = 0.0;
	        for (T element : elements) {
	            sum += ((Number) element).doubleValue();
	        }
	        return sum;
	    }
	}
	
