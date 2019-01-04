// this
//인스턴스 자신을 가르키는 참조변수
//인스턴스의 주소가 저장되어 있다
//모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재한다
public class CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String color = "";
		String gearType = "";
		int door = 0;
		
		color = "red";
		gearType = "manual";
		door = 4;
		
		Car2 car1 = new Car2(color, gearType, door);  
//		car1.color
//		6442b0a6.color
//		this
		car1.carInfo();
				
	}

}
