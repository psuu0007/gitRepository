package exce.test;

public class OtherClass {

	void method1() throws Exception{
		method2();
	}

	// 메서드 선언부에 예외를 선언함으로써 메서드를 사용하려는
	// 사람이 메서드의 선언부를 보았을 때, 이 메서드를 사용하기 위해서는
	// 어떠한 예외들이 처리되어야 하는지 쉽게 알수 있다.
	void method2() throws Exception {
		throw new Exception("우리가 오류 코드를 만들수 있지");
	}
}
