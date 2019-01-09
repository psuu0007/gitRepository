
public class DrinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drink drink = new Drink();
		drink.drinkName = "coke";
		drink.drinkcapacity = 500;
		drink.drinkPrice = 2000;
		drink.drinkInfo();
		
		Coffee coffee = new Coffee();
		coffee.drinkName = "coffee";
		coffee.drinkcapacity = 500;
		coffee.drinkPrice = 2000;
		coffee.caffeine = 10;
		
		coffee.drinkInfo();

	}

}
