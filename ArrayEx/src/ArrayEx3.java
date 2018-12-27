
public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 Array []
//		배열의 명명규칙
		
		int[] numArr = new int[3];
		numArr[0] = 1;
		numArr[1] = 2;
		numArr[2] = 3;
		
//		System.out.println(numArr.length);
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.println((i+1) + "번째 수행: " + numArr[i]);
		}
		
		
		
	}

}
