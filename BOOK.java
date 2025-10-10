
public class BOOK {
	private String bookID, title, author;
	private int quantity, publicationYear;

	public BOOK(String bookID, String title, String author, int quantity, int publicationYear) {
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.quantity = quantity;
		this.publicationYear = publicationYear;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public String getTitle() {
		return title;

	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void displayInfo() {
		System.out.println("BookID: "+bookID+
				"\nTitle: "+title+
				"\nAuthor: "+author+
				"\nPublication Year: "+publicationYear+
				"\nQuantity: "+quantity);
	}
}
