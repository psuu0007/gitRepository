
public class House {
	
	int window = 0;
	int door = 0;
	int room = 0;
	
	
	House(){
		//기본생성자
//		window = 1;
//		door = 1;
//		room = 1;
	}
	
	House(int houseWindow){//창문만 초기화 가능한 생성자
		window=houseWindow;	
		door = 1;
		room = 1;
	}
	House(int houseWindow, int houseDoor){//창문과 문만 초기화 가능한 생성자
		window=houseWindow;
		door=houseDoor;
		room = 1;
	}
	House(int houseWindow, int houseDoor, int houseRoom){//창문과 문 방 모두 초기화 가능한 생성자
		window=houseWindow;
		door=houseDoor;
		room=houseRoom;
	}
	
	void housePrint(){//출력 메서드
		System.out.println("창문"+window+" 문 "+door+" 방"+room+"개인");
		System.out.println("집이 지어졌습니다.");
		
	}

}
