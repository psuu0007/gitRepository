import java.util.ArrayList;

public class ArrayListTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list  = new ArrayList();
		
		TeamPerson tp = new TeamPerson(3, "장훈일", 30);
		TeamPerson tp2 = new TeamPerson(3, "김충현", 25); 
		
//		tp.printInfo();
		
		list.add(tp);
		list.add(tp2);
		
//		for(int i = 0; i < list.size(); i++) {
//			((TeamPerson)list.get(i)).printInfo();
//		}
		
//		TeamPerson tempTp = null;
//		for(int i = 0; i < list.size(); i++) {
//			tempTp = (TeamPerson) list.get(i);
//			
//			System.out.println();
//			tempTp.printInfo();
//		}
//		for(int i = 0; i < list.size(); i++) {
//			((TeamPerson) list.get(i)).printInfo();
//		}
		
		
	}

}
