package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import model.Numero;
import view.Grafica;

public class Controller implements ActionListener {
	private Numero n;
	private Grafica g;
	int tentativi = 4;

	public Controller(Numero n, Grafica g) {
		this.n = n;
		this.g = g;
		g.registraController(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getActionCommand().equalsIgnoreCase("INVIA")) {
			// System.out.println(n.random);
			String n1 = g.textField.getText();
			// System.out.println(n1);
			int n2 = Integer.parseInt(n1);
			if (n2 != n.random) {
				if (n2 < n.random) {
					JOptionPane.showMessageDialog(null, "IL NUMERO SEGRETO E' PIU' GRANDE, RIPROVA!!");
				}
				if (n2 > n.random) {
					JOptionPane.showMessageDialog(null, "IL NUMERO SEGRETO E' PIU' PICCOLO, RIPROVA!!");
				}
				// System.out.println("riprova");
				int nten = tentativi--;
				if (nten < 1) {
					// System.out.println("hai perso");
					JOptionPane.showMessageDialog(null, "HAI PERSO");

					g.textTent.setText(String.valueOf(0));

				} else {
					// System.out.println(nten);
					// String.valueOf(nten);
					g.textTent.setText(String.valueOf(nten));
				}
			} else {
				JOptionPane.showMessageDialog(null, "HAI VINTO");
				// System.out.println("hai vinto");
			}
		}

	}
}
