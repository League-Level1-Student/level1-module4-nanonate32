package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class calculator implements ActionListener {JFrame frame = new JFrame();
	      JPanel panel = new JPanel();
	      JButton add = new JButton(add);
	      JButton subtract = new JButton(subtract);	
	      JButton multiply = new JButton(multiply);	
	      JButton divide = new JButton(divide);   
	      JTextField firstInt = new JTextField(10);
	      JTextField secondInt = new JTextField(10);
	void run() {	
		frame.setVisible(true);
		frame.add(panel);
		 panel.add(add);
	      panel.add(subtract);
	      panel.add(multiply);
	      panel.add(divide);
	      panel.add(firstInt);
	      panel.add(secondInt);
	      add.addActionListener(this);
	      subtract.addActionListener(this);
	      multiply.addActionListener(this);
	      divide.addActionListener(this);
	      frame.pack();
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     
	}
	
int add(int firstNum, int secondNum) {
	return firstNum+ secondNum;
	
}
int subtract(int firstNum, int secondNum) {
	return firstNum- secondNum;
}
int multiply(int firstNum, int secondNum) {
	return firstNum* secondNum;
}
int divide(int firstNum, int secondNum) {
	return firstNum/ secondNum;
}

@Override        
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	  int num = Integer.parseInt(firstInt.getText());
	  int num2 = Integer.parseInt(firstInt.getText());
	if(e.getSource() == add) {
		add(num, num2);
		
	}
	if(e.getSource() == subtract) {
		subtract(num, num2);
		
	}
	if(e.getSource() ==  multiply) {
		multiply(num, num2);
		
	}
	if(e.getSource() == divide) {
		divide(num, num2);
		
	}
	}
}



