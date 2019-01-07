
public class ParentChildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Parent();
		p.age = 47;
		System.out.println(p.age);

		Child c = new Child();
		c.age = 21;
		System.out.println(c.age);
		c.play();
		
		
	}

}
