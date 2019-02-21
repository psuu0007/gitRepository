package shopping.product;

public class Book extends Product{
	
	public Book (String name, int price) {
		super(name, price);
	}

	public String myProductName() {
		return name;
	}
}
