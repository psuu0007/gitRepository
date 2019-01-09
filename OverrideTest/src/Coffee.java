
public class Coffee extends Drink{
	
	int caffeine = 0;
	
	void drinkInfo() {
		System.out.println("음료수 이름: " + drinkName);
		System.out.println("용량 " + drinkcapacity + "ml");
		System.out.println("가격 " + drinkPrice + "원");
		System.out.println("카페인 " + caffeine + "%");
		System.out.println();
	}
	

}
