package shopping.product;

public class Computer extends Product {
	
//	public Computer() {
//		// 조상클래스의 생성자 Product(int price)를 호출한다
//		super(200);	//Tv의 가격을 100만원으로 한다
//	}
	
	public Computer(String name, int price) {
		super(name, price);
	}
	
//	public String toString() { //Object클래스의 toStirng()을 오버로딩한다
//		return "Computer";
//	}
	
	public String myProductName() {
		return name;
	}

}
