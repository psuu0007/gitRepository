import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String color = "";
		String gearType = "";
		Scanner scan = new Scanner(System.in);
		Car[] car = new Car[10];
		int cnt = 0;
		
		while(true) {
			System.out.println("어떤 자동차를 원하시나요?");
			
			System.out.println("당신이 원하는 색상을 적어주세요");
			color = scan.nextLine();
			System.out.println("당신이 원하는 변속기 타입을 적어주세요");
			System.out.println("(ex: 자동, 수동)");
			gearType = scan.nextLine();
			
			car[cnt] = new Car(color, gearType);
			
			System.out.println("당신이 만들고자 했던 자동차 특징");
			System.out.println("색상은 " + car[cnt].color);
			System.out.println("변속기 종류는 " + car[cnt].gearType);
			
			cnt++;
		}
		
	}

}
