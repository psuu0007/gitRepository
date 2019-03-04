
public class ArrayListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numArr[] = new int[5];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i + 1;
		}

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "\t");
		}
		System.out.println();

		int tmpArr[] = new int[numArr.length + 1];

		for (int i = 0; i < numArr.length; i++) {
			tmpArr[i] = numArr[i];
		}

		tmpArr[tmpArr.length-1] = 0;

		for (int i = 0; i < tmpArr.length; i++) {
			System.out.print(tmpArr[i] + "\t");
		}
	}

}