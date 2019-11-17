package _03_jeopardy;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	ChuckleClicker john = new ChuckleClicker();
        john.makeButtons();
	}
    void makeButtons(){
    	JFrame frame = new JFrame();
    	frame.setVisible(true);
    	JPanel panel = new JPanel();
    	JButton joke = new JButton();
    	JButton punchline = new JButton();
    	panel.setVisible(true);
    	frame.add(panel);
    	panel.add(punchline);
    	panel.add(joke);
    	joke.setText("joke");
    	punchline.setText("punchline");
    	joke.addActionListener(this);
    	punchline.addActionListener(this);
    	
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == joke) {
		}
		}
	}   
	   
   

	
}