package week2.day1;

public class Library {
	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully:" +bookTitle);
		return bookTitle;
	}
	public void issueBook() 
	{
		System.out.println( "Book issued successfully");
	}

	public static void main(String[] args) {
		Library libraryObj=new Library();
		libraryObj.addBook("Believe in Yourself");
		libraryObj.issueBook();

	}

}
