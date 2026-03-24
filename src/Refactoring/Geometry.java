package Refactoring;

import java.util.UUID;

/*
 * Exceptions entfernen und in eigene Klassen legen*/

/*
 * Geometry Class abstract machen, da die Klasse als Vorlage und nicht Bauplan gilt!*/

public abstract class Geometry implements Comparable<Geometry> {
	private static UUID UUID = null;
	private UUID id;
	private boolean filled;
	private String color;
	
/*
 * Löschen von width und height*/
	
	
	
/*
 * Variablendeklaration und Initialisierung trennen*/	
	
	public Geometry() {
		
		this.id = UUID.randomUUID();
		this.filled = false;
		this.color = "";

	}

	/*
	 * DT von id von int überall zu UUID geändert damit keine Fehlermeldung auftritt*/
	
	/*
	 * Statt -1, id mit UUID.roandomUUID deklarieren*/
	
	/*
	 * Löschen von IdException und if-Abfraget*/
	
	protected Geometry(UUID id, boolean filled, String color) {
		this.id = UUID;
		this.filled = filled;
		this.color = color;
	}

	/*
	 * Löschen von IdException und if-Abfrage*/
	
	protected Geometry(UUID id, double width, double height, boolean filled, String color) {
		this.UUID = id;
		this.filled = filled;
		this.color = color;
	}

	/*
	 * calculateArea und getPerimeter abstract machen*/
	
	public abstract double calculateArea();

	public abstract double getPerimeter();

	/*
	 * int zu double ändern*/
	public int compareTo(Geometry c) {
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
