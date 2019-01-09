package greet.main;

//import greet.america.Hello;  // 풀 네임
//import greet.america.HelloKorea;  // 풀 네임
//에스테리크 * : 전체
import greet.america.*;

// import

//소스코드를 작성할 때 다른 패키지의 클래스를 사용하려면 
//패키지명이 포함된 클래스 이름을 사용해야 한다

//클래스 코드를 작성하기 전에 import문으로 사용하고자 하는 클래스의 패키지를
//미리 명시해주면 소스코드에 사용되는 클래스이름에서 패키지명은 생략할 수 있다

//import문의 역할은 컴파일러에게 소스파일에 사용된 클래스의 패키지에 대한 정보를
//제공하는 것이다
//컴파일 시에 컴파일러는 import문을 통해 소스파일에 사용된 클래스들의 패키지를
//알아 낸 다음, 모든 클래스이름 앞에 패키지명을 붙여 준다

// 일반적인 소스파일(*.java)의 구성은 다음의 순서로 되어 있다
//1. package문
//2. import문
//3. 클래스 선언

//import 표현식
//import 패키지명.클래스명;
//or
//import 패키지명.*;

//greet.main
public class GreetHelloMain {
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hello aHello = new Hello();
		
		aHello.goodMorningPrint();
		aHello.afterNoonPrint();
		
		HelloKorea koreaHello = new HelloKorea();
		
		koreaHello.afterNoonPrint();
		
		HelloKoreaVer2 hkv2 = new HelloKoreaVer2();
		hkv2.goodMorningPrint();
		
//		greet.korea.Hello kHello = new greet.korea.Hello();
//		
//		kHello.goodMorningPrint();
//		
//		System.out.println("?");
//		
		
	}

}
