package shopping.test;

import java.util.Scanner;

import shopping.product.Computer;
import shopping.product.Tv;
import shopping.user.Buyer;

public class ShopTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("구매자의 소지금을 입력해주세요");
		int inputMoney = scan.nextInt();
		
		Buyer user1 = new Buyer("박성욱", 500);
		Buyer user2 = new Buyer("최문권", inputMoney);
		
		Tv tv1 = new Tv("조은Tv", 100);
		Computer com1 = new Computer("아카데미 com");
		Computer com2 = new Computer("조은 com");
		
		com1.inputComPrice();
		
//		System.out.println("구매자의 이름: " + user2.name);
//		System.out.println("구매자의 돈: " + user2.money);
		
		System.out.println(com1.name + "의 이름: " + com1.name);
		System.out.println(com1.name + "의 가격: " + com1.price);
		System.out.println(com2.name + "의 이름: " + com2.name);
		System.out.println(com2.name + "의 가격: " + com2.price);
		
//		Tv tv1 = new Tv(); // 0x1212
//		Computer com1 = new Computer();
//
////		Product p = tv1;
//		
//		user1.buy(tv1);
//		System.out.println("Tv를 구매한 후 사용자의 정보");
//		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
//		System.out.println("현재 보너스점수는 " + user1.bonusPoint + "점입니다");
//		System.out.println();
//
//		user1.buy(com1);
//		System.out.println("Computer를 구매한 후 사용자의 정보");
//		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
//		System.out.println("현재 보너스점수는 " + user1.bonusPoint + "점입니다");
//		System.out.println();
//
//		user1.buy(com1);
//		System.out.println("컴퓨터를 구매못한 사용자의 정보");
//		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
//		System.out.println("현재 보너스점수는 " + user1.bonusPoint + "점입니다");
//		System.out.println();
//
//		user1.buy(tv1);
//		System.out.println("Tv를 구매못한 사용자의 정보");
//		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
//		System.out.println("현재 보너스점수는 " + user1.bonusPoint + "점입니다");
//		System.out.println();
//
//		user1.buy(tv1);
//		System.out.println("Tv를 구매못한 사용자의 정보");
//		System.out.println("현재 남은 돈은 " + user1.money + "만원입니다");
//		System.out.println("현재 보너스점수는 " + user1.bonusPoint + "점입니다");
//		System.out.println();

	}

}
