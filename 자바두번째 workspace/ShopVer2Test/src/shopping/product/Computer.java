package shopping.product;

import java.util.Scanner;

public class Computer extends Product{

	public Computer(){
		
	}
	
	public Computer(String name) {
		this.name = name;
	}
	
	
//	public String toString() {
//		return "Computer";
//	}
	
	public void inputComPrice() {
		Scanner scan = new Scanner(System.in);
		int inputMoney = 0;

		System.out.println(name + "의 가격을 입력해주세요");
		inputMoney = scan.nextInt();
		
		price = inputMoney;
	}
	
	public String myProductName() {
		return "Computer"; 
	}
	
}
