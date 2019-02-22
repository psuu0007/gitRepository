package shopping.user;

import shopping.product.Product;

public class Buyer {

	private String name = "";
	private int money = 0;
	private int bonusPoint = 0;
	private Product product;

	public Buyer() {
	}

	public Buyer(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	

//	public void getBuyerInfo() {
//		System.out.println(product.myProductName() + "를 구매한 후 " + name + "님의 정보");
//		System.out.println("현재 남은 돈은 " + money + "원입니다");
//		System.out.println("현재 보너스점수는 " + bonusPoint + "점입니다");
//		System.out.println();
//	}
	
	
}
