
public class ArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 Array []
		
		// 5개의 int 값을 저장할 수 있는 배열을 생성한다
		int[] score = new int[5];  // 복수
		
		for (int i = 0; i < 5; i++) {
			score[i] = i+1;
		}
		
		int cnt = 0;
		while(cnt < 5) {
			System.out.println(score[cnt]);
			
			cnt++;
		}
		
	}

}
