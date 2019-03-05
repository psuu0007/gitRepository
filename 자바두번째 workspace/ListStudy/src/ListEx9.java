import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numList = new ArrayList();
//		List<Integer> numList = new List();

//		int[] numArr = new int[10];

		for (int i = 0; i < 5; i++) {
			numList.add(i);
		}

		Iterator<Integer> it = numList.iterator();
		int cnt = 1;
		
		while (it.hasNext()) {
			System.out.println("횟수: " + cnt);
			System.out.println(it.next());
			
//			System.out.println(it.next());
			cnt++;
		}

		
		
		
		
		
		
	}

}
