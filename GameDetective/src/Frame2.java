//Filename: Frame2.java
//Author: Angelos, Haseeb, Nicolas & Soptik 
//Date: June 19, 2020
//Description: The Frame 2 class displays the main window for GameDetective which allows you to find game records, sort game records, create game records and delete game records.

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class Frame2 extends JFrame {
	
	static String fileName = "records.txt";         // fileName = "records.txt"
	final int MAX = 20;                             // Set MAX numuber of records
	String rows[] = new String[MAX];                // Store max 20 records
	String info[][] = new String[MAX][6];           // Store records in 2d array
	ReadData rd = new ReadData();                   // Instantiate the class ReadData
	Records re = new Records();                     // Instantiate the class Records
	Sorter s = new Sorter();                        // Instantiate the class Sorter
	SearchInput si = new SearchInput();             // Instantiate the class SearchInput
	SearchInput2 si2 = new SearchInput2();          // Instantiate the class SearchInput2
	KeyInput ki = new KeyInput();                   // Instantiate the class Keyinput
	NewRecord nr = new NewRecord();                 // Instantiate the class NewRecord

	String nameArray [] = new String[MAX]; 


	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 frame = new Frame2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 622);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton btnNewButton = new JButton("ADD");//The "Upload" button
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setOpaque(true);
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			      nr.addRecord(fileName,  ki.entries()); //add new record 
			}
		});
		
        JButton btnLoad = new JButton("LOAD"); // The "Load" button
        btnLoad.setBorder(null);
        btnLoad.setForeground(Color.GREEN);
        btnLoad.setBackground(Color.DARK_GRAY);
        btnLoad.setOpaque(true);
        btnLoad.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	    rows = rd.readFile(fileName, MAX); // Calls readFile method
        	    info = re.getRecords(rows); // Calls getRecords method

        	}
        });
        btnLoad.setBounds(288, 190, 119, 48);
        contentPane.add(btnLoad);
		
		JButton btnList = new JButton("LIST"); // The "List" button
		btnList.setBorder(null);
		btnList.setForeground(Color.GREEN);
		btnList.setBackground(Color.DARK_GRAY);
		btnList.setOpaque(true);
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int row = 0; row < info.length; row++)
				   {System.out.println(" ");
				    for (int col = 0; col < info[0].length; col++)
				      {System.out.println( info[row][col] );
				      }
			      }
       }
		});
		btnList.setBounds(478, 191, 119, 48);
		contentPane.add(btnList);
		btnNewButton.setBounds(128, 525, 102, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EXIT");//The "Exit" button
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnNewButton_1.setForeground(Color.GREEN);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Frame1 f1 = new Frame1();
				f1.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(801, 553, 84, 41);
		contentPane.add(btnNewButton_1);
		
		JButton btnAsf = new JButton("GENRE"); //The "Genre" button
		btnAsf.setForeground(Color.GREEN);
		btnAsf.setBackground(Color.DARK_GRAY);
		btnAsf.setOpaque(true);
		btnAsf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			      info = s.sort(info, 1); //Sort records by Genre
		          System.out.println("Sorted by Genre");
		          System.out.println("Click List to view");
			}
		});
		btnAsf.setBorder(null);
		btnAsf.setBounds(379, 130, 84, 38);
		contentPane.add(btnAsf);
		
		JButton btnAsf_1 = new JButton("GAME"); //The "Games" button
		btnAsf_1.setForeground(Color.GREEN);
		btnAsf_1.setBackground(Color.DARK_GRAY);
		btnAsf_1.setOpaque(true);
		btnAsf_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 info = s.sort(info, 0); //Sort records by Names
	             System.out.println("Sorted by Names");
		         System.out.println("Click List to view");
			}
		});
		btnAsf_1.setBorder(null);
		btnAsf_1.setBounds(131, 130, 84, 38);
		contentPane.add(btnAsf_1);
		
		JButton btnAsf_2 = new JButton("PRICE");//The "Price" button
		btnAsf_2.setForeground(Color.GREEN);
		btnAsf_2.setBackground(Color.DARK_GRAY);
		btnAsf_2.setOpaque(true);
		btnAsf_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     info = s.sort(info, 2); //Sort records by Price 
	             System.out.println("Sorted by Price");
		         System.out.println("Click List to view");
				
			}
		});
		btnAsf_2.setBorder(null);
		btnAsf_2.setBounds(483, 131, 84, 38);
		contentPane.add(btnAsf_2);
		
		JButton btnAsf_3 = new JButton("RATING"); //The "Rating" button
		btnAsf_3.setForeground(Color.GREEN);
		btnAsf_3.setBackground(Color.DARK_GRAY);
		btnAsf_3.setOpaque(true);
		btnAsf_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     info = s.sort(info, 4); //Sort records by Rating 
	             System.out.println("Sorted by Rating");
		         System.out.println("Click List to view");
			}
		});
		btnAsf_3.setBorder(null);
		btnAsf_3.setBounds(586, 133, 84, 38);
		contentPane.add(btnAsf_3);
		
		JButton btnAsf_4 = new JButton("FIND BY NAME"); //The Search Bar button
		btnAsf_4.setForeground(Color.GREEN);
		btnAsf_4.setBackground(Color.DARK_GRAY);
		btnAsf_4.setOpaque(true);
		btnAsf_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			      si.keyInput(fileName, info, 0); // Key in input and conduct a search by Names   	
			}
		});
		btnAsf_4.setBorder(null);
		btnAsf_4.setBounds(527, 23, 345, 38);
		contentPane.add(btnAsf_4);
		
		JButton btnAsf_5 = new JButton("DELETE");//The "Delete" button
		btnAsf_5.setForeground(Color.GREEN);
		btnAsf_5.setBackground(Color.DARK_GRAY);
		btnAsf_5.setOpaque(true);
		btnAsf_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     si2.keyInput(fileName, info, 0);
			}
		});
		btnAsf_5.setBorder(null);
		btnAsf_5.setBounds(242, 525, 102, 29);
		contentPane.add(btnAsf_5);
		
		JLabel lblNewLabel_1 = new JLabel("<html>Click the Load button to load the records than click either of the above buttons to sort, add, delete and even find a game record. Finally click List to view the changes. All records can be viewed on the console.</html>");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(269, 287, 488, 123);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblHelp = new JLabel("HELP:");
		lblHelp.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblHelp.setBounds(164, 272, 102, 67);
		contentPane.add(lblHelp);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 36));
		lblNewLabel.setIcon(new ImageIcon("mainwindow.png"));
		lblNewLabel.setBounds(0, 0, 900, 600);
		contentPane.add(lblNewLabel);
		
	}
}
