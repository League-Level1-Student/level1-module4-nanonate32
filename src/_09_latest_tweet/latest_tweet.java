package _09_latest_tweet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class latest_tweet implements ActionListener {
	private String getLatestTweet(String searchingFor) {

	    Twitter twitter = new TwitterFactory().getInstance();

	    AccessToken accessToken = new AccessToken(
	        "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
	        "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
	    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
	        "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
	    twitter.setOAuthAccessToken(accessToken);

	Query query = new Query(searchingFor);
	    try {
	        QueryResult result = twitter.search(query);
	        return result.getTweets().get(0).getText();
	    } catch (Exception e) {
	        System.err.print(e.getMessage());
	        return "What the heck is that?";
	    }
	}
	JTextField textfield = new JTextField(11);
	public void run() {
JFrame frame = new JFrame("The amazing tweet retriever");
frame.setVisible(true);
JPanel panel = new JPanel();
JButton button = new JButton("Search the Twitterverse");

frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
frame.add(panel);
panel.add(textfield);
panel.add(button);
button.addActionListener(this);
frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Tweet!,Tweet!");
		String latestTweet = getLatestTweet(textfield.getText());
		System.out.println(latestTweet);
	}

	
		
		
	
}
