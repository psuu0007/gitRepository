package shopping;

import human.Customer;
import products.tv.Tv;
import shop.DigitalShop;

public class PlayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer = new Customer("홍길동", 5000);
		Tv tv = new Tv("메가Tv", 5000);
		DigitalShop ds = new DigitalShop("더조은샾", 100000, tv);
//		DigitalShop ds = new DigitalShop("더조은샾", 100000);
		
//		ds.tv = tv;
//		customer.tv = tv;
		
		customer.myInfoView();
		
		ds.showProducts();
		
		
		ds.sellProduct(customer);
		
		customer.myInfoView();
		
		// tv를 판매했으니 이젠 없다
		ds.showProducts();
		
		
	}

}
