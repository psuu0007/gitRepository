package exam.test;


public class ProductTest {
	public static void main(String[] args) {
		int price = 0;
		int bonusPoint = 0;
		String name = "";
		
		Tv t1 = new Tv();
		price = t1.getPrice();
		bonusPoint = t1.getBonusPoint();
		name = t1.getName();
		System.out.println("1제품의 가격: " + price);
		System.out.println("1보너스 점수: " + bonusPoint);
		
		Tv t2 = new Tv(1000, 100);
		price = t2.getPrice();
		bonusPoint = t2.getBonusPoint();
		System.out.println("2제품의 가격: " + price);
		System.out.println("2보너스 점수: " + bonusPoint);
		
	}
}