// this
//인스턴스 자신을 가르키는 참조변수
//인스턴스의 주소가 저장되어 있다
//모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재한다

public class Car2 {
	
	String color = "";
	String gearType = "";
	int door = 0;
	
//	매개변수가 있는 생성자
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	void setDoor(int door) {
		this.door = door;
	}
	
	void carInfo() {
		
		System.out.println("색상: " + color);
		System.out.println("기어타입: " + gearType);
		System.out.println("문 갯수: " + door);
	}
	
}
