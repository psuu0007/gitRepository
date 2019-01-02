
public class CallByExamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam2 exam2 = new Exam2();
//		Exam3 exam3 = new Exam3();
		int result = 0;
		int[] c = new int[1];
		int[] d = new int[1];
		
		c[0] = 10;
		d[0] = 20;
//		exam3.n = 10;
//		exam3.m = 20;
		result = exam2.add(c, d);
		
		System.out.println(result);
		System.out.println("c= " + c[0] + "/ d= " + d[0]);
//		
//		System.out.println("=============");
//		
//		result = exam3.add(exam3);
//		
//		System.out.println(result);
//		System.out.println("exam3.n= " + exam3.n + "/ exam3.m= " + exam3.m);
	}

}
