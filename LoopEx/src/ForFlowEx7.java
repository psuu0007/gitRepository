import java.util.Scanner;

public class ForFlowEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner scan = new Scanner(System.in);
		
		String str = "";
		
//		System.out.println("nextLine()은 한글 입력이 가능합니다 입력해주세요");
//		str = scan.nextLine();
		
		int num = 0;
//		무한루프
		while(num < 10) {
			
			
			System.out.println("nextLine()은 한글 입력이 가능합니다 입력해주세요");
			str = scan.nextLine();
			
			System.out.println(num);
			System.out.println(str);
			num++;
		}
		
		
		
	}

}
