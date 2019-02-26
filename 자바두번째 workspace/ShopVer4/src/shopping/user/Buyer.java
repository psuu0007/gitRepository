package shopping.user;

import java.util.Arrays;

import shopping.product.Product;

public class Buyer {

	public String name = "";
	public int money = 400;
	public int bousPoint = 0;
	//
	public Product[] itemArr = new Product[10]; // 구입한 제품을 저장 하기 위한 배열
	public int cnt = 0; // Product배열 itemArr에 사용될 index
	
	public Buyer() {
		
	}
	
	public Buyer(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}

	public Buyer(String name, int money, int bousPoint, Product[] itemArr, int cnt) {
		super();
		this.name = name;
		this.money = money;
		this.bousPoint = bousPoint;
		this.itemArr = itemArr;
		this.cnt = cnt;
	}

	public void buy(Product product) {
		if (money < product.getPrice()) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			System.out.println("부족한 금액 : " + (product.getPrice() - money));
			return;
		}

		money = money - product.getPrice(); // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bousPoint = bousPoint + product.getBonusPoint(); // 제품의 보너스 점수를 추가한다.

		//
		itemArr[cnt++] = product; // 제품을 저장함 배열에
//      cnt++;

		System.out.println(product + "를 구입하셨습니다.");
		System.out.println();
	}

	//
	// 구매자의 정보를 출력한다
	public void showProductInfo() {
		int sum = 0;
		String itemListStr = "";

		System.out.println("[" + name + "]님의 물품 구매 내역");
		
		for (int i = 0; i < itemArr.length; i++) {
			if (itemArr[i] == null) {
				break;
			}

			sum = sum + itemArr[i].getPrice();
			itemListStr = itemListStr + itemArr[i] + ", ";

		} // for end
		int last = itemListStr.lastIndexOf(", ");
		if(last >= 0) {
			itemListStr = itemListStr.substring(0, last);
		}else {
			itemListStr = "없습";
		}

		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemListStr + " 입니다.");
		System.out.println();
	}

	@Override
	public String toString() {
		return "Buyer [name=" + name + ", money=" + money 
				+ ", bousPoint=" + bousPoint + ", itemArr="
				+ Arrays.toString(itemArr) + ", cnt=" + cnt + "]";
	}

	
}
