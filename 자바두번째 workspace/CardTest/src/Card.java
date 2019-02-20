
public class Card {
	
	static String[] shape = {"♥", "◆", "♠", "♣"};
	static String[] number = {"A", "2", "3", "4", "5",
			"6", "7", "8", "9", "T", "J", "Q", "K"
	};
	// 카드		
	String card = "";
	
	Card(){
		
	}
	// 매개변수 있는 생성자
	Card(int shapeIndex, int numberIndex){
		init(shapeIndex, numberIndex);
	}
	
//	임의로 카드 생성
	void init() {
		// 모양 랜덤으로 선택
		int shapeIndex = (int)(Math.random() * shape.length);
		// 숫자 랜덤으로 선택
		int numberIndex = (int)(Math.random() * number.length);
		
		card = shape[shapeIndex] + number[numberIndex]; // ♣3, ♠J
	}

	// 수동으로 카드 생성
	void init(int shapeIndex, int numberIndex) {
		card = shape[shapeIndex] + number[numberIndex]; // ♣3, ♠J
	}
	
	
//	카드 얻는다
	String getCard() {
		return card;
	}
	
	
	
	
	
	
	
	
}
