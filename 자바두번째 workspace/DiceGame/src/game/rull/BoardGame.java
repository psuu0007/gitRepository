package game.rull;

import game.dice.Dice;
import game.user.Player;

public class BoardGame {

//	승리 조건
	private final int victoryConditionNum = 15;
	public Dice dice = new Dice();
	
	public boolean gamePlay(Player player) {
		while(true) {
			player.diceThrow(dice);
			
			System.out.println("플레이어가 가진 총 숫자: " + player.totalNumDice);
			
			if(player.totalNumDice < victoryConditionNum) {
				System.out.println("아직 경기가 끝나지 않았습니다.");
				System.out.println("남은 점수: " + 
						(victoryConditionNum - player.totalNumDice));
			}else {
				System.out.println(player.name + "님 WINNER!!");
				System.out.println("플레이어의 숫자가 " + victoryConditionNum + "를 넘었습니다.");
				break;
			}
			
			System.out.println();
		}
		
		return true;
	}
	
}
