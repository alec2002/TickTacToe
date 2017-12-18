import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TicTacToe implements ActionListener{
	
public static void main(String[] args) {
	TicTacToe mainclass = new TicTacToe();
	TickTacToeGraphics gfx = new TickTacToeGraphics();
	TickTacToeLogic lgc = new TickTacToeLogic();
	gfx.setActionListener(mainclass);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	
	
}
}
