package genericsTypebounds;

import java.util.ArrayList;
import java.util.List;


public class ShapeBox<T extends Shape> {

	private List<T> shapes;
	
	public ShapeBox() {
		this.shapes = new ArrayList<T>();
	}
	
	public void addShape(T shape) {
		this.shapes.add(shape);
	}
	
	public void printBox() {
		for(T shape : shapes) {
			shape.drawShape();
		}
	}
}
