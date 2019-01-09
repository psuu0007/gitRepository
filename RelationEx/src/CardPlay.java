import java.util.Scanner;

public class CardPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CardCase cc = new CardCase();
		cc.shuffle();
		User myUser = new User();
		User yourUser = new User();
		
		Scanner scan = new Scanner(System.in);
		String card = "";  // 임시 카드 정보 
		String programContinueCheck = ""; // 프로그램 종료 여부 y,n
		System.out.println("Card sdjfkljsdkfl");
		
		System.out.println("첫번째 게임 유저의 이름을 입력해주세요");
		myUser.name = scan.nextLine();
		System.out.println("두번째 게임 유저의 이름을 입력해주세요");
		yourUser.name = scan.nextLine();
		
		System.out.println(myUser.name + "님은 카드를 자동으로 배정받습니다");
		System.out.println("배정중..");
		for (int i = 0; i < 100000000; i++) {
			for (int j = 0; j < 100000000; j++) {
			}
		}

		card = cc.pick().getCard();
		myUser.card = card;
		
		while (true) {
			
			System.out.println(yourUser.name + "님의 카드는 직접 선택하시면 됩니다");
			
			cc.cardsView();
			System.out.println("선택 방법은 1~52 중에 하나를 선택하시면 됩니다");
			int choiceNum = 0;
			System.out.println("숫자를 입력해주세요");
			choiceNum = scan.nextInt() - 1;
			card = cc.pick(choiceNum).getCard();
			
			yourUser.card = card;
			System.out.println("선택하신 카드는 " + yourUser.card + "입니다");

			System.out.println("서로의 카드를 확인합니다");
			if(myUser.card.equals(yourUser.card)) {
				System.out.println(myUser.name + "가 가진 카드는 " + myUser.card);
				System.out.println(yourUser.name + "가 가진 카드는 " + yourUser.card);
				System.out.println("찾았습니다");
			}else {
//				System.out.println(myUser.name + "가 가진 카드는 " + myUser.card);
				System.out.println(yourUser.name + "가 가진 카드는 " + yourUser.card);
				System.out.println("서로 다릅니다");
			}
			
			System.out.println("다시 도전해보겠습니까? 포기하시겠습니까? y or n");
			scan.nextLine();
			programContinueCheck = scan.nextLine();
			
			if(programContinueCheck.equals("n")) {
				// 프로그램 종료
				break;
			}
			
		}
		
		System.out.println("프로그램이 종료되었습니다");
	}

}
