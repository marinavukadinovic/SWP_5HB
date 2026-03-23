package Refactoring;

import java.util.UUID;

/*
 * Exceptions entfernen und in eigene Klassen legen*/

/*
 * Geometry Class abstract machen, da die Klasse als Vorlage und nicht Bauplan gilt*/

public abstract class Geometry implements Comparable<Geometry> {
	private UUID id;
	private boolean filled;
	private String color;
	private double width;
	private double height;
	
/*
 * Variablendeklaration und Initialisierung trennen*/	
	
	public Geometry() {
		
		this.id = UUID.randomUUID();
		this.filled = false;
		this.color = "";
		this.width = 0;
		this.height = 0;

	}

	/*
	 * DT von id von int überall zu UUID geändert damit keine Fehlermeldung auftritt*/
	
	/*
	 * Statt -1, id mit UUID.roandomUUID deklarieren*/
	
	/*
	 * Löschen von IdException und if-Abfraget*/
	
	protected Geometry(UUID id, boolean filled, String color) {
		this.id = id;
		this.filled = filled;
		this.color = color;
	}

	/*
	 * Löschen von IdException und if-Abfrage*/
	
	protected Geometry(UUID id, double width, double height, boolean filled, String color) {
		this.id = id;
		this.width = width;
		this.height = height;
		this.filled = filled;
		this.color = color;
	}

	/*
	 * calculateArea und getPerimeter abstract machen*/
	
	public  abstract double calculateArea();

	public  abstract double getPerimeter();

	/*
	 * int zu double ändern*/
	public double compareTo(Geometry c) {
		if (this.calculateArea() > c.calculateArea())
			return 1;
		else if (this.calculateArea() < c.calculateArea())
			return -1;
		else
			return 0;
	}

	/*
	 * Getter + Setter generieren + setId + height/width löschen*/
	
	
	public String getColor() {
		return color;
	}


	public UUID getId() {
		return id;
	}


	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}


	public void setColor(String color) {
		this.color = color;
	}

	public boolean filled() {
		return filled;
	}
}
