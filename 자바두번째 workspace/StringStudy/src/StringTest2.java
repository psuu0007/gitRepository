import java.util.Scanner;

public class StringTest2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = "";
		
		str = scan.nextLine();
		
		
		if(str == "박성욱") {
			System.out.println("그래 정답은 " + str);
		}
		
		if(str.equals("박성욱")) {
			System.out.println("그래 정답은 " + str + " 이야");
		}
		
		
		
		
		
	}
	
	
	
}
