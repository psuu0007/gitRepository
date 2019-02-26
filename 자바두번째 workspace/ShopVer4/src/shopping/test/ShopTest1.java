package shopping.test;

import shopping.product.Computer;
import shopping.product.Tv;
import shopping.user.Buyer;

public class ShopTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer user1 = new Buyer("홍길동", 10000);
		Buyer user2 = new Buyer("제우스", 1000);
		Tv tv1 = new Tv();
		Computer com1 = new Computer();
		
		user1.buy(tv1);
		user1.buy(com1);
		
		user1.showProductInfo();
//		System.out.println(user1);
		
//		System.out.println();
		
		user2.buy(tv1);
		user2.buy(com1);
		
		user2.showProductInfo();
//		System.out.println(user2);
		
		
	}

}
