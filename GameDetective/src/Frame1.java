//Filename: Frame1.java
//Author: Angelos, Haseeb, Nicolas & Soptik 
//Date: June 19, 2020
//Description: The Frame 1 class displays an opening window to GameDetective which allows you to "Enter" Gamedective by opening Frame2 (the main window) and then closing this window.

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Frame1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame for the opening screen.
	 */
	public Frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 622);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("START"); // The start button
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 55));
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setOpaque(true);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Frame2 f2 = new Frame2();
				f2.setVisible(true);
			}
		});
		btnNewButton.setBounds(332, 205, 232, 177);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("openingwindow.png"));
		lblNewLabel.setBounds(0, 0, 900, 600);
		contentPane.add(lblNewLabel);
	}

}

