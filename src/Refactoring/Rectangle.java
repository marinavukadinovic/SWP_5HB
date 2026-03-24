package Refactoring;

import java.util.UUID;

public class Rectangle extends Geometry {

	/*
	 * DT von id von int überall zu UUID ändern*/
	
	private final double width;
	private final double height;
	
	
	/*
	 * Löschen von IdException und if-Abfragen*/

	protected Rectangle(double width, double height, boolean filled, String color) throws InvalidNumberException{ 
		if (width <0) {
			throw new InvalidNumberException("Radius less than zero not allowed!");
		}
		
		this.width = width;
		this.height = height;
	}
	
	/*Getter + Setter generiren + setid löschen*/
	
	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
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