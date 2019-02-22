package shopping.product;

public class Computer extends Product {
	
	private String plusKeyboard = "키보드 제공";
	
//	public Computer() {
//		// 조상클래스의 생성자 Product(int price)를 호출한다
//		super(200);	//Tv의 가격을 100만원으로 한다
//	}
	
	
//	public String toString() { //Object클래스의 toStirng()을 오버로딩한다
//		return "Computer";
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "";
		
		str += name + "\n";
		str += price + "\n";
		str += bonusPoint + "\n";
		str += plusKeyboard + "\n";
		
		return str;
	}
	
	
}
