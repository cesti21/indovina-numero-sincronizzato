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

	public Numero(int tentativi, Grafica g) {
		this.random = (int) (Math.random() * 20);
		this.tentativi = tentativi;
		this.g = g;
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

	public int controllo() throws Exception {
		FileWriter fw = null;

		try {
			fw = new FileWriter("Testo.txt");
			// creazione file
			SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss:");
			String strDate = formatter.format(new Date());

			fw.write(strDate + "INIZIO");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// System.out.println(n.random);
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
					try {
						SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss:");

						String strDate = formatter.format(new Date());
						fw.write(strDate + "numero troppo grande");
						fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					return -1;
				}
				if (n2 > random) {
					JOptionPane.showMessageDialog(null, "IL NUMERO SEGRETO E' PIU' PICCOLO, RIPROVA!!");
					try {
						SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss:");

						String strDate = formatter.format(new Date());
						fw.write(strDate + "numero troppo piccolo");
						fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					return 1;
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
			return 0;
		} else {
			JOptionPane.showMessageDialog(null, "SCEGLI UN NUMERO COMPRESO TRA 0 E 20");
			throw new Exception();
		}
	}

	@Override
	public String toString() {
		return "Numero [random=" + random + ", tentativi=" + tentativi + "]";
	}
}
