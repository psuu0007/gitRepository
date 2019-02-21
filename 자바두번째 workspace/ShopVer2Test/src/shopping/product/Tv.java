package shopping.product;

public class Tv extends Product{

	public Tv(){
		// 조상클래스의 생성자 Product(int price)를 호출한다
		
	}
	
//	public String toString() { // Object클래스의 toString()을 오버라이딩한다.
//		return "Tv";
//	}
	
	public Tv(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String myProductName() {
		return "Tv";
	}
	
}
