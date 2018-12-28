public class ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 45개의 정수값을 저장하기 위한 배열 생성
		int[] ballArr = new int[45];
		
		// 배열의 각 요소에 1~45의 값을 저장한다
		for (int i = 0; i < ballArr.length; i++) {
			ballArr[i] = i+1;
		}
		
		// 45개의 공 확인
//		for (int i = 0; i < ballArr.length; i++) {
//			System.out.print(ballArr[i] + " ");
//			if((i+1) % 5 == 0) {
//				System.out.println();
//			}
//		}
		
		int temp = 0;
		int rndNum = 0;
//		섞는다
		for (int i = 0; i < 5; i++) {
			rndNum = (int)(Math.random() * 45);
			temp = ballArr[i];
			ballArr[i] = ballArr[rndNum];
			ballArr[rndNum] = temp;
		}
		
//		for (int i = 0; i < ballArr.length; i++) {
//			System.out.print(ballArr[i] + " ");
//			if((i+1) % 5 == 0) {
//				System.out.println();
//			}
//		}
		
		System.out.println("자동선택 번호");
		System.out.println("================");
		for (int i = 0; i < 6; i++) {
			System.out.print(ballArr[i] + " ");
		}
		
		
	}

}
