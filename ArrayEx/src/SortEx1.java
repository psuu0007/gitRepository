public class SortEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scoreArr = new int[5];
		
		scoreArr[0] = 15;
		scoreArr[1] = 11;
		scoreArr[2] = 1;
		scoreArr[3] = 3;
		scoreArr[4] = 8;
		
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + " ");
		}
		System.out.println();
		System.out.println("오름차순으로 정렬");
		int cnt = 0;
		int temp = 0;
		for (int i = 0; i < scoreArr.length; i++) {
			for (int n = 0; n < scoreArr.length; n++) {
				if(scoreArr[i] < scoreArr[n]) {
					temp = scoreArr[i];
					scoreArr[i] = scoreArr[n];
					scoreArr[n] = temp;
				}
				cnt++;
			}
		}
		
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + " ");
		}
		
		System.out.println("총 수행 횟수: " + cnt);
	}

}
