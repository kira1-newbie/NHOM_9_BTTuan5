
public class Novel extends Book {
	private String theLoai;
	private boolean laSachSeries;

	public Novel(String bookID, String title, String author, int quantity, int publicationYear, double giaCoBan,
			Publisher NhaXuatBan, String theLoai, boolean laSachSeries) {
		super(bookID, title, author, quantity, publicationYear, giaCoBan, NhaXuatBan);
		this.theLoai = theLoai;
		this.laSachSeries = laSachSeries;
	}

	public Novel() {
		super();
	}
@Override
	public void Nhap() {
		super.Nhap();
		System.out.println("===Nhap thong tin sach tieu thuyet===");
		System.out.println("Nhap the loai: ");
		theLoai = sc.nextLine();
		System.out.println("Sach co phai la Series khong:(true/false) ");
		laSachSeries = sc.nextBoolean();
	}
@Override
public String toString() {
    return super.toString()
         + "\n The loai       : " + theLoai
         + "\n La series      : " + (laSachSeries ? "Co" : "Khong")
         + "\n Gia ban        : " + String.format("%.0f", tinhGiaBan())
         + "\n═══════════════════════════════════════════════";
}

@Override
	public double tinhGiaBan() {
		double gcb = getgiaCoBan();
		if (laSachSeries == true)
			return gcb + 15000;
		else
			return gcb;
	}
@Override
public boolean kiemTraTonKho(int soLuongToiThieu) {
    return this.getQuantity() >= soLuongToiThieu;
}
@Override
	public void capNhatViTri(String viTriMoi) {
		System.out.println("Đa chuyen sach" + getTitle() + "den khu vuc:" + viTriMoi);
	}

}
