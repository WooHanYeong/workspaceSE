package com.itwill.address.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddressServiceMainFrame extends JFrame {
	
	/*******************************/
	
	 
	/*******************************/
	
	
	
	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField phoneTextField;
	private JTextField addressTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddressServiceMainFrame frame = new AddressServiceMainFrame();
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
	public AddressServiceMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane addresstabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(addresstabbedPane, BorderLayout.CENTER);
		
		JPanel addressInsertPanel = new JPanel();
		addressInsertPanel.setBackground(Color.YELLOW);
		addresstabbedPane.addTab("주소록쓰기", null, addressInsertPanel, null);
		addressInsertPanel.setLayout(null);
		
		JLabel addressNameLabel = new JLabel("이름");
		addressNameLabel.setBounds(83, 90, 57, 15);
		addressInsertPanel.add(addressNameLabel);
		
		JLabel addressPhoneLabel_1 = new JLabel("전화번호");
		addressPhoneLabel_1.setBounds(83, 170, 57, 15);
		addressInsertPanel.add(addressPhoneLabel_1);
		
		JLabel addressAddressLabel_2 = new JLabel("주소");
		addressAddressLabel_2.setBounds(83, 250, 57, 15);
		addressInsertPanel.add(addressAddressLabel_2);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(194, 88, 116, 21);
		addressInsertPanel.add(nameTextField);
		nameTextField.setColumns(10);
		
		phoneTextField = new JTextField();
		phoneTextField.setBounds(194, 167, 116, 21);
		addressInsertPanel.add(phoneTextField);
		phoneTextField.setColumns(10);
		
		addressTextField = new JTextField();
		addressTextField.setBounds(194, 240, 116, 21);
		addressInsertPanel.add(addressTextField);
		addressTextField.setColumns(10);
		
		JButton addressWirteButton = new JButton("주소록쓰기");
		addressWirteButton.setBounds(143, 322, 116, 30);
		addressInsertPanel.add(addressWirteButton);
		
		JPanel addressListPanel = new JPanel();
		addressListPanel.setBackground(Color.CYAN);
		addresstabbedPane.addTab("주소록리스트", null, addressListPanel, null);
		addressListPanel.setLayout(null);
		
		JPanel addressDetailPanel = new JPanel();
		addressDetailPanel.setBackground(Color.PINK);
		addresstabbedPane.addTab("주소록상세보기", null, addressDetailPanel, null);
		addressDetailPanel.setLayout(null);
	}
}
