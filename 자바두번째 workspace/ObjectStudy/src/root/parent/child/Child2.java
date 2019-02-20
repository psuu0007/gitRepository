package root.parent.child;

public class Child2 {
	String name = "";
	int age = 0;
	
	public Child2(){
//		super();
		// this(매개변수);
		this("sfsdf");
	}
	
	public Child2(String name){
//		super();
		this("ㄴㅇㄹ", 2134);
		this.name = name;
	}

	public Child2(String name, int age){
		super();
		this.name = name;
		this.age = age;
	}
	
	public String nameView() {
		
		return name;
	}
	
}


