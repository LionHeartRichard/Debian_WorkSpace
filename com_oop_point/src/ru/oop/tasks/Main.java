package ru.oop.tasks;

public class Main {

	public static void main(String[] args) {

		DataGraph[] myMas = new DataGraph[3];
		myMas[0] = new LineGraph();
		myMas[1] = new BarGraph();
		myMas[2] = new ChartGraph();

		for (int i = 0; i < myMas.length; i++) {
			myMas[i].update();
			myMas[i].setData(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		}
		
	}
}

abstract class DataGraph implements Observer {

	private double[] data = new double[N_ELEMENTS];

	void setData(double[] data) {
		if (data.length == 10) {
			this.data = data;
		} else {
			System.out.println("Error: You enter is not possible length to array");
		}
	}

	double[] getData() {
		return data;
	}

	Observer[] graphs;

}

interface Observer {
	int N_ELEMENTS = 10;

	void update();
}

class LineGraph extends DataGraph {
	DataGraph dataGraph;

	@Override
	public void update() {
		System.out.println("Graphs drawing in LINE");

	}

}

class BarGraph extends DataGraph {
	DataGraph dataGraph;

	@Override
	public void update() {
		System.out.println("BAR_GRAPH");
	}
}

class ChartGraph extends DataGraph {
	DataGraph dataGraph;

	@Override
	public void update() {
		System.out.println("Graphs drawing in chart");
	}
}