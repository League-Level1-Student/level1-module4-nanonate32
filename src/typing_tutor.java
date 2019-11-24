
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class typing_tutor {

	public static void main(String[] args) {
		// only cool method with void return type and parameters
		typing_tutor bob = new typing_tutor();
		bob.setup();
	}

	void setup() {
		JFrame frame = new JFrame();
		
		JLabel label = new JLabel();
		frame.setVisible(true);
		frame.setTitle("type or get zucced");
		char currentLetter;
		currentLetter = generateRandomLetter();
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

}
