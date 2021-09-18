package main;

import controller.Controller;
import model.Numero;
import view.Grafica;

public class Main {
	public static void main(String[] args) {
		Numero n = new Numero(5);
		Grafica g = new Grafica();
		Controller c = new Controller(n, g);

		g.setVisible(true);
	}
}
