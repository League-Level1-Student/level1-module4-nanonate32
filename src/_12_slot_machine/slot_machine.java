package _12_slot_machine;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slot_machine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spin = new JButton();
	JLabel cherry;
	JLabel creeper;
	JLabel johnCena;
	Random random = new Random();

	GridLayout layout = new GridLayout(1, 4);

	void run() {

		frame.add(panel);
		panel.setLayout(layout);
		panel.add(spin);
       
		spin.addActionListener(this);
		frame.pack();
		frame.setVisible(true);

		try {

			 cherry = createLabelImage("slotMachine_cherry.jpg");
			 creeper = createLabelImage("slotMachine_creeper.jpeg");
			 johnCena = createLabelImage("slotMachine_JohnCena.jpg");
			panel.add(cherry);
			panel.add(creeper);
			panel.add(johnCena);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		slot_machine slots = new slot_machine();
		slots.run();
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource().equals(spin)) {
			//panel.removeAll();
//			panel.add(spin);
			
			for (int i = 0; i < 3; i++) {
				JLabel label = new JLabel();
				switch (random.nextInt(3)) {
				case 0:
					try {
						label = createLabelImage("slotMachine_cherry.jpg");
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
                  
				case 1:
					try {
						label = createLabelImage("slotmachine_creeper.jpeg");
					} catch (MalformedURLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
                  
				case 2:
					try {
						label = createLabelImage("slotmachine_JohnCena.jpg");
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}

panel.add(label);
			}
			panel.repaint();
		}
		// TODO Auto-generated method stub
	}
}
