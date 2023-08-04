package com.itwill.member;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class cardlayouttest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cardlayouttest frame = new cardlayouttest();
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
	public cardlayouttest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 342, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel menuBottonPanel = new JPanel();
		menuBottonPanel.setBackground(Color.GREEN);
		contentPane.add(menuBottonPanel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		menuBottonPanel.add(btnNewButton);
		
		JButton button = new JButton("로그인");
		menuBottonPanel.add(button);
		
		JPanel parentPanel = new JPanel();
		parentPanel.setBackground(Color.RED);
		contentPane.add(parentPanel, BorderLayout.CENTER);
		parentPanel.setLayout(new CardLayout(0, 0));
		
		JPanel joinPanel = new JPanel();
		joinPanel.setBackground(Color.ORANGE);
		parentPanel.add(joinPanel, "name_594769943446700");
		joinPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(60, 71, 57, 15);
		joinPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(60, 126, 57, 15);
		joinPanel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(158, 68, 116, 21);
		joinPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 123, 116, 21);
		joinPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(Color.MAGENTA);
		parentPanel.add(loginPanel, "name_594812759866900");
		loginPanel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(51, 77, 57, 15);
		loginPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(51, 128, 57, 15);
		loginPanel.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(153, 74, 116, 21);
		loginPanel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(153, 125, 116, 21);
		loginPanel.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		parentPanel.add(panel_2, "name_594814046386700");
	}
}
