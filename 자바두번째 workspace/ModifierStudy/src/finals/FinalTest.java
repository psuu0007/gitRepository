package finals;

public final class FinalTest {

	int MAX_SIZE = 10;
	
	int getMaxSize() {
		final int LV = MAX_SIZE;
//		MAX_SIZE = 100;
//		num = 10;
//		LV = 234;
		return MAX_SIZE;
	}
	
	void num() {
		System.out.println("fd");
	}
}
