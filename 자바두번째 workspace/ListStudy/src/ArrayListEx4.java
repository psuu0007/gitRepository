import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx4 {

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
		
//		list.add("객체의 존재유무 알림");
		list.add(lu);
		
		lu.arrayListAllPrint(list);
		
//		System.out.println(list.contains("객체의 존재유무 알림"));
		
//		System.out.println(list.indexOf(lu));
		
		System.out.println(list.isEmpty());
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		
	}

}
