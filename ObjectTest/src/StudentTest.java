
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu = new Student();
		Student stu2 = new Student();
		
		stu.ban = "하이브리드";
		stu.age = 21;
		System.out.println(stu.ban);
		System.out.println(stu.age);
		System.out.println(stu2.ban);
		System.out.println(stu2.age);
		
		stu2.ban = "잘못적어";
		
		System.out.println(stu.ban);
		System.out.println(stu.age);
		System.out.println(stu2.ban);
		System.out.println(stu2.age);
		
		
	}

}
