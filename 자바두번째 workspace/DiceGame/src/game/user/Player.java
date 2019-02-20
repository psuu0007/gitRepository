package game.user;

import game.dice.Dice;

public class Player {

	public String name = "";
	public int totalNumDice = 0;
//	public Dice dice = null;  // 주사위 내 소유
	
	public Player() {
		
	}

	public Player(String name) {
		this.name = name;
	}
	
	public void diceThrow(Dice dice) {
		dice.diceThrow();
		dice.diceView();
		
		totalNumDice = totalNumDice + dice.getDiceNum(); 
	}
	
	public void myInfoView() {
		System.out.println("==============플레이어 정보==============");
		System.out.println("플레이어 이름: " + name);
		System.out.println("주사위를 굴린 숫자의 총합: " + totalNumDice);
		System.out.println("=====================================");
		System.out.println();
	}
	
}
