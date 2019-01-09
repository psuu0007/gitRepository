import java.util.Scanner;

public class CardTest {

	public static void main(String[] args) {
		
		Card card = new Card();
		String myCard = "";
		int shapeIndex = 0; // 모양을 선택 0 "♥", 1 "◆", 2 "♠", 3 "♣"
		int cardChoiceNumber = 0;  // 1~13
		
//		Scanner scan = new Scanner(System.in);
		shapeIndex = 2;
		cardChoiceNumber = 12;
		
//		card.init();
		card.init(shapeIndex, cardChoiceNumber);
		
		myCard = card.getCard();
		
		System.out.println("당신에게 준 카드는 ");
		System.out.println(myCard);
		
		
	}
	
	
}
