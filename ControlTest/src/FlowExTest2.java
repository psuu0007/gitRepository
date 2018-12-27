import java.util.Scanner;

public class FlowExTest2 {

	public static void main(String[] args) {
//		선언부
		// else문
		Scanner scan = new Scanner(System.in);
		int score =0;
		
		
		System.out.println("자신의 점수를 입력해주세요");
		score = scan.nextInt();
		
		
		if (90 <= score && score <= 100) {
			System.out.println(score + "점은 " + "A");
		} else if (80 <= score && score <= 89) {
			System.out.println(score + "점은 " + "B");
		} else if (70 <= score && score <= 79) {
			System.out.println(score + "점은 " + "C");
		} else {
			System.out.println(score + "점은 " + "F");

		}

	}

}