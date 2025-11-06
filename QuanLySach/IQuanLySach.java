
public interface IQuanLySach {
	public void themMoi(Book s);

	public boolean Timkiem(String ma);

	public void Xoa(String ma);

	public void CapNhat(String ma);

	public void displayBooks();

	public boolean kiemTraTonKho(String ma, int soluongtoithieu);

	public void capNhatViTri(String ma, String viTriMoi);
	
	public double tinhTongTien();
}
