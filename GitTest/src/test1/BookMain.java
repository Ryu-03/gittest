package test1;

public class BookMain {
	public static void main(String[] args) {
		
		Book book = new Book();
		
		book.setTitle("Train Collection");
		book.setPage(250);
		
		System.out.println("Title: " + book.getTitle());
		System.out.println("Page: " + book.getPage());
	}

}
