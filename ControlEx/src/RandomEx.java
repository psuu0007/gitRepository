
public class RandomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		double score = 0.0;
		int intScore = 0;
//		랜덤 -> 임의의 값
//		score = (int)(Math.random() * 10) + 1;

		score = Math.random();
		
		System.out.println("1. 랜덤값은 : " + score);
		score = score * 10;
		System.out.println("2. " + score);
		intScore = (int)score;
		System.out.println("3. " + intScore);
		intScore = intScore + 1;
		System.out.println("4. " + intScore);
		
//		0.9999999999999999999 ~ 0.00000000000000000000
//		1 > ? >= 0.0
//		
//		0.99999999 * 10 -> 9.9999999  -> 9     0.0 ~ 9.9  -> (0 ~ 9) + 1 -> 1 ~ 10
//		0.0 * 10 -> 0
//		주사위 
		
	}

}
