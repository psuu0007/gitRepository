import java.util.ArrayList;

public class ListEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListUtil lu = new ListUtil();
		ArrayList list = new ArrayList();
		
		list.add(new TeamPerson());
		list.add(1);
		list.add(01011112222);
		list.add("당연하지:");
		
//		((TeamPerson)list.get(0)).printInfo();
		
		for (int i = 0; i < list.size(); i++) {
			((TeamPerson)list.get(i)).printInfo();
		}
		
		
//		lu.arrayListAllPrint(list, "list");
		
////		백업 복제
////		ArrayList listCopy = list;
//		ArrayList listCopy = null;
//		listCopy = new ArrayList();		
//		
//		listCopy.add(list.get(0));
//		listCopy.add(list.get(1));
//		listCopy.add(list.get(2));
//		
//		lu.arrayListAllPrint(listCopy, "listCopy");
//		
//		listCopy.add("잘못된 복제");
//		list.remove(0);
//
//		// 3
//		lu.arrayListAllPrint(list, "list");
//		lu.arrayListAllPrint(listCopy, "listCopy");
		

	}

}
