package main;

import controller.Controller;
import model.Numero;
import view.Grafica;

public class Main {
	public static void main(String[] args) {

		Grafica g = new Grafica();
		Numero n = new Numero(5, g);
		Controller c = new Controller(n, g);

		g.setVisible(true);
	}
}
