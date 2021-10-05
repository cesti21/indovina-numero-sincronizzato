package main;

import controller.Controller;
import model.Log;
import model.Numero;
import view.Grafica;

public class Main {
	public static void main(String[] args) {

		Grafica g = new Grafica();
		Log log = new Log();
		Numero n = new Numero(5, g, log);
		Controller c = new Controller(n, g);

		g.setVisible(true);
	}
}
