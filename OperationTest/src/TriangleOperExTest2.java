import java.util.Scanner;

public class TriangleOperExTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num = 9999;
		String result = "";
		
		System.out.println("1, -1, 0중에 숫자를 하나 입력해주세요");
		num = scan.nextInt();		
		
		result = (num == 1) ? "양수" : (num == -1) ? "음수" : "0";
		
		System.out.println(result);
		
		
	}

}
