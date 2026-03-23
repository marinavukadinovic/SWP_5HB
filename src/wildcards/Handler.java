package wildcards;

import java.util.List;

public class Handler <T>{
	
	private T value;
	

    public Handler(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void addItems(List<? super T> list, T item) {
        list.add(item); 
}
}


