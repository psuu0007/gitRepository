
public class GugudanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GugudanV2 gugu = new GugudanV2();
		
		gugu.dan = 2;
		
		System.out.println("부모의 구구단 출력");
		gugu.perfectGugudan();
		
		System.out.println("자식의 인스턴스 변수를 사용한 출력");
		gugu.oneDanGuguPrint();
		
		int dan = 3;
		
		System.out.println("매개변수를 사용한 출력");
		gugu.oneDanGuguPrint2(dan);
		
	}

}
