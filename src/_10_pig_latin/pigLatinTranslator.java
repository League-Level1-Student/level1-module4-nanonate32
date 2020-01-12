package _10_pig_latin;

import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pigLatinTranslator {
	
		
	
static JFrame frame = new JFrame("Pig Latin");
static JPanel panel = new JPanel();
static JTextField textfield = new JTextField();
static JTextField vexfield = new JTextField();
static JButton button = new JButton("translate");

	
public static void main(String[] args) {
textfield.setSize(50, 50);
vexfield.setSize(50, 50);
frame.add(panel);
panel.add(textfield);
panel.add(vexfield);
panel.add(button);
frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);	
}
}