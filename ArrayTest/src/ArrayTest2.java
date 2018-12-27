
public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ten = new int[6];

//		0  6-1
//		기능 분리
		for (int i = 0; i < 6; i++) {
			ten[i] = (i * 10);
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println(ten[i]);
		}
		
	}

}
