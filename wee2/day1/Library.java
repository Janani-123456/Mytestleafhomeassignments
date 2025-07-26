package wee2.day1;

public class Library {

	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;

	}

	public void issueBook() {
		System.out.println("Book issued successfully");

	}

	public static void main(String[] args) {
		Library bookdetails = new Library();
		bookdetails.addBook("bookTitle");
		bookdetails.issueBook();

	}

}
