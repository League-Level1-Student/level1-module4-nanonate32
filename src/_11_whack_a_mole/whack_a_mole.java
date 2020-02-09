package _11_whack_a_mole;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class whack_a_mole implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random random = new Random();
	
    
    
    int molesWhacked = 0;
    int molesMissed = 0;
    Date TimeAtStart;
    
	void drawButtons(int randy) {
		
   JButton button = (JButton) panel.getComponent(randy);
    button.setText("mole!");
	}
	void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	void makeButtons() {
		
			 frame = new JFrame();
			 panel = new JPanel();
			frame.add(panel);
			frame.setSize(500,500);
			frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			button.addActionListener(this);
			panel.add(button);
		}
		drawButtons(random.nextInt(24));
	}
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
	void run() {
		TimeAtStart = new Date(); 
		frame.add(panel);
		GridLayout layout = new GridLayout(8, 3);
		panel.setLayout(layout);
		makeButtons();
		
		drawButtons(random.nextInt(24));
		frame.setSize(500,500);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {

		whack_a_mole bob = new whack_a_mole();
		bob.run();
		

	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(((JButton) e.getSource()).getText().equals("mole!")) {
		speak("correct");
		 molesWhacked +=1;
		 
		 
		}
		else {
		speak("mist");
		molesMissed +=1;
		
		}
		if(molesMissed == 5) {
			JOptionPane.showMessageDialog(null, "You lose!");
			endGame(TimeAtStart,molesWhacked);
		}
		frame.dispose();
		makeButtons();
		}
	}


