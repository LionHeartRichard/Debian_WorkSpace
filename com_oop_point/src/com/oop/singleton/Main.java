package com.oop.singleton;

public class Main {

	public static void main(String[] args) {
		
		SingletonTrainee singletonTrainee = SingletonTrainee.getInstance();
		System.out.println("Singleton TRAINEE count:" + singletonTrainee.getCount());

		SingletonJunior singletonJunior = SingletonJunior.getInstance();
		System.out.println("Singleton JUNIOR count:" + singletonJunior.getCount());
		
		SingletonSeniorSoftwareEngineer singletonSenior = SingletonSeniorSoftwareEngineer.getInstance();
		System.out.println("Singleton Senior Software Engineer: " + singletonSenior.getCount());
	}

}
