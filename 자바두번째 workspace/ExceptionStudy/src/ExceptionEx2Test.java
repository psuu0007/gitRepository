public class ExceptionEx2Test {
	public static void main(String[] args) {

//		null 포인터 예외를 발생시키는데
//		문제가 발생하였습니다.
//		예외메시지 : 예외 메세지를 출력하시오
//		ex:) 문제가 발생하였습니다. 
//		예외메시지 : / zero
		
		System.out.println(1);
		System.out.println(2);
		
		String str = null;
		
		str.charAt(3);

		
		
		System.out.println("종료");
	}
}
