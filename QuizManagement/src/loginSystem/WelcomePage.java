package loginSystem;

import java.awt.*;
import javax.swing.*;

public class WelcomePage {
	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("Hello!");
	
	WelcomePage(String userID){
		
		welcomeLabel.setBounds(0,0,200,35);
		welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
		welcomeLabel.setText("Good Luck!!");
		//welcomeLabel.setFontcolor(20,20,20);
		
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(820, 820);
		//frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(null);
		frame.setVisible(true);
		
		Quiz quiz = new Quiz();
	}

}
