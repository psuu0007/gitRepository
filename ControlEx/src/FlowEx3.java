
public class FlowEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// else문
		
//		표현식
//		if(조건식) {
//			// 조건식이 true일 때 수행될 문장들을 적는다
//		}else{
//		    조건식이 거짓일 때 수행될 문장들을 적는다
//		}
		int visitCount = -1;
		
		if (visitCount == 0) {
			System.out.println("처음 오셨군요 방문해주셔서 감사합니다.");
		}else {
			System.out.println("다시 방문해 주셔서 감사합니다");
		}
		
		System.out.println("방문횟수는 " + (visitCount+1) + " 번 입니다");
		
	}

}
