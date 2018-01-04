import java.lang.reflect.Array;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class TickTacToeLogic {
public final static int B = 0;
public final static int X = 1;
public final static int O = 2;
private int[] states = new int [9];
public final int XTurn = 0;
public final int OTurn = 1;
private int playerTurn = XTurn;
JButton[] buttons;

public TickTacToeLogic(){
	StartGame();
	buttons = new JButton[9];
}

public void StartGame(){
	for (int i = 0; i < states.length; i++) {
		states[i] = B;
	}
	JOptionPane.showMessageDialog(null, "X's go first");
}

public int getPlayerTurn(){
	return playerTurn;
}

public boolean checkWin(int buttonLoc){
	//iterate through states looking for winner
	for (int i = 0; i < states.length; i++) {
	if (states.equals(buttonLoc)) {
		playerTurn = XTurn;
		return true;
	}
	}
	
	playerTurn = OTurn;
	return false;
	//change player turn if false
	
}

public void handleWinCondition(){
	//Alert user of winner
	JOptionPane.showMessageDialog(null, playerTurn + " won the game");
	//ask for replay
	
}
public void handleDraw(){
	//Alert user of draw
	//Ask for replay
}

public boolean askForReplay(){
	
}
}
