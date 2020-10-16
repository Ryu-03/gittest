package test1;

public class BookMain {
	public static void main(String[] args) {
		
		Book book = new Book();
		
		book.setTitle("World Animal");
		book.setPage(300);
		
		System.out.println("Title: " + book.getTitle());
		System.out.println("Page: " + book.getPage());
	}

}
