
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human ha1 = new Human();
		
		ha1.name = "이상한 사람";
		ha1.age = 1;
		ha1.appleColor = "빨간색";
		ha1.appleName = "사과";
		
		Human2 h1 = new Human2();
		
		h1.name = "일반 사람";
		h1.age = 2;
//		h1.apple = new Apple();
		Apple apple = new Apple();
		apple.color = "초록색";
		
//		h1.apple.name = "나만의 특별한 사과";
		
		h1.apple = apple;
		
		h1.apple.showAppleInfo();
		
		Human2 h2 = new Human2();
		
		h2.apple = new Apple("거창 사과", "새빨간색");
		
		h2.apple.showAppleInfo();
		
	}

}
