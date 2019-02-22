package shopping.test;

import shopping.product.Computer;
import shopping.product.Product;
import shopping.product.Tv;

public class ShopTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p = new Product();
		Tv tv = new Tv();
		Computer com = new Computer();
		
		p.setBonusPoint(100);
		p.setName("커피");
		p.setPrice(2500);
		
		System.out.println(p);
		
		tv.setBonusPoint(1000);
		tv.setName("폴더블 Tv");
		tv.setPrice(2000000);
		
		System.out.println(tv);
		
		com.setBonusPoint(300);
		com.setName("가정용 컴퓨터");
		com.setPrice(500000);
		
		System.out.println(com);
		
		
	}

}
