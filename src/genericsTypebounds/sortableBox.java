package genericsTypebounds;

public class sortableBox<T extends Comparable<T>> {
	
	private T value;

	public sortableBox(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public int compareToOtherBox(sortableBox<T> sb) {
		return this.value.compareTo(sb.getValue());
	}
}
