package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class typing_tutor implements KeyListener {
	char currentLetter;
	JLabel label = new JLabel();
	JFrame frame = new JFrame();

	public static void main(String[] args) {
		// only cool method with void return type and parameters
		typing_tutor bob = new typing_tutor();
		bob.setup();
	}

	void setup() {

		frame.setTitle("type or get zucced");
		frame.add(label);

		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(this);
		frame.pack();
		frame.setVisible(true);

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// Uncool Method

		System.out.println(e.getKeyChar());
		if (e.getKeyChar() == currentLetter) {
			System.out.println("correct");
			frame.setBackground(new Color(0, 0, 255));
		}

		else {
			System.out.println("incorrect");
			frame.setBackground(new Color(255, 0, 0));
		}
		currentLetter = generateRandomLetter();
        
		label.setText(String.valueOf(currentLetter));
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// Uncool Method

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
