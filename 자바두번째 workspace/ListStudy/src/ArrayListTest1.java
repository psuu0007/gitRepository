import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();

		list.add(1);
		list.add("정혜미");
		list.add(36);

		list.add(2);
		list.add("정민성");
		list.add(27);

		list.add(3);
		list.add("박대승");
		list.add(25);

		list.add(4);
		list.add("송지원");
		list.add(23);

		String teamNumber = "팀 번호: ";
		String teamName = "팀원 이름 : ";
		String teamAge = "팀원의 나이: ";

//      System.out.println(teamNumber+ list.get(0));
//      System.out.println(teamName + list.get(1));
//      System.out.println(teamAge + list.get(2));
//      System.out.println();
//      
//      System.out.println(teamNumber + list.get(3));
//      System.out.println(teamName + list.get(4));
//      System.out.println(teamAge + list.get(5));
//      System.out.println();
//      
//      System.out.println(teamNumber + list.get(6));
//      System.out.println(teamName + list.get(7));;
//      System.out.println(teamAge + list.get(8));
//      System.out.println();
//      
//      System.out.println(teamNumber + list.get(9));
//      System.out.println(teamName + list.get(10));
//      System.out.println(teamAge + list.get(11));

//      System.out.println("=======================================");

//      지원씨 코드
//		int count = 0;
//		for (int i = 0; i < 4; i++) {
//			System.out.println(teamNumber + list.get(count));
//			count++;
//			System.out.println(teamName + list.get(count));
//			count++;
//			System.out.println(teamAge + list.get(count));
//			if (count < list.size()) {
//				count++;
//			}
//			System.out.println();
//		}

//      대승씨 코드, 혜선씨
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(teamNumber + list.get(i));
//			i++;
//			System.out.println(teamName + list.get(i));
//			i++;
//			System.out.println(teamAge + list.get(i));
//			System.out.println();
//		}

//      명선씨 코드
//		for (int i = 0; i < 4; i++) {
//			System.out.println(teamNumber + list.get(i * 3));
//			System.out.println(teamName + list.get(i * 3 + 1));
//			System.out.println(teamAge + list.get(i * 3 + 2));
//			System.out.println();
//		}

//      강인씨 코드 
//		for (int i = 0; i < list.size(); i++) {
//
//			if (i % 3 == 0) {
//				System.out.println("팀 번호: " + list.get(i));
//				System.out.println("팀원의 이름: " + list.get(i + 1));
//				System.out.println("팀원의 나이: " + list.get(i + 2));
//				System.out.println();
//			}
//
//		}

//      
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
//      
	}

}