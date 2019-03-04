import java.util.ArrayList;

public class ListEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();

		TeamPerson tp = new TeamPerson(3, "장훈일", 30);
		TeamPerson tp2 = new TeamPerson(3, "김충현", 25);

		list.add(tp);
		list.add(tp2);

		ArrayList listCopy = new ArrayList();

		for (int i = 0; i < list.size(); i++) {
			listCopy.add(list.get(i));
		}

//	      for(int i = 0; i < list.size(); i++) {
//	         System.out.println(list.get(i).);
//	      }

//	      TeamPerson tempTp = null;
//	      for(int i = 0; i < list.size(); i++) {
//	         tempTp = (TeamPerson)list.get(i);
//	         
//	         System.out.println();
//	         tempTp.printInfo();
//	      }

//	      

		for (int i = 0; i < list.size(); i++) {
			int newAge = (((TeamPerson) list.get(i)).getAge()) + 1;
			((TeamPerson) listCopy.get(i)).setAge(newAge);
		}

		for (int i = 0; i < listCopy.size(); i++) {
			((TeamPerson) listCopy.get(i)).printInfo();
			System.out.println();

		}

	}

}
