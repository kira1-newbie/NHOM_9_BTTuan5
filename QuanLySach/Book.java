import java.time.LocalDateTime;
import java.util.Scanner;
public abstract class Book implements IGiaBan, IKiemKe {
	protected String bookID;
	protected String title, author;
	protected int quantity, publicationYear;
	protected double giaCoBan;
	protected Publisher NhaXuatBan = new Publisher();
	protected Scanner sc = new Scanner(System.in);

	public Book(String bookID, String title, String author, int quantity, int publicationYear, double giaCoBan,
			Publisher NhaXuatBan) {
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.quantity = quantity;
		this.publicationYear = publicationYear;
		this.giaCoBan = giaCoBan;
		this.NhaXuatBan = NhaXuatBan;
	}

	public Book() {
	}

	public Double getgiaCoBan() {
		return giaCoBan;
	}

	public double getGiaCoBan() {
		return giaCoBan;
	}

	public void setGiaCoBan(double giaCoBan) {
		this.giaCoBan = giaCoBan;
	}

	public void setgiaCoBan(Double giaCoBan) {
		this.giaCoBan = giaCoBan;
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

	public Publisher getNhaXuatBan() {
		return NhaXuatBan;
	}

	public void setNhaXuatBan(Publisher nhaXuatBan) {
		NhaXuatBan = nhaXuatBan;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public void Nhap() {
		System.out.println("===Nhap thong tin sach===");
		System.out.print("Nhap bookID: ");
		bookID = sc.nextLine();
		System.out.print("Nhap title: ");
		title = sc.nextLine();
		System.out.print("Nhap author: ");
		author = sc.nextLine();
		System.out.println("Nhap quantity: ");
		quantity= sc.nextInt();
		while (quantity < 0)
		{
		System.out.print("Nhap quantity lai: ");
		quantity = sc.nextInt();
		}
		System.out.print("Nhap publicationYear: ");
		publicationYear = sc.nextInt();
		while (publicationYear < 0 || publicationYear > LocalDateTime.now().getYear())
		{
		System.out.print("Nhap publicationYear lai: ");
		publicationYear = sc.nextInt();
		}
		System.out.print("Nhap gia co ban: ");
		giaCoBan = sc.nextDouble();
		while (giaCoBan < 0)
		{
		System.out.print("Nhap gia co ban lai: ");
		giaCoBan = sc.nextDouble();
		}
		sc.nextLine();
		NhaXuatBan.Nhap();
	}
@Override
public String toString() {
    String line = "-----------------------------------------------";
    String info =
        line + "\n" +
        "Ma sach       : " + bookID + "\n" +
        "Tieu de       : " + title + "\n" +
        "Tac gia       : " + author + "\n" +
        "Nam xuat ban  : " + publicationYear + "\n" +
        "So luong      : " + quantity + "\n" +
        "Gia co ban    : " + giaCoBan + "\n" +
        NhaXuatBan.toString() + "\n" +
        line;
    return info;
}


}
