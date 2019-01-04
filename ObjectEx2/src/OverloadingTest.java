import java.util.Scanner;

public class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCalc mc = new MyCalc();
//		
		long result = 0;
//		
//		mc.add(3, 5);
		int[] numArr = new int[4];
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
//		System.out.println("4번 정도 숫자를 입력해주세요");
		for (int i = 0; i < numArr.length; i++) {
			System.out.println("숫자를 입력해주세요");
			num = scan.nextInt();
			numArr[i] = num;
		}
		
//		num = scan.nextInt();
//		numArr[1] = num;
//		num = scan.nextInt();
//		numArr[2] = num;
//		num = scan.nextInt();
//		numArr[3] = num;
		
		result = mc.add(numArr);
		
		System.out.println(result);
	}

}
