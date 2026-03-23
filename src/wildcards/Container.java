package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Container <T> {
	
	private T value;
	private List<T> elements = new ArrayList<>();
	  
	public Container (T value) {
		this.value = value;
	}

	 public void addElement(T element) {
	        elements.add(element);
	}
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public double sumItems() {
        double sum = 0;
        for (T element : elements) {
            sum += ((Number) element).doubleValue();
        }
        return sum;
    }
		
	}
	

