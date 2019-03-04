import java.util.ArrayList;

public class ListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListUtil lu = new ListUtil();
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add("당연하지:");
		
//		lu.arrayListAllPrint(list, "list");
		
//		백업 복제
//		
		ArrayList listCopy = new ArrayList();
		
//		listCopy = list;
		listCopy = (ArrayList)list.clone();
		
		list.add("새로운 내용");
		listCopy.add("달라");
		
		lu.arrayListAllPrint(list, "list");
		lu.arrayListAllPrint(listCopy, "listCopy");

	}

}
