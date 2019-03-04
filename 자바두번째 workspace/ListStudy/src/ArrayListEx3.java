import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListUtil lu = new ListUtil();
		ArrayList list = new ArrayList();

		list.add(new Integer(1));
		list.add(new Integer(6));
		list.add(new Integer(3));
		list.add(new Integer(2));
		list.add(new Integer(4));
		list.add(new Integer(5));

		//1
		lu.arrayListAllPrint(list);
		
		
		ArrayList list2 = new ArrayList(list.subList(1, 4));
		//2
		lu.arrayListAllPrint(list2);
		
		Collections.sort(list);
		Collections.sort(list2);
//		String str = "123";
//		String tempStr = str.substring(1);
		
//		"123".charAt(0);
		//3
		lu.arrayListAllPrint(list);
		//4
		lu.arrayListAllPrint(list2);
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		
		//5
		lu.arrayListAllPrint(list2);
		
		list2.set(3, "AA");
		//6
		lu.arrayListAllPrint(list);
		lu.arrayListAllPrint(list2);
		
		
	}

}
