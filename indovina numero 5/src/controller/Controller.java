package controller;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import model.Log;
import model.Numero;
import view.Grafica;

public class Controller implements ActionListener {
	private Numero n;
	private Grafica g;
	private Log log;
	// int tentativi = 4;
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
			n.controllo();
		}
		if (arg0.getActionCommand().equalsIgnoreCase("LOG")) {
			File file = new File("C:\\Users\\andre\\git\\repository4\\indovina numero 5\\Testo.txt");
			try {
				Desktop desktop = Desktop.getDesktop();
				if (file.exists()) {
					desktop.open(file);
				} else {
					JOptionPane.showMessageDialog(null, "FILE NON TROVATO O INESISTENTE");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (arg0.getActionCommand().equalsIgnoreCase("RIPROVA")) {
			
			System.out.println(n.random);
			g.restart();
		}

	}

}
