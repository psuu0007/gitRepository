import java.util.Scanner;

public class MyCalculatorTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		MyCalculator mc = new MyCalculator();
		int num = 0;
		int num2 = 0;
		int result = 0;
		double doubleResult = 0.0;
		
		System.out.println("숫자만 입력해주세요");
		num = scan.nextInt();
		System.out.println("숫자만 입력해주세요");
		num2 = scan.nextInt();
		
		result = mc.add(num, num2);
		System.out.println(result);
		
		result = mc.subtract(num, num2);
		System.out.println(result);
		
		result = mc.multiply(num, num2);
		System.out.println(result);
		
		doubleResult = mc.divide(num, num2);
		System.out.println(doubleResult);
		
		double dNum = 0.0;
		double dNum2 = 0.0;
		
		System.out.println("실수만 입력해주세요");
		dNum = scan.nextDouble();
		System.out.println("실수만 입력해주세요");
		dNum2 = scan.nextDouble();
		
		doubleResult = mc.add(dNum, dNum2);
		System.out.println(doubleResult);
		
		doubleResult = mc.subtract(dNum, dNum2);
		System.out.println(doubleResult);
		
		doubleResult = mc.multiply(dNum, dNum2);
		System.out.println(doubleResult);
		
		doubleResult = mc.divide(dNum, dNum2);
		System.out.println(doubleResult);
		
		
		
	}
}
