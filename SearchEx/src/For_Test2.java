public class For_Test2 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 0; i < 100; i++) {
//			78 + 13 = 91
//			91 + 14 = 105
			if (sum + (i+1) > 100) {
				break;
			}
			sum = sum + (i + 1);

		}
		
		System.out.println(sum);

	}

}
