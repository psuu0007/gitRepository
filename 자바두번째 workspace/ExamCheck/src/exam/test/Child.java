package exam.test;

class Child extends Parent {
	int x = 3000;

	Child() {
		this(1000);
	}

	Child(int x) {
		System.out.println("나야: " + this.x);
		this.x = x;
	}
	
	int getX() {
//		return x;
		return super.x;
	}
}
