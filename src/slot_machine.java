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
	int random = 3;
	GridLayout layout = new GridLayout(1, 4);

	void run() {

		frame.add(panel);
		panel.setLayout(layout);
		panel.add(spin);
		
		spin.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
          
		try {
			
			JLabel cherry = createLabelImage("slotMachine_cherry.jpg");
			JLabel creeper = createLabelImage("slotMachine_creeper.jpeg");
			JLabel johnCena = createLabelImage("slotMachine_JohnCena.jpg");
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
		// TODO Auto-generated method stub
               switch(random) {
               case 1:
            	   cherry.seti
               case 2:
            	   
               case 3:
               }
	}
}
