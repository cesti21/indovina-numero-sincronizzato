package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import model.Numero;
import view.Grafica;

public class Controller implements ActionListener {
	private Numero n;
	private Grafica g;
	int tentativi = 4;
	Date date = new Date();
	/*
	 * SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss:"); String
	 * strDate = formatter.format(date);
	 */

	public Controller(Numero n, Grafica g) {
		this.n = n;
		this.g = g;
		g.registraController(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getActionCommand().equalsIgnoreCase("INVIA")) {

			try {
				n.controllo();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "INPUT NON VALIDO");
			}
		}

	}
}
