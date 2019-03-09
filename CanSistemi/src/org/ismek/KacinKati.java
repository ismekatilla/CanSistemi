package org.ismek;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KacinKati {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KacinKati window = new KacinKati();
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
	public KacinKati() {
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
		
		textField = new JTextField();
		textField.setBounds(141, 51, 131, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String sayi = textField.getText();
				byte sayiAsByte = Byte.parseByte(sayi);
				if (sayiAsByte < 0 || sayiAsByte > 50) {
					JOptionPane.showMessageDialog(frame, "Girilen sayı 0-50 arasında olmalıdır");
				} else {
					if(sayiAsByte % 5 == 0) {
						JOptionPane.showMessageDialog(frame, "Girilen sayı 5 in katıdır");
					} else if(sayiAsByte % 4 == 0) {
						JOptionPane.showMessageDialog(frame, "Girilen sayı 4 in katıdır");
					}  else if(sayiAsByte % 3 == 0) {
						JOptionPane.showMessageDialog(frame, "Girilen sayı 3 in katıdır");
					}  else if(sayiAsByte % 2 == 0) {
						JOptionPane.showMessageDialog(frame, "Girilen sayı 2 in katıdır");
					} else {
						JOptionPane.showMessageDialog(frame, "KATI YOKTUR.");
					}
				}
			}
		});
		btnNewButton.setBounds(184, 82, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
