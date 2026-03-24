package Refactoring;


public class Square extends Geometry {

	/*
	 * id entfernt*/

	private final double width;
	private final double height;

	/*
	 * int dann auch hier löschen*/
	protected Square(double width, double height, boolean filled, String color) throws IdException {
		super(filled, color);

		if (width < 0 || height < 0) {
			System.out.println("Value less than zero not allowed!");
		}
		
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + height);
	}

}
