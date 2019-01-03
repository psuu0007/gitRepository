
public class ClassEx {
	static String title = "";
	
	void instanceMethod() {
		
	}
	
	static void staticMethod() { // 스태틱 메서드, 클래스 메서드
		
	}
	
	void instanceMethod2() {
		instanceMethod(); // 인스턴스 메서드
		staticMethod();   // 스태틱 메서드
	}
	
	static void staticMethod2() {
//		instanceMethod();  // 인스턴스 메서드 호출
		staticMethod();    // 스태틱 메서드 호출
	}
	
	
}
