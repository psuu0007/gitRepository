public class SortEx4 {

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
		
		int temp = 0;
		int cnt = 0;
		boolean check = false; // 자리바꿈이 발생했는지 체크
		
		for (int i = 0; i < scoreArr.length-1; i++) {
			check = false; 
			
			for (int n = 0; n < scoreArr.length-1-i; n++) {
				if(scoreArr[n] > scoreArr[n+1]) { // 옆의 값이 작으면 서로 바꾼다
					temp = scoreArr[n];
					scoreArr[n] = scoreArr[n+1];
					scoreArr[n+1] = temp;
					check = true;  //서로 변경되었으니 자리가 변경되었음을 설정
				}
				// cnt 총 몇 번 돌았는지 횟수
				cnt++;
			}
			
			if(check == false) {  // 자리바꿈이 없으면 반복문을 벗어난다
				break;
			}
		}
		// 정렬된 결과를 출력
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + " ");
		}
		
		System.out.println("총 수행 횟수: " + cnt);
	}

}
