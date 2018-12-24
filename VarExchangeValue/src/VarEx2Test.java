
public class VarEx2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tmp = 0;  // 선언문
		int num1 = 400;
		int num2 = 300;
		int num3 = 200;
		
		System.out.println("num1 " + num1);
		System.out.println("num2 " + num2);
		System.out.println("num3 " + num3);
		
		tmp = num1;
		num1 = num2;
		num2 = tmp;
		
		System.out.println();
		System.out.println("num1 " + num1);
		System.out.println("num2 " + num2);
		System.out.println("num3 " + num3);
		
		tmp = num2;
		num2 = num3;
		num3 = tmp;
		
		System.out.println();
		System.out.println("num1 " + num1);
		System.out.println("num2 " + num2);
		System.out.println("num3 " + num3);
		
//		num1 400
//		num2 300
//		num3 200 
//
//		���������� ġȯ
//
//		num1 300
//		num2 400
//		num3 200
//
//		num1 300
//		num2 200
//		num3 400
//
//		num1 200
//		num2 300
//		num3 400
//		
	}

}
