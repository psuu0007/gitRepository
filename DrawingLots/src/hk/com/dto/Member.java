package hk.com.dto;

public class Member {
	private int number = 0;
	private String name = "";
	
	public Member() {
		super();
	}

	public Member(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[연번=" + number + ", 이름=" + name + "]";
	}
	
	
	
}
