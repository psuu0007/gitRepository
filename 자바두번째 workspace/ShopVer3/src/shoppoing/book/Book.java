package shoppoing.book;

public class Book {

	public int price;
	public String bookTitle;
	public int bonusPoint;

	public Book(String name, int price) {
		this.bookTitle = name;
		this.price = price;
	}

	public String myProductName() {
		return "책";
	}

}
