package com.tg;

// 패키지
// 패키지란 클래스의 묶음이다
// 패키지에는 클래스 or 인터페이스를 포함시킬 수 있으며,
// 서로 관련된 클래스들끼리 그룹 단위로 묶어 놓음으로써 
// 클래스를 효율적으로 관리할 수 있다

// 같은 이름의 클래스 일지라도 서로 다른 패키지에 존재하는 것이 가능하므로,
// 자신만의 패키지 체계를 유지함으로써 다른 개발자가 개발한 
// 클래스 라이브러리의 클래스와 이름이 충돌하는 것을 피할 수 있다

// 지금까지는 단순히 클래스 이름으로만 클래스를 구분했지만
// 클래스의 실제 이름(full name)은 패키지명을 포함한 것이다.  

// 클래스가 물리적으로 하나의 클래스파일(.class)인 것과 같이
// 패키지는 물리적으로 하나의 디렉토리이다.

//표현식
//package 패키지명;

//ex: com.tg;
//클래스명이 class PackageTest
//src
//    com
//        tg 이 아래에 클래스명.java 가 있다

// 패키지의 명명규칙
// 무조건 소문자로 작성한다

//- 패키지는 점(.)을 구분자로 하여 계층구조로 구성할 수 있다
//- 하나의 소스파일에 첫 번째 문장으로 단 한 번의 패키지 선언만을 허용한다
//- 모든 클래스는 반드시 하나의 패키지에 속해야 한다
//- 패키지는 물리적으로 클래스 파일(.class)을 포함하는 하나의 디렉토리이다

public class PackageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("사용하던 되로 사용하세요");
		
	}

}
