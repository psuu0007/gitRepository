
public class CardCaseTest {
	
	public static void main(String[] args) {
		CardCase cc = new CardCase();
		Card card = null;
		
		cc.cardsView();
		
		card = cc.pick();
		
		System.out.println(card.getCard());
	}
	
}
