package org.oop.anonimclass;

public class Main {

	public static void main(String[] args) {
		
		Button btn = new Button(); 
		btn.click();
		
		//***********************************************************
		
		var myButton = new Button() {
			public void click() {
				System.out.println("Open file");
			}
			
			public void escape() {
				System.out.println("Escape to program");
			}
		};
		myButton.click();
		myButton.escape();
		
		
		//*************************************************************
		
		EventButton eventBtn = new EventButton(new EventHandler() {
			public void event() {
				System.out.println("Copy data");
			}
		});
		eventBtn.click();
	}

}

class Button{
	public void click() {
		System.out.println("Enter to button");
	}
}