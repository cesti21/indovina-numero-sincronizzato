package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import controller.Controller;

public class Grafica {

	private JFrame frame;
	public JButton btnNewButton;
	public JTextField textField;
	public JTextField textTent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafica window = new Grafica();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Grafica() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("INDOVINA NUMERO");
		lblNewLabel.setBounds(156, 13, 120, 16);
		frame.getContentPane().add(lblNewLabel);

		btnNewButton = new JButton("INVIA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(166, 187, 97, 25);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("TENTATIVI: ");
		lblNewLabel_1.setBounds(168, 75, 79, 16);
		frame.getContentPane().add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(160, 143, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textTent = new JTextField();
		textTent.setBounds(238, 72, 25, 22);
		frame.getContentPane().add(textTent);
		textTent.setColumns(10);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}

	public void registraController(Controller controller) {
		btnNewButton.addActionListener(controller);

	}
}
