
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String color = "";
		String gearType = "";
		int door = 0;
		
		color = "검은색";
		gearType = "자동";
		door = 1;
		
		Car car = new Car(color, gearType, door);
		
		int sum = 0;
		
		System.out.println("당신이 만들고자 했던 자동차 특징");
		System.out.println("색상은 " + car.color);
		System.out.println("변속기 종류는 " + car.gearType);
		System.out.println("문의 개수는 " + car.door);
		
		
		
		
	}

}
