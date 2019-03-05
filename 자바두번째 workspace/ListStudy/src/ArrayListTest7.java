import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		List<Integer> ggdList= new ArrayList();
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("숫자를 입력해주세요 ");
		num = scan.nextInt();
		Gugudan2 ggd = new Gugudan2(num);
	
		ggd.Gugudan2Print(num);
		
		
	}

}
