
public class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCalc mc = new MyCalc();
		
		long result = 0;
		
//		result = mc.add(3, 5);
//		System.out.println(result);
//		
//		result = (int)mc.add(3L, 5L);
//		System.out.println(result);
		
		mc.add(3, 5);
		
		
		mc.add(1.0, 3.325435);
		
//		mc.add(3L, 5);
		
		
	}

}
