package exam.test;


public class ProductTest3 {
	public static void main(String[] args) {
		int price = 0;
		int bonusPoint = 0;
		String name = "";
		
		Tv t1 = new Tv(2000);
		price = t1.getPrice();
		bonusPoint = t1.getBonusPoint();
		name = t1.getName();
		System.out.println("1Tv의 가격: " + price);
		System.out.println("1보너스 점수" + bonusPoint);
		
		Product p = new Product(3000);
		price = p.getPrice();
		bonusPoint = p.bonusPoint;
		System.out.println("2Product의 가격: " + price);
		System.out.println("2보너스 점수" + bonusPoint);
		
		
	}
}