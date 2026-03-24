package Refactoring;

public class DrawIT {
	public static void main(String[] args) throws IdException {

		Geometry filledGreyRect = new Rectangle(2, 6, true, "grey");
		Geometry unfilledBlueRect = new Rectangle( 8, 9, false, "blue");
		Geometry filledGreyCircle = new Circle(3, true, "grey");
		Geometry unfilledRedCircle = new Circle(3, false, "red");

		GeometryCollection construction = new GeometryCollection();

		construction.add(filledGreyRect);
		construction.add(unfilledBlueRect);
		construction.add(filledGreyCircle);
		construction.add(unfilledRedCircle);

		
		try {
			System.out.println("The area of the object is: " + construction.getById(2).calculateArea());
		} catch (InvalidAccessException e1) {
			System.out.println(e1.getMessage());
		}

		System.out.println(construction.containsGeometry(unfilledRedCircle));
		try {
			construction.remove(unfilledRedCircle);
			System.out.println(construction.getById(1).calculateArea());
			System.out.println(construction.contains(unfilledRedCircle));
		} catch (InvalidAccessException e) {
			System.out.println(e.getMessage());
		}
	}
}
