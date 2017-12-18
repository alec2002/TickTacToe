import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class TickTacToeGraphics {
JButton[] buttons;
JFrame frame;
JPanel panel;
public TickTacToeGraphics(){
	frame = new JFrame("Tic Tack Toe");
	panel = new JPanel(new GridLayout(3, 3));
	buttons = new JButton[9];
	frame.add(panel);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
	for (int i = 0; i < buttons.length; i++) {
		buttons[i] = new JButton();
		panel.add(buttons[i]);
		
	}
}

public void setButtonState(int button, int state){
	//if () {
		
	//}//set text
	//disable button
}

public int getClickedButtonLocation(ActionEvent e){
for (int i = 0; i < buttons.length; i++) {
	if (e.getSource() == buttons[i]) {
		return i;
	}
}
return 0;
}

public void resetGame(){
	//set buttons to blank
	//enable buttons
}

public void setActionListener(ActionListener a){
	for (int i = 0; i < buttons.length; i++) {
		buttons[i].addActionListener(a);
	}//iterater through buttons
// set ActionListener
}
}
