import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListUtil lu = new ListUtil();
		ArrayList list = new ArrayList();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(6);
		list.add(4);
		list.add(5);
		list.add(1);
		

		// 1
//		lu.arrayListAllPrint(list);

		ArrayList list2 = new ArrayList(list.subList(1, 4));
		// 2
//		lu.arrayListAllPrint(list2);

		Collections.sort(list);
		Collections.sort(list2);

		// 3
//		lu.arrayListAllPrint(list);
		// 4
//		lu.arrayListAllPrint(list2);

		list2.add("B");
		list2.add("C");
		list2.add(3, "A");

		list2.add(1);
		list2.add(1);
		// 5
//		lu.arrayListAllPrint(list2);

//		list2.set(3, "AA");
		// 6
//		lu.arrayListAllPrint(list);
//		lu.arrayListAllPrint(list2);

//		list2.remove(10);
//		
//		System.out.println("=====================제거후");
//		lu.arrayListAllPrint(list);
//		lu.arrayListAllPrint(list2);
//		System.out.println(list2.size());

		lu.arrayListAllPrint(list);
		lu.arrayListAllPrint(list2);
		
//		for (int i = 0; i < list.size(); i++) {
//			for (int j = 0; j < list2.size(); j++) {
//				if (list.get(i) == list2.get(j)) {
//					list2.remove(j);
//				}
//			}
//		}
//		
		System.out.println("제거후");
		System.out.println();
//
//		lu.arrayListAllPrint(list);
//		lu.arrayListAllPrint(list2);

//		System.out.println("여기야: "+ list.get(0));
		
//		for (int i = list2.size() - 1; i >= 0; i--) {
//			if (list.contains(list2.get(i))) {
//				list2.remove(i);
//			}
//		}
//
		for (int i = 0; i < list2.size(); i++) {
			if (list.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		
		lu.arrayListAllPrint(list);
		lu.arrayListAllPrint(list2);

	}

}
