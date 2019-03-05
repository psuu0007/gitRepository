import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList<Gugudan> gugudanList = new ArrayList();
//		
//		Gugudan gugudan = new Gugudan();
//		
//		gugudanList = gugudan.setNumDan(2);
//		
//		
//		for (int i = 0; i < 9; i++) {
//			gugudanList.get(i).printInfo();
//		}
		
		
//		Gugudan ggd = new Gugudan(2, 0 + 1);
//		gugudanList.add(ggd);  // 2, 1
//		gugudanList.get(0).printInfo();
//		Gugudan ggd = new Gugudan(2, 1 + 1);
//		gugudanList.add(ggd);  // 2, 2
//		gugudanList.get(1).printInfo();
		
		
//		System.out.println(gugudanList.size());
		
//		gugudanList.get(0).printInfo();
		
		
//		System.out.println(gugudanList.get(0));
//		char
//		byte
//		long
		ArrayList<Integer> arrayList = new ArrayList();
//		Character cc = new Character(' ');
//		Boolean check = false;
		
		
		for (int i = 0; i < 3; i++) {
			arrayList.add(i);
		}
		
		Iterator<Integer> it = arrayList.iterator();
		int index = 0;
//		while (it.hasNext()) {
//			Integer integer = (Integer) it.next();
//			
//			System.out.println("나는 iterrator친구꺼 : " + integer);
//			System.out.println("==========================");
//			System.out.println("나는 list 자신: " + arrayList.get(index));
//			System.out.println();
//			index++;
//		}
		
		for (int i=0; i < 2; i++) {
			Integer integer = (Integer) it.next();
			
			System.out.println("나는 iterrator친구꺼 : " + integer);
			System.out.println("==========================");
			System.out.println("나는 list 자신: " + arrayList.get(i));
			System.out.println();
			
//			integer = (Integer) it.next();
//			
//			System.out.println("나는 iterrator친구꺼 : " + integer);
//			System.out.println("==========================");
//			System.out.println("나는 list 자신: " + arrayList.get(i));
//			System.out.println();
		}
		
//		it = arrayList.iterator();
		
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			
			System.out.println(integer);
		}
		
		
	}
}
