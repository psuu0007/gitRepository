
public class ForFlowEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		중첩 for문
		
		for (int i = 1; i <= 9; i++) {
			
			for (int n = 2; n <= 9; n++) {
				System.out.print(n + " * " + i + " = " + (n * i) + "\t");
			}
			System.out.println();
		}
		
		
	}

}
