package shopping.test;

import shopping.product.Book;
import shopping.product.Computer;
import shopping.product.Tv;
import shopping.user.Buyer;

public class ShopTest3 {

	public static void main(String[] args) {

		Buyer user1 = new Buyer("박기성", 20000);

		Tv tjTv = new Tv("조은 티비", 100);
		Computer tjCom = new Computer("조은 컴퓨터", 400);
		Book javaBook = new Book("자바의 정석", 10000);
		Book comicBook = new Book("OnePiece", 4000);

		user1.buy(tjTv);
		user1.getBuyerInfo();

		user1.buy(tjCom);
		user1.getBuyerInfo();

		user1.buy(javaBook);
		user1.getBuyerInfo();

		user1.buy(comicBook);
		user1.getBuyerInfo();

	}

}
