package _10_pig_latin;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pigLatinBranslator implements ActionListener {

	PigLatinTranslator translator = new PigLatinTranslator();

	static JFrame frame = new JFrame("Pig Latin");
	static JPanel panel = new JPanel();
	static JTextField textfield = new JTextField(11);
	static JTextField vexfield = new JTextField(11);
	static JButton button = new JButton("translate");

	void run() {

		button.addActionListener(this);
		frame.add(panel);
		panel.add(textfield);
		panel.add(button);
		panel.add(vexfield);

		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.pack();
		textfield.setSize(1000, 1000);
		vexfield.setSize(1000, 1000);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		pigLatinBranslator branslator = new pigLatinBranslator();
		branslator.run();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String pig = textfield.getText();
		String cool = translator.translate(pig);
		vexfield.setText(cool);
	}

}