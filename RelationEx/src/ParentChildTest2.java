
public class ParentChildTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child2 c2 = new Child2();
		// 부모꺼는 내꺼
		c2.age = 21;
		System.out.println(c2.age);
		// 내꺼는 내꺼
		c2.study();
				
		System.out.println();
		GrandChild grandC = new GrandChild();
		
		grandC.age = 1;
		System.out.println(grandC.age);
		grandC.play();
		grandC.myIntroduce();
		
		Parent p = new Parent();
		System.out.println("parent에서 만든 객체의 age 값은?");
		System.out.println(p.age);
		
		
	}

}
