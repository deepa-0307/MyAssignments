package week2.day1.assignment;

public class Library {
	
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		Library libraryObj = new Library();
		System.out.println(libraryObj.addBook("Fire wings"));
		libraryObj.issueBook();
		

	}

}
