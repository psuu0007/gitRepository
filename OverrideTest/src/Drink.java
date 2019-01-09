
public class Drink {
	
	String drinkName = "";
	int drinkcapacity = 0;
	int drinkPrice = 0;
	
//	Drink (String drinkName, int drinkBarrelage, int drinkPrice) {
//		this.drinkName = drinkName;
//		this.drinkBarrelage = drinkBarrelage;
//		this.drinkPrice = drinkPrice;
//	}
	
	void drinkInfo() {
		System.out.println("음료수 이름: " + drinkName);
		System.out.println("용량 " + drinkcapacity + "ml");
		System.out.println("가격 " + drinkPrice + "원");
	}
	
}
