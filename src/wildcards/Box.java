package wildcards;
	
	public class Box <T extends Comparable <T>>{
		
	private T value;
		
	public Box(T value) {
		this.value = value;
			
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
		
	public boolean compareBoxes(Box<?> otherBox) {
        return this.value.equals(otherBox.getValue());
    }
	
	
}
