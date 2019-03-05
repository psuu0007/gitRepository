import java.util.ArrayList;

public class ListEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> strList = new ArrayList<String>();
//		ArrayList strList = new ArrayList();
		
		String str = "";
		
		str = "1";
		strList.add(str);
		str = "2";
		strList.add(str);
		str = "3";
		strList.add(str);
		
		int sum = 0;
		for (int i = 0; i < strList.size(); i++) {
//			str = (String)strList.get(i);
			sum = sum + Integer.parseInt(strList.get(i));
		}
		System.out.println(sum);
		
//		strList.add(12);
		

	}

}
