//카드케이스는 카드 포함하고 있다
public class CardCase {
	//	4 * 13 = 52
	int numOfCards = Card.shape.length * Card.number.length;
	Card[] cardArr = new Card[numOfCards];
	
//	card케이스 안에 카드 52장을 초기화해준다 만들어준다
	CardCase() {
		int totalCnt = 0;
//		{"♥", "◆", "♠", "♣"};
//		{"A", "2", "3", "4", "5",
//				"6", "7", "8", "9", "T", "J", "Q", "K"
//		};
//		0,1,2,3,4,116, 17, 32, 33,
		for (int i = 0; i < Card.shape.length; i++) {
			for (int n = 0; n < Card.number.length; n++) {
				cardArr[totalCnt++] = new Card(i, n);
			}
		} // 전체 for문 종료
		
	} // 기본 생성자 종료
	
	
	// 임의의 위치의 카드를 뽑는다
	Card pick() {
		int index = (int)(Math.random() * numOfCards);
		Card card = pick(index);
//		Card card = cardArr[index];
		
		return card;
	}
	
	// 지정된 위치의 카드를 뽑는다
	Card pick(int index) {
		
		return cardArr[index];
	}
	
	void shuffle() {
		int rand = 0;
		Card temp = null;
		
		for (int i = 0; i < cardArr.length; i++) {
			rand = (int)(Math.random() * numOfCards);
			
			temp = cardArr[i];
			cardArr[i] = cardArr[rand];
			cardArr[rand] = temp;
		}
	}
	
	void cardsView() {
		for (int i = 0; i < cardArr.length; i++) {
			System.out.print(cardArr[i].getCard() + " ");
			if((i+1) % 13 == 0) {
				System.out.println();
			}
			
		}
	}
	
	
	
	
	
}
