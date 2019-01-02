
public class Data {
	
	int num = 0;

	void change(int param) { // param = 209;
		
		System.out.println("param의 처음 값: " + param);
		param = 1000;  // param = 1000;
		System.out.println("메서드를 통해 param의 값 수정 ");
		System.out.println("data.num : " + param);
	}
	
}

