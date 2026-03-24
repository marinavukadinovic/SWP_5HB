package Refactoring;

/*
 * private int id, private boolean filled, private String color, entfernt, da nicht gelesen
 */

public class Circle extends Geometry {

/*
 * if (this.id==id), this.id = id, this.filled = filled, this.color = color entfernt, da dead Code
 */

	private double radius;
	
/*
 * int id rauslöschen*/
	
	protected Circle(double radius, boolean filled, String color) throws InvalidNumberException {
		super(filled, color);
		if (radius <= 0) {
			throw new InvalidNumberException("Radius less than zero not allowed!");
	}
	
		this.radius = radius;
	}

	
	public double getRadius() {
		return radius;
	}
	

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}

	public double getDiameter() {
		return 2 * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

}