package shopping.product;

public class Tv extends Product {

//	public Tv() {
//		// 조상클래스의 생성자 Product(int price)를 호출한다
//		super(100);	//Tv의 가격을 100만원으로 한다
//	}

	public Tv(String name, int price) {
		super(name, price);
	}

//	public String toString() { //Object클래스의 toStirng()을 오버로딩한다
//		return "Tv";
//	}

	public String myProductName() {
		return name;
	}

}
