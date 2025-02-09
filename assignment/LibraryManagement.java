package week2.day1.assignment;

public class LibraryManagement {

	public static void main(String[] args) {
		Library libraryObj = new Library();
		System.out.println(libraryObj.addBook("Children Digest"));
		libraryObj.issueBook();

	}

}
