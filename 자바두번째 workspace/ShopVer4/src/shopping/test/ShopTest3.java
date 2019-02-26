package shopping.test;

import java.util.Scanner;

import shopping.product.Computer;
import shopping.product.Tv;
import shopping.user.Buyer;

public class ShopTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer[] userArr = new Buyer[4];
		
		Tv tv1 = new Tv();
		Computer com1 = new Computer();
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		int money = 0;
	
		try {
			for (int i = 0; i < userArr.length; i++) {
				System.out.println("구매자의 이름을 입력해주세요");
				name = scan.nextLine();
				System.out.println(name + "님의  소지금을 입력해주세요");
				money = Integer.parseInt(scan.nextLine());
				
				userArr[i] = new Buyer(name, money);
			}
		} catch (Exception e) {
			System.out.println("소지금은 숫자만 입력해주세요");
		}
		
		for (int i = 0; i < userArr.length; i++) {
			System.out.println(userArr[i]);
		}
//		System.out.println(userArr[0]);
//		System.out.println(userArr[1]);
//		System.out.println(userArr[2]);
//		System.out.println(userArr[3]);
		
		for (int i = 0; i < 3; i++) {
			userArr[2].buy(tv1);
		}
		
//		for (int i = 0; i < 2; i++) {
//			for (int n = 0; n < 3; i++) {
//				userArr[i+2].buy(tv1);
//			}
//		}
//		userArr[2].buy(tv1);
//		userArr[2].buy(tv1);
//		userArr[2].buy(tv1);
		
		for (int i = 0; i < 3; i++) {
			userArr[3].buy(tv1);
		}
		
		for (int i = 0; i < 7; i++) {
			userArr[3].buy(com1);
		}
		
//		userArr[3].buy(tv1);
//		userArr[3].buy(tv1);
//		userArr[3].buy(tv1);
//		userArr[3].buy(com1);
//		userArr[3].buy(com1);
//		userArr[3].buy(com1);
//		userArr[3].buy(com1);
//		userArr[3].buy(com1);
//		userArr[3].buy(com1);
//		userArr[3].buy(com1);
		
		for (int i = 0; i < userArr.length; i++) {
			System.out.println(userArr[i]);
			userArr[i].showProductInfo();
		}
		
		
		
//		for (int i = 0; i < userArr.length; i++) {
//			userArr[i].buy(tv1);
//		}
//		
//		for (int i = 0; i < userArr.length; i++) {
//			userArr[i].buy(com1);
//		}
//		
//		for (int i = 0; i < userArr.length; i++) {
//			userArr[i].showProductInfo();
//		}
		
	}

}
