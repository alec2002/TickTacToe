import java.lang.reflect.Array;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class TickTacToeLogic {
	int num = 0;
	public final static int B = 0;
	public final static int X = 1;
	public final static int O = 2;
	private int[] states = new int[9];
	public final static int XTurn = 0;
	public final static int OTurn = 1;
	private int playerTurn = XTurn;
	

	public TickTacToeLogic() {
		StartGame();
		
		
		
		
	}

	public void StartGame() {
		for (int i = 0; i < states.length; i++) {
			states[i] = B;
		}
		JOptionPane.showMessageDialog(null, "X's go first");
	}

	public int getPlayerTurn() {
		return playerTurn;
	}
	public void changePlayerTurn(){
		if (playerTurn == XTurn) {
			playerTurn = OTurn;
		}
		else{
			playerTurn = XTurn;
		}
		
	}

	public boolean checkWin(int buttonLoc) {
		// iterate through states looking for winner
		
		int turn = X;

		if (playerTurn == XTurn) {
			turn = X;
		} else {
			turn = O;
		}
			if (states[0] == turn && states[1] == turn && states[2] == turn) {
				return true;
			} else if (states[3] == turn && states[4] == turn
					&& states[5] == turn) {
				return true;
			} else if (states[6] == turn && states[7] == turn
					&& states[8] == turn) {
				return true;
			} else if (states[0] == turn && states[3] == turn
					&& states[6] == turn) {
				return true;
			} else if (states[1] == turn && states[4] == turn
					&& states[7] == turn) {
				return true;
			} else if (states[2] == turn && states[5] == turn
					&& states[8] == turn) {
				return true;
			} else if (states[0] == turn && states[4] == turn
					&& states[8] == turn) {
				return true;
			} else if (states[2] == turn && states[4] == turn
					&& states[6] == turn) {
				return true;
			} else {
				playerTurn = OTurn;
				return false;

				// change player turn if false
			}

		}

	

	public void handleWinCondition() {
		// Alert user of winner
		JOptionPane.showMessageDialog(null, playerTurn + " won the game");
		// ask for replay
JOptionPane.showConfirmDialog(null, "Do you want to play again?");


	}

	public void handleDraw() {
		// Alert user of draw
		// Ask for replay
	}

//	public boolean askForReplay() {
//
//	}
}
