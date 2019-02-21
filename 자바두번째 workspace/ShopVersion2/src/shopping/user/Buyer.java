package shopping.user;

import shopping.product.Product;

public class Buyer {

	public String name = "";
	public int money = 0;
	public int bonusPoint = 0;
	public Product product;

	public Buyer() {
	}

	public Buyer(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void buy(Product product) {
		this.product = product;
		if (money < product.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			System.out.println("부족한 금액: " + (product.price - money) + "원");
			return;
		}

		money = money - product.price; // 가진 돈에서 구입한 제품의 가격을 뺀다
		bonusPoint = bonusPoint + product.bonusPoint; // 제품의 보너스 점수를 추가한다.

//		System.out.println(tv + "를 구입하셨습니다");
		String productNameStr = "";
		productNameStr = product.myProductName();
		System.out.println(name + "님이 " + productNameStr + "를 구입하셨습니다");
	}

	public void getBuyerInfo() {
		System.out.println(product.myProductName() + "를 구매한 후 " + name + "님의 정보");
		System.out.println("현재 남은 돈은 " + money + "원입니다");
		System.out.println("현재 보너스점수는 " + bonusPoint + "점입니다");
		System.out.println();
	}
}
