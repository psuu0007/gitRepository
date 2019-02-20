package game.dice;

import game.rull.BoardGame;
import game.user.Player;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice dice = new Dice();
		
		Player player = new Player("그쟈?");
//		player.dice = dice;
		
		BoardGame game = new BoardGame();
		
		game.gamePlay(player);
		
		
		
	}

}
