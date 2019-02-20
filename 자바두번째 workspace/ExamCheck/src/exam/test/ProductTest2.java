package exam.test;


public class ProductTest2 {
	public static void main(String[] args) {
		int price = 0;
		int bonusPoint = 0;
		String name = "";
		
		Tv t1 = new Tv();
		t1.totalInfo();
		
		
		Tv t2 = new Tv(1000, 100);
		t2.totalInfo();
		
	}
}