package test1;

public class BookMain {
	public static void main(String[] args) {
		
		Book book = new Book();
		
		book.setTitle("Japanese Recipe");
		book.setPage(900);
		
		System.out.println("Title: " + book.getTitle());
		System.out.println("Page: " + book.getPage());
		System.out.println("20201030");
	}

}
