package publictest;

import publics.test.DefaultTest;
import publics.test.PublicTest;

public class PublicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PublicTest publicTest = new PublicTest();
		PublicTest pt = new PublicTest();
//		DefaultTest defaultTest = new DefaultTest();
		
		publicTest.num = 234;
		publicTest.numPrint();
//		int num = defaultTest.num + 43;
//		defaultTest.numPrint();
		
	}

}
