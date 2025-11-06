import java.util.ArrayList;
import java.util.List;

public class BookManager implements IQuanLySach {
	private List<Book> ds = new ArrayList<>();

	@Override
	public void themMoi(Book s) {
		for (Book c : ds) {
			if (c.equals(s)) {
				System.out.println("Nhap trung ma sach");
				return;
			}
		}
		ds.add(s);
		System.out.println("Them moi thanh cong!");
	}

	@Override
	public void Xoa(String ma) {
		if (ds.isEmpty() == true) {
			System.out.println("Danh sach rong, khong the xoa!");
		} else {
			for (Book c : ds) {
				if (c.getBookID().equals(ma)) {
					ds.remove(c);
					System.out.println("Xoa thanh cong!");
					return;
				}
			}
			System.out.println("Xoa that bai, khong tim thay ma sach!");
		}
	}

	@Override
	public void CapNhat(String ma) {
		if (ds.isEmpty() == true) {
			System.out.println("Danh sach rong, khong the cap nhat!");
		} else
			for (int i = 0; i < ds.size(); i++) {
				Book c = ds.get(i);
				if (c.getBookID().equals(ma)) {
					if (c instanceof Novel) {
						Book n = new Novel();
						n.Nhap();
						ds.set(i, n);
					} else if (c instanceof TextBook) {
						Book n = new TextBook();
						n.Nhap();
						ds.set(i, n);
					}
					System.out.println("Cập nhật thành công!");
					return;
				}
				else 
					System.out.println("Khong tim thay ma sach!");
			}
	}

	@Override
	public boolean Timkiem(String ma) {
		if (ds.isEmpty() == true) {
			System.out.println("Danh sách rỗng, không thể tìm kiếm!");
		} else
			for (Book c : ds) {
				if (c.getBookID().equals(ma)) {
					return true;
				}
			}
		return false;
	}

@Override
public void displayBooks() {
    if (ds.isEmpty()) {
        System.out.println("Danh sach rong!");
        return;
    }
    System.out.println("\n========= DANH SACH SACH =========\n");
    int i = 1;
    for (Book b : ds) {
        System.out.println(" SACH THU " + i++ + ":");
        System.out.println(b.toString());
        System.out.println();
    }
}

	@Override
	public boolean kiemTraTonKho(String ma, int soluongtoithieu) {
		for (Book b : ds)
			if (b.getBookID().equals(ma))
				return b.kiemTraTonKho(soluongtoithieu);
		System.out.println("Khong tim thay sach co ma: " + ma);
		return false;
	}
	@Override
	public void capNhatViTri(String ma, String viTriMoi) {
		for (Book b : ds)
			if (b.getBookID().equals(ma)) {
				b.capNhatViTri(viTriMoi);
				return;
			}
		System.out.println("Khong tim thay sach!");
	}
	@Override
	public double tinhTongTien() {
		double tong = 0;
		for (Book b : ds)
			tong += b.tinhGiaBan();
		return tong;
	}
}
