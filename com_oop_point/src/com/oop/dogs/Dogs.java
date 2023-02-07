package com.oop.dogs;

public class Dogs {
	private String name;

	private Foot foot;

	{
		name = "";
		foot = new Foot();
		System.out.println("Create instance class FOOT");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("-- run god --" + this.name);
		foot.run();
	}

	private class Foot {

		String name;

		{
			name = "foot";
		}

		private Foot() {
		}

		private void run() {
			System.out.println("foot method run " + name);
			System.out.println("foot run " + Dogs.this.name);
		}
	}

}
