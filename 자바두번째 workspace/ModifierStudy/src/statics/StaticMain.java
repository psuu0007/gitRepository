package statics;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		StaticTest st = new StaticTest();
		int resultNum = 0;

		resultNum = StaticTest.max(100, 20);

//		System.out.println(resultNum);

		StaticTest st = new StaticTest();
	
		StaticTest st2 = new StaticTest();
		
//		st.height = 234;
		
		System.out.println(st.height);
		System.out.println(st2.height);
		System.out.println(StaticTest.height);
		
	}

}
