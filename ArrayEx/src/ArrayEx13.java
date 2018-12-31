import java.util.Scanner;

public class ArrayEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		2차원 배열

		// int형 타입 4행 3열의 2차원 배열을 생성한다
		int[][] scoreArr = new int[2][3];
//		{
//			{
//				10, 10
//			},
//			{
//				20, 30
//			}
//		}
		
		int cnt = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println(scoreArr[0].length);
		
		for (int i = 0; i < scoreArr.length; i++) {
			for (int n = 0; n < scoreArr[0].length; n++) {
//				scoreArr[i][n] = cnt++; 
				scoreArr[i][n] = scan.nextInt(); 
			}
		}
		
		
		for (int i = 0; i < 2; i++) {
			for (int n = 0; n < 3; n++) {
				System.out.print("[" + scoreArr[i][n] + "] ");
			}
			System.out.println();
		}
//		

	}

}
