package privates;

import privates.another.TestClass;
import privates.test.ProtectedTest;

public class ModifierMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		PrivateTest privateTest = new PrivateTest();
//		
//		privateTest.num = 23;
//		System.out.println(privateTest.num);
		
		ProtectedTest protectedTest = new ProtectedTest();
				
		TestClass tc = new TestClass();
		tc.testMethod();
		
//		protectedTest.num = 3333;
//		System.out.println(protectedTest.num);
		
		
		
		
	}

}
