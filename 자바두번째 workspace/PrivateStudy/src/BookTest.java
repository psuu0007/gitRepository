
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book();
		
		String title= "";
		String writer= "";
		String publisher= "";
		int price = 0;
		int publishingDate = 0;
		
		book1.setTitle("이태원 클라쓰");
		book1.setWriter("광진");
		book1.setPublisher("영컴");
		book1.setPrice(11700);
		book1.setPublishingDate(20170628);

		title = book1.getTitle();
		writer = book1.getWriter();
		publisher = book1.getPublisher();
		price = book1.getPrice();
		publishingDate = book1.getPublishingDate();
		
		book1.bookPrint();
		
		System.out.println("============");
		
		book1.setTitle(title + "- 다시 시작된 여정");
		
//		title = book1.getTitle();
//		writer = book1.getWriter();
//		publisher = book1.getPublisher();
//		price = book1.getPrice();
//		publishingDate = book1.getPublishingDate();
		
		book1.bookPrint();
		writer = writer + ", 박성욱 저자";
//		System.out.println(title);
		System.out.println(writer);
//		System.out.println(publisher);
//		System.out.println(price);
//		System.out.println(publishingDate);
		
		System.out.println(" toString 호출 =============================");
//		String resultStr = "";
//		resultStr = book1.toString();
//		
//		System.out.println(resultStr);
		
//		System.out.println(book1.toString());
		System.out.println(" toString 호출 =============================");
		System.out.println(book1);
		
		
		
	}

}
