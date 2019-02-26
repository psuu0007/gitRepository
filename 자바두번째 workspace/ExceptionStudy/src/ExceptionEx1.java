import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx1 {
	public static void main(String[] args) {

		int num = 0;
		int module = 0;
		int resultNum = 0;
		Scanner scan = new Scanner(System.in);

//		try {
		System.out.println("숫자를 입력해주세요");
		num = scan.nextInt();
//		} catch(InputMismatchException e) {
//			System.out.println("입력을 실수했구나");
//		}

		scan.nextLine();
		int[] numArr = new int[1];

		System.out.println("나눌 값을 입력해주세요");
		module = Integer.parseInt(scan.nextLine());
//		예외처리
		try {
			resultNum = num / module; 
			numArr[2] = 1;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("배열 접근 오류가 발생해서 예외처리함");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("산술연산 오류가 발생해서 예외처리함");
		}

		System.out.println("결과값: " + resultNum);

	}
}
