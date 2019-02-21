package shopping.product;

public class Product {

	public String name;

	public int price; // 제품의 가격
	public int bonusPoint; // 제품구매 시 제공하는 보너스점수

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
		bonusPoint = (int) (price / 10.0); // 보너스점수는 제품가격의 10%
	}

	public String myProductName() {
		return name;
	}

}
