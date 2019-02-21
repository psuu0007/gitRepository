package shopping.test;

import java.util.Scanner;

import shopping.product.Computer;
import shopping.product.Tv;
import shopping.user.Buyer;

public class ShopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		Buyer user1 = new Buyer("박기성", 500);

		System.out.println("동기의 소지금");
		int money = scan.nextInt();

		Buyer user2 = new Buyer("조혜선", money);

		Tv tjTv = new Tv("조은 티비", 100);
		Tv acTv = new Tv("아카데미 티비", 300);

		Computer tjCom = new Computer("좋은 컴퓨터", 400);

		System.out.println("아카데미 컴퓨터 가격");
		int price = scan.nextInt();

		Computer acCom = new Computer("아카데미 컴퓨터", price);

		user1.buy(acCom);
		user1.getBuyerInfo();

	}

}
