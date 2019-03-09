package org.ismek;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form {

	private JFrame frmanSistemi;
	private JTextField txtOgrenci1;
	private JTextField txtOgrenci2;
	private JTextField txtOgrenci3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form window = new Form();
					window.frmanSistemi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmanSistemi = new JFrame();
		frmanSistemi.setTitle("Çan Sistemi");
		frmanSistemi.setBounds(100, 100, 450, 300);
		frmanSistemi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmanSistemi.getContentPane().setLayout(null);

		txtOgrenci1 = new JTextField();
		txtOgrenci1.setBounds(193, 25, 158, 20);
		frmanSistemi.getContentPane().add(txtOgrenci1);
		txtOgrenci1.setColumns(10);

		JLabel lblrenci = new JLabel("Öğrenci 1");
		lblrenci.setBounds(74, 28, 83, 14);
		frmanSistemi.getContentPane().add(lblrenci);

		txtOgrenci2 = new JTextField();
		txtOgrenci2.setColumns(10);
		txtOgrenci2.setBounds(193, 56, 158, 20);
		frmanSistemi.getContentPane().add(txtOgrenci2);

		txtOgrenci3 = new JTextField();
		txtOgrenci3.setBackground(Color.MAGENTA);
		txtOgrenci3.setColumns(10);
		txtOgrenci3.setBounds(193, 87, 158, 20);
		frmanSistemi.getContentPane().add(txtOgrenci3);

		JLabel lblrenci_1 = new JLabel("Öğrenci 2");
		lblrenci_1.setBounds(74, 59, 83, 14);
		frmanSistemi.getContentPane().add(lblrenci_1);

		JLabel lblrenci_2 = new JLabel("Öğrenci 3");
		lblrenci_2.setBounds(74, 90, 83, 14);
		frmanSistemi.getContentPane().add(lblrenci_2);

		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ogrenci1Text = txtOgrenci1.getText();
				String ogrenci2Text = txtOgrenci2.getText();
				String ogrenci3Text = txtOgrenci3.getText();

				Byte ogrenci1Not = Byte.valueOf(ogrenci1Text);
				Byte ogrenci2Not = Byte.valueOf(ogrenci2Text);
				Byte ogrenci3Not = Byte.valueOf(ogrenci3Text);

				float ortalama = (ogrenci1Not + ogrenci2Not + ogrenci3Not) / 3f;

				if (ogrenci1Not >= ortalama) {
					JOptionPane.showMessageDialog(frmanSistemi, "GEÇTİ.(ÖĞRENCİ 1)");
				} else {
					float kalmaNotu = ortalama - ogrenci1Not;
					JOptionPane.showMessageDialog(frmanSistemi, "ÖĞRENCİ 1 " + kalmaNotu + " puan altında KALDI.");
				}

				if (ogrenci2Not >= ortalama) {
					JOptionPane.showMessageDialog(frmanSistemi, "GEÇTİ.(ÖĞRENCİ 2)");
				} else {
					float kalmaNotu = ortalama - ogrenci2Not;
					JOptionPane.showMessageDialog(frmanSistemi, kalmaNotu + " KALDI.(ÖĞRENCİ 2)");
				}

				if (ogrenci3Not >= ortalama) {
					JOptionPane.showMessageDialog(frmanSistemi, "GEÇTİ. (ÖĞRENCİ3)");
				} else {
					float kalmaNotu = ortalama - ogrenci3Not;
					JOptionPane.showMessageDialog(frmanSistemi, kalmaNotu + " KALDI. (ÖĞRENCİ3)");
				}
			}
		});
		btnHesapla.setBounds(262, 118, 89, 23);
		frmanSistemi.getContentPane().add(btnHesapla);
	}
}
