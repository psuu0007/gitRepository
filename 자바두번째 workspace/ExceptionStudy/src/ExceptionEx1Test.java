//100을 0~10까지의 랜덤한 수로 10번 나누는 
//프로그램을 작성하시오
public class ExceptionEx1Test {
	public static void main(String[] args) {
		
		int num = 200;
		int rnd = 0;
		
		rnd = (int)(Math.random()*11);
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
			rnd = (int)(Math.random()*11); // 0~10
			try{
				result = num/rnd;
				System.out.println(i+1 + "번째 수행: " + num + " / " + rnd + " = " + result);
			}catch(ArithmeticException e) {
//				System.out.println(i+1 + "번째 수행: " + "논리적인 오류가 발생해서 예외처리함");
//				System.out.println(num + "의 값을 " + rnd + "값으로 나누면 안됨");
//				System.out.println("0 이외의 숫자로 나누어 주십시요");
				System.out.println(i+1 + "번째 수행: " + num + " / " + rnd + " = " + num);
			}
		}
//		System.out.println("반복문 종료가 된거지 catch가 발생했다고 해서 중간에 종료가 된게 아니잖아요");
		
	}
}
