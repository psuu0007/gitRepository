import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberSum numberSum = new NumberSum();
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		int num2 = 0;
		
		System.out.println("숫자를 하나 입력해주세요");
		num = scan.nextInt();
		
		sum = numberSum.add(num);
		
		System.out.println(sum);
		
		System.out.println("숫자를 하나 입력해주세요");
		num = scan.nextInt();
		System.out.println("숫자를 하나 입력해주세요");
		num2 = scan.nextInt();
		numberSum.add(num, num2);
		
	}

}
