
public class ForDuliTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 5; i++) { // 행 5
			
			for (int s = 4; s > i; s--) {
				System.out.print(" ");
			}
			
			for (int n = 0; n <= i; n++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
