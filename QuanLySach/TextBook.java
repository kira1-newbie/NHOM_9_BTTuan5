import java.time.LocalDate;

public class TextBook extends Book {
	private String monHoc, capDo;

	public TextBook(String bookID, String title, String author, int quantity, int publicationYear, double giaCoBan,
			Publisher NhaXuatBan, String monHoc, String capDo) {
		super(bookID, title, author, quantity, publicationYear, giaCoBan, NhaXuatBan);
		this.monHoc = monHoc;
		this.capDo = capDo;
	}

	public TextBook() {
		super();
	}
@Override
	public void Nhap() {
		super.Nhap();
		System.out.println("===Nhap thong tin sach giao khoa===");
		System.out.println("Nhap monHoc: ");
		monHoc = sc.nextLine();
		System.out.println("Nhập cap do ");
		capDo = sc.nextLine();
	}
@Override
public String toString() {
    return super.toString()
         + "\n Mon hoc        : " + monHoc
         + "\n Cap do         : " + capDo
         + "\n Gia ban        : " + String.format("%.0f", tinhGiaBan())
         + "\n═══════════════════════════════════════════════";
}

@Override
	public double tinhGiaBan() {
		return getgiaCoBan() + ((LocalDate.now().getYear() - getPublicationYear()) * 5000);
	}
@Override
public boolean kiemTraTonKho(int soLuongToiThieu) {
    return this.getQuantity() >= soLuongToiThieu;
}
@Override
	public void capNhatViTri(String viTriMoi) {
		System.out.println("Da chuyen sach" + getTitle() + "den khu vuc:" + viTriMoi);
	}
}
