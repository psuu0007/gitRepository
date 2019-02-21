package shoppoing.user;

import shoppoing.book.Book;
import shoppoing.product.Product;

public class Buyer {

	public int money = 0;
	public int bonusPoint = 0;
	public String userName = "";

	public Buyer(String name, int money) {
		this.userName = name;
		this.money = money;
	}

	public void buy(Product product) {

		if (money < product.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			System.out.println("부족한 금액: " + (product.price - money));
			return;
		}

		money = money - product.price; // 가진 돈에서 구입한 제품의 가격을 뺸다
		bonusPoint = bonusPoint + product.bonusPoint; // 제품의 보너스 점수를 추가한다.

		String productNameStr = "";
		productNameStr = product.myProductName();
		System.out.println(productNameStr + "를 구입하셨습니다");

	}

	public void buy(Book book) {

		if (money < book.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			System.out.println("부족한 금액: " + (book.price - money));
			return;
		}

		money = money - book.price; // 가진 돈에서 구입한 제품의 가격을 뺸다
		bonusPoint = bonusPoint + book.bonusPoint; // 제품의 보너스 점수를 추가한다.

		String productNameStr = "";
		productNameStr = book.myProductName();
		System.out.println(productNameStr + "를 구입하셨습니다");
	}
}