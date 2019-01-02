
public class GugudanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2 9 = 8
//		1 9 = 9		
		int[][] gugudan1 = new int[8][9];
		
		for (int i = 0; i < gugudan1.length; i++) {			
			for (int n = 0; n < gugudan1[0].length; n++) {
				gugudan1[i][n] = (i + 2) * (n + 1);
			}
		}
		
		for (int i = 0; i < gugudan1.length; i++) {			
			for (int n = 0; n < gugudan1[0].length; n++) {
				System.out.print((i + 2) + " * " + (n + 1) 
						+ " = " + gugudan1[i][n] + "\t");
			}
			System.out.println();
		}
		
	}

}
