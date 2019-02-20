package finals;

public class FinalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalTest ft = new FinalTest();
		int maxSize = 0;
		
		maxSize = ft.getMaxSize();
		
		System.out.println("ft에서 호출한 거야: " + maxSize);
		
//		System.out.println(ft.MAX_SIZE + 1);
		
		ChildClass childClass = new ChildClass();
//		maxSize = childClass.getMaxSize();
		
		System.out.println("이건 ChildClass를 호출한 거야: " + maxSize);
		
	}

}
