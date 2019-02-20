public class BindingTest3 {
	public static void main(String[] args) {
		Parent3 p = new Child3();
		Child3 c = new Child3();
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println();
		System.out.println("c.x = " + c.x);
		c.method();
	}
}
class Parent3 {
	int x = 100;
	void method() {
		System.out.println("Parent Method");
	}
//	void method() {
//		System.out.println("x= " + x);
//		System.out.println("this.x= " + this.x);
//	}
}
class Child3 extends Parent3 {
	int x = 200;
	void method() {
		System.out.println("x= " + x);
		System.out.println("this.x= " + this.x);
	}
}
