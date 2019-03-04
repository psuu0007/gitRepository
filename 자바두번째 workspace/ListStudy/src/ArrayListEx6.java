import java.util.ArrayList;

public class ArrayListEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add("당연하지:");
		
		int num = (int) list.get(0);
		int num2 = (int) list.get(1);
		
		int sum = num + num2;
		String str = (String) list.get(2);
		
		System.out.println(str + sum);
		
		
		
		
		

	}

}
