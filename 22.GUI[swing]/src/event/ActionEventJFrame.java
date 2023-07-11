package event;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;

public class ActionEventJFrame extends JFrame {
	JPanel contentPane;
	private JButton northbutton;
	private JButton southbutton;
	private JButton westbutton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActionEventJFrame frame = new ActionEventJFrame();
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
	public ActionEventJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		northbutton = new JButton("이벤트소스[NORTH]");
		contentPane.add(northbutton, BorderLayout.NORTH);

		southbutton = new JButton("이벤트소스[SOUTH]");
		contentPane.add(southbutton, BorderLayout.SOUTH);
		
		westbutton = new JButton("이벤트소스[WEST]");
		contentPane.add(westbutton, BorderLayout.WEST);
		/********************* 이벤트쏘스에 이벤트핸들러객체를 등록 ***********************/
		/****** 외부클래스 *********/
		NorthButtonActionEventHandler handler1 = new NorthButtonActionEventHandler(this);

		northbutton.addActionListener(handler1);

		/****** 멤버내부클래스 *********/
		SoutButtonActionEventHandler handler2 = new SoutButtonActionEventHandler();
		southbutton.addActionListener(handler2);

		/******anonymous(익명) local inner 클래스********/
		ActionListener handler3 = new ActionListener() {
			int buttonClick=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				southbutton.setText("이벤트쏘스[SOUTH}" + ++buttonClick);
				setTitle("button click count : " + ++buttonClick);
				int r = (int)(Math.random()*255);
				int g = (int)(Math.random()*255);
				int b = (int)(Math.random()*255);
				contentPane.setBackground(new Color(r,g,b));
					
				
			}
		};
		
		westbutton.addActionListener(handler3);
		
		/********************************************/

	}// 생성자끝

	/***********************************
	 * member inner class
	 *********************************/
	public class SoutButtonActionEventHandler implements ActionListener {
		int buttonClickCount=0;
		@Override
		public void actionPerformed(ActionEvent e) {
			southbutton.setText("이벤트쏘스[SOUTH}" + ++buttonClickCount);
			setTitle("button click count : " + ++buttonClickCount);
			int r = (int)(Math.random()*255);
			int g = (int)(Math.random()*255);
			int b = (int)(Math.random()*255);
			contentPane.setBackground(new Color(r,g,b));
			
		}
	}

}
