package shopping.test;

import java.util.Scanner;

import shopping.product.Book;
import shopping.product.Computer;
import shopping.product.Tv;
import shopping.user.Buyer;

public class ShopTest4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("자신의 이름을 입력하세요");
		String name = scan.next();

		System.out.println("자신의 소지금을 입력하세요");
		int money = scan.nextInt();

		Buyer user1 = new Buyer(name, money);

		Tv tjTv = new Tv("조은 티비", 100);
		Computer tjCom = new Computer("조은 컴퓨터", 400);
		Book javaBook = new Book("자바의 정석", 10000);
		Book comicBook = new Book("OnePiece", 4000);

		for (int i = 0; i < 9999; i++) {
			System.out.println("구입할 물건을 고르세요. 1. 조은 티비(100원) 2. 조은 컴퓨터(400원) 3. 자바의 정석(10000원) 4. OnePiece(4000원)");
			int buyProduct = scan.nextInt();
			
			switch (buyProduct) {
			case 1:
				user1.buy(tjTv);
				user1.getBuyerInfo();		
				break;
				
			case 2:
				user1.buy(tjCom);
				user1.getBuyerInfo();
				break;
				
			case 3:
				user1.buy(javaBook);
				user1.getBuyerInfo();
				break;
				
			case 4:
				user1.buy(comicBook);
				user1.getBuyerInfo();
				break;

			default:
				break;
			}
		}
		

	}

}
