import java.util.Scanner;

public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		String str = "100";
		System.out.println("1. 숫자를 입력해주세요");
		str = scan.nextLine();
		
//		문자열 글자가 들어가 있지 않아야 한다
//		오로지 문자열 안에는 숫자가 들어가 있어야 유용하다
		Integer numObj = new Integer(0);
		int n = 0;
		
		
		int num = new Integer("100").intValue();
		System.out.println("2. 숫자를 입력해주세요");
		num = scan.nextInt();
		
		int num2 = Integer.parseInt(str);
		
//		"sdfsdf".valueOf(324);
//		Integer num3 = Integer.valueOf("100");
		
		
//		System.out.println("str= " + "100" * 2);
//		System.out.println("num= " + num * 2);
//		System.out.println("num2= " + num2 * 2);
//		System.out.println("num3= " + num3 * 2);
		
		
		
				
		
	}

}
