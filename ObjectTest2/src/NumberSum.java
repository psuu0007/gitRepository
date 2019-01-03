
public class NumberSum {

	int add(int param) {
		int sum = 0;

		for (int i = 1; i <= param; i++) {
			sum = sum + i;
		}

		return sum;
	}
	
	void add(int num, int num2) {
		int sum = 0;
		
		sum = num + num2;
		
		System.out.println(sum);
	}

}
