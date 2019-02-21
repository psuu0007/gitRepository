package shop;

import human.Customer;
import products.tv.Tv;

public class DigitalShop {
	
	public String shopName = "";
	public int money = 0;
	public Tv tv = null;
		
	public DigitalShop() {
		shopName = "더조은 샾";
		money = 100000;   // 10만원
	}

	public DigitalShop(String shopName
			, int money) {
		this.money = money;
		this.shopName = shopName;
	}

	public DigitalShop(String shopName
			, int money, Tv tv) {
		this.money = money;
		this.shopName = shopName;
		this.tv = tv;
	}
	
	// 가게에 존재하는 제품 보여주기
	public void showProducts() {
		System.out.println("가게이름: " + shopName);
//		System.out.println("가게소지금: " + money);
		
		if(tv == null) {
			System.out.println("소지한 tv가 존재하지 않습니다");
		}else {
			tv.myInfoView();
		}
		
	}
	
	// 가전제품을 고객에게 판매하는 기능
	public void sellProduct(Customer customer) {
		money = money + tv.price;
		customer.money = customer.money - tv.price;
		
		customer.tv = tv;
		
		tv = null;
		
		System.out.println("tv를 팔았습니다");
		System.out.println();
	}
	
	
}
