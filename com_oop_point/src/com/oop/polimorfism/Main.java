package com.oop.polimorfism;

public class Main {
	public static void main(String[] args) {
		Samurai samuray = new Samurai();
		samuray.name = "Eihido";
		samuray.type = "ia-do atack";
		samuray.attack();
		
		Warriors ronin = new JapanWarriors();
		ronin.attack();
		
		ronin = samuray;
		ronin.attack();
		
		ronin = new MinamotoSamurai();
		ronin.attack();
		
		System.out.println("*********************");
		
		JapanWarriors[] japanWarriors = new JapanWarriors[4];
		japanWarriors[0] = new JapanWarriors();
		japanWarriors[1] = new Samurai();
		japanWarriors[2] = new MinamotoSamurai();
		japanWarriors[3] = new YmiArcher();
		
		for (int i =0; i<4; i++) {
			japanWarriors[i].attack();
			japanWarriors[i].healing();
		}
	}
}
