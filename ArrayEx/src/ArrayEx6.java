import sun.misc.FpUtils;

public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] fiveNumArr = new int[6];
		int[] tenNumArr = new int[10];

		for (int i = 0; i < fiveNumArr.length; i++) {
			fiveNumArr[i] = i;
		}
//		fiveNumArr[0] = 0;
//		fiveNumArr[1] = 1;
//		fiveNumArr[2] = 2;
//		fiveNumArr[3] = 3;
//		fiveNumArr[4] = 4;

//		for (int i = 0; i < tenNumArr.length; i++) {
//			if(i < 5) {
//				tenNumArr[i] = fiveNumArr[i];
//			}
//		}

		for (int i = 0; i < 5; i++) {
			tenNumArr[i] = fiveNumArr[i];
		}

//		tenNumArr[0] = fiveNumArr[0];
//		tenNumArr[1] = fiveNumArr[1];
//		tenNumArr[2] = fiveNumArr[2];
//		tenNumArr[3] = fiveNumArr[3];
//		tenNumArr[4] = fiveNumArr[4];

		System.out.println(fiveNumArr[0]);
		System.out.println(fiveNumArr[1]);
		System.out.println(fiveNumArr[2]);
		System.out.println(fiveNumArr[3]);
		System.out.println(fiveNumArr[4]);

		System.out.println();
		System.out.println("=======================");
		System.out.println();

		System.out.println(tenNumArr[0]);
		System.out.println(tenNumArr[1]);
		System.out.println(tenNumArr[2]);
		System.out.println(tenNumArr[3]);
		System.out.println(tenNumArr[4]);

	}

}
