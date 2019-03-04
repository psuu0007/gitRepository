import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object o = new ArrayList();
//		Object o2 = new Integer(0);
//		o = new Test();
//		o = 21;
		ArrayList list = new ArrayList();
		
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));
		
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		
		
		System.out.println("===================");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		
	}

}
