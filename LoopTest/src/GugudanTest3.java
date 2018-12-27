import java.util.Scanner;

public class GugudanTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String str = "";
		int num = 0;
		
		System.out.println("세번 작동합니다");
				
		while (num < 3) {
			System.out.println("내용을 입력해주세요");
			str = scan.nextLine();
			System.out.println(str + "\n");
			num++;
		}
		
		System.out.println("프로그램을 종료합니다");
		
	}

}
