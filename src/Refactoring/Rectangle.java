package Refactoring;

import java.util.UUID;

public class Rectangle extends Geometry {

	/*
	 * DT von id von int überall zu UUID ändern*/
	
	
	private UUID id;
	private final double width;
	private final double height;
	
	
	/*
	 * Löschen von IdException und if-Abfraget*/

	protected Rectangle(UUID id, double width, double height, boolean filled, String color) {
		
		this.setUUID(UUID.randomUUID());
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

	/*Getter + Setter generiren + setid löschen*/
	
	public int getUUID() {
		return UUID;
	}

	public void setUUID(UUID uuid) {
		uuid = uuid;
	}

	public UUID getId() {
		return id;
	}


}