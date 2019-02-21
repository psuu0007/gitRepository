package shopping.user;

import shopping.product.Computer;
import shopping.product.Tv;

public class Buyer {

	public int money = 400;
	public int bonusPoint = 0;
	
	public void buy(Tv tv) {
		if(money < tv.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			System.out.println("부족한 금액: " + (tv.price - money));
			return;
		}
		
		money = money - tv.price; // 가진 돈에서 구입한 제품의 가격을 뺀다
		bonusPoint = bonusPoint + tv.bonusPoint; // 제품의 보너스 점수를 추가한다.
		
		String productNameStr = "";
		productNameStr = tv.myProductName();
		System.out.println(productNameStr + "를 구입하셨습니다");
	}
	
	public void buy(Computer computer) {
		if(money < computer.price) { //100 < 200
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			System.out.println("부족한 금액: " + (computer.price - money));
			return;
		}

		money = money - computer.price; // 가진 돈에서 구입한 제품의 가격을 뺀다
		bonusPoint = bonusPoint + computer.bonusPoint; // 제품의 보너스 점수를 추가한다.
		System.out.println(computer.myProductName() + "를 구입하셨습니다");
		
	}
	
}
