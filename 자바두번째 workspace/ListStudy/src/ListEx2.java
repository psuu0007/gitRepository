import java.util.ArrayList;

public class ListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int fisrtPersonAge = 30;
		TeamPerson tp = new TeamPerson(1, "장훈일", fisrtPersonAge);    // 0000
		ArrayList list = new ArrayList();    // 9999
		
		list.add(tp);          // 0000
		
		ArrayList listCopy = new ArrayList();    // 8888
		
		TeamPerson tempTp = new TeamPerson();
		
		tempTp.setAge(tp.getAge()-1);
		tempTp.setTeamNo(tp.getTeamNo());
		tempTp.setName(tp.getName());
		
		listCopy.add(tempTp);
		
//		listCopy.set(0, ((TeamPerson)listCopy.get(0)).set)
		
//		int age = ((TeamPerson)listCopy.get(0)).getAge();
//		age = age - 1;
//		((TeamPerson)listCopy.get(0)).setAge(age);
//		
//		
//		
		((TeamPerson)list.get(0)).printInfo();
		((TeamPerson)listCopy.get(0)).printInfo();
		
		
//		System.out.println();
//		System.out.println("복제한 내용들");
//		System.out.println();
//		
//		for (int i = 0; i < list.size(); i++) {  // 8888
//			listCopy.add(list.get(i));          // 9999 -> 0000, 1111, 2222
//		}
//
//		for (int i = 0; i < listCopy.size(); i++) {  // 8888
//			((TeamPerson) listCopy.get(i)).printInfo();  // 0000, 1111, 2222
//		}
//		
//		listCopy.add(123);
		
//		System.out.println();
//		System.out.println("새롭게 추가했다 복제한 8888 영역에");
//		
//		for (int i = 0; i < list.size(); i++) {      // 9999
//			((TeamPerson) list.get(i)).printInfo();   // 0000, 1111, 2222                        
//		}
//		System.out.println("list.size()는 : " + list.size());
//		
//		for (int i = 0; i < listCopy.size()-1; i++) {  // 8888
//			((TeamPerson) listCopy.get(i)).printInfo();  // 0000, 1111, 2222
//		}
//		
//		System.out.println(listCopy.get(listCopy.size()-1) );  // 0000, 1111, 2222
//		
//		System.out.println("listCopy.size()는 : " + listCopy.size());
	}

}
