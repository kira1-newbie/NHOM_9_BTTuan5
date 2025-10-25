import java.util.Scanner;
public class Book {
	protected String bookID;
	private String title, author;
	private int quantity, publicationYear;
    Scanner sc = new Scanner(System.in);
	public Book(String bookID, String title, String author, int quantity, int publicationYear) {
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.quantity = quantity;
		this.publicationYear = publicationYear;
	}
	public Book() {
		super();
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
	  public void Nhap() {
	        System.out.print("Nhập bookID: "); bookID= sc.nextLine();
	        System.out.print("Nhập title: ");  title= sc.nextLine();
	        System.out.print("Nhập author: "); author = sc.nextLine();
	        System.out.print("Nhập quantity: "); quantity = sc.nextInt();
	        System.out.print("Nhập publicationYear: "); publicationYear = sc.nextInt();
	        sc.nextLine();
	  }
	public String toString() {
		return "BookID: "+bookID+
				"\nTitle: "+title+
				"\nAuthor: "+author+
				"\nPublication Year: "+publicationYear+
				"\nQuantity: "+quantity;
	}
}
