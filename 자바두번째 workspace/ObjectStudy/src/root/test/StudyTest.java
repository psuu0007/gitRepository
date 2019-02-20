package root.test;

import root.parent.child.Child1;

public class StudyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resultStr = "";
		Child1 c1 = new Child1();
		Child1 c2 = new Child1();
		Child1 c3 = new Child1("내가 만든 자식");
		resultStr = c1.nameView();
		
		System.out.println(resultStr);
		System.out.println(c2.nameView());
		
		resultStr = c3.nameView();
		
		System.out.println(resultStr);
		
		
		
	}

}
