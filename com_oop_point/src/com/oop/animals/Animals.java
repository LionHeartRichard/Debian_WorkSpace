package com.oop.animals;

public abstract class Animals implements PropertiesAnimals {
	protected int[] size;
	protected String name;
	protected int weight;

	public abstract void giveBirthTo();

	public abstract void respire();

	public abstract void run();
}
