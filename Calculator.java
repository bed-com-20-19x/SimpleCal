// package Calculator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

private JFrame frame;
private JTextField textDisplay;
	
double firstnum;
double secondnum;
String operation;
String answer;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Calculator window = new Calculator();
window.frame.setVisible(true);
} 
catch (Exception e) {
e.printStackTrace();
    }
   }
 });
}

/**
* Create the application.
*/
public Calculator() {
initialize();
 }

/**
* Initialize the contents of the frame.
*/
private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 265, 367);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setFont(new Font("Tahoma", Font.BOLD, 20));
		textDisplay.setBounds(10, 11, 230, 60);
		frame.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		//-------------row1---------------------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String EnterNumber = textDisplay.getText() + btn7.getText();
			textDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 82, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String EnterNumber = textDisplay.getText() + btn8.getText();
			textDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(70, 82, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String EnterNumber = textDisplay.getText() + btn9.getText();
			textDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(130, 82, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double firstnum = Double.parseDouble(textDisplay.getText());
			textDisplay.setText("");
			operation ="+";
			
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(190, 83, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		//-------------row2---------------------------
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String EnterNumber = textDisplay.getText() + btn4.getText();
			textDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 142, 50, 50);
		frame.getContentPane().add(btn4);
				
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String EnterNumber = textDisplay.getText() + btn5.getText();
			textDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(70, 142, 50, 50);
		frame.getContentPane().add(btn5);
				
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String EnterNumber = textDisplay.getText() + btn6.getText();
			textDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(130, 142, 50, 50);
		frame.getContentPane().add(btn6);
				
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			double firstnum = Double.parseDouble(textDisplay.getText());
			textDisplay.setText("");
			operation ="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(190, 142, 50, 50);
		frame.getContentPane().add(btnSub);
		
		
		//-------------row3---------------------------
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String EnterNumber = textDisplay.getText() + btn1.getText();
			textDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 202, 50, 50);
		frame.getContentPane().add(btn1);
				
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String EnterNumber = textDisplay.getText() + btn2.getText();
			textDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(70, 202, 50, 50);
		frame.getContentPane().add(btn2);
				
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String EnterNumber = textDisplay.getText() + btn3.getText();
			textDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(130, 202, 50, 50);
		frame.getContentPane().add(btn3);
				
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			double firstnum = Double.parseDouble(textDisplay.getText());
			textDisplay.setText("");
			operation ="*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMult.setBounds(190, 202, 50, 50);
		frame.getContentPane().add(btnMult);
		
		//-------------row3---------------------------
				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					String EnterNumber = textDisplay.getText() + btn0.getText();
					textDisplay.setText(EnterNumber);
					}
				});
				btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn0.setBounds(10, 262, 50, 50);
				frame.getContentPane().add(btn0);
						
				JButton btnDot = new JButton(".");
				btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDot.setBounds(70, 262, 50, 50);
				frame.getContentPane().add(btnDot);
						
				JButton btnEquals = new JButton("=");
				btnEquals.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					String answer;
						
					double firstnum = Double.parseDouble(textDisplay.getText());
					textDisplay.setText("");
					operation ="=";
					}
				});
				btnEquals.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnEquals.setBounds(130, 262, 50, 50);
				frame.getContentPane().add(btnEquals);
						
				JButton btnDev = new JButton("/");
				btnDev.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					double firstnum = Double.parseDouble(textDisplay.getText());
					textDisplay.setText("");
					operation ="/";
					}
				});
				btnDev.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDev.setBounds(190, 262, 50, 50);
				frame.getContentPane().add(btnDev);
	}
}
