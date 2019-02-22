package shopping.product;

public class Product {

	protected String name;
	protected int price; // 제품의 가격
	protected int bonusPoint; // 제품구매 시 제공하는 보너스점수

	

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "";
		
		str += name + "\n";
		str += price + "\n";
		str += bonusPoint + "\n";
//		str += addProduct + "\n";
		
		return str;
	}
	
	
	
}
