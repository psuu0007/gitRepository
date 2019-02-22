
public class Book {

	private String title;
	private String writer;
	private String publisher;
	private int price;
	private int publishingDate;
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getWriter() {
		return writer;
	}
	//-------------------------------------------
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getPublisher() {
		return publisher;
	}
	//-------------------------------------------
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	// -------------------------------------------
	public void setPublishingDate(int publishingDate) {
		this.publishingDate = publishingDate;
	}
	
	public int getPublishingDate() {
		return publishingDate;
	}
	
	public void bookPrint() {
		System.out.println(title);
		System.out.println(writer);
		System.out.println(publisher);
		System.out.println(price);
		System.out.println(publishingDate);
	}
	
	// object 메서드 오버라이딩
	public String toString() {
		String str = "";
		
		str += title + "\n";
		str += writer + "\n";
		str += publisher + "\n";
		str += price + "\n";
		str += publishingDate + "\n";
		
		return str; 
	}
	
}
