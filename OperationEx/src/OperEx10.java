
public class OperEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		논리연산자
//		| or연산자 , & and연산자
		int n = 0;
		
		n = 10;
//		10 / 2 == 5  
		System.out.println(n % 2 == 0);
		System.out.println(n % 3 == 0);
		System.out.println(n % 2 == 0 || n % 3 == 0);
		
		System.out.println(n);
		
		System.out.println(n % 3 == 0 && n % 2 == 0); //true && false
		System.out.println(n);
		
	}

}
