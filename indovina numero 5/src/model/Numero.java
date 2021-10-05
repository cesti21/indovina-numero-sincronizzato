package model;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import view.Grafica;

public class Numero {
	public int random;
	public int tentativi = 5;
	private Grafica g;
	private Log log;

	public Numero(int tentativi, Grafica g, Log log) {
		this.random = (int) (Math.random() * 20);
		this.tentativi = tentativi;
		this.g = g;
		this.log = log;
		log.writeLog("INIZIO");
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

	public int getTentativi() {
		return tentativi;
	}

	public void setTentativi(int tentativi) {
		this.tentativi = tentativi;
	}

	public int controllo() {
		System.out.println(random);
		tentativi--;
		String n1 = g.textField.getText();
		// System.out.println(n1);
		int n2 = 0;
		n2 = Integer.parseInt(n1);
		/*
		 * try { n2 = Integer.parseInt(n1); } catch (Exception e) { throw new
		 * Exception(); }
		 */
		if (n2 >= 0 && n2 < 21) {
			if (n2 != random) {
				if (n2 < random) {
					JOptionPane.showMessageDialog(null, "IL NUMERO SEGRETO E' PIU' GRANDE, RIPROVA!!");
					log.writeLog("IL NUMERO SEGRETO E' PIU' GRANDE");
				}
				if (n2 > random) {
					JOptionPane.showMessageDialog(null, "IL NUMERO SEGRETO E' PIU' PICCOLO, RIPROVA!!");
					log.writeLog("IL NUMERO SEGRETO E' PIU' PICCOLO");
				}
				// System.out.println("riprova");
				if (tentativi <1) {
					// System.out.println("hai perso");
					JOptionPane.showMessageDialog(null, "HAI PERSO");

					g.textTent.setText(String.valueOf(0));
					log.writeLog("HAI PERSO");
				} else {
					// System.out.println(nten);
					// String.valueOf(nten);
					g.textTent.setText(String.valueOf(tentativi));
				}
			} else {
				JOptionPane.showMessageDialog(null, "HAI VINTO");
				log.writeLog("HAI VINTO");
				// System.out.println("hai vinto");
			}
		} else {
			JOptionPane.showMessageDialog(null, "SCEGLI UN NUMERO COMPRESO TRA 0 E 20");

		}

		if (tentativi < 1) {
			return 0;
		}
		return 1;
	}

	@Override
	public String toString() {
		return "Numero [random=" + random + ", tentativi=" + tentativi + "]";
	}
}
