package shopping.test;

import shopping.product.Computer;
import shopping.product.Tv;
import shopping.user.Buyer;

public class ShopTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer user1 = new Buyer();
		Tv tv1 = new Tv(); //0x1212
		Computer com1 = new Computer();
		
		user1.buy(tv1);
		System.out.println("Tv를 구매한 후 사용자의 정보");
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
		System.out.println("현재 보너스점수는 " + user1.bonusPoint + "점입니다");
		System.out.println();
		
		user1.buy(com1);
		System.out.println("Computer를 구매한 후 사용자의 정보");
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
		System.out.println("현재 보너스점수는 " + user1.bonusPoint + "점입니다");
		System.out.println();
		
		user1.buy(com1);
		System.out.println("컴퓨터를 구매못한 사용자의 정보");
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
		System.out.println("현재 보너스점수는 " + user1.bonusPoint + "점입니다");
		System.out.println();
		
		user1.buy(tv1);
		System.out.println("Tv를 구매못한 사용자의 정보");
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
		System.out.println("현재 보너스점수는 " + user1.bonusPoint + "점입니다");
		System.out.println();

		user1.buy(tv1);
		System.out.println("Tv를 구매못한 사용자의 정보");
		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
		System.out.println("현재 보너스점수는 " + user1.bonusPoint + "점입니다");
		System.out.println();
		
	}

}
