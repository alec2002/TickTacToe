import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TicTacToe implements ActionListener{
	int num = 0;
	TickTacToeGraphics gfx = new TickTacToeGraphics();
	TickTacToeLogic lgc = new TickTacToeLogic();
	
public static void main(String[] args) {
	TicTacToe mainclass = new TicTacToe();
	
}
TicTacToe(){
	gfx.setActionListener(this);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	
	lgc.checkWin(gfx.getClickedButtonLocation(e));
	gfx.setButtonState(gfx.getClickedButtonLocation(e), lgc.getPlayerTurn());
	lgc.changePlayerTurn();
}
}
