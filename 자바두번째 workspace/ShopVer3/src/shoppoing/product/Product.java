package shoppoing.product;

public class Product {

	public int price;	// 제품의 가격
	public int bonusPoint;		// 제품구매 시 제공하는 보너스 점수
	public String productName;
	
	public Product(String name, int price){
		this.productName = name;
		this.price = price;
	}
	
	public String myProductName() { //추가함!
//				(이후 자식의 오버라이딩된 메서드에 접근하려면 부모도 같은 이름의 메서드를 가져야하기 때문에)
		return "제품";
	}
	
}
