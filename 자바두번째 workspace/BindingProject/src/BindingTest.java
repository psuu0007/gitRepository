
public class BindingTest {
	public static void main(String[] args) {
//		Parent p = new Child();
		Parent p = new Child();
		Child c = new Child();
//		p.showX();
		
		Child cc = (Child)p;
		cc.showX();
		p = cc;
		
		System.out.println(cc.x);
//		System.out.println("p.x = " + p.x);
//		p.method();
//		System.out.println("c.x = " + c.x);
//		c.method();
//		c.showX();
		
	}
}

class Parent {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
	
//	void showX() {
//		System.out.println(x);
//	}
}

class Child extends Parent {
	int x = 200; // 1000;
	
	void method() {
		System.out.println("Child Method");
	}
	
	void showX() {
		System.out.println("부모에 없는 버튼");
	}
}



