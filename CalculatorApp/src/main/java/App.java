import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class App {

	private JFrame frame;
	private JTextField display;

	
	
	double selection,result,num1,num2;
	int operation;
	

	
	public void Calculation() {
		switch(operation)
		{
		case 1:
			result = selection + Double.parseDouble(display.getText());
			display.setText(Double.toString(result));
			break;
			
			
		case 2:
			result = selection - Double.parseDouble(display.getText());
			display.setText(Double.toString(result));
			break;
			
		case 3:
			result = selection * Double.parseDouble(display.getText());
			display.setText(Double.toString(result));
			break;
			
		case 4:
			result = selection / Double.parseDouble(display.getText());
			display.setText(Double.toString(result));
			break;
		
		default:
			
			JOptionPane.showMessageDialog(null, "Incorrect");
			return;
		
		}
		
		display.setText(Double.toString(result));
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
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
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 204, 255));
		frame.setBounds(100, 100, 450, 655);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		display = new JTextField();
		display.setBounds(15, 37, 398, 58);
		frame.getContentPane().add(display);
		display.setColumns(10);
		
		JButton num0 = new JButton("0");
		num0.setFont(new Font("Tahoma", Font.BOLD, 20));
		num0.setBackground(new Color(0, 255, 0));
		num0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String num = display.getText() + "0";
				display.setText(num);
			}
		});
		num0.setBounds(15, 507, 115, 43);
		frame.getContentPane().add(num0);
		
		JButton button = new JButton(".");
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.setBackground(new Color(0, 255, 0));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + ".";
				display.setText(num);
			}
		});
		button.setBounds(187, 507, 107, 43);
		frame.getContentPane().add(button);
		
		JButton num1 = new JButton("1");
		num1.setFont(new Font("Tahoma", Font.BOLD, 20));
		num1.setBackground(new Color(0, 255, 0));
		num1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num = display.getText() + "1";
				display.setText(num);
			}
		});
		num1.setBounds(15, 439, 78, 49);
		frame.getContentPane().add(num1);
		
		JButton num2 = new JButton("2");
		num2.setFont(new Font("Tahoma", Font.BOLD, 20));
		num2.setBackground(new Color(0, 255, 0));
		num2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + "2";
				display.setText(num);
			}
		});
		num2.setBounds(117, 439, 78, 49);
		frame.getContentPane().add(num2);
		
		JButton num3 = new JButton("3");
		num3.setFont(new Font("Tahoma", Font.BOLD, 20));
		num3.setBackground(new Color(0, 255, 0));
		num3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + "3";
				display.setText(num);
			}
		});
		num3.setBounds(216, 439, 78, 49);
		frame.getContentPane().add(num3);
		
		JButton num4 = new JButton("4");
		num4.setFont(new Font("Tahoma", Font.BOLD, 20));
		num4.setBackground(new Color(0, 255, 0));
		num4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + "4";
				display.setText(num);
			}
		});
		num4.setBounds(15, 374, 78, 49);
		frame.getContentPane().add(num4);
		
		JButton num5 = new JButton("5");
		num5.setFont(new Font("Tahoma", Font.BOLD, 20));
		num5.setBackground(new Color(0, 255, 0));
		num5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + "5";
				display.setText(num);
			}
		});
		num5.setBounds(117, 374, 78, 49);
		frame.getContentPane().add(num5);
		
		JButton num6 = new JButton("6");
		num6.setFont(new Font("Tahoma", Font.BOLD, 20));
		num6.setBackground(new Color(0, 255, 0));
		num6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + "6";
				display.setText(num);
			}
		});
		num6.setBounds(216, 374, 78, 49);
		frame.getContentPane().add(num6);
		
		JButton num7 = new JButton("7");
		num7.setFont(new Font("Tahoma", Font.BOLD, 20));
		num7.setBackground(new Color(0, 255, 0));
		num7.setForeground(Color.BLACK);
		num7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + "7";
				display.setText(num);
			}
		});
		num7.setBounds(15, 309, 78, 49);
		frame.getContentPane().add(num7);
		
		JButton num8 = new JButton("8");
		num8.setFont(new Font("Tahoma", Font.BOLD, 20));
		num8.setBackground(new Color(0, 255, 0));
		num8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + "8";
				display.setText(num);
			}
		});
		num8.setBounds(117, 309, 78, 49);
		frame.getContentPane().add(num8);
		
		JButton num9 = new JButton("9");
		num9.setFont(new Font("Tahoma", Font.BOLD, 20));
		num9.setBackground(new Color(0, 255, 0));
		num9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + "9";
				display.setText(num);
			}
		});
		num9.setBounds(216, 309, 78, 49);
		frame.getContentPane().add(num9);
		
		JButton division = new JButton("/");
		division.setBackground(new Color(255, 255, 255));
		division.setFont(new Font("Tahoma", Font.BOLD, 20));
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = 4;
				selection = Double.parseDouble(display.getText());
				display.setText("");
			}
		});
		division.setBounds(309, 485, 115, 65);
		frame.getContentPane().add(division);
		
		JButton multiplication = new JButton("*");
		multiplication.setBackground(new Color(255, 255, 255));
		multiplication.setFont(new Font("Tahoma", Font.BOLD, 20));
		multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = 3;
				selection = Double.parseDouble(display.getText());
				display.setText("");
			}
		});
		multiplication.setBounds(309, 397, 115, 65);
		frame.getContentPane().add(multiplication);
		
		JButton subtraction = new JButton("-");
		subtraction.setBackground(new Color(255, 255, 255));
		subtraction.setFont(new Font("Tahoma", Font.BOLD, 20));
		subtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = 2;
				selection = Double.parseDouble(display.getText());
				display.setText("");
			}
		});
		subtraction.setBounds(309, 304, 115, 65);
		frame.getContentPane().add(subtraction);
		
		JButton addition = new JButton("+");
		addition.setBackground(new Color(255, 255, 255));
		addition.setFont(new Font("Tahoma", Font.BOLD, 20));
		addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = 1;
				selection = Double.parseDouble(display.getText());
				display.setText("");
				
				
			}
		});
		addition.setBounds(309, 221, 115, 65);
		frame.getContentPane().add(addition);
		
		JButton Enter = new JButton("=");
		Enter.setBackground(new Color(255, 255, 255));
		Enter.setFont(new Font("Tahoma", Font.BOLD, 20));
		Enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculation();
			}
		});
		Enter.setBounds(15, 221, 279, 65);
		frame.getContentPane().add(Enter);
		
		JButton Exit = new JButton("X");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Exit.setBackground(new Color(0, 0, 255));
		Exit.setFont(new Font("Tahoma", Font.BOLD, 20));
		Exit.setBounds(335, 111, 78, 58);
		frame.getContentPane().add(Exit);
		
		JButton Backspace = new JButton("B");
		Backspace.setBackground(new Color(128, 128, 128));
		Backspace.setFont(new Font("Tahoma", Font.BOLD, 20));
		Backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int lenght = display.getText().length();
				int num = display.getText().length() - 1;
				String store;
				
				StringBuilder sb = new StringBuilder(display.getText());
				
				if(lenght>0) {
					sb.deleteCharAt(num);
					store = sb.toString();
					display.setText(store);
				}
			}
		});
		Backspace.setBounds(15, 147, 78, 58);
		frame.getContentPane().add(Backspace);
		
		JButton clear = new JButton("C");
		clear.setBackground(new Color(128, 128, 128));
		clear.setFont(new Font("Tahoma", Font.BOLD, 20));
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				display.setText("");
				
			}
		});
		clear.setBounds(216, 147, 78, 58);
		frame.getContentPane().add(clear);
		
		JLabel lblJg = new JLabel("JG");
		lblJg.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblJg.setBounds(201, 0, 37, 29);
		frame.getContentPane().add(lblJg);
	}
}
