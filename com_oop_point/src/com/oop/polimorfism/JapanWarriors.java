package com.oop.polimorfism;

public class JapanWarriors extends Warriors {
	@Override
	protected void attack() {
		System.out.println("attack");
	}
	protected final void healing() {
		System.out.println("Final Method Healing");
	}
}
