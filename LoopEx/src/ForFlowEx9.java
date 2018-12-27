import java.util.Scanner;

public class ForFlowEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		업다운 게임
//		대학교 오리엔테이션
		
//		병뚜껑 숫자 확인 50
		
//		1 ~ 100
		
//		유저1 : 10
		
//		심판: 업
		
//		유저2: 60
//		심판: 다운
		
//		유저3: 40
//		심판: 업
		
//		유저1: 50
//		심판: 당첨
		
//		게임 끝
		
		int input = 0;
		int answer = 0;
		Scanner scan = new Scanner(System.in);
		
		// 1 ~ 100사이의 임의의 수를 저장
		answer = (int)(Math.random() * 100) + 1; 
		
		while(true) {
			System.out.print("1과 100사이의 숫자를 입력하세요>>");
			input = scan.nextInt();
		
			if(input > answer) {
				System.out.println("더 작은 수를 입력해주세요");
			}else if(input < answer) {
				System.out.println("더 큰 수를 입력해주세요");
			}else {
				System.out.println("정답은 " + answer);
				System.out.println("당첨입니다");
				break;
			}
		}
		
//		System.out.println("게임 종료");
		
		
		
		
		
		
		
		
		
		
		
	}

}
