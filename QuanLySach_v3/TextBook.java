import java.util.Scanner;
public class TextBook extends Book {
	private String monHoc,capDo;
	Scanner sc=new Scanner(System.in);
	public TextBook(String bookID, String title, String author, int quantity, int publicationYear, String monHoc,
			String capDo) {
		super(bookID, title, author, quantity, publicationYear);
		this.monHoc = monHoc;
		this.capDo = capDo;
	}
	
	public TextBook() {
		super();
	}
	public void Nhap()
	{
		super.Nhap();
		System.out.println("Nhập monHoc: ");
		monHoc=sc.nextLine();
		System.out.println("Nhập cấp độ ");
		capDo=sc.nextLine();
	}
	public String toString() {
		return super.toString() + "\nmon hoc: "+monHoc+"\ncap do: "+capDo;
	}
	
}
